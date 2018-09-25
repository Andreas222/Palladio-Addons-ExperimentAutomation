package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.experimentautomation.dsl.expAuto.AllocationModel;
import org.palladiosimulator.experimentautomation.dsl.expAuto.EventMiddlewareRepository;
import org.palladiosimulator.experimentautomation.dsl.expAuto.InitSpecifications;
import org.palladiosimulator.experimentautomation.dsl.expAuto.MiddlewareRepository;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsFactory;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;
import org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsFactoryImpl;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

public class InitialModelTransformation {
	private ExperimentsFactory experimentsfactory;
	private ResourceSet rs;
	
	protected InitialModelTransformation(ResourceSet rs) {
		experimentsfactory = ExperimentsFactoryImpl.init();
		this.rs = rs;
	}
	
	protected InitialModel transformInitialModel(org.palladiosimulator.experimentautomation.dsl.expAuto.InitialModel old) {
		InitialModel initialModel = experimentsfactory.createInitialModel();
		
		initialModel.setReconfigurationRules(null);
		initialModel.setRepository(null);
		initialModel.setResourceEnvironment(null);
		initialModel.setServiceLevelObjectives(null);
		initialModel.setSystem(null);
		initialModel.setUsageEvolution(null);
		
		transformInitialModelSpecifications(initialModel, old.getInitSpecifications());
		
		return initialModel;
	}
	
	private void transformInitialModelSpecifications(InitialModel initialModel, InitSpecifications old) {
		EList<EObject> oldSpecifications = old.getSpecifications();
		
		for(int i=0; i < oldSpecifications.size(); i++) {
			EObject currObject = oldSpecifications.get(i);
			if(currObject instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel) {
				UsageModel usageModel = transformUsageModel((org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel)currObject);
				initialModel.setUsageModel(usageModel);
			} else if(currObject instanceof AllocationModel) {
				Allocation allocation = transformAllocation((AllocationModel)currObject);
				initialModel.setAllocation(allocation);
			} else if(currObject instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository) {
				MonitorRepository monitorRepository = transformMonitorRepository((org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository)currObject);
				initialModel.setMonitorRepository(monitorRepository);
			} else if(currObject instanceof MiddlewareRepository) {
				Repository middlewareRepository = transformMiddlewareRepository((MiddlewareRepository)currObject);
				initialModel.setMiddlewareRepository(middlewareRepository);
			} else if(currObject instanceof EventMiddlewareRepository) {
				Repository eventMiddlewareRepository = transformEventMiddlewareRepository((EventMiddlewareRepository)currObject);
				initialModel.setEventMiddleWareRepository(eventMiddlewareRepository);
			}	
		}
		
		if(initialModel.getMiddlewareRepository() == null) {
			URI currUri = URI.createURI("pathmap://PCM_MODELS/Glassfish.repository");
			Repository middlewareRepository = loadRepositoryResource(currUri);
			initialModel.setMiddlewareRepository(middlewareRepository);
		} 
		
		if(initialModel.getEventMiddleWareRepository() == null) {
			URI currUri = URI.createURI("pathmap://PCM_MODELS/default_event_middleware.repository");
			Repository middlewareRepository = loadRepositoryResource(currUri);
			initialModel.setEventMiddleWareRepository(middlewareRepository);
		} 
	}
	
	private UsageModel transformUsageModel(org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel old) {
		URI currUri = URI.createURI(old.getUsageModel());
		Resource importedResource = rs.getResource(currUri, true);
		UsageModel usageModel = (UsageModel)importedResource.getContents().get(0);
		return usageModel;
	}
	
	private Allocation transformAllocation(AllocationModel old) {
		URI currUri = URI.createURI(old.getAllocation());
		Resource importedResource = rs.getResource(currUri, true);
		Allocation allocation = (Allocation)importedResource.getContents().get(0);
		return allocation;
	}
	
	private MonitorRepository transformMonitorRepository(org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository old) {
		URI currUri = URI.createURI(old.getMonitorRepository());
		Resource importedResource = rs.getResource(currUri, true);
		MonitorRepository monitorRepository = (MonitorRepository)importedResource.getContents().get(0);
		return monitorRepository;
	}
	
	private Repository transformMiddlewareRepository(MiddlewareRepository old) {
		URI currUri = URI.createURI(old.getMiddlewareRepository());
		return loadRepositoryResource(currUri);
	}
	
	private Repository transformEventMiddlewareRepository(EventMiddlewareRepository old) {
		URI currUri = URI.createURI(old.getEventMiddelwareRepository());
		return loadRepositoryResource(currUri);
	}
	
	private Repository loadRepositoryResource(URI repositoryURI) {
		Resource importedResource = rs.getResource(repositoryURI, true);
		Repository repository = (Repository)importedResource.getContents().get(0);
		return repository;
	}
}
