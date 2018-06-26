/**
 * generated by Xtext 2.13.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage;
import org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitor Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.impl.MonitorRepositoryImpl#getMonitorRepository <em>Monitor Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitorRepositoryImpl extends MinimalEObjectImpl.Container implements MonitorRepository
{
  /**
   * The default value of the '{@link #getMonitorRepository() <em>Monitor Repository</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonitorRepository()
   * @generated
   * @ordered
   */
  protected static final String MONITOR_REPOSITORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMonitorRepository() <em>Monitor Repository</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonitorRepository()
   * @generated
   * @ordered
   */
  protected String monitorRepository = MONITOR_REPOSITORY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MonitorRepositoryImpl()
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
    return ExpAutoPackage.Literals.MONITOR_REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMonitorRepository()
  {
    return monitorRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonitorRepository(String newMonitorRepository)
  {
    String oldMonitorRepository = monitorRepository;
    monitorRepository = newMonitorRepository;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpAutoPackage.MONITOR_REPOSITORY__MONITOR_REPOSITORY, oldMonitorRepository, monitorRepository));
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
      case ExpAutoPackage.MONITOR_REPOSITORY__MONITOR_REPOSITORY:
        return getMonitorRepository();
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
      case ExpAutoPackage.MONITOR_REPOSITORY__MONITOR_REPOSITORY:
        setMonitorRepository((String)newValue);
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
      case ExpAutoPackage.MONITOR_REPOSITORY__MONITOR_REPOSITORY:
        setMonitorRepository(MONITOR_REPOSITORY_EDEFAULT);
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
      case ExpAutoPackage.MONITOR_REPOSITORY__MONITOR_REPOSITORY:
        return MONITOR_REPOSITORY_EDEFAULT == null ? monitorRepository != null : !MONITOR_REPOSITORY_EDEFAULT.equals(monitorRepository);
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
    result.append(" (monitorRepository: ");
    result.append(monitorRepository);
    result.append(')');
    return result.toString();
  }

} //MonitorRepositoryImpl
