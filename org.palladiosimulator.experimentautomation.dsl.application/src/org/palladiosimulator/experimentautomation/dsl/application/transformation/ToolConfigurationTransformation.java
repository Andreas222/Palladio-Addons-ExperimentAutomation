package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import java.util.LinkedList;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationFactoryImpl;
import org.palladiosimulator.experimentautomation.dsl.expAuto.SeedDefinition;
//import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentFileDatasource;
//import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentMemoryDatasource;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ListOfSeeds;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;

public class ToolConfigurationTransformation {
	private AbstractsimulationFactory factory;
	
	protected ToolConfigurationTransformation() {
		factory = AbstractsimulationFactoryImpl.init();
	}
	
	protected ToolConfiguration transformToolDefinition(ToolDefinition old) {
		//TODO entweder konkrete Erstellung des Tooladapters (String in Grammatik) oder keine Transformation notwendig (Abhängig von Grammatik)
		return null;
	}
	
	private RandomNumberGeneratorSeed transformSeedDefinition(SeedDefinition old) {
		RandomNumberGeneratorSeed generatorSeed = factory.createRandomNumberGeneratorSeed();
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
	
	//TODO: Anpassung an Grammatik
	/*
	private FileDatasource transformExperimentFileDatasource(ExperimentFileDatasource old) {
		FileDatasource datasource = factory.createFileDatasource();
		
		datasource.setId(old.getSource().getName());
		datasource.setLocation(old.getSource().getSourceURI());
		
		return datasource;
	}
	
	private MemoryDatasource transformExperimentMemoryDatasource(ExperimentMemoryDatasource old) {
		MemoryDatasource datasource = factory.createMemoryDatasource();
		
		datasource.setId(old.getSource().getName());
		
		return datasource;
	}*/
}
