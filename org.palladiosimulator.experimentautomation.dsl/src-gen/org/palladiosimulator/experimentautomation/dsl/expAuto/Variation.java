/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getVariationTyp <em>Variation Typ</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getMaxVariations <em>Max Variations</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getValueProvider <em>Value Provider</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getVariation()
 * @model
 * @generated
 */
public interface Variation extends EObject
{
  /**
   * Returns the value of the '<em><b>Variation Typ</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variation Typ</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variation Typ</em>' attribute.
   * @see #setVariationTyp(String)
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getVariation_VariationTyp()
   * @model
   * @generated
   */
  String getVariationTyp();

  /**
   * Sets the value of the '{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getVariationTyp <em>Variation Typ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variation Typ</em>' attribute.
   * @see #getVariationTyp()
   * @generated
   */
  void setVariationTyp(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getVariation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Identifier)
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getVariation_Target()
   * @model
   * @generated
   */
  Identifier getTarget();

  /**
   * Sets the value of the '{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Identifier value);

  /**
   * Returns the value of the '<em><b>Max Variations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Variations</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Variations</em>' attribute.
   * @see #setMaxVariations(int)
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getVariation_MaxVariations()
   * @model
   * @generated
   */
  int getMaxVariations();

  /**
   * Sets the value of the '{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getMaxVariations <em>Max Variations</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Variations</em>' attribute.
   * @see #getMaxVariations()
   * @generated
   */
  void setMaxVariations(int value);

  /**
   * Returns the value of the '<em><b>Value Provider</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Provider</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Provider</em>' containment reference.
   * @see #setValueProvider(EObject)
   * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage#getVariation_ValueProvider()
   * @model containment="true"
   * @generated
   */
  EObject getValueProvider();

  /**
   * Sets the value of the '{@link org.palladiosimulator.experimentautomation.dsl.expAuto.Variation#getValueProvider <em>Value Provider</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Provider</em>' containment reference.
   * @see #getValueProvider()
   * @generated
   */
  void setValueProvider(EObject value);

} // Variation
