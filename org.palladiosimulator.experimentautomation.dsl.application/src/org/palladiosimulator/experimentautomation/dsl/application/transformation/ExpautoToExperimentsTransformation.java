package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
		ResourceSet rs = new ResourceSetImpl();
		//TODO URI festlegen
		Resource res = rs.createResource(null);
		//TODO Save options festlegen
		//res.save(null);
		
		ExperimentTransformation experimentTransformation = new ExperimentTransformation(rs);
		ExperimentRepository experimentRepository = factory.createExperimentRepository();
		
		for(org.palladiosimulator.experimentautomation.dsl.expAuto.Experiment currExperiment : old.getExperiments()) {
			Experiment experiment = experimentTransformation.transformExperiment(currExperiment);
			experimentRepository.getExperiments().add(experiment);
		}
		
		res.getContents().add(experimentRepository);
		//res.save(null);
		
		return experimentRepository;
	}
}
