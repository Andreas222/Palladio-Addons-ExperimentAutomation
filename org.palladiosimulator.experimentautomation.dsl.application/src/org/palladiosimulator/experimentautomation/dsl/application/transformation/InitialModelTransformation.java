package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
	private ExperimentsFactory factory;
	
	protected InitialModelTransformation() {
		factory = ExperimentsFactoryImpl.init();
	}
	
	protected InitialModel transformInitialModel(org.palladiosimulator.experimentautomation.dsl.expAuto.InitialModel old) {
		InitialModel initialModel = factory.createInitialModel();
		
		//TODO
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
				if(monitorRepository == null) {
					//TODO
				} else {
					initialModel.setMonitorRepository(monitorRepository);
				}
			} else if(currObject instanceof MiddlewareRepository) {
				Repository middlewareRepository = transformMiddlewareRepository((MiddlewareRepository)currObject);
				if(middlewareRepository == null) {
					//TODO
				} else {
					initialModel.setMiddlewareRepository(middlewareRepository);
				}
			} else if(currObject instanceof EventMiddlewareRepository) {
				Repository eventMiddlewareRepository = transformEventMiddlewareRepository((EventMiddlewareRepository)currObject);
				if(eventMiddlewareRepository == null) {
					//TODO
				} else {
					initialModel.setEventMiddleWareRepository(eventMiddlewareRepository);
				}
			}	
		}
	}
	
	private UsageModel transformUsageModel(org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel old) {
		//UsageModel usageModel = factory.create
		
		return null;	//TODO
	}
	
	private Allocation transformAllocation(AllocationModel old) {
		//Allocation allocation = factory.create
		
		return null;	//TODO
	}
	
	private MonitorRepository transformMonitorRepository(org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository old) {
		//MonitorRepository monitorRepository = factory.create
				
		return null;	//TODO
	}
	
	private Repository transformMiddlewareRepository(MiddlewareRepository old) {
		//Repository repository = factory.create
				
		return null;	//TODO
	}
	
	private Repository transformEventMiddlewareRepository(EventMiddlewareRepository old) {
		//Repository repository = factory.create
		
		return null;	//TODO
	}
}
