/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Nested Intervals Long
 * Value Provider</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.NestedIntervalsLongValueProviderImpl#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedIntervalsLongValueProviderImpl extends ValueProviderImpl
        implements NestedIntervalsLongValueProvider {

    /**
     * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected static final long MIN_VALUE_EDEFAULT = 0L;

    /**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected long minValue = MIN_VALUE_EDEFAULT;

				/**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected static final long MAX_VALUE_EDEFAULT = 0L;

    /**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected long maxValue = MAX_VALUE_EDEFAULT;

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected NestedIntervalsLongValueProviderImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.NESTED_INTERVALS_LONG_VALUE_PROVIDER;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public long getMinValue() {
		return minValue;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setMinValue(long newMinValue) {
		long oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE, oldMinValue, minValue));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public long getMaxValue() {
		return maxValue;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setMaxValue(long newMaxValue) {
		long oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE, oldMaxValue, maxValue));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
				return getMinValue();
			case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
				return getMaxValue();
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
			case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
				setMinValue((Long)newValue);
				return;
			case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
				setMaxValue((Long)newValue);
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
			case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
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
			case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case ExperimentsPackage.NESTED_INTERVALS_LONG_VALUE_PROVIDER__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
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
		result.append(" (minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(')');
		return result.toString();
	}

} // NestedIntervalsLongValueProviderImpl
