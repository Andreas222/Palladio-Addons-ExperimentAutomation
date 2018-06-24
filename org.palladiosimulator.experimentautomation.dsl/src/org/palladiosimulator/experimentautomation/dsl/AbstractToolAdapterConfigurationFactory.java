package org.palladiosimulator.experimentautomation.dsl;

import java.util.HashMap;

public abstract class AbstractToolAdapterConfigurationFactory {
	public abstract org.palladiosimulator.experimentautomation.experiments.ToolConfiguration createToolConfiguration(HashMap<String, ?> configParams);
}
