/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage;
import org.palladiosimulator.experimentautomation.dsl.expAuto.MiddlewareRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Middleware Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.impl.MiddlewareRepositoryImpl#getMiddlewareRepository <em>Middleware Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiddlewareRepositoryImpl extends MinimalEObjectImpl.Container implements MiddlewareRepository
{
  /**
   * The default value of the '{@link #getMiddlewareRepository() <em>Middleware Repository</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiddlewareRepository()
   * @generated
   * @ordered
   */
  protected static final String MIDDLEWARE_REPOSITORY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMiddlewareRepository() <em>Middleware Repository</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiddlewareRepository()
   * @generated
   * @ordered
   */
  protected String middlewareRepository = MIDDLEWARE_REPOSITORY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MiddlewareRepositoryImpl()
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
    return ExpAutoPackage.Literals.MIDDLEWARE_REPOSITORY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMiddlewareRepository()
  {
    return middlewareRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiddlewareRepository(String newMiddlewareRepository)
  {
    String oldMiddlewareRepository = middlewareRepository;
    middlewareRepository = newMiddlewareRepository;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExpAutoPackage.MIDDLEWARE_REPOSITORY__MIDDLEWARE_REPOSITORY, oldMiddlewareRepository, middlewareRepository));
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
      case ExpAutoPackage.MIDDLEWARE_REPOSITORY__MIDDLEWARE_REPOSITORY:
        return getMiddlewareRepository();
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
      case ExpAutoPackage.MIDDLEWARE_REPOSITORY__MIDDLEWARE_REPOSITORY:
        setMiddlewareRepository((String)newValue);
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
      case ExpAutoPackage.MIDDLEWARE_REPOSITORY__MIDDLEWARE_REPOSITORY:
        setMiddlewareRepository(MIDDLEWARE_REPOSITORY_EDEFAULT);
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
      case ExpAutoPackage.MIDDLEWARE_REPOSITORY__MIDDLEWARE_REPOSITORY:
        return MIDDLEWARE_REPOSITORY_EDEFAULT == null ? middlewareRepository != null : !MIDDLEWARE_REPOSITORY_EDEFAULT.equals(middlewareRepository);
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
    result.append(" (middlewareRepository: ");
    result.append(middlewareRepository);
    result.append(')');
    return result.toString();
  }

} //MiddlewareRepositoryImpl
