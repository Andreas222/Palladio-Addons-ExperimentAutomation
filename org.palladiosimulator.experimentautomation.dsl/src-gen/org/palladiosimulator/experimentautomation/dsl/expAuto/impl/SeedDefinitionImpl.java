/**
 * generated by Xtext 2.13.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ListOfSeeds;
import org.palladiosimulator.experimentautomation.dsl.expAuto.SeedDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seed Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.impl.SeedDefinitionImpl#getSeedLists <em>Seed Lists</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeedDefinitionImpl extends MinimalEObjectImpl.Container implements SeedDefinition
{
  /**
   * The cached value of the '{@link #getSeedLists() <em>Seed Lists</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeedLists()
   * @generated
   * @ordered
   */
  protected EList<ListOfSeeds> seedLists;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeedDefinitionImpl()
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
    return ExpAutoPackage.Literals.SEED_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ListOfSeeds> getSeedLists()
  {
    if (seedLists == null)
    {
      seedLists = new EObjectContainmentEList<ListOfSeeds>(ListOfSeeds.class, this, ExpAutoPackage.SEED_DEFINITION__SEED_LISTS);
    }
    return seedLists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ExpAutoPackage.SEED_DEFINITION__SEED_LISTS:
        return ((InternalEList<?>)getSeedLists()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ExpAutoPackage.SEED_DEFINITION__SEED_LISTS:
        return getSeedLists();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExpAutoPackage.SEED_DEFINITION__SEED_LISTS:
        getSeedLists().clear();
        getSeedLists().addAll((Collection<? extends ListOfSeeds>)newValue);
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
      case ExpAutoPackage.SEED_DEFINITION__SEED_LISTS:
        getSeedLists().clear();
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
      case ExpAutoPackage.SEED_DEFINITION__SEED_LISTS:
        return seedLists != null && !seedLists.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SeedDefinitionImpl