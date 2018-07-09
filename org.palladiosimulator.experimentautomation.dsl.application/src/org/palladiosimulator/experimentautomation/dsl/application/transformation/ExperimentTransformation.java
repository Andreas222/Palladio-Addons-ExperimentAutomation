package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import java.util.LinkedList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory;
import org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationFactoryImpl;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Description;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentDatasource;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentSpecifications;
import org.palladiosimulator.experimentautomation.dsl.expAuto.NumberOfExperiments;
import org.palladiosimulator.experimentautomation.dsl.expAuto.SeedDefinition;
import org.palladiosimulator.experimentautomation.dsl.expAuto.StopCountCondition;
import org.palladiosimulator.experimentautomation.dsl.expAuto.StopTimeCondition;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentDesign;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsFactory;
import org.palladiosimulator.experimentautomation.experiments.InitialModel;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
import org.palladiosimulator.experimentautomation.experiments.Variation;
import org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsFactoryImpl;

public class ExperimentTransformation {
	private ExperimentsFactory expFactory;
	private AbstractsimulationFactory absFactory;
	
	protected ExperimentTransformation() {
		expFactory = ExperimentsFactoryImpl.init();
		absFactory = AbstractsimulationFactoryImpl.init();
	}
	
	protected Experiment transformExperiment(org.palladiosimulator.experimentautomation.dsl.expAuto.Experiment old) {
		Experiment experiment = expFactory.createExperiment();
		
		experiment.setName(old.getName());
		experiment.setId(old.getName());
		experiment.setExperimentDesign(transformDesign(old.getDesign()));
		
		//TODO Defaultwert setzen
		experiment.setResponseMeasurement(null);
		
		transformExperimentSpecifications(experiment, old.getExperimentSpecifications());
		
		return experiment;
	}
	
	private ExperimentDesign transformDesign(String old) {
		if(old.equals("FullFactorial")) {
			return expFactory.createFullFactorialDesign();
		} else if(old.equals("OneFactor")) {
			return expFactory.createOneFactorAtATime();
		} else {
			return null;
		}
	}
	
	private void transformExperimentSpecifications(Experiment experiment, ExperimentSpecifications old) {
		EList<EObject> specifications = old.getSpecifications();
		EList<Variation> variations = new BasicEList<Variation>();
		EList<StopCondition> stopConditions = new BasicEList<StopCondition>();
		EList<ToolConfiguration> toolConfigurations = new BasicEList<ToolConfiguration>();
		VariationTransformation variationTransformation = new VariationTransformation();
		InitialModelTransformation initialModelTransformation = new InitialModelTransformation();
		
		for(int i = 0; i < specifications.size(); i++) {
			EObject currObject = specifications.get(i);
			if(currObject instanceof Description) {
				experiment.setDescription(transformDescription((Description)currObject));
			} else if(currObject instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.Variation) {
				Variation variation = variationTransformation.transformVariation((org.palladiosimulator.experimentautomation.dsl.expAuto.Variation)currObject);
				variations.add(variation);
			} else if(currObject instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.InitialModel) {
				InitialModel initialModel = initialModelTransformation.transformInitialModel((org.palladiosimulator.experimentautomation.dsl.expAuto.InitialModel)currObject);
				experiment.setInitialModel(initialModel);
			} else if(currObject instanceof StopTimeCondition) {
				StopCondition condition = transformStopTimeCondition((StopTimeCondition)currObject);
				stopConditions.add(condition);
			} else if(currObject instanceof StopCountCondition) {
				StopCondition condition = transformStopCountCondition((StopCountCondition)currObject);
				stopConditions.add(condition);
			} else if(currObject instanceof NumberOfExperiments) {
				experiment.setRepetitions(transformNumberOfExperiments((NumberOfExperiments)currObject));
			} else if(currObject instanceof ToolDefinition) {
				ToolConfiguration configuration = transformToolDefinition((ToolDefinition)currObject);
				toolConfigurations.add(configuration);
			} else if(currObject instanceof SeedDefinition) {
				//TODO Dummyimplementierung austauschen
				transformSeedDefinition((SeedDefinition)currObject);
			} else if(currObject instanceof ExperimentDatasource) {
				//TODO Dummyimplementierung austauschen
				transformExperimentDatasource((ExperimentDatasource)currObject);
			} else {
				// Never possible
			}
		}
		
		//TODO Zugriff auf das entsprechende EStructuralFeature ??
		//experiment.eSet(, variations)
		//experiment.eSet(, stopConditions);
		//experiment.eSet(, toolConfigurations);
		//TODO Listen anlegen notwendig? vgl. Beschreibung in Klasse ExpautoToExperiments
	}
	
	private String transformDescription(Description old) {
		return old.getDescription();
	}
	
	private StopCondition transformStopTimeCondition(StopTimeCondition old) {
		SimTimeStopCondition stopCondition = absFactory.createSimTimeStopCondition();
		stopCondition.setSimulationTime(old.getStopParam());
		return stopCondition;
	}
	
	private StopCondition transformStopCountCondition(StopCountCondition old) {
		MeasurementCountStopCondition stopCondition = absFactory.createMeasurementCountStopCondition();
		stopCondition.setMeasurementCount(old.getStopParam());
		return null;
	}
	
	private int transformNumberOfExperiments(NumberOfExperiments old) {
		return old.getNumberOfRepetitions();
	}
	
	private ToolConfiguration transformToolDefinition(ToolDefinition old) {
		//TODO entweder konkrete Erstellung des Tooladapters (String in Grammatik) oder keine Transformation notwendig (Abhängig von Grammatik)
		return null;
	}
	
	//TODO Entsprechung in Zielmodell finden
	private void transformSeedDefinition(SeedDefinition old) {
	}
	
	private void transformExperimentDatasource(ExperimentDatasource old) {
	}
}
