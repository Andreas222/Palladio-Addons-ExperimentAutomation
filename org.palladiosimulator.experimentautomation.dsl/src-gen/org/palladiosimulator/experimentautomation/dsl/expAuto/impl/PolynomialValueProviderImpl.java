/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage;
import org.palladiosimulator.experimentautomation.dsl.expAuto.PolynomialValueProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polynomial Value Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.impl.PolynomialValueProviderImpl#getExponent <em>Exponent</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.impl.PolynomialValueProviderImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolynomialValueProviderImpl extends MinimalEObjectImpl.Container implements PolynomialValueProvider
{
  /**
   * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExponent()
   * @generated
   * @ordered
   */
  protected static final int EXPONENT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExponent()
   * @generated
   * @ordered
   */
  protected int exponent = EXPONENT_EDEFAULT;

  /**
   * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected static final int FACTOR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected int factor = FACTOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PolynomialValueProviderImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExpAutoPackage.Literals.POLYNOMIAL_VALUE_PROVIDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getExponent()
  {
    return exponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExponent(int newExponent)
  {
    int oldExponent = exponent;
    exponent = newExponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT, oldExponent, exponent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFactor()
  {
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor(int newFactor)
  {
    int oldFactor = factor;
    factor = newFactor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR, oldFactor, factor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT:
        return getExponent();
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR:
        return getFactor();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT:
        setExponent((Integer)newValue);
        return;
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR:
        setFactor((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT:
        setExponent(EXPONENT_EDEFAULT);
        return;
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR:
        setFactor(FACTOR_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__EXPONENT:
        return exponent != EXPONENT_EDEFAULT;
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER__FACTOR:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (exponent: ");
    result.append(exponent);
    result.append(", factor: ");
    result.append(factor);
    result.append(')');
    return result.toString();
  }

} //PolynomialValueProviderImpl
