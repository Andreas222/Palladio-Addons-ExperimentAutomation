/**
 */
package org.palladiosimulator.experimentautomation.abstractsimulation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationPackage;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition;
import org.palladiosimulator.experimentautomation.experiments.impl.ToolConfigurationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Abstract Simulation
 * Configuration</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#getStopConditions <em>Stop Conditions</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#getRandomNumberGeneratorSeed <em>Random Number Generator Seed</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#isSimulateLinkingResources <em>Simulate Linking Resources</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#isSimulateFailures <em>Simulate Failures</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractSimulationConfigurationImpl#getDatasource <em>Datasource</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractSimulationConfigurationImpl extends ToolConfigurationImpl implements
        AbstractSimulationConfiguration {

    /**
	 * The cached value of the '{@link #getStopConditions() <em>Stop Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<StopCondition> stopConditions;

	/**
	 * The cached value of the '{@link #getRandomNumberGeneratorSeed() <em>Random Number Generator Seed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomNumberGeneratorSeed()
	 * @generated
	 * @ordered
	 */
	protected RandomNumberGeneratorSeed randomNumberGeneratorSeed;

				/**
	 * The default value of the '{@link #isSimulateLinkingResources() <em>Simulate Linking Resources</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSimulateLinkingResources()
	 * @generated
	 * @ordered
	 */
    protected static final boolean SIMULATE_LINKING_RESOURCES_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isSimulateLinkingResources() <em>Simulate Linking Resources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimulateLinkingResources()
	 * @generated
	 * @ordered
	 */
	protected boolean simulateLinkingResources = SIMULATE_LINKING_RESOURCES_EDEFAULT;

				/**
	 * The default value of the '{@link #isSimulateFailures() <em>Simulate Failures</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSimulateFailures()
	 * @generated
	 * @ordered
	 */
    protected static final boolean SIMULATE_FAILURES_EDEFAULT = false;

    /**
	 * The cached value of the '{@link #isSimulateFailures() <em>Simulate Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimulateFailures()
	 * @generated
	 * @ordered
	 */
	protected boolean simulateFailures = SIMULATE_FAILURES_EDEFAULT;

				/**
	 * The cached value of the '{@link #getDatasource() <em>Datasource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasource()
	 * @generated
	 * @ordered
	 */
	protected EDP2Datasource datasource;

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected AbstractSimulationConfigurationImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AbstractsimulationPackage.Literals.ABSTRACT_SIMULATION_CONFIGURATION;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public EList<StopCondition> getStopConditions() {
		if (stopConditions == null) {
			stopConditions = new EObjectContainmentEList<StopCondition>(StopCondition.class, this, AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS);
		}
		return stopConditions;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public RandomNumberGeneratorSeed getRandomNumberGeneratorSeed() {
		return randomNumberGeneratorSeed;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetRandomNumberGeneratorSeed(
            RandomNumberGeneratorSeed newRandomNumberGeneratorSeed, NotificationChain msgs) {
		RandomNumberGeneratorSeed oldRandomNumberGeneratorSeed = randomNumberGeneratorSeed;
		randomNumberGeneratorSeed = newRandomNumberGeneratorSeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED, oldRandomNumberGeneratorSeed, newRandomNumberGeneratorSeed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setRandomNumberGeneratorSeed(RandomNumberGeneratorSeed newRandomNumberGeneratorSeed) {
		if (newRandomNumberGeneratorSeed != randomNumberGeneratorSeed) {
			NotificationChain msgs = null;
			if (randomNumberGeneratorSeed != null)
				msgs = ((InternalEObject)randomNumberGeneratorSeed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED, null, msgs);
			if (newRandomNumberGeneratorSeed != null)
				msgs = ((InternalEObject)newRandomNumberGeneratorSeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED, null, msgs);
			msgs = basicSetRandomNumberGeneratorSeed(newRandomNumberGeneratorSeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED, newRandomNumberGeneratorSeed, newRandomNumberGeneratorSeed));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean isSimulateLinkingResources() {
		return simulateLinkingResources;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setSimulateLinkingResources(boolean newSimulateLinkingResources) {
		boolean oldSimulateLinkingResources = simulateLinkingResources;
		simulateLinkingResources = newSimulateLinkingResources;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES, oldSimulateLinkingResources, simulateLinkingResources));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean isSimulateFailures() {
		return simulateFailures;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setSimulateFailures(boolean newSimulateFailures) {
		boolean oldSimulateFailures = simulateFailures;
		simulateFailures = newSimulateFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES, oldSimulateFailures, simulateFailures));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EDP2Datasource getDatasource() {
		return datasource;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetDatasource(EDP2Datasource newDatasource, NotificationChain msgs) {
		EDP2Datasource oldDatasource = datasource;
		datasource = newDatasource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE, oldDatasource, newDatasource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setDatasource(EDP2Datasource newDatasource) {
		if (newDatasource != datasource) {
			NotificationChain msgs = null;
			if (datasource != null)
				msgs = ((InternalEObject)datasource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE, null, msgs);
			if (newDatasource != null)
				msgs = ((InternalEObject)newDatasource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE, null, msgs);
			msgs = basicSetDatasource(newDatasource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE, newDatasource, newDatasource));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
				return ((InternalEList<?>)getStopConditions()).basicRemove(otherEnd, msgs);
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
				return basicSetRandomNumberGeneratorSeed(null, msgs);
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
				return basicSetDatasource(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
				return getStopConditions();
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
				return getRandomNumberGeneratorSeed();
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
				return isSimulateLinkingResources();
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
				return isSimulateFailures();
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
				return getDatasource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
				getStopConditions().clear();
				getStopConditions().addAll((Collection<? extends StopCondition>)newValue);
				return;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
				setRandomNumberGeneratorSeed((RandomNumberGeneratorSeed)newValue);
				return;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
				setSimulateLinkingResources((Boolean)newValue);
				return;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
				setSimulateFailures((Boolean)newValue);
				return;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
				setDatasource((EDP2Datasource)newValue);
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
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
				getStopConditions().clear();
				return;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
				setRandomNumberGeneratorSeed((RandomNumberGeneratorSeed)null);
				return;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
				setSimulateLinkingResources(SIMULATE_LINKING_RESOURCES_EDEFAULT);
				return;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
				setSimulateFailures(SIMULATE_FAILURES_EDEFAULT);
				return;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
				setDatasource((EDP2Datasource)null);
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
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__STOP_CONDITIONS:
				return stopConditions != null && !stopConditions.isEmpty();
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__RANDOM_NUMBER_GENERATOR_SEED:
				return randomNumberGeneratorSeed != null;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_LINKING_RESOURCES:
				return simulateLinkingResources != SIMULATE_LINKING_RESOURCES_EDEFAULT;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__SIMULATE_FAILURES:
				return simulateFailures != SIMULATE_FAILURES_EDEFAULT;
			case AbstractsimulationPackage.ABSTRACT_SIMULATION_CONFIGURATION__DATASOURCE:
				return datasource != null;
		}
		return super.eIsSet(featureID);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (simulateLinkingResources: ");
		result.append(simulateLinkingResources);
		result.append(", simulateFailures: ");
		result.append(simulateFailures);
		result.append(')');
		return result.toString();
	}

} // AbstractSimulationConfigurationImpl
