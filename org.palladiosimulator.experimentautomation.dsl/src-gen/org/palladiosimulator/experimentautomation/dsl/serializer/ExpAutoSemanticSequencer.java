/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.palladiosimulator.experimentautomation.dsl.expAuto.AllocationModel;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ConfigurationParams;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Datasource;
import org.palladiosimulator.experimentautomation.dsl.expAuto.DatasourceSpecification;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Description;
import org.palladiosimulator.experimentautomation.dsl.expAuto.EventMiddlewareRepository;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Experiment;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentDatasource;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentSpecifications;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExponentialValueProvider;
import org.palladiosimulator.experimentautomation.dsl.expAuto.FileDatasourceSpecification;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Import;
import org.palladiosimulator.experimentautomation.dsl.expAuto.InitSpecifications;
import org.palladiosimulator.experimentautomation.dsl.expAuto.InitialModel;
import org.palladiosimulator.experimentautomation.dsl.expAuto.KeyValue;
import org.palladiosimulator.experimentautomation.dsl.expAuto.LinearValueProvider;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ListOfSeeds;
import org.palladiosimulator.experimentautomation.dsl.expAuto.MemoryDatasourceSpecification;
import org.palladiosimulator.experimentautomation.dsl.expAuto.MiddlewareRepository;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Model;
import org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository;
import org.palladiosimulator.experimentautomation.dsl.expAuto.NestedIntervalsValueProvider;
import org.palladiosimulator.experimentautomation.dsl.expAuto.NumberOfExperiments;
import org.palladiosimulator.experimentautomation.dsl.expAuto.PolynomialValueProvider;
import org.palladiosimulator.experimentautomation.dsl.expAuto.SeedDefinition;
import org.palladiosimulator.experimentautomation.dsl.expAuto.SetValueProvider;
import org.palladiosimulator.experimentautomation.dsl.expAuto.StopCountCondition;
import org.palladiosimulator.experimentautomation.dsl.expAuto.StopTimeCondition;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition;
import org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Variation;
import org.palladiosimulator.experimentautomation.dsl.services.ExpAutoGrammarAccess;

@SuppressWarnings("all")
public class ExpAutoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpAutoGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ExpAutoPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ExpAutoPackage.ALLOCATION_MODEL:
				sequence_AllocationModel(context, (AllocationModel) semanticObject); 
				return; 
			case ExpAutoPackage.CONFIGURATION_PARAMS:
				sequence_ConfigurationParams(context, (ConfigurationParams) semanticObject); 
				return; 
			case ExpAutoPackage.DATASOURCE:
				sequence_Datasource(context, (Datasource) semanticObject); 
				return; 
			case ExpAutoPackage.DATASOURCE_SPECIFICATION:
				sequence_DatasourceSpecification(context, (DatasourceSpecification) semanticObject); 
				return; 
			case ExpAutoPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case ExpAutoPackage.EVENT_MIDDLEWARE_REPOSITORY:
				sequence_EventMiddlewareRepository(context, (EventMiddlewareRepository) semanticObject); 
				return; 
			case ExpAutoPackage.EXPERIMENT:
				sequence_Experiment(context, (Experiment) semanticObject); 
				return; 
			case ExpAutoPackage.EXPERIMENT_DATASOURCE:
				sequence_ExperimentDatasource(context, (ExperimentDatasource) semanticObject); 
				return; 
			case ExpAutoPackage.EXPERIMENT_SPECIFICATIONS:
				sequence_ExperimentSpecifications(context, (ExperimentSpecifications) semanticObject); 
				return; 
			case ExpAutoPackage.EXPONENTIAL_VALUE_PROVIDER:
				sequence_ExponentialValueProvider(context, (ExponentialValueProvider) semanticObject); 
				return; 
			case ExpAutoPackage.FILE_DATASOURCE_SPECIFICATION:
				sequence_FileDatasourceSpecification(context, (FileDatasourceSpecification) semanticObject); 
				return; 
			case ExpAutoPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ExpAutoPackage.INIT_SPECIFICATIONS:
				sequence_InitSpecifications(context, (InitSpecifications) semanticObject); 
				return; 
			case ExpAutoPackage.INITIAL_MODEL:
				sequence_InitialModel(context, (InitialModel) semanticObject); 
				return; 
			case ExpAutoPackage.KEY_VALUE:
				sequence_KeyValue(context, (KeyValue) semanticObject); 
				return; 
			case ExpAutoPackage.LINEAR_VALUE_PROVIDER:
				sequence_LinearValueProvider(context, (LinearValueProvider) semanticObject); 
				return; 
			case ExpAutoPackage.LIST_OF_SEEDS:
				sequence_ListOfSeeds(context, (ListOfSeeds) semanticObject); 
				return; 
			case ExpAutoPackage.MEMORY_DATASOURCE_SPECIFICATION:
				sequence_MemoryDatasourceSpecification(context, (MemoryDatasourceSpecification) semanticObject); 
				return; 
			case ExpAutoPackage.MIDDLEWARE_REPOSITORY:
				sequence_MiddlewareRepository(context, (MiddlewareRepository) semanticObject); 
				return; 
			case ExpAutoPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ExpAutoPackage.MONITOR_REPOSITORY:
				sequence_MonitorRepository(context, (MonitorRepository) semanticObject); 
				return; 
			case ExpAutoPackage.NESTED_INTERVALS_VALUE_PROVIDER:
				sequence_NestedIntervalsValueProvider(context, (NestedIntervalsValueProvider) semanticObject); 
				return; 
			case ExpAutoPackage.NUMBER_OF_EXPERIMENTS:
				sequence_NumberOfExperiments(context, (NumberOfExperiments) semanticObject); 
				return; 
			case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER:
				sequence_PolynomialValueProvider(context, (PolynomialValueProvider) semanticObject); 
				return; 
			case ExpAutoPackage.SEED_DEFINITION:
				sequence_SeedDefinition(context, (SeedDefinition) semanticObject); 
				return; 
			case ExpAutoPackage.SET_VALUE_PROVIDER:
				sequence_SetValueProvider(context, (SetValueProvider) semanticObject); 
				return; 
			case ExpAutoPackage.STOP_COUNT_CONDITION:
				sequence_StopCountCondition(context, (StopCountCondition) semanticObject); 
				return; 
			case ExpAutoPackage.STOP_TIME_CONDITION:
				sequence_StopTimeCondition(context, (StopTimeCondition) semanticObject); 
				return; 
			case ExpAutoPackage.TOOL_DEFINITION:
				sequence_ToolDefinition(context, (ToolDefinition) semanticObject); 
				return; 
			case ExpAutoPackage.USAGE_MODEL:
				sequence_UsageModel(context, (UsageModel) semanticObject); 
				return; 
			case ExpAutoPackage.VARIATION:
				sequence_Variation(context, (Variation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AllocationModel returns AllocationModel
	 *
	 * Constraint:
	 *     allocation=STRING
	 */
	protected void sequence_AllocationModel(ISerializationContext context, AllocationModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.ALLOCATION_MODEL__ALLOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.ALLOCATION_MODEL__ALLOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAllocationModelAccess().getAllocationSTRINGTerminalRuleCall_2_0(), semanticObject.getAllocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ConfigurationParams returns ConfigurationParams
	 *
	 * Constraint:
	 *     (params+=SeedDefinition | params+=ExperimentDatasource | params+=StopTimeCondition | params+=StopCountCondition | params+=KeyValue)+
	 */
	protected void sequence_ConfigurationParams(ISerializationContext context, ConfigurationParams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DatasourceSpecification returns DatasourceSpecification
	 *
	 * Constraint:
	 *     (specification=FileDatasourceSpecification | specification=MemoryDatasourceSpecification)
	 */
	protected void sequence_DatasourceSpecification(ISerializationContext context, DatasourceSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Datasource returns Datasource
	 *
	 * Constraint:
	 *     (name=ID specification=DatasourceSpecification)
	 */
	protected void sequence_Datasource(ISerializationContext context, Datasource semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.DATASOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.DATASOURCE__NAME));
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.DATASOURCE__SPECIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.DATASOURCE__SPECIFICATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDatasourceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDatasourceAccess().getSpecificationDatasourceSpecificationParserRuleCall_3_0(), semanticObject.getSpecification());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Description returns Description
	 *
	 * Constraint:
	 *     description=STRING
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.DESCRIPTION__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.DESCRIPTION__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EventMiddlewareRepository returns EventMiddlewareRepository
	 *
	 * Constraint:
	 *     eventMiddelwareRepository=STRING
	 */
	protected void sequence_EventMiddlewareRepository(ISerializationContext context, EventMiddlewareRepository semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.EVENT_MIDDLEWARE_REPOSITORY__EVENT_MIDDELWARE_REPOSITORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.EVENT_MIDDLEWARE_REPOSITORY__EVENT_MIDDELWARE_REPOSITORY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventMiddlewareRepositoryAccess().getEventMiddelwareRepositorySTRINGTerminalRuleCall_2_0(), semanticObject.getEventMiddelwareRepository());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExperimentDatasource returns ExperimentDatasource
	 *
	 * Constraint:
	 *     source=[Datasource|ID]
	 */
	protected void sequence_ExperimentDatasource(ISerializationContext context, ExperimentDatasource semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.EXPERIMENT_DATASOURCE__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.EXPERIMENT_DATASOURCE__SOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExperimentDatasourceAccess().getSourceDatasourceIDTerminalRuleCall_2_0_1(), semanticObject.eGet(ExpAutoPackage.Literals.EXPERIMENT_DATASOURCE__SOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExperimentSpecifications returns ExperimentSpecifications
	 *
	 * Constraint:
	 *     (
	 *         specifications+=Description | 
	 *         specifications+=InitialModel | 
	 *         specifications+=Variation | 
	 *         specifications+=StopTimeCondition | 
	 *         specifications+=StopCountCondition | 
	 *         specifications+=NumberOfExperiments | 
	 *         specifications+=ToolDefinition
	 *     )+
	 */
	protected void sequence_ExperimentSpecifications(ISerializationContext context, ExperimentSpecifications semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Experiment returns Experiment
	 *
	 * Constraint:
	 *     (name=ID (design='FullFactorial' | design='OneFactor') experimentSpecifications=ExperimentSpecifications)
	 */
	protected void sequence_Experiment(ISerializationContext context, Experiment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExponentialValueProvider returns ExponentialValueProvider
	 *
	 * Constraint:
	 *     base=INT
	 */
	protected void sequence_ExponentialValueProvider(ISerializationContext context, ExponentialValueProvider semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.EXPONENTIAL_VALUE_PROVIDER__BASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.EXPONENTIAL_VALUE_PROVIDER__BASE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExponentialValueProviderAccess().getBaseINTTerminalRuleCall_2_0(), semanticObject.getBase());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FileDatasourceSpecification returns FileDatasourceSpecification
	 *
	 * Constraint:
	 *     (sourceType='EDP2' sourceURI=STRING)
	 */
	protected void sequence_FileDatasourceSpecification(ISerializationContext context, FileDatasourceSpecification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.FILE_DATASOURCE_SPECIFICATION__SOURCE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.FILE_DATASOURCE_SPECIFICATION__SOURCE_TYPE));
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.FILE_DATASOURCE_SPECIFICATION__SOURCE_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.FILE_DATASOURCE_SPECIFICATION__SOURCE_URI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFileDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0_0(), semanticObject.getSourceType());
		feeder.accept(grammarAccess.getFileDatasourceSpecificationAccess().getSourceURISTRINGTerminalRuleCall_2_0(), semanticObject.getSourceURI());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     path=STRING
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.IMPORT__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.IMPORT__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     InitSpecifications returns InitSpecifications
	 *
	 * Constraint:
	 *     (
	 *         specifications+=AllocationModel | 
	 *         specifications+=UsageModel | 
	 *         specifications+=MiddlewareRepository | 
	 *         specifications+=EventMiddlewareRepository | 
	 *         specifications+=MonitorRepository
	 *     )+
	 */
	protected void sequence_InitSpecifications(ISerializationContext context, InitSpecifications semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InitialModel returns InitialModel
	 *
	 * Constraint:
	 *     (modeltyp='PCM' initSpecifications=InitSpecifications)
	 */
	protected void sequence_InitialModel(ISerializationContext context, InitialModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.INITIAL_MODEL__MODELTYP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.INITIAL_MODEL__MODELTYP));
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.INITIAL_MODEL__INIT_SPECIFICATIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.INITIAL_MODEL__INIT_SPECIFICATIONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInitialModelAccess().getModeltypPCMKeyword_2_0(), semanticObject.getModeltyp());
		feeder.accept(grammarAccess.getInitialModelAccess().getInitSpecificationsInitSpecificationsParserRuleCall_4_0(), semanticObject.getInitSpecifications());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KeyValue returns KeyValue
	 *
	 * Constraint:
	 *     (key=ID value=ConfigValue)
	 */
	protected void sequence_KeyValue(ISerializationContext context, KeyValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.KEY_VALUE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.KEY_VALUE__KEY));
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.KEY_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.KEY_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKeyValueAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getKeyValueAccess().getValueConfigValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LinearValueProvider returns LinearValueProvider
	 *
	 * Constraint:
	 *     (summand=INT factor=INT)
	 */
	protected void sequence_LinearValueProvider(ISerializationContext context, LinearValueProvider semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.LINEAR_VALUE_PROVIDER__SUMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.LINEAR_VALUE_PROVIDER__SUMMAND));
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.LINEAR_VALUE_PROVIDER__FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.LINEAR_VALUE_PROVIDER__FACTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLinearValueProviderAccess().getSummandINTTerminalRuleCall_2_0(), semanticObject.getSummand());
		feeder.accept(grammarAccess.getLinearValueProviderAccess().getFactorINTTerminalRuleCall_4_0(), semanticObject.getFactor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ListOfSeeds returns ListOfSeeds
	 *
	 * Constraint:
	 *     (seeds+=INT seeds+=INT*)
	 */
	protected void sequence_ListOfSeeds(ISerializationContext context, ListOfSeeds semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MemoryDatasourceSpecification returns MemoryDatasourceSpecification
	 *
	 * Constraint:
	 *     sourceType='EDP2'
	 */
	protected void sequence_MemoryDatasourceSpecification(ISerializationContext context, MemoryDatasourceSpecification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.MEMORY_DATASOURCE_SPECIFICATION__SOURCE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.MEMORY_DATASOURCE_SPECIFICATION__SOURCE_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMemoryDatasourceSpecificationAccess().getSourceTypeEDP2Keyword_0(), semanticObject.getSourceType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MiddlewareRepository returns MiddlewareRepository
	 *
	 * Constraint:
	 *     middlewareRepository=STRING
	 */
	protected void sequence_MiddlewareRepository(ISerializationContext context, MiddlewareRepository semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.MIDDLEWARE_REPOSITORY__MIDDLEWARE_REPOSITORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.MIDDLEWARE_REPOSITORY__MIDDLEWARE_REPOSITORY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMiddlewareRepositoryAccess().getMiddlewareRepositorySTRINGTerminalRuleCall_2_0(), semanticObject.getMiddlewareRepository());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (imports+=Import+ datasources+=Datasource+ experiments+=Experiment+)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MonitorRepository returns MonitorRepository
	 *
	 * Constraint:
	 *     monitorRepository=STRING
	 */
	protected void sequence_MonitorRepository(ISerializationContext context, MonitorRepository semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.MONITOR_REPOSITORY__MONITOR_REPOSITORY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.MONITOR_REPOSITORY__MONITOR_REPOSITORY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMonitorRepositoryAccess().getMonitorRepositorySTRINGTerminalRuleCall_2_0(), semanticObject.getMonitorRepository());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NestedIntervalsValueProvider returns NestedIntervalsValueProvider
	 *
	 * Constraint:
	 *     ((min=INT max=INT) | (min=INT max=INT))
	 */
	protected void sequence_NestedIntervalsValueProvider(ISerializationContext context, NestedIntervalsValueProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NumberOfExperiments returns NumberOfExperiments
	 *
	 * Constraint:
	 *     numberOfRepetitions=INT
	 */
	protected void sequence_NumberOfExperiments(ISerializationContext context, NumberOfExperiments semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.NUMBER_OF_EXPERIMENTS__NUMBER_OF_REPETITIONS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.NUMBER_OF_EXPERIMENTS__NUMBER_OF_REPETITIONS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberOfExperimentsAccess().getNumberOfRepetitionsINTTerminalRuleCall_2_0(), semanticObject.getNumberOfRepetitions());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PolynomialValueProvider returns PolynomialValueProvider
	 *
	 * Constraint:
	 *     (exponent=INT factor=INT)
	 */
	protected void sequence_PolynomialValueProvider(ISerializationContext context, PolynomialValueProvider semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.POLYNOMIAL_VALUE_PROVIDER__EXPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.POLYNOMIAL_VALUE_PROVIDER__EXPONENT));
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.POLYNOMIAL_VALUE_PROVIDER__FACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.POLYNOMIAL_VALUE_PROVIDER__FACTOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPolynomialValueProviderAccess().getExponentINTTerminalRuleCall_2_0(), semanticObject.getExponent());
		feeder.accept(grammarAccess.getPolynomialValueProviderAccess().getFactorINTTerminalRuleCall_4_0(), semanticObject.getFactor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SeedDefinition returns SeedDefinition
	 *
	 * Constraint:
	 *     (seedLists+=ListOfSeeds seedLists+=ListOfSeeds*)
	 */
	protected void sequence_SeedDefinition(ISerializationContext context, SeedDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SetValueProvider returns SetValueProvider
	 *
	 * Constraint:
	 *     ((values+=INT values+=INT*) | (values+=INT values+=INT*))
	 */
	protected void sequence_SetValueProvider(ISerializationContext context, SetValueProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StopCountCondition returns StopCountCondition
	 *
	 * Constraint:
	 *     (stopTyp='measurementCount' stopParam=INT)
	 */
	protected void sequence_StopCountCondition(ISerializationContext context, StopCountCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.STOP_COUNT_CONDITION__STOP_TYP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.STOP_COUNT_CONDITION__STOP_TYP));
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.STOP_COUNT_CONDITION__STOP_PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.STOP_COUNT_CONDITION__STOP_PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStopCountConditionAccess().getStopTypMeasurementCountKeyword_2_0(), semanticObject.getStopTyp());
		feeder.accept(grammarAccess.getStopCountConditionAccess().getStopParamINTTerminalRuleCall_4_0(), semanticObject.getStopParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StopTimeCondition returns StopTimeCondition
	 *
	 * Constraint:
	 *     (stopTyp='simulationTime' stopParam=INT)
	 */
	protected void sequence_StopTimeCondition(ISerializationContext context, StopTimeCondition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.STOP_TIME_CONDITION__STOP_TYP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.STOP_TIME_CONDITION__STOP_TYP));
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.STOP_TIME_CONDITION__STOP_PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.STOP_TIME_CONDITION__STOP_PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStopTimeConditionAccess().getStopTypSimulationTimeKeyword_2_0(), semanticObject.getStopTyp());
		feeder.accept(grammarAccess.getStopTimeConditionAccess().getStopParamINTTerminalRuleCall_4_0(), semanticObject.getStopParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ToolDefinition returns ToolDefinition
	 *
	 * Constraint:
	 *     (tool=STRING configParams=ConfigurationParams)
	 */
	protected void sequence_ToolDefinition(ISerializationContext context, ToolDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.TOOL_DEFINITION__TOOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.TOOL_DEFINITION__TOOL));
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.TOOL_DEFINITION__CONFIG_PARAMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.TOOL_DEFINITION__CONFIG_PARAMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getToolDefinitionAccess().getToolSTRINGTerminalRuleCall_2_0(), semanticObject.getTool());
		feeder.accept(grammarAccess.getToolDefinitionAccess().getConfigParamsConfigurationParamsParserRuleCall_4_0(), semanticObject.getConfigParams());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UsageModel returns UsageModel
	 *
	 * Constraint:
	 *     usageModel=STRING
	 */
	protected void sequence_UsageModel(ISerializationContext context, UsageModel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExpAutoPackage.Literals.USAGE_MODEL__USAGE_MODEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpAutoPackage.Literals.USAGE_MODEL__USAGE_MODEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUsageModelAccess().getUsageModelSTRINGTerminalRuleCall_2_0(), semanticObject.getUsageModel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Variation returns Variation
	 *
	 * Constraint:
	 *     (
	 *         variationTyp=[ValueVariation|ID] 
	 *         name=ID 
	 *         target=[Identifier|ID] 
	 *         maxVariations=INT 
	 *         (
	 *             valueProvider=NestedIntervalsValueProvider | 
	 *             valueProvider=SetValueProvider | 
	 *             valueProvider=LinearValueProvider | 
	 *             valueProvider=ExponentialValueProvider | 
	 *             valueProvider=PolynomialValueProvider
	 *         )
	 *     )
	 */
	protected void sequence_Variation(ISerializationContext context, Variation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
