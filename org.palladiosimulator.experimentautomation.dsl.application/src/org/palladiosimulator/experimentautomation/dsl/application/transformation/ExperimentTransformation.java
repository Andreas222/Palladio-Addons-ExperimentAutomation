package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
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
	private ResourceSet rs;
	
	protected ExperimentTransformation(ResourceSet rs) {
		expFactory = ExperimentsFactoryImpl.init();
		absFactory = AbstractsimulationFactoryImpl.init();
		this.rs = rs;
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
		EList<StopCondition> stopConditions = new BasicEList<StopCondition>();
		VariationTransformation variationTransformation = new VariationTransformation();
		InitialModelTransformation initialModelTransformation = new InitialModelTransformation(rs);
		ToolConfigurationTransformation toolConfigurationTransformation = new ToolConfigurationTransformation();
		
		for(int i = 0; i < specifications.size(); i++) {
			EObject currObject = specifications.get(i);
			if(currObject instanceof Description) {
				experiment.setDescription(transformDescription((Description)currObject));
			} else if(currObject instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.Variation) {
				Variation variation = variationTransformation.transformVariation((org.palladiosimulator.experimentautomation.dsl.expAuto.Variation)currObject);
				experiment.getVariations().add(variation);
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
				ToolConfiguration configuration = toolConfigurationTransformation.transformToolDefinition((ToolDefinition)currObject);
				experiment.getToolConfiguration().add(configuration);
			} else if(currObject instanceof SeedDefinition) {
				//TODO Grammatik anpassen?
			} else if(currObject instanceof ExperimentDatasource) {
				//TODO Grammatik anpassen?
			} else {
				// Never possible
			}
		}
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
}
