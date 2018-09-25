package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.MeasurementCountStopCondition;
//import org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.abstractsimulation.SimTimeStopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.StopCondition;
import org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationFactoryImpl;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Description;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentDatasource;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentSpecifications;
//import org.palladiosimulator.experimentautomation.dsl.expAuto.FileDatasourceSpecification;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ListOfSeeds;
//import org.palladiosimulator.experimentautomation.dsl.expAuto.MemoryDatasourceSpecification;
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
		VariationTransformation variationTransformation = new VariationTransformation();
		InitialModelTransformation initialModelTransformation = new InitialModelTransformation(rs);
		ToolConfigurationTransformation toolConfigurationTransformation = new ToolConfigurationTransformation();
		RandomNumberGeneratorSeed generatorSeeds = null;
		EDP2Datasource datasource = null;
		
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
				experiment.getStopConditions().add(transformStopTimeCondition((StopTimeCondition)currObject));
			} else if(currObject instanceof StopCountCondition) {
				experiment.getStopConditions().add(transformStopCountCondition((StopCountCondition)currObject));
			} else if(currObject instanceof NumberOfExperiments) {
				experiment.setRepetitions(transformNumberOfExperiments((NumberOfExperiments)currObject));
			} else if(currObject instanceof ToolDefinition) {
				experiment.getToolConfiguration().add(toolConfigurationTransformation.transformToolDefinition((ToolDefinition)currObject));
			} else if(currObject instanceof SeedDefinition) {
				generatorSeeds = transformSeedDefinition((SeedDefinition)currObject);
			} else if(currObject instanceof ExperimentDatasource) {
				datasource = transformExperimentDatasource((ExperimentDatasource)currObject);
			} else {
				// Never possible
			}
		}
		
		for(ToolConfiguration currConfig : experiment.getToolConfiguration()) {
			if(currConfig instanceof AbstractSimulationConfiguration) {
				toolConfigurationTransformation.completeToolConfigurationTransformation((AbstractSimulationConfiguration)currConfig, generatorSeeds, datasource);
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
		return stopCondition;
	}
	
	private int transformNumberOfExperiments(NumberOfExperiments old) {
		return old.getNumberOfRepetitions();
	}
	
	private RandomNumberGeneratorSeed transformSeedDefinition(SeedDefinition old) {
		RandomNumberGeneratorSeed generatorSeed = absFactory.createRandomNumberGeneratorSeed();
		LinkedList<Integer> seeds = new LinkedList<Integer>();
		
		for(ListOfSeeds currList : old.getSeedLists()){
			for(int currSeed : currList.getSeeds()){
				seeds.addLast(currSeed);
			}
		}
		
		int currIndex = 0;
		generatorSeed.setSeed0(seeds.get(currIndex));
		currIndex = (currIndex + 1) % seeds.size();
		generatorSeed.setSeed1(seeds.get(currIndex));
		currIndex = (currIndex + 1) % seeds.size();
		generatorSeed.setSeed2(seeds.get(currIndex));
		currIndex = (currIndex + 1) % seeds.size();
		generatorSeed.setSeed3(seeds.get(currIndex));
		currIndex = (currIndex + 1) % seeds.size();
		generatorSeed.setSeed4(seeds.get(currIndex));
		currIndex = (currIndex + 1) % seeds.size();
		generatorSeed.setSeed5(seeds.get(currIndex));
		currIndex = (currIndex + 1) % seeds.size();
		
		return generatorSeed;
	}
	
	private EDP2Datasource transformExperimentDatasource(ExperimentDatasource old) {
		EDP2Datasource datasource;
		String sourceURI = old.getSource().getSourceURI();
		
		if(sourceURI != null && !sourceURI.isEmpty()) {
			FileDatasource fds = absFactory.createFileDatasource();
			fds.setLocation(old.getSource().getSourceURI());
			datasource = fds;
		} else {
			datasource = absFactory.createMemoryDatasource();
		}
		
		datasource.setId(old.getSource().getName());
		return datasource;
	}
}
