package org.palladiosimulator.experimentautomation.application.config;

import java.util.List;

import org.palladiosimulator.experimentautomation.experiments.Experiment;

import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;

public class ExperimentAutomationConfiguration extends AbstractWorkflowBasedRunConfiguration {

    private List<Experiment> experiments;

    public void setExperiments(final List<Experiment> experiments) {
        this.experiments = experiments;
    }

    public List<Experiment> getExperiments() {
        return this.experiments;
    }

    @Override
    public String getErrorMessage() {
        // must be null; otherwise a non-empty error message will result in
        // a workflow config being considered invalid
        return null;
    }

    @Override
    public void setDefaults() {
        throw new RuntimeException("Not implemented. No defaults defined.");
    }

}
