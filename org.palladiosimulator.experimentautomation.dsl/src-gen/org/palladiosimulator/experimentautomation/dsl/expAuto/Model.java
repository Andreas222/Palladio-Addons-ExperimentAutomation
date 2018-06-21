/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Model#getDatasources <em>Datasources</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Model#getExperiments <em>Experiments</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.experimentautomation.dsl.expAuto.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Datasources</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.experimentautomation.dsl.expAuto.Datasource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datasources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datasources</em>' containment reference list.
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getModel_Datasources()
   * @model containment="true"
   * @generated
   */
  EList<Datasource> getDatasources();

  /**
   * Returns the value of the '<em><b>Experiments</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.experimentautomation.dsl.expAuto.Experiment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Experiments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Experiments</em>' containment reference list.
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getModel_Experiments()
   * @model containment="true"
   * @generated
   */
  EList<Experiment> getExperiments();

} // Model
