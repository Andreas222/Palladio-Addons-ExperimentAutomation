/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Specifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.InitSpecifications#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getInitSpecifications()
 * @model
 * @generated
 */
public interface InitSpecifications extends EObject
{
  /**
   * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifications</em>' containment reference list.
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getInitSpecifications_Specifications()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getSpecifications();

} // InitSpecifications
