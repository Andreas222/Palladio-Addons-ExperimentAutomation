package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractSimulationConfiguration;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;

public class ToolConfigurationTransformation {
	protected ToolConfigurationTransformation() {
		
	}
	
	protected ToolConfiguration transformToolDefinition(ToolDefinition old) {
		//TODO konkrete Erstellung des Tooladapters (Factory aus Extension)
		AbstractSimulationConfiguration config = null;
		
		
		
		return config;
	}
	
	protected void completeToolConfigurationTransformation(AbstractSimulationConfiguration config, RandomNumberGeneratorSeed seeds, EDP2Datasource datasource) {
		config.setRandomNumberGeneratorSeed(seeds);
		config.setDatasource(datasource);
	}
}
