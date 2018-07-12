/**
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.expAuto.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.palladiosimulator.experimentautomation.dsl.expAuto.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage
 * @generated
 */
public class ExpAutoSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ExpAutoPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpAutoSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ExpAutoPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ExpAutoPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.DATASOURCE:
      {
        Datasource datasource = (Datasource)theEObject;
        T result = caseDatasource(datasource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.DATASOURCE_SPECIFICATION:
      {
        DatasourceSpecification datasourceSpecification = (DatasourceSpecification)theEObject;
        T result = caseDatasourceSpecification(datasourceSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.FILE_DATASOURCE_SPECIFICATION:
      {
        FileDatasourceSpecification fileDatasourceSpecification = (FileDatasourceSpecification)theEObject;
        T result = caseFileDatasourceSpecification(fileDatasourceSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.MEMORY_DATASOURCE_SPECIFICATION:
      {
        MemoryDatasourceSpecification memoryDatasourceSpecification = (MemoryDatasourceSpecification)theEObject;
        T result = caseMemoryDatasourceSpecification(memoryDatasourceSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.EXPERIMENT:
      {
        Experiment experiment = (Experiment)theEObject;
        T result = caseExperiment(experiment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.EXPERIMENT_SPECIFICATIONS:
      {
        ExperimentSpecifications experimentSpecifications = (ExperimentSpecifications)theEObject;
        T result = caseExperimentSpecifications(experimentSpecifications);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.DESCRIPTION:
      {
        Description description = (Description)theEObject;
        T result = caseDescription(description);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.INITIAL_MODEL:
      {
        InitialModel initialModel = (InitialModel)theEObject;
        T result = caseInitialModel(initialModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.INIT_SPECIFICATIONS:
      {
        InitSpecifications initSpecifications = (InitSpecifications)theEObject;
        T result = caseInitSpecifications(initSpecifications);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.ALLOCATION_MODEL:
      {
        AllocationModel allocationModel = (AllocationModel)theEObject;
        T result = caseAllocationModel(allocationModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.USAGE_MODEL:
      {
        UsageModel usageModel = (UsageModel)theEObject;
        T result = caseUsageModel(usageModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.MIDDLEWARE_REPOSITORY:
      {
        MiddlewareRepository middlewareRepository = (MiddlewareRepository)theEObject;
        T result = caseMiddlewareRepository(middlewareRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.EVENT_MIDDLEWARE_REPOSITORY:
      {
        EventMiddlewareRepository eventMiddlewareRepository = (EventMiddlewareRepository)theEObject;
        T result = caseEventMiddlewareRepository(eventMiddlewareRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.MONITOR_REPOSITORY:
      {
        MonitorRepository monitorRepository = (MonitorRepository)theEObject;
        T result = caseMonitorRepository(monitorRepository);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.VARIATION:
      {
        Variation variation = (Variation)theEObject;
        T result = caseVariation(variation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.NESTED_INTERVALS_VALUE_PROVIDER:
      {
        NestedIntervalsValueProvider nestedIntervalsValueProvider = (NestedIntervalsValueProvider)theEObject;
        T result = caseNestedIntervalsValueProvider(nestedIntervalsValueProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.SET_VALUE_PROVIDER:
      {
        SetValueProvider setValueProvider = (SetValueProvider)theEObject;
        T result = caseSetValueProvider(setValueProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.LINEAR_VALUE_PROVIDER:
      {
        LinearValueProvider linearValueProvider = (LinearValueProvider)theEObject;
        T result = caseLinearValueProvider(linearValueProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.EXPONENTIAL_VALUE_PROVIDER:
      {
        ExponentialValueProvider exponentialValueProvider = (ExponentialValueProvider)theEObject;
        T result = caseExponentialValueProvider(exponentialValueProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.POLYNOMIAL_VALUE_PROVIDER:
      {
        PolynomialValueProvider polynomialValueProvider = (PolynomialValueProvider)theEObject;
        T result = casePolynomialValueProvider(polynomialValueProvider);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.STOP_TIME_CONDITION:
      {
        StopTimeCondition stopTimeCondition = (StopTimeCondition)theEObject;
        T result = caseStopTimeCondition(stopTimeCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.STOP_COUNT_CONDITION:
      {
        StopCountCondition stopCountCondition = (StopCountCondition)theEObject;
        T result = caseStopCountCondition(stopCountCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.NUMBER_OF_EXPERIMENTS:
      {
        NumberOfExperiments numberOfExperiments = (NumberOfExperiments)theEObject;
        T result = caseNumberOfExperiments(numberOfExperiments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.SEED_DEFINITION:
      {
        SeedDefinition seedDefinition = (SeedDefinition)theEObject;
        T result = caseSeedDefinition(seedDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.LIST_OF_SEEDS:
      {
        ListOfSeeds listOfSeeds = (ListOfSeeds)theEObject;
        T result = caseListOfSeeds(listOfSeeds);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.EXPERIMENT_DATASOURCE:
      {
        ExperimentDatasource experimentDatasource = (ExperimentDatasource)theEObject;
        T result = caseExperimentDatasource(experimentDatasource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.TOOL_DEFINITION:
      {
        ToolDefinition toolDefinition = (ToolDefinition)theEObject;
        T result = caseToolDefinition(toolDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ExpAutoPackage.CONFIGURATION_PARAMS:
      {
        ConfigurationParams configurationParams = (ConfigurationParams)theEObject;
        T result = caseConfigurationParams(configurationParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datasource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datasource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasource(Datasource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datasource Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datasource Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatasourceSpecification(DatasourceSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File Datasource Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File Datasource Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFileDatasourceSpecification(FileDatasourceSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Memory Datasource Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Memory Datasource Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemoryDatasourceSpecification(MemoryDatasourceSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experiment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experiment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperiment(Experiment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experiment Specifications</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experiment Specifications</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperimentSpecifications(ExperimentSpecifications object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescription(Description object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initial Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initial Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialModel(InitialModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Specifications</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Specifications</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitSpecifications(InitSpecifications object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allocation Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allocation Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllocationModel(AllocationModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Usage Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Usage Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsageModel(UsageModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Middleware Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Middleware Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMiddlewareRepository(MiddlewareRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Middleware Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Middleware Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventMiddlewareRepository(EventMiddlewareRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Monitor Repository</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Monitor Repository</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonitorRepository(MonitorRepository object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariation(Variation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Intervals Value Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Intervals Value Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedIntervalsValueProvider(NestedIntervalsValueProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Value Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Value Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetValueProvider(SetValueProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linear Value Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linear Value Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinearValueProvider(LinearValueProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exponential Value Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exponential Value Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExponentialValueProvider(ExponentialValueProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Polynomial Value Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Polynomial Value Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePolynomialValueProvider(PolynomialValueProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stop Time Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stop Time Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStopTimeCondition(StopTimeCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stop Count Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stop Count Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStopCountCondition(StopCountCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Of Experiments</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Of Experiments</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberOfExperiments(NumberOfExperiments object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Seed Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Seed Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSeedDefinition(SeedDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Of Seeds</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Of Seeds</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListOfSeeds(ListOfSeeds object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Experiment Datasource</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Experiment Datasource</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExperimentDatasource(ExperimentDatasource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tool Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseToolDefinition(ToolDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigurationParams(ConfigurationParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ExpAutoSwitch
