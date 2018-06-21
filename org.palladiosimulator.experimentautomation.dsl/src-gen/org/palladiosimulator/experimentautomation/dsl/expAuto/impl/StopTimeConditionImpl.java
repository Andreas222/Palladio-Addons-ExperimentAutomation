/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage;
import org.palladiosimulator.experimentautomation.dsl.expAuto.StopTimeCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Time Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.impl.StopTimeConditionImpl#getStopTyp <em>Stop Typ</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.impl.StopTimeConditionImpl#getStopParam <em>Stop Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopTimeConditionImpl extends MinimalEObjectImpl.Container implements StopTimeCondition
{
  /**
   * The default value of the '{@link #getStopTyp() <em>Stop Typ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopTyp()
   * @generated
   * @ordered
   */
  protected static final String STOP_TYP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStopTyp() <em>Stop Typ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopTyp()
   * @generated
   * @ordered
   */
  protected String stopTyp = STOP_TYP_EDEFAULT;

  /**
   * The default value of the '{@link #getStopParam() <em>Stop Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopParam()
   * @generated
   * @ordered
   */
  protected static final int STOP_PARAM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStopParam() <em>Stop Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopParam()
   * @generated
   * @ordered
   */
  protected int stopParam = STOP_PARAM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StopTimeConditionImpl()
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
    return ExpAutoPackage.Literals.STOP_TIME_CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStopTyp()
  {
    return stopTyp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStopTyp(String newStopTyp)
  {
    String oldStopTyp = stopTyp;
    stopTyp = newStopTyp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpAutoPackage.STOP_TIME_CONDITION__STOP_TYP, oldStopTyp, stopTyp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStopParam()
  {
    return stopParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStopParam(int newStopParam)
  {
    int oldStopParam = stopParam;
    stopParam = newStopParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpAutoPackage.STOP_TIME_CONDITION__STOP_PARAM, oldStopParam, stopParam));
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
      case ExpAutoPackage.STOP_TIME_CONDITION__STOP_TYP:
        return getStopTyp();
      case ExpAutoPackage.STOP_TIME_CONDITION__STOP_PARAM:
        return getStopParam();
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
      case ExpAutoPackage.STOP_TIME_CONDITION__STOP_TYP:
        setStopTyp((String)newValue);
        return;
      case ExpAutoPackage.STOP_TIME_CONDITION__STOP_PARAM:
        setStopParam((Integer)newValue);
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
      case ExpAutoPackage.STOP_TIME_CONDITION__STOP_TYP:
        setStopTyp(STOP_TYP_EDEFAULT);
        return;
      case ExpAutoPackage.STOP_TIME_CONDITION__STOP_PARAM:
        setStopParam(STOP_PARAM_EDEFAULT);
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
      case ExpAutoPackage.STOP_TIME_CONDITION__STOP_TYP:
        return STOP_TYP_EDEFAULT == null ? stopTyp != null : !STOP_TYP_EDEFAULT.equals(stopTyp);
      case ExpAutoPackage.STOP_TIME_CONDITION__STOP_PARAM:
        return stopParam != STOP_PARAM_EDEFAULT;
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
    result.append(" (stopTyp: ");
    result.append(stopTyp);
    result.append(", stopParam: ");
    result.append(stopParam);
    result.append(')');
    return result.toString();
  }

} //StopTimeConditionImpl
