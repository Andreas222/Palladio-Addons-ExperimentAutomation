/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.scoping

import java.util.LinkedList
import javax.inject.Inject
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IExtension
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.scoping.Scopes
import org.palladiosimulator.experimentautomation.dsl.expAuto.AllocationModel
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage
import org.palladiosimulator.experimentautomation.dsl.expAuto.Import
import org.palladiosimulator.experimentautomation.dsl.expAuto.InitialModel
import org.palladiosimulator.experimentautomation.dsl.expAuto.Model
import org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel
import org.palladiosimulator.experimentautomation.dsl.expAuto.Variation
import org.palladiosimulator.experimentautomation.variation.ValueVariation
import org.eclipse.xtext.scoping.IScope
import org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition
import org.eclipse.core.runtime.Platform
import org.palladiosimulator.experimentautomation.dsl.expAuto.EObjectWithName
import org.palladiosimulator.experimentautomation.dsl.expAuto.impl.ExpAutoFactoryImpl
import de.uka.ipd.sdq.identifier.Identifier

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ExpAutoScopeProvider extends AbstractExpAutoScopeProvider {
	IExtension currExtension;
	int i;
	LinkedList<ValueVariation> valueVariationList;
	LinkedList<Identifier> possibleTargetsList;
	LinkedList<EObjectWithName> possibleToolConfigurations;
	Class actualVariedInterfaceClassObject;
	String toolName;
	EObjectWithName config;
	
	@Inject
	IQualifiedNameProvider nameProvider;

	override getScope(EObject context, EReference reference) {
		// Scope VariationType
		if (context instanceof Variation && reference == ExpAutoPackage.Literals.VARIATION__VARIATION_TYP) {
			val experimentSpecificationEntity = EcoreUtil2.getRootContainer(context)
			val experimentEntity = EcoreUtil2.getRootContainer(experimentSpecificationEntity)
			val rootEntity = EcoreUtil2.getRootContainer(experimentEntity)
			val importEntities = (rootEntity as Model).getImports()

			valueVariationList = new LinkedList<ValueVariation>

			for (Import currImport : importEntities) {
				val path = currImport.getPath()
				val currUri = URI.createURI(path)
				val importedResource = context.eResource.resourceSet.getResource(currUri, true)
				val resourceRootEntity = importedResource.getContents().get(0)
				val currCandidates = EcoreUtil2.getAllContentsOfType(resourceRootEntity, ValueVariation)
				for (ValueVariation currVar : currCandidates) {
					valueVariationList.addFirst(currVar);
				}
			}

			val candidates = valueVariationList
			val newScope = Scopes.scopeFor(candidates)
			return newScope
		}

		// Scope VariationTarget
		if (context instanceof Variation && reference == ExpAutoPackage.Literals.VARIATION__TARGET) {
			val experimentSpecificationEntity = EcoreUtil2.getRootContainer(context)
			val experimentEntity = EcoreUtil2.getRootContainer(experimentSpecificationEntity)
			val initModelEntity = EcoreUtil2.getAllContentsOfType(experimentEntity, InitialModel).get(0)
			val usageModelEntity = EcoreUtil2.getAllContentsOfType(initModelEntity, UsageModel).get(0)
			val allocationModelEntity = EcoreUtil2.getAllContentsOfType(initModelEntity, AllocationModel).get(0)

			val usageResource = context.eResource.resourceSet.getResource(
				URI.createURI(usageModelEntity.getUsageModel()), true)
			val usageRootEntity = usageResource.getContents().get(0)
			val usageModelContents = EcoreUtil2.getAllContentsOfType(usageRootEntity, Identifier)

			val allocationResource = context.eResource.resourceSet.getResource(
				URI.createURI(allocationModelEntity.getAllocation()), true)
			val allocationRootEntity = allocationResource.getContents().get(0)
			val allocationModelContents = EcoreUtil2.getAllContentsOfType(allocationRootEntity, Identifier)

			val importedStrategy = (context as Variation).getVariationTyp()
			val variedEntityInterface = importedStrategy.getVariedEntityInterface()
			actualVariedInterfaceClassObject = Class.forName(variedEntityInterface)

			possibleTargetsList = new LinkedList<Identifier>();

			for (Identifier currObject : usageModelContents) {
				if(actualVariedInterfaceClassObject.isInstance(currObject)){
					possibleTargetsList.addFirst(currObject)
				}
			}

			for (Identifier currObject : allocationModelContents) {
				if(actualVariedInterfaceClassObject.isInstance(currObject)){
					possibleTargetsList.addFirst(currObject)
				}
			}

			val candidates = possibleTargetsList
			val newScope = Scopes.scopeFor(candidates, this.nameProvider, IScope.NULLSCOPE)
			return newScope
		}
		
		// Scope ToolConfiguration
		if(context instanceof ToolDefinition && reference == ExpAutoPackage.Literals.TOOL_DEFINITION__TOOL){
		  	possibleToolConfigurations = new LinkedList<EObjectWithName>
		  	
		  	val registry = Platform.getExtensionRegistry
		  	val extensionPoint = registry.getExtensionPoint("org.palladiosimulator.experimentautomation.dsl.org.palladiosimulator.experimentautomation.dsl.toolAdapter")
		  	
		  	if(extensionPoint === null) {
		  		return null;
		  	} 
		  	
		  	val extensions = extensionPoint.getExtensions()
		  	val factory = new ExpAutoFactoryImpl()
  		    
		  	for (i=0; i<extensions.length; i++){
		  		currExtension = extensions.get(i);
  				val extensionElements = currExtension.configurationElements
  				for(IConfigurationElement currElem : extensionElements){
  					toolName = currElem.getAttribute("toolName")
  				}
  				if(toolName !== null){
  					config = factory.createEObjectWithName()
  					config.name = toolName
  					val resource = context.eResource
  					resource.contents.add(config)
  					possibleToolConfigurations.addFirst(config)
  				}
		  	}
			
		  	val candidates = possibleToolConfigurations
		  	val newScope = Scopes.scopeFor(candidates)
		  	return newScope
		}

		return super.getScope(context, reference)
	}
	
/*private <T> List<T> loadPluginObjects(String extensionPointId) {
 * 	List<T> adapters = new ArrayList<T>();
 * 	IExtensionRegistry registry = Platform.getExtensionRegistry();
 * 	IExtensionPoint extensionPoint = registry.getExtensionPoint(extensionPointId);
 * 	IExtension[] extensions = extensionPoint.getExtensions();
 * 	for(int i=0; i<extensions.length; i++) {
 * 		loadPluginObject(adapters, extensions[i]);
 * 	}
 * 	return adapters;
 * }
 *  
 * private <T> void loadPluginObject(List<T> adapters, IExtension extension) {
 * 	IConfigurationElement[] elements = extension.getConfigurationElements();
 * 	for(int j=0;j<elements.length;j++) {
 * 		try {
 * 			// Provoke a ClassCastException because we cannot access the type T at runtime
 * 			// to ensure that the returned object is an instance of T
 * 			T extInstance = (T)elements[j].createExecutableExtension("class");
 * 			adapters.add(extInstance);
 * 		} catch (ClassCastException cce) {
 * 			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error while loading plugin objects", cce);
 * 			Activator.getDefault().getLog().log(status);
 * 		} catch (CoreException ce) {
 * 			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error while loading plugin objects", ce);
 * 			Activator.getDefault().getLog().log(status);
 * 		}
 * 	}
 }*/
}
