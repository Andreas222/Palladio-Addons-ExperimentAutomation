/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition#getTool <em>Tool</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition#getConfigParams <em>Config Params</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getToolDefinition()
 * @model
 * @generated
 */
public interface ToolDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Tool</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tool</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tool</em>' reference.
   * @see #setTool(EObjectWithName)
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getToolDefinition_Tool()
   * @model
   * @generated
   */
  EObjectWithName getTool();

  /**
   * Sets the value of the '{@link org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition#getTool <em>Tool</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tool</em>' reference.
   * @see #getTool()
   * @generated
   */
  void setTool(EObjectWithName value);

  /**
   * Returns the value of the '<em><b>Config Params</b></em>' containment reference list.
   * The list contents are of type {@link org.palladiosimulator.experimentautomation.dsl.expAuto.ConfigurationParams}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config Params</em>' containment reference list.
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getToolDefinition_ConfigParams()
   * @model containment="true"
   * @generated
   */
  EList<ConfigurationParams> getConfigParams();

} // ToolDefinition
