package de.uka.ipd.sdq.experimentautomation.application;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.Bundle;

import de.uka.ipd.sdq.experimentautomation.application.controller.ExperimentController;
import de.uka.ipd.sdq.experimentautomation.experiments.Experiment;

public class ExperimentApplication implements IApplication {

    private ConfigurationModel config;

    @Override
    public Object start(final IApplicationContext context) throws Exception {
        // obtain command line arguments
        final String[] args = (String[]) context.getArguments().get("application.args");

        // check arguments
        if (args.length < 3) {
            System.out.println("The mandatory parameters have not been specified.");
            return IApplication.EXIT_OK;
        }

        // prepare experiment list, if parameter has been specified
        final List<String> experimentIds = new ArrayList<String>();
        if (args.length >= 4) {
            final String[] ids = args[3].split(";");
            for (final String id : ids) {
                experimentIds.add(id);
            }
        }

        // load configuration
        final Bundle bundle = Activator.getDefault().getBundle();
        final Path experimentsLocation = new Path(args[0]);
        final Path variationsLocation = new Path(args[1]);
        this.config = ConfigurationModel.loadFromBundle(bundle, experimentsLocation, variationsLocation);

        // filter experiment list
        final List<Experiment> filteredExperiments = new ArrayList<Experiment>();
        for (final Experiment e : this.config.getExperiments().getExperiments()) {
            for (final String id : experimentIds) {
                if (e.getId().equalsIgnoreCase(id)) {
                    filteredExperiments.add(e);
                    break;
                }
            }
        }

        // run experiments
        final ExperimentController controller = new ExperimentController(this.config, experimentsLocation,
                variationsLocation, args);

        final int repetitions = this.config.getExperiments().getRepetitions();
        if (experimentIds.isEmpty()) {
            controller.runExperiments(repetitions);
        } else {
            controller.runExperiment(filteredExperiments, repetitions);
        }

        return IApplication.EXIT_OK;
    }

    @Override
    public void stop() {
        // nothing to do
    }

}
