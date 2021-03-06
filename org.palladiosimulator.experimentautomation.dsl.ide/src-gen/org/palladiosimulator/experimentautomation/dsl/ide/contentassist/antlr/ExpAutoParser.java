/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.palladiosimulator.experimentautomation.dsl.ide.contentassist.antlr.internal.InternalExpAutoParser;
import org.palladiosimulator.experimentautomation.dsl.services.ExpAutoGrammarAccess;

public class ExpAutoParser extends AbstractContentAssistParser {

	@Inject
	private ExpAutoGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalExpAutoParser createParser() {
		InternalExpAutoParser result = new InternalExpAutoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getExperimentAccess().getDesignAlternatives_3_0(), "rule__Experiment__DesignAlternatives_3_0");
					put(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAlternatives_0(), "rule__ExperimentSpecifications__SpecificationsAlternatives_0");
					put(grammarAccess.getInitSpecificationsAccess().getSpecificationsAlternatives_0(), "rule__InitSpecifications__SpecificationsAlternatives_0");
					put(grammarAccess.getVariationAccess().getValueProviderAlternatives_13_0(), "rule__Variation__ValueProviderAlternatives_13_0");
					put(grammarAccess.getNestedIntervalsValueProviderAccess().getAlternatives(), "rule__NestedIntervalsValueProvider__Alternatives");
					put(grammarAccess.getSetValueProviderAccess().getAlternatives(), "rule__SetValueProvider__Alternatives");
					put(grammarAccess.getConfigValueAccess().getAlternatives(), "rule__ConfigValue__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getDatasourceAccess().getGroup(), "rule__Datasource__Group__0");
					put(grammarAccess.getDatasourceAccess().getGroup_4(), "rule__Datasource__Group_4__0");
					put(grammarAccess.getExperimentAccess().getGroup(), "rule__Experiment__Group__0");
					put(grammarAccess.getDescriptionAccess().getGroup(), "rule__Description__Group__0");
					put(grammarAccess.getInitialModelAccess().getGroup(), "rule__InitialModel__Group__0");
					put(grammarAccess.getAllocationModelAccess().getGroup(), "rule__AllocationModel__Group__0");
					put(grammarAccess.getUsageModelAccess().getGroup(), "rule__UsageModel__Group__0");
					put(grammarAccess.getMiddlewareRepositoryAccess().getGroup(), "rule__MiddlewareRepository__Group__0");
					put(grammarAccess.getEventMiddlewareRepositoryAccess().getGroup(), "rule__EventMiddlewareRepository__Group__0");
					put(grammarAccess.getMonitorRepositoryAccess().getGroup(), "rule__MonitorRepository__Group__0");
					put(grammarAccess.getVariationAccess().getGroup(), "rule__Variation__Group__0");
					put(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_0(), "rule__NestedIntervalsValueProvider__Group_0__0");
					put(grammarAccess.getNestedIntervalsValueProviderAccess().getGroup_1(), "rule__NestedIntervalsValueProvider__Group_1__0");
					put(grammarAccess.getSetValueProviderAccess().getGroup_0(), "rule__SetValueProvider__Group_0__0");
					put(grammarAccess.getSetValueProviderAccess().getGroup_0_2(), "rule__SetValueProvider__Group_0_2__0");
					put(grammarAccess.getSetValueProviderAccess().getGroup_1(), "rule__SetValueProvider__Group_1__0");
					put(grammarAccess.getSetValueProviderAccess().getGroup_1_3(), "rule__SetValueProvider__Group_1_3__0");
					put(grammarAccess.getLinearValueProviderAccess().getGroup(), "rule__LinearValueProvider__Group__0");
					put(grammarAccess.getExponentialValueProviderAccess().getGroup(), "rule__ExponentialValueProvider__Group__0");
					put(grammarAccess.getPolynomialValueProviderAccess().getGroup(), "rule__PolynomialValueProvider__Group__0");
					put(grammarAccess.getStopTimeConditionAccess().getGroup(), "rule__StopTimeCondition__Group__0");
					put(grammarAccess.getStopCountConditionAccess().getGroup(), "rule__StopCountCondition__Group__0");
					put(grammarAccess.getNumberOfExperimentsAccess().getGroup(), "rule__NumberOfExperiments__Group__0");
					put(grammarAccess.getSeedDefinitionAccess().getGroup(), "rule__SeedDefinition__Group__0");
					put(grammarAccess.getSeedDefinitionAccess().getGroup_4(), "rule__SeedDefinition__Group_4__0");
					put(grammarAccess.getListOfSeedsAccess().getGroup(), "rule__ListOfSeeds__Group__0");
					put(grammarAccess.getListOfSeedsAccess().getGroup_2(), "rule__ListOfSeeds__Group_2__0");
					put(grammarAccess.getExperimentDatasourceAccess().getGroup(), "rule__ExperimentDatasource__Group__0");
					put(grammarAccess.getToolDefinitionAccess().getGroup(), "rule__ToolDefinition__Group__0");
					put(grammarAccess.getToolDefinitionAccess().getGroup_3(), "rule__ToolDefinition__Group_3__0");
					put(grammarAccess.getConfigurationParamsAccess().getGroup(), "rule__ConfigurationParams__Group__0");
					put(grammarAccess.getModelAccess().getImportsAssignment_0(), "rule__Model__ImportsAssignment_0");
					put(grammarAccess.getModelAccess().getDatasourcesAssignment_1(), "rule__Model__DatasourcesAssignment_1");
					put(grammarAccess.getModelAccess().getExperimentsAssignment_2(), "rule__Model__ExperimentsAssignment_2");
					put(grammarAccess.getImportAccess().getPathAssignment_1(), "rule__Import__PathAssignment_1");
					put(grammarAccess.getDatasourceAccess().getNameAssignment_1(), "rule__Datasource__NameAssignment_1");
					put(grammarAccess.getDatasourceAccess().getSourceTypeAssignment_3(), "rule__Datasource__SourceTypeAssignment_3");
					put(grammarAccess.getDatasourceAccess().getSourceURIAssignment_4_1(), "rule__Datasource__SourceURIAssignment_4_1");
					put(grammarAccess.getExperimentAccess().getNameAssignment_1(), "rule__Experiment__NameAssignment_1");
					put(grammarAccess.getExperimentAccess().getDesignAssignment_3(), "rule__Experiment__DesignAssignment_3");
					put(grammarAccess.getExperimentAccess().getExperimentSpecificationsAssignment_5(), "rule__Experiment__ExperimentSpecificationsAssignment_5");
					put(grammarAccess.getExperimentSpecificationsAccess().getSpecificationsAssignment(), "rule__ExperimentSpecifications__SpecificationsAssignment");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment_2(), "rule__Description__DescriptionAssignment_2");
					put(grammarAccess.getInitialModelAccess().getModeltypAssignment_2(), "rule__InitialModel__ModeltypAssignment_2");
					put(grammarAccess.getInitialModelAccess().getInitSpecificationsAssignment_4(), "rule__InitialModel__InitSpecificationsAssignment_4");
					put(grammarAccess.getInitSpecificationsAccess().getSpecificationsAssignment(), "rule__InitSpecifications__SpecificationsAssignment");
					put(grammarAccess.getAllocationModelAccess().getAllocationAssignment_2(), "rule__AllocationModel__AllocationAssignment_2");
					put(grammarAccess.getUsageModelAccess().getUsageModelAssignment_2(), "rule__UsageModel__UsageModelAssignment_2");
					put(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositoryAssignment_2(), "rule__MiddlewareRepository__MiddlewareRepositoryAssignment_2");
					put(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositoryAssignment_2(), "rule__EventMiddlewareRepository__EventMiddelwareRepositoryAssignment_2");
					put(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositoryAssignment_2(), "rule__MonitorRepository__MonitorRepositoryAssignment_2");
					put(grammarAccess.getVariationAccess().getVariationTypAssignment_2(), "rule__Variation__VariationTypAssignment_2");
					put(grammarAccess.getVariationAccess().getNameAssignment_3(), "rule__Variation__NameAssignment_3");
					put(grammarAccess.getVariationAccess().getTargetAssignment_7(), "rule__Variation__TargetAssignment_7");
					put(grammarAccess.getVariationAccess().getMaxVariationsAssignment_10(), "rule__Variation__MaxVariationsAssignment_10");
					put(grammarAccess.getVariationAccess().getValueProviderAssignment_13(), "rule__Variation__ValueProviderAssignment_13");
					put(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_0_1(), "rule__NestedIntervalsValueProvider__MinAssignment_0_1");
					put(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_0_3(), "rule__NestedIntervalsValueProvider__MaxAssignment_0_3");
					put(grammarAccess.getNestedIntervalsValueProviderAccess().getMinAssignment_1_2(), "rule__NestedIntervalsValueProvider__MinAssignment_1_2");
					put(grammarAccess.getNestedIntervalsValueProviderAccess().getMaxAssignment_1_4(), "rule__NestedIntervalsValueProvider__MaxAssignment_1_4");
					put(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_1(), "rule__SetValueProvider__ValuesAssignment_0_1");
					put(grammarAccess.getSetValueProviderAccess().getValuesAssignment_0_2_1(), "rule__SetValueProvider__ValuesAssignment_0_2_1");
					put(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_2(), "rule__SetValueProvider__ValuesAssignment_1_2");
					put(grammarAccess.getSetValueProviderAccess().getValuesAssignment_1_3_1(), "rule__SetValueProvider__ValuesAssignment_1_3_1");
					put(grammarAccess.getLinearValueProviderAccess().getSummandAssignment_2(), "rule__LinearValueProvider__SummandAssignment_2");
					put(grammarAccess.getLinearValueProviderAccess().getFactorAssignment_4(), "rule__LinearValueProvider__FactorAssignment_4");
					put(grammarAccess.getExponentialValueProviderAccess().getBaseAssignment_2(), "rule__ExponentialValueProvider__BaseAssignment_2");
					put(grammarAccess.getPolynomialValueProviderAccess().getExponentAssignment_2(), "rule__PolynomialValueProvider__ExponentAssignment_2");
					put(grammarAccess.getPolynomialValueProviderAccess().getFactorAssignment_4(), "rule__PolynomialValueProvider__FactorAssignment_4");
					put(grammarAccess.getStopTimeConditionAccess().getStopTypAssignment_2(), "rule__StopTimeCondition__StopTypAssignment_2");
					put(grammarAccess.getStopTimeConditionAccess().getStopParamAssignment_4(), "rule__StopTimeCondition__StopParamAssignment_4");
					put(grammarAccess.getStopCountConditionAccess().getStopTypAssignment_2(), "rule__StopCountCondition__StopTypAssignment_2");
					put(grammarAccess.getStopCountConditionAccess().getStopParamAssignment_4(), "rule__StopCountCondition__StopParamAssignment_4");
					put(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsAssignment_2(), "rule__NumberOfExperiments__NumberOfRepetitionsAssignment_2");
					put(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_3(), "rule__SeedDefinition__SeedListsAssignment_3");
					put(grammarAccess.getSeedDefinitionAccess().getSeedListsAssignment_4_1(), "rule__SeedDefinition__SeedListsAssignment_4_1");
					put(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_1(), "rule__ListOfSeeds__SeedsAssignment_1");
					put(grammarAccess.getListOfSeedsAccess().getSeedsAssignment_2_1(), "rule__ListOfSeeds__SeedsAssignment_2_1");
					put(grammarAccess.getExperimentDatasourceAccess().getSourceAssignment_2(), "rule__ExperimentDatasource__SourceAssignment_2");
					put(grammarAccess.getToolDefinitionAccess().getToolAssignment_2(), "rule__ToolDefinition__ToolAssignment_2");
					put(grammarAccess.getToolDefinitionAccess().getConfigParamsAssignment_3_1(), "rule__ToolDefinition__ConfigParamsAssignment_3_1");
					put(grammarAccess.getConfigurationParamsAccess().getKeyAssignment_0(), "rule__ConfigurationParams__KeyAssignment_0");
					put(grammarAccess.getConfigurationParamsAccess().getValueAssignment_2(), "rule__ConfigurationParams__ValueAssignment_2");
					put(grammarAccess.getEObjectWithNameAccess().getNameAssignment(), "rule__EObjectWithName__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ExpAutoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ExpAutoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
