package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import java.util.LinkedList;

import org.palladiosimulator.experimentautomation.dsl.expAuto.Model;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentRepository;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsFactory;
import org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsFactoryImpl;

public class ExpautoToExperimentsTransformation {
	private ExperimentsFactory factory;
	
	public ExpautoToExperimentsTransformation() {
		factory = ExperimentsFactoryImpl.init();
	}
	
	public ExperimentRepository transformExpautoToExperiments(Model old) {
		ExperimentTransformation experimentTransformation = new ExperimentTransformation();
		LinkedList<Experiment> experiments = new LinkedList<Experiment>();
		ExperimentRepository experimentRepository = factory.createExperimentRepository();
		
		for(org.palladiosimulator.experimentautomation.dsl.expAuto.Experiment currExperiment : old.getExperiments()) {
			Experiment experiment = experimentTransformation.transformExperiment(currExperiment);
			experiments.addFirst(experiment);
		}
		
		//TODO
		//Import und Datasource?
		
		//TODO
		//experimentRepository.setExperiments(experiments)
		
		return experimentRepository;
	}
}
