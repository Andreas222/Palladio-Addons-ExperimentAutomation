package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.dsl.expAuto.EObjectWithName;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;

public class ToolConfigurationTransformation {
	protected ToolConfigurationTransformation() {
		
	}
	
	protected ToolConfiguration transformToolDefinition(ToolDefinition old) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = registry.getExtensionPoint("org.palladiosimulator.experimentautomation.dsl.org.palladiosimulator.experimentautomation.dsl.toolAdapter");
			  	
		if(extensionPoint == null) {
			return null;
		} 
			  	
		IExtension[] extensions = extensionPoint.getExtensions();
		
		EObjectWithName toolNameObject = old.getTool();
		String toolName = toolNameObject.getName();
		String currToolName;
		ToolConfiguration config = null;
		
		for (int i=0; i<extensions.length; i++){
			IExtension currExtension = extensions[i];
	  		IConfigurationElement[] extensionElements = currExtension.getConfigurationElements();
	  		for(IConfigurationElement currElem : extensionElements){
	  			currToolName = currElem.getAttribute("toolName");
	  			if(toolName.equals(currToolName)) {
	  				String className = currElem.getAttribute("class");
	  				try {
	  					Class currClass = Class.forName(className);
	  					config = (ToolConfiguration) currClass.newInstance();
	  				} catch (ClassNotFoundException ex) {
	  					return null;
	  				} catch (IllegalAccessException ex) {
	  					return null;
	  				} catch (InstantiationException ex) {
	  					return null;
	  				}
	  			}
	  		}
		}
		
		return config;
	}
	
	protected void completeToolConfigurationTransformation(AbstractSimulationConfiguration config, RandomNumberGeneratorSeed seeds, EDP2Datasource datasource) {
		config.setRandomNumberGeneratorSeed(seeds);
		config.setDatasource(datasource);
	}
}
