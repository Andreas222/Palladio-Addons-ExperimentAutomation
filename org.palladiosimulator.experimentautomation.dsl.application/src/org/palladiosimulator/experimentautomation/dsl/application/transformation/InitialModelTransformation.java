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
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;
import org.palladiosimulator.monitorrepository.impl.MonitorRepositoryFactoryImpl;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationFactory;
import org.palladiosimulator.pcm.allocation.impl.AllocationFactoryImpl;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryFactory;
import org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.pcm.usagemodel.UsagemodelFactory;
import org.palladiosimulator.pcm.usagemodel.impl.UsagemodelFactoryImpl;

public class InitialModelTransformation {
	private ExperimentsFactory experimentsfactory;
	private UsagemodelFactory usageFactory;
	private RepositoryFactory repositoryFactory;
	private AllocationFactory allocationFactory;
	private MonitorRepositoryFactory monitorFactory;
	
	protected InitialModelTransformation() {
		experimentsfactory = ExperimentsFactoryImpl.init();
		usageFactory = UsagemodelFactoryImpl.init();
		repositoryFactory = RepositoryFactoryImpl.init();
		allocationFactory = AllocationFactoryImpl.init();
		monitorFactory = MonitorRepositoryFactoryImpl.init();
	}
	
	protected InitialModel transformInitialModel(org.palladiosimulator.experimentautomation.dsl.expAuto.InitialModel old) {
		InitialModel initialModel = experimentsfactory.createInitialModel();
		
		//TODO Defaultwerte setzen
		//initialModel.setReconfigurationRules(null);
		//initialModel.setRepository(null);
		//initialModel.setResourceEnvironment(null);
		//initialModel.setServiceLevelObjectives(null);
		//initialModel.setSystem(null);
		//initialModel.setUsageEvolution(null);
		
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
					//TODO Defaultwert setzen
				} else {
					initialModel.setMonitorRepository(monitorRepository);
				}
			} else if(currObject instanceof MiddlewareRepository) {
				Repository middlewareRepository = transformMiddlewareRepository((MiddlewareRepository)currObject);
				if(middlewareRepository == null) {
					//TODO Defaultwert setzen
				} else {
					initialModel.setMiddlewareRepository(middlewareRepository);
				}
			} else if(currObject instanceof EventMiddlewareRepository) {
				Repository eventMiddlewareRepository = transformEventMiddlewareRepository((EventMiddlewareRepository)currObject);
				if(eventMiddlewareRepository == null) {
					//TODO Defaultwert setzen
				} else {
					initialModel.setEventMiddleWareRepository(eventMiddlewareRepository);
				}
			}	
		}
	}
	
	//TODO Eigenschaften der Modelle setzen (Pfadangabe ausreichend?, vgl. espresso.experiments)
	private UsageModel transformUsageModel(org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel old) {
		UsageModel usageModel = usageFactory.createUsageModel();
		//
		return usageModel;
	}
	
	private Allocation transformAllocation(AllocationModel old) {
		Allocation allocation = allocationFactory.createAllocation();
		//
		return allocation;
	}
	
	private MonitorRepository transformMonitorRepository(org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository old) {
		MonitorRepository monitorRepository = monitorFactory.createMonitorRepository();
		//
		return monitorRepository;
	}
	
	private Repository transformMiddlewareRepository(MiddlewareRepository old) {
		Repository repository = repositoryFactory.createRepository();
		//
		return repository;
	}
	
	private Repository transformEventMiddlewareRepository(EventMiddlewareRepository old) {
		Repository repository = repositoryFactory.createRepository();
		//
		return repository;
	}
}
