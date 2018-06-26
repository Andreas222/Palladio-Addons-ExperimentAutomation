/**
 * generated by Xtext 2.13.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Value Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.LinearValueProvider#getSummand <em>Summand</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.LinearValueProvider#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getLinearValueProvider()
 * @model
 * @generated
 */
public interface LinearValueProvider extends EObject
{
  /**
   * Returns the value of the '<em><b>Summand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Summand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Summand</em>' attribute.
   * @see #setSummand(int)
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getLinearValueProvider_Summand()
   * @model
   * @generated
   */
  int getSummand();

  /**
   * Sets the value of the '{@link org.palladiosimulator.experimentautomation.dsl.expAuto.LinearValueProvider#getSummand <em>Summand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Summand</em>' attribute.
   * @see #getSummand()
   * @generated
   */
  void setSummand(int value);

  /**
   * Returns the value of the '<em><b>Factor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' attribute.
   * @see #setFactor(int)
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getLinearValueProvider_Factor()
   * @model
   * @generated
   */
  int getFactor();

  /**
   * Sets the value of the '{@link org.palladiosimulator.experimentautomation.dsl.expAuto.LinearValueProvider#getFactor <em>Factor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' attribute.
   * @see #getFactor()
   * @generated
   */
  void setFactor(int value);

} // LinearValueProvider