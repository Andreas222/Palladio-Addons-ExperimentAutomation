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
	
	public InitialModelTransformation() {
		factory = ExperimentsFactoryImpl.init();
	}
	
	public InitialModel transformInitialModel(org.palladiosimulator.experimentautomation.dsl.expAuto.InitialModel old) {
		InitialModel initialModel = factory.createInitialModel();
		EObject[] specifications = transformInitialModelSpecifications(old.getInitSpecifications());
		
		initialModel.setUsageModel((UsageModel)specifications[0]);
		initialModel.setAllocation((Allocation)specifications[1]);
		
		if(specifications[2] == null) {
			//TODO
		} else {
			initialModel.setMonitorRepository((MonitorRepository)specifications[2]);
		}
		
		if(specifications[3] == null) {
			//TODO
		} else {
			initialModel.setMiddlewareRepository((Repository)specifications[3]);
		}
		
		if(specifications[4] == null) {
			//TODO
		} else {
			initialModel.setEventMiddleWareRepository((Repository)specifications[4]);
		}
		
		//TODO
		initialModel.setReconfigurationRules(null);
		initialModel.setRepository(null);
		initialModel.setResourceEnvironment(null);
		initialModel.setServiceLevelObjectives(null);
		initialModel.setSystem(null);
		initialModel.setUsageEvolution(null);
		
		return initialModel;
	}
	
	public EObject[] transformInitialModelSpecifications(InitSpecifications old) {
		//0: UsageModel, 1: AllocationModel, 2: MonitorRepository, 3: MiddlewareRepository, 4: EventMiddlewareRepository
		EObject[] specifications = new EObject[5];
		EList<EObject> oldSpecifications = old.getSpecifications();
		
		for(int i=0; i < oldSpecifications.size(); i++) {
			EObject currObject = oldSpecifications.get(i);
			if(currObject instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel) {
				specifications[0] = transformUsageModel((org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel)currObject);
			} else if(currObject instanceof AllocationModel) {
				specifications[1] = transformAllocation((AllocationModel)currObject);
			} else if(currObject instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository) {
				specifications[2] = transformMonitorRepository((org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository)currObject);
			} else if(currObject instanceof MiddlewareRepository) {
				specifications[3] = transformMiddlewareRepository((MiddlewareRepository)currObject);
			} else if(currObject instanceof EventMiddlewareRepository) {
				specifications[4] = transformEventMiddlewareRepository((EventMiddlewareRepository)currObject);
			}	
		}
		
		return specifications;
	}
	
	public UsageModel transformUsageModel(org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel old) {
		//UsageModel usageModel = factory.create
		
		return null;	//TODO
	}
	
	public Allocation transformAllocation(AllocationModel old) {
		//Allocation allocation = factory.create
		
		return null;	//TODO
	}
	
	public MonitorRepository transformMonitorRepository(org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository old) {
		//MonitorRepository monitorRepository = factory.create
				
		return null;	//TODO
	}
	
	public Repository transformMiddlewareRepository(MiddlewareRepository old) {
		//Repository repository = factory.create
				
		return null;	//TODO
	}
	
	public Repository transformEventMiddlewareRepository(EventMiddlewareRepository old) {
		//Repository repository = factory.create
		
		return null;	//TODO
	}
}
