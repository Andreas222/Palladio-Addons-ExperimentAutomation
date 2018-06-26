/**
 * generated by Xtext 2.13.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Seeds</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.ListOfSeeds#getSeeds <em>Seeds</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getListOfSeeds()
 * @model
 * @generated
 */
public interface ListOfSeeds extends EObject
{
  /**
   * Returns the value of the '<em><b>Seeds</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seeds</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seeds</em>' attribute list.
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getListOfSeeds_Seeds()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getSeeds();

} // ListOfSeeds