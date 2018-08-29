package org.palladiosimulator.experimentautomation.dsl.application.tooladapter.simucom;

import java.util.HashMap;

import org.palladiosimulator.experimentautomation.dsl.extensionPoint.AbstractToolAdapterConfigurationFactory;
import org.palladiosimulator.experimentautomation.experiments.ToolConfiguration;
import org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.SimucomtooladapterFactory;
import org.palladiosimulator.experimentautomation.application.tooladapter.simucom.model.impl.SimucomtooladapterFactoryImpl;

public class Factory extends AbstractToolAdapterConfigurationFactory {

	@Override
	public ToolConfiguration createToolConfiguration(HashMap<String, ?> configParams) {
		SimucomtooladapterFactory factory = new SimucomtooladapterFactoryImpl();
		return factory.createSimuComConfiguration();
	}

}
