package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Model;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentRepository;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsFactory;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsFactoryImpl;

public class ExpautoToExperimentsTransformation {
	private ExperimentsFactory factory;
	
	public ExpautoToExperimentsTransformation() {
		factory = ExperimentsFactoryImpl.init();
	}
	
	public ExperimentRepository transformExpautoToExperiments(Model old) {
		ExperimentTransformation experimentTransformation = new ExperimentTransformation();
		EList<Experiment> experiments = new BasicEList<Experiment>();
		ExperimentRepository experimentRepository = factory.createExperimentRepository();
		
		for(org.palladiosimulator.experimentautomation.dsl.expAuto.Experiment currExperiment : old.getExperiments()) {
			Experiment experiment = experimentTransformation.transformExperiment(currExperiment);
			experiments.add(experiment);
		}
		
		//TODO Import und Datasource Transformation notwendig?
		
		//TODO Zugriff auf das entsprechende EStructuralFeature ??
		//experimentRepository.eSet(, experiments);
		//TODO muss die Liste noch angelegt werden? 
		// In #eset wird vorhandene Liste geleert und Elemente übergebener Liste eingefügt,
		// also weder übergebene Liste übernommen noch Liste erstellt
		// In der Factory wird auch keine Liste erstellt
		// Problem gilt auch für Listen in Klasse ExperimentTransformation
		
		return experimentRepository;
	}
}
