/**
 */
package org.palladiosimulator.experimentautomation.experiments;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>Experiment
 * Repository</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.ExperimentRepository#getExperiments <em>Experiments</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperimentRepository()
 * @model
 * @generated
 */
public interface ExperimentRepository extends EObject {

    /**
     * Returns the value of the '<em><b>Experiments</b></em>' containment reference list. The list
     * contents are of type
     * {@link org.palladiosimulator.experimentautomation.experiments.Experiment}. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Experiments</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Experiments</em>' containment reference list.
     * @see org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage#getExperimentRepository_Experiments()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<Experiment> getExperiments();

} // ExperimentRepository
