package org.palladiosimulator.experimentautomation.application.tooladapter.abstractsimulation;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.AbstractSimulationWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.pcm.ConstantsContainer;
import de.uka.ipd.sdq.workflow.pcm.configurations.AbstractCodeGenerationWorkflowRunConfiguration.CodeGenerationAdvice;

/**
 * @author Sebastian Lehrig
 */
public class AbstractSimulationWorkflowConfigurationFactory {

    private static final String DEFAULT_CONNECTOR_FEATURE_CONFIG = "pathmap://PCM_MODELS/ConnectorConfig.featureconfig";

    public static void fillWorkflowConfiguration(final AbstractSimulationWorkflowConfiguration workflowConfig) {

        /***************************************************/
        /** General ****************************************/
        /***************************************************/
        /** Kind of workflow run */
        workflowConfig.setDebug(false);
        workflowConfig.setInteractive(false); // TODO
        workflowConfig.setCodeGenerationAdvicesFile(CodeGenerationAdvice.SIMULATION);

        /***************************************************/
        /** Architecture Model(s) Tab **********************/
        /***************************************************/
        // loaded to blackboard; no need to specify here!

        /***************************************************/
        /** Analysis Configuration Tab *********************/
        /***************************************************/
        /** Location of temporary data */
        workflowConfig.setStoragePluginID(ConstantsContainer.DEFAULT_TEMPORARY_DATA_LOCATION);
        workflowConfig.setOverwriteWithoutAsking(true); // TODO ensure that no folders can be
                                                        // deleted accidentally

        /** Temporary Data */
        workflowConfig.setDeleteTemporaryDataAfterAnalysis(true); // TODO

        /** Accuracy influence analysis */
        workflowConfig.setAccuracyInfluenceAnalysisEnabled(false);

        /** Sensitivity Analysis Parameters */
        workflowConfig.setSensitivityAnalysisEnabled(false); // TODO Sensitivity analysis should be
                                                             // replaced by Experiment AUtomation

        /***************************************************/
        /** Feature Settings Tab ***************************/
        /***************************************************/
        /** PCM2EJB Feature Configuration File */
        workflowConfig.setFeatureConfigFile(DEFAULT_CONNECTOR_FEATURE_CONFIG);
    }

}
