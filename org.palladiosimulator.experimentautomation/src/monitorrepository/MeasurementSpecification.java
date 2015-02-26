/**
 */
package monitorrepository;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.metricspec.MetricDescription;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Measurement Specification</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A measurement specification for a pcm element including the performance
 * metric and the statistical charaterization. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link monitorrepository.MeasurementSpecification#getTemporalRestriction <em>Temporal
 * Restriction</em>}</li>
 * <li>{@link monitorrepository.MeasurementSpecification#getStatisticalCharacterization <em>
 * Statistical Characterization</em>}</li>
 * <li>{@link monitorrepository.MeasurementSpecification#getMetricDescription <em>Metric Description
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see monitorrepository.MonitorrepositoryPackage#getMeasurementSpecification()
 * @model
 * @generated
 */
public interface MeasurementSpecification extends EObject, Identifier {
    /**
     * Returns the value of the '<em><b>Temporal Restriction</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Temporal Restriction</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Temporal Restriction</em>' containment reference.
     * @see #setTemporalRestriction(TemporalCharacterization)
     * @see monitorrepository.MonitorrepositoryPackage#getMeasurementSpecification_TemporalRestriction()
     * @model containment="true" required="true"
     * @generated
     */
    TemporalCharacterization getTemporalRestriction();

    /**
     * Sets the value of the '
     * {@link monitorrepository.MeasurementSpecification#getTemporalRestriction
     * <em>Temporal Restriction</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Temporal Restriction</em>' containment reference.
     * @see #getTemporalRestriction()
     * @generated
     */
    void setTemporalRestriction(TemporalCharacterization value);

    /**
     * Returns the value of the '<em><b>Statistical Characterization</b></em>' attribute. The
     * literals are from the enumeration {@link monitorrepository.StatisticalCharacterizationEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Statistical Characterization</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Statistical Characterization</em>' attribute.
     * @see monitorrepository.StatisticalCharacterizationEnum
     * @see #setStatisticalCharacterization(StatisticalCharacterizationEnum)
     * @see monitorrepository.MonitorrepositoryPackage#getMeasurementSpecification_StatisticalCharacterization()
     * @model required="true"
     * @generated
     */
    StatisticalCharacterizationEnum getStatisticalCharacterization();

    /**
     * Sets the value of the '
     * {@link monitorrepository.MeasurementSpecification#getStatisticalCharacterization
     * <em>Statistical Characterization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Statistical Characterization</em>' attribute.
     * @see monitorrepository.StatisticalCharacterizationEnum
     * @see #getStatisticalCharacterization()
     * @generated
     */
    void setStatisticalCharacterization(StatisticalCharacterizationEnum value);

    /**
     * Returns the value of the '<em><b>Metric Description</b></em>' reference. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Metric Description</em>' reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Metric Description</em>' reference.
     * @see #setMetricDescription(MetricDescription)
     * @see monitorrepository.MonitorrepositoryPackage#getMeasurementSpecification_MetricDescription()
     * @model required="true"
     * @generated
     */
    MetricDescription getMetricDescription();

    /**
     * Sets the value of the '
     * {@link monitorrepository.MeasurementSpecification#getMetricDescription
     * <em>Metric Description</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Metric Description</em>' reference.
     * @see #getMetricDescription()
     * @generated
     */
    void setMetricDescription(MetricDescription value);

} // MeasurementSpecification
