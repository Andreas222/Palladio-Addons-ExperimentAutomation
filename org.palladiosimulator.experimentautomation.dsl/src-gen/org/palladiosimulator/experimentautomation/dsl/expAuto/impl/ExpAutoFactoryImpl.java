/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.experimentautomation.dsl.expAuto.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpAutoFactoryImpl extends EFactoryImpl implements ExpAutoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpAutoFactory init()
  {
    try
    {
      ExpAutoFactory theExpAutoFactory = (ExpAutoFactory)EPackage.Registry.INSTANCE.getEFactory(ExpAutoPackage.eNS_URI);
      if (theExpAutoFactory != null)
      {
        return theExpAutoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExpAutoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpAutoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExpAutoPackage.MODEL: return createModel();
      case ExpAutoPackage.IMPORT: return createImport();
      case ExpAutoPackage.DATASOURCE: return createDatasource();
      case ExpAutoPackage.DATASOURCE_SPECIFICATION: return createDatasourceSpecification();
      case ExpAutoPackage.FILE_DATASOURCE_SPECIFICATION: return createFileDatasourceSpecification();
      case ExpAutoPackage.MEMORY_DATASOURCE_SPECIFICATION: return createMemoryDatasourceSpecification();
      case ExpAutoPackage.EXPERIMENT: return createExperiment();
      case ExpAutoPackage.EXPERIMENT_SPECIFICATIONS: return createExperimentSpecifications();
      case ExpAutoPackage.DESCRIPTION: return createDescription();
      case ExpAutoPackage.INITIAL_MODEL: return createInitialModel();
      case ExpAutoPackage.INIT_SPECIFICATIONS: return createInitSpecifications();
      case ExpAutoPackage.ALLOCATION_MODEL: return createAllocationModel();
      case ExpAutoPackage.USAGE_MODEL: return createUsageModel();
      case ExpAutoPackage.MIDDLEWARE_REPOSITORY: return createMiddlewareRepository();
      case ExpAutoPackage.EVENT_MIDDLEWARE_REPOSITORY: return createEventMiddlewareRepository();
      case ExpAutoPackage.MONITOR_REPOSITORY: return createMonitorRepository();
      case ExpAutoPackage.VARIATION: return createVariation();
      case ExpAutoPackage.NESTED_INTERVALS_VALUE_PROVIDER: return createNestedIntervalsValueProvider();
      case ExpAutoPackage.SET_VALUE_PROVIDER: return createSetValueProvider();
      case ExpAutoPackage.LINEAR_VALUE_PROVIDER: return createLinearValueProvider();
      case ExpAutoPackage.EXPONENTIAL_VALUE_PROVIDER: return createExponentialValueProvider();
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER: return createPolynomialValueProvider();
      case ExpAutoPackage.STOP_TIME_CONDITION: return createStopTimeCondition();
      case ExpAutoPackage.STOP_COUNT_CONDITION: return createStopCountCondition();
      case ExpAutoPackage.NUMBER_OF_EXPERIMENTS: return createNumberOfExperiments();
      case ExpAutoPackage.TOOL_DEFINITION: return createToolDefinition();
      case ExpAutoPackage.CONFIGURATION_PARAMS: return createConfigurationParams();
      case ExpAutoPackage.SEED_DEFINITION: return createSeedDefinition();
      case ExpAutoPackage.LIST_OF_SEEDS: return createListOfSeeds();
      case ExpAutoPackage.EXPERIMENT_DATASOURCE: return createExperimentDatasource();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datasource createDatasource()
  {
    DatasourceImpl datasource = new DatasourceImpl();
    return datasource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatasourceSpecification createDatasourceSpecification()
  {
    DatasourceSpecificationImpl datasourceSpecification = new DatasourceSpecificationImpl();
    return datasourceSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileDatasourceSpecification createFileDatasourceSpecification()
  {
    FileDatasourceSpecificationImpl fileDatasourceSpecification = new FileDatasourceSpecificationImpl();
    return fileDatasourceSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemoryDatasourceSpecification createMemoryDatasourceSpecification()
  {
    MemoryDatasourceSpecificationImpl memoryDatasourceSpecification = new MemoryDatasourceSpecificationImpl();
    return memoryDatasourceSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Experiment createExperiment()
  {
    ExperimentImpl experiment = new ExperimentImpl();
    return experiment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExperimentSpecifications createExperimentSpecifications()
  {
    ExperimentSpecificationsImpl experimentSpecifications = new ExperimentSpecificationsImpl();
    return experimentSpecifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialModel createInitialModel()
  {
    InitialModelImpl initialModel = new InitialModelImpl();
    return initialModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitSpecifications createInitSpecifications()
  {
    InitSpecificationsImpl initSpecifications = new InitSpecificationsImpl();
    return initSpecifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllocationModel createAllocationModel()
  {
    AllocationModelImpl allocationModel = new AllocationModelImpl();
    return allocationModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsageModel createUsageModel()
  {
    UsageModelImpl usageModel = new UsageModelImpl();
    return usageModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MiddlewareRepository createMiddlewareRepository()
  {
    MiddlewareRepositoryImpl middlewareRepository = new MiddlewareRepositoryImpl();
    return middlewareRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventMiddlewareRepository createEventMiddlewareRepository()
  {
    EventMiddlewareRepositoryImpl eventMiddlewareRepository = new EventMiddlewareRepositoryImpl();
    return eventMiddlewareRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonitorRepository createMonitorRepository()
  {
    MonitorRepositoryImpl monitorRepository = new MonitorRepositoryImpl();
    return monitorRepository;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variation createVariation()
  {
    VariationImpl variation = new VariationImpl();
    return variation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedIntervalsValueProvider createNestedIntervalsValueProvider()
  {
    NestedIntervalsValueProviderImpl nestedIntervalsValueProvider = new NestedIntervalsValueProviderImpl();
    return nestedIntervalsValueProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetValueProvider createSetValueProvider()
  {
    SetValueProviderImpl setValueProvider = new SetValueProviderImpl();
    return setValueProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinearValueProvider createLinearValueProvider()
  {
    LinearValueProviderImpl linearValueProvider = new LinearValueProviderImpl();
    return linearValueProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExponentialValueProvider createExponentialValueProvider()
  {
    ExponentialValueProviderImpl exponentialValueProvider = new ExponentialValueProviderImpl();
    return exponentialValueProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PolynomialValueProvider createPolynomialValueProvider()
  {
    PolynomialValueProviderImpl polynomialValueProvider = new PolynomialValueProviderImpl();
    return polynomialValueProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StopTimeCondition createStopTimeCondition()
  {
    StopTimeConditionImpl stopTimeCondition = new StopTimeConditionImpl();
    return stopTimeCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StopCountCondition createStopCountCondition()
  {
    StopCountConditionImpl stopCountCondition = new StopCountConditionImpl();
    return stopCountCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberOfExperiments createNumberOfExperiments()
  {
    NumberOfExperimentsImpl numberOfExperiments = new NumberOfExperimentsImpl();
    return numberOfExperiments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToolDefinition createToolDefinition()
  {
    ToolDefinitionImpl toolDefinition = new ToolDefinitionImpl();
    return toolDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationParams createConfigurationParams()
  {
    ConfigurationParamsImpl configurationParams = new ConfigurationParamsImpl();
    return configurationParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeedDefinition createSeedDefinition()
  {
    SeedDefinitionImpl seedDefinition = new SeedDefinitionImpl();
    return seedDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListOfSeeds createListOfSeeds()
  {
    ListOfSeedsImpl listOfSeeds = new ListOfSeedsImpl();
    return listOfSeeds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExperimentDatasource createExperimentDatasource()
  {
    ExperimentDatasourceImpl experimentDatasource = new ExperimentDatasourceImpl();
    return experimentDatasource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpAutoPackage getExpAutoPackage()
  {
    return (ExpAutoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExpAutoPackage getPackage()
  {
    return ExpAutoPackage.eINSTANCE;
  }

} //ExpAutoFactoryImpl
