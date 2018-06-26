/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seed Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.SeedDefinition#getSeedLists <em>Seed Lists</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getSeedDefinition()
 * @model
 * @generated
 */
public interface SeedDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Seed Lists</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.experimentautomation.dsl.expAuto.ListOfSeeds}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seed Lists</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seed Lists</em>' containment reference list.
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getSeedDefinition_SeedLists()
   * @model containment="true"
   * @generated
   */
  EList<ListOfSeeds> getSeedLists();

} // SeedDefinition
