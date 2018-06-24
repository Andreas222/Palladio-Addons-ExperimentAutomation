/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;
import org.palladiosimulator.experimentautomation.experiments.ReconfigurationRulesFolder;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.resourceenvironment.ResourceEnvironment;
import org.palladiosimulator.pcm.usagemodel.UsageModel;
import org.palladiosimulator.servicelevelobjective.ServiceLevelObjectiveRepository;
import org.scaledl.usageevolution.UsageEvolution;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Initial Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getUsageModel <em>Usage Model</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getMiddlewareRepository <em>Middleware Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getEventMiddleWareRepository <em>Event Middle Ware Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getReconfigurationRules <em>Reconfiguration Rules</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getMonitorRepository <em>Monitor Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getServiceLevelObjectives <em>Service Level Objectives</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getResourceEnvironment <em>Resource Environment</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.InitialModelImpl#getUsageEvolution <em>Usage Evolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialModelImpl extends MinimalEObjectImpl.Container implements InitialModel {

    /**
	 * The cached value of the '{@link #getUsageModel() <em>Usage Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageModel()
	 * @generated
	 * @ordered
	 */
	protected UsageModel usageModel;
	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected Allocation allocation;
	/**
	 * The cached value of the '{@link #getMiddlewareRepository() <em>Middleware Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddlewareRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository middlewareRepository;
	/**
	 * The cached value of the '{@link #getEventMiddleWareRepository() <em>Event Middle Ware Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventMiddleWareRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository eventMiddleWareRepository;
	/**
	 * The cached value of the '{@link #getReconfigurationRules() <em>Reconfiguration Rules</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationRules()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationRulesFolder reconfigurationRules;
	/**
	 * The cached value of the '{@link #getMonitorRepository() <em>Monitor Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitorRepository()
	 * @generated
	 * @ordered
	 */
	protected MonitorRepository monitorRepository;
	/**
	 * The cached value of the '{@link #getServiceLevelObjectives() <em>Service Level Objectives</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLevelObjectives()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevelObjectiveRepository serviceLevelObjectives;
	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected org.palladiosimulator.pcm.system.System system;
	/**
	 * The cached value of the '{@link #getResourceEnvironment() <em>Resource Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceEnvironment()
	 * @generated
	 * @ordered
	 */
	protected ResourceEnvironment resourceEnvironment;
	/**
	 * The cached value of the '{@link #getUsageEvolution() <em>Usage Evolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageEvolution()
	 * @generated
	 * @ordered
	 */
	protected UsageEvolution usageEvolution;
				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected InitialModelImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.INITIAL_MODEL;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public UsageModel getUsageModel() {
		if (usageModel != null && ((EObject)usageModel).eIsProxy()) {
			InternalEObject oldUsageModel = (InternalEObject)usageModel;
			usageModel = (UsageModel)eResolveProxy(oldUsageModel);
			if (usageModel != oldUsageModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL, oldUsageModel, usageModel));
			}
		}
		return usageModel;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public UsageModel basicGetUsageModel() {
		return usageModel;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setUsageModel(UsageModel newUsageModel) {
		UsageModel oldUsageModel = usageModel;
		usageModel = newUsageModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL, oldUsageModel, usageModel));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Allocation getAllocation() {
		if (allocation != null && ((EObject)allocation).eIsProxy()) {
			InternalEObject oldAllocation = (InternalEObject)allocation;
			allocation = (Allocation)eResolveProxy(oldAllocation);
			if (allocation != oldAllocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__ALLOCATION, oldAllocation, allocation));
			}
		}
		return allocation;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public Allocation basicGetAllocation() {
		return allocation;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setAllocation(Allocation newAllocation) {
		Allocation oldAllocation = allocation;
		allocation = newAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__ALLOCATION, oldAllocation, allocation));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Repository getMiddlewareRepository() {
		if (middlewareRepository != null && ((EObject)middlewareRepository).eIsProxy()) {
			InternalEObject oldMiddlewareRepository = (InternalEObject)middlewareRepository;
			middlewareRepository = (Repository)eResolveProxy(oldMiddlewareRepository);
			if (middlewareRepository != oldMiddlewareRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY, oldMiddlewareRepository, middlewareRepository));
			}
		}
		return middlewareRepository;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public Repository basicGetMiddlewareRepository() {
		return middlewareRepository;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setMiddlewareRepository(Repository newMiddlewareRepository) {
		Repository oldMiddlewareRepository = middlewareRepository;
		middlewareRepository = newMiddlewareRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY, oldMiddlewareRepository, middlewareRepository));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Repository getEventMiddleWareRepository() {
		if (eventMiddleWareRepository != null && ((EObject)eventMiddleWareRepository).eIsProxy()) {
			InternalEObject oldEventMiddleWareRepository = (InternalEObject)eventMiddleWareRepository;
			eventMiddleWareRepository = (Repository)eResolveProxy(oldEventMiddleWareRepository);
			if (eventMiddleWareRepository != oldEventMiddleWareRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, oldEventMiddleWareRepository, eventMiddleWareRepository));
			}
		}
		return eventMiddleWareRepository;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public Repository basicGetEventMiddleWareRepository() {
		return eventMiddleWareRepository;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setEventMiddleWareRepository(Repository newEventMiddleWareRepository) {
		Repository oldEventMiddleWareRepository = eventMiddleWareRepository;
		eventMiddleWareRepository = newEventMiddleWareRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, oldEventMiddleWareRepository, eventMiddleWareRepository));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public ReconfigurationRulesFolder getReconfigurationRules() {
		if (reconfigurationRules != null && reconfigurationRules.eIsProxy()) {
			InternalEObject oldReconfigurationRules = (InternalEObject)reconfigurationRules;
			reconfigurationRules = (ReconfigurationRulesFolder)eResolveProxy(oldReconfigurationRules);
			if (reconfigurationRules != oldReconfigurationRules) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES, oldReconfigurationRules, reconfigurationRules));
			}
		}
		return reconfigurationRules;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public ReconfigurationRulesFolder basicGetReconfigurationRules() {
		return reconfigurationRules;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setReconfigurationRules(ReconfigurationRulesFolder newReconfigurationRules) {
		ReconfigurationRulesFolder oldReconfigurationRules = reconfigurationRules;
		reconfigurationRules = newReconfigurationRules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES, oldReconfigurationRules, reconfigurationRules));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public MonitorRepository getMonitorRepository() {
		if (monitorRepository != null && ((EObject)monitorRepository).eIsProxy()) {
			InternalEObject oldMonitorRepository = (InternalEObject)monitorRepository;
			monitorRepository = (MonitorRepository)eResolveProxy(oldMonitorRepository);
			if (monitorRepository != oldMonitorRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY, oldMonitorRepository, monitorRepository));
			}
		}
		return monitorRepository;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public MonitorRepository basicGetMonitorRepository() {
		return monitorRepository;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setMonitorRepository(MonitorRepository newMonitorRepository) {
		MonitorRepository oldMonitorRepository = monitorRepository;
		monitorRepository = newMonitorRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY, oldMonitorRepository, monitorRepository));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public ServiceLevelObjectiveRepository getServiceLevelObjectives() {
		if (serviceLevelObjectives != null && ((EObject)serviceLevelObjectives).eIsProxy()) {
			InternalEObject oldServiceLevelObjectives = (InternalEObject)serviceLevelObjectives;
			serviceLevelObjectives = (ServiceLevelObjectiveRepository)eResolveProxy(oldServiceLevelObjectives);
			if (serviceLevelObjectives != oldServiceLevelObjectives) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES, oldServiceLevelObjectives, serviceLevelObjectives));
			}
		}
		return serviceLevelObjectives;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public ServiceLevelObjectiveRepository basicGetServiceLevelObjectives() {
		return serviceLevelObjectives;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setServiceLevelObjectives(ServiceLevelObjectiveRepository newServiceLevelObjectives) {
		ServiceLevelObjectiveRepository oldServiceLevelObjectives = serviceLevelObjectives;
		serviceLevelObjectives = newServiceLevelObjectives;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES, oldServiceLevelObjectives, serviceLevelObjectives));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Repository getRepository() {
		if (repository != null && ((EObject)repository).eIsProxy()) {
			InternalEObject oldRepository = (InternalEObject)repository;
			repository = (Repository)eResolveProxy(oldRepository);
			if (repository != oldRepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__REPOSITORY, oldRepository, repository));
			}
		}
		return repository;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public Repository basicGetRepository() {
		return repository;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setRepository(Repository newRepository) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__REPOSITORY, oldRepository, repository));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public org.palladiosimulator.pcm.system.System getSystem() {
		if (system != null && ((EObject)system).eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (org.palladiosimulator.pcm.system.System)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public org.palladiosimulator.pcm.system.System basicGetSystem() {
		return system;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setSystem(org.palladiosimulator.pcm.system.System newSystem) {
		org.palladiosimulator.pcm.system.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__SYSTEM, oldSystem, system));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public ResourceEnvironment getResourceEnvironment() {
		if (resourceEnvironment != null && ((EObject)resourceEnvironment).eIsProxy()) {
			InternalEObject oldResourceEnvironment = (InternalEObject)resourceEnvironment;
			resourceEnvironment = (ResourceEnvironment)eResolveProxy(oldResourceEnvironment);
			if (resourceEnvironment != oldResourceEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
			}
		}
		return resourceEnvironment;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public ResourceEnvironment basicGetResourceEnvironment() {
		return resourceEnvironment;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setResourceEnvironment(ResourceEnvironment newResourceEnvironment) {
		ResourceEnvironment oldResourceEnvironment = resourceEnvironment;
		resourceEnvironment = newResourceEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT, oldResourceEnvironment, resourceEnvironment));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public UsageEvolution getUsageEvolution() {
		if (usageEvolution != null && usageEvolution.eIsProxy()) {
			InternalEObject oldUsageEvolution = (InternalEObject)usageEvolution;
			usageEvolution = (UsageEvolution)eResolveProxy(oldUsageEvolution);
			if (usageEvolution != oldUsageEvolution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION, oldUsageEvolution, usageEvolution));
			}
		}
		return usageEvolution;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public UsageEvolution basicGetUsageEvolution() {
		return usageEvolution;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setUsageEvolution(UsageEvolution newUsageEvolution) {
		UsageEvolution oldUsageEvolution = usageEvolution;
		usageEvolution = newUsageEvolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION, oldUsageEvolution, usageEvolution));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
				if (resolve) return getUsageModel();
				return basicGetUsageModel();
			case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
				if (resolve) return getAllocation();
				return basicGetAllocation();
			case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
				if (resolve) return getMiddlewareRepository();
				return basicGetMiddlewareRepository();
			case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
				if (resolve) return getEventMiddleWareRepository();
				return basicGetEventMiddleWareRepository();
			case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
				if (resolve) return getReconfigurationRules();
				return basicGetReconfigurationRules();
			case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
				if (resolve) return getMonitorRepository();
				return basicGetMonitorRepository();
			case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
				if (resolve) return getServiceLevelObjectives();
				return basicGetServiceLevelObjectives();
			case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
			case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
				if (resolve) return getResourceEnvironment();
				return basicGetResourceEnvironment();
			case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
				if (resolve) return getUsageEvolution();
				return basicGetUsageEvolution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
				setUsageModel((UsageModel)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
				setAllocation((Allocation)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
				setMiddlewareRepository((Repository)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
				setEventMiddleWareRepository((Repository)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
				setReconfigurationRules((ReconfigurationRulesFolder)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
				setMonitorRepository((MonitorRepository)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
				setServiceLevelObjectives((ServiceLevelObjectiveRepository)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
				setRepository((Repository)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
				setSystem((org.palladiosimulator.pcm.system.System)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)newValue);
				return;
			case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
				setUsageEvolution((UsageEvolution)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
				setUsageModel((UsageModel)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
				setAllocation((Allocation)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
				setMiddlewareRepository((Repository)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
				setEventMiddleWareRepository((Repository)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
				setReconfigurationRules((ReconfigurationRulesFolder)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
				setMonitorRepository((MonitorRepository)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
				setServiceLevelObjectives((ServiceLevelObjectiveRepository)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
				setRepository((Repository)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
				setSystem((org.palladiosimulator.pcm.system.System)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
				setResourceEnvironment((ResourceEnvironment)null);
				return;
			case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
				setUsageEvolution((UsageEvolution)null);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExperimentsPackage.INITIAL_MODEL__USAGE_MODEL:
				return usageModel != null;
			case ExperimentsPackage.INITIAL_MODEL__ALLOCATION:
				return allocation != null;
			case ExperimentsPackage.INITIAL_MODEL__MIDDLEWARE_REPOSITORY:
				return middlewareRepository != null;
			case ExperimentsPackage.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY:
				return eventMiddleWareRepository != null;
			case ExperimentsPackage.INITIAL_MODEL__RECONFIGURATION_RULES:
				return reconfigurationRules != null;
			case ExperimentsPackage.INITIAL_MODEL__MONITOR_REPOSITORY:
				return monitorRepository != null;
			case ExperimentsPackage.INITIAL_MODEL__SERVICE_LEVEL_OBJECTIVES:
				return serviceLevelObjectives != null;
			case ExperimentsPackage.INITIAL_MODEL__REPOSITORY:
				return repository != null;
			case ExperimentsPackage.INITIAL_MODEL__SYSTEM:
				return system != null;
			case ExperimentsPackage.INITIAL_MODEL__RESOURCE_ENVIRONMENT:
				return resourceEnvironment != null;
			case ExperimentsPackage.INITIAL_MODEL__USAGE_EVOLUTION:
				return usageEvolution != null;
		}
		return super.eIsSet(featureID);
	}

} // InitialModelImpl
