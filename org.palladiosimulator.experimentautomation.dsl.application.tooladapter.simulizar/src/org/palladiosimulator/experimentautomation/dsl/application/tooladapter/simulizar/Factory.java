package org.palladiosimulator.experimentautomation.dsl.application.tooladapter.simulizar;

import java.util.HashMap;

import org.palladiosimulator.experimentautomation.dsl.extensionPoint.AbstractToolAdapterConfigurationFactory;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.SimulizartooladapterFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.simulizar.model.impl.SimulizartooladapterFactoryImpl;

public class Factory extends AbstractToolAdapterConfigurationFactory {

	@Override
	public ToolConfiguration createToolConfiguration(HashMap<String, ?> configParams) {
		SimulizartooladapterFactory factory = new SimulizartooladapterFactoryImpl();
		return factory.createSimuLizarConfiguration();
	}

}
