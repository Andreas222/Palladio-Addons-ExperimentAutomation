/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.LinearValueProvider;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Linear Value
 * Provider</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.LinearValueProviderImpl#getSummand <em>Summand</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.LinearValueProviderImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearValueProviderImpl extends ValueProviderImpl implements LinearValueProvider {

    /**
     * The default value of the '{@link #getSummand() <em>Summand</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSummand()
     * @generated
     * @ordered
     */
    protected static final double SUMMAND_EDEFAULT = 0.0;

    /**
	 * The cached value of the '{@link #getSummand() <em>Summand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummand()
	 * @generated
	 * @ordered
	 */
	protected double summand = SUMMAND_EDEFAULT;

				/**
     * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getFactor()
     * @generated
     * @ordered
     */
    protected static final double FACTOR_EDEFAULT = 0.0;

    /**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected double factor = FACTOR_EDEFAULT;

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected LinearValueProviderImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.LINEAR_VALUE_PROVIDER;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public double getSummand() {
		return summand;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setSummand(double newSummand) {
		double oldSummand = summand;
		summand = newSummand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND, oldSummand, summand));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public double getFactor() {
		return factor;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setFactor(double newFactor) {
		double oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR, oldFactor, factor));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND:
				return getSummand();
			case ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR:
				return getFactor();
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
			case ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND:
				setSummand((Double)newValue);
				return;
			case ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR:
				setFactor((Double)newValue);
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
			case ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND:
				setSummand(SUMMAND_EDEFAULT);
				return;
			case ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR:
				setFactor(FACTOR_EDEFAULT);
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
			case ExperimentsPackage.LINEAR_VALUE_PROVIDER__SUMMAND:
				return summand != SUMMAND_EDEFAULT;
			case ExperimentsPackage.LINEAR_VALUE_PROVIDER__FACTOR:
				return factor != FACTOR_EDEFAULT;
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
		result.append(" (summand: ");
		result.append(summand);
		result.append(", factor: ");
		result.append(factor);
		result.append(')');
		return result.toString();
	}

} // LinearValueProviderImpl
