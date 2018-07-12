package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.experimentautomation.abstractsimulation.AbstractsimulationFactory;
import org.palladiosimulator.experimentautomation.abstractsimulation.EDP2Datasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.FileDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.MemoryDatasource;
import org.palladiosimulator.experimentautomation.abstractsimulation.RandomNumberGeneratorSeed;
import org.palladiosimulator.experimentautomation.abstractsimulation.impl.AbstractsimulationFactoryImpl;
import org.palladiosimulator.experimentautomation.dsl.expAuto.SeedDefinition;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentDatasource;
import org.palladiosimulator.experimentautomation.dsl.expAuto.FileDatasourceSpecification;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ListOfSeeds;
import org.palladiosimulator.experimentautomation.dsl.expAuto.MemoryDatasourceSpecification;
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
	
	private EDP2Datasource transformExperimentDatasource(ExperimentDatasource old) {
		EDP2Datasource datasource;
		EObject specification = old.getSource().getSpecification().getSpecification();
		
		if(specification instanceof FileDatasourceSpecification) {
			datasource = transformFileDatasource((FileDatasourceSpecification)specification);
		} else if(specification instanceof MemoryDatasourceSpecification) {
			datasource = transformMemoryDatasource((MemoryDatasourceSpecification)specification);
		} else {
			//sollte nie passieren
			return null;
		}
		
		datasource.setId(old.getSource().getName());
		
		return datasource;
	}
	
	private FileDatasource transformFileDatasource(FileDatasourceSpecification old) {
		FileDatasource datasource = factory.createFileDatasource();
		datasource.setLocation(old.getSourceURI());
		return datasource;
	}
	
	private MemoryDatasource transformMemoryDatasource(MemoryDatasourceSpecification old) {
		MemoryDatasource datasource = factory.createMemoryDatasource();
		return datasource;
	}
}
