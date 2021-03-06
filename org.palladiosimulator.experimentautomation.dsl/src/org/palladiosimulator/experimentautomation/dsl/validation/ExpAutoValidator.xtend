/*
 * generated by Xtext 2.12.0
 */
package org.palladiosimulator.experimentautomation.dsl.validation

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check
import org.palladiosimulator.experimentautomation.dsl.expAuto.AllocationModel
import org.palladiosimulator.experimentautomation.dsl.expAuto.Description
import org.palladiosimulator.experimentautomation.dsl.expAuto.EventMiddlewareRepository
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentDatasource
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExperimentSpecifications
import org.palladiosimulator.experimentautomation.dsl.expAuto.InitSpecifications
import org.palladiosimulator.experimentautomation.dsl.expAuto.InitialModel
import org.palladiosimulator.experimentautomation.dsl.expAuto.MiddlewareRepository
import org.palladiosimulator.experimentautomation.dsl.expAuto.Model
import org.palladiosimulator.experimentautomation.dsl.expAuto.MonitorRepository
import org.palladiosimulator.experimentautomation.dsl.expAuto.NumberOfExperiments
import org.palladiosimulator.experimentautomation.dsl.expAuto.SeedDefinition
import org.palladiosimulator.experimentautomation.dsl.expAuto.StopCountCondition
import org.palladiosimulator.experimentautomation.dsl.expAuto.StopTimeCondition
import org.palladiosimulator.experimentautomation.dsl.expAuto.ToolDefinition
import org.palladiosimulator.experimentautomation.dsl.expAuto.UsageModel
import org.palladiosimulator.experimentautomation.dsl.expAuto.Variation

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ExpAutoValidator extends AbstractExpAutoValidator {
	
	int i = 0;
	int j = 0;
	int sizeOfDatasourceList;
	int sizeOfExperimentList;
	int sizeOfVariationList;
	List<Variation> listOfVariations;
	
	@Check
	def void checkDatasourceName(Model model){
		sizeOfDatasourceList = model.getDatasources().size();
		
		for(i = 0; i < sizeOfDatasourceList; i++){
			for(j = 0; j < sizeOfDatasourceList; j++){
				if(i != j && model.getDatasources.get(i).getName().equals(model.getDatasources.get(j).getName)){
					error('Jeder Name f�r eine Datenquelle darf nur einmal vergeben werden.', ExpAutoPackage.Literals.MODEL__DATASOURCES, 'invalidDatasourceName')
				}
			}
		}
	}
	
	@Check
	def void checkExperimentName(Model model){
		sizeOfExperimentList = model.getExperiments().size();
		
		for(i = 0; i < sizeOfExperimentList; i++){
			for(j = 0; j < sizeOfExperimentList; j++){
				if(i != j && model.getExperiments.get(i).getName().equals(model.getExperiments.get(j).getName)){
					error('Jeder Name f�r ein Experiment darf nur einmal vergeben werden.', ExpAutoPackage.Literals.MODEL__EXPERIMENTS, 'invalidExperimentName')
				}
			}
		}
	}
	
	@Check
	def void checkVariationName(ExperimentSpecifications experiment){
		listOfVariations = EcoreUtil2.getAllContentsOfType(experiment, Variation);
		sizeOfVariationList = listOfVariations.size();
		
		for(i = 0; i < sizeOfVariationList; i++){
			for(j = 0; j < sizeOfVariationList; j++){
				if(i != j && listOfVariations.get(i).getName().equals(listOfVariations.get(j).getName)){
					error('Jeder Name f�r eine Variation darf pro Experiment nur einmal vergeben werden.', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidVariationName')
				}
			}
		}
	}

	int numberOfAllocationModels;
	int numberOfUsageModels;
	int numberOfMiddlewareRepositories;
	int numberOfEventMiddlewareRepositories;
	int numberOfMonitorRepositories;

	@Check
	def void checkInitModelSpecification(InitSpecifications specifications){
		numberOfAllocationModels = 0;
		numberOfUsageModels = 0;
		numberOfMiddlewareRepositories = 0;
		numberOfEventMiddlewareRepositories = 0;
		numberOfMonitorRepositories = 0;
		
		for(EObject currObj : specifications.getSpecifications()){
			if(currObj instanceof AllocationModel){
				numberOfAllocationModels++;
			} else if(currObj instanceof UsageModel){
				numberOfUsageModels++;
			} else if(currObj instanceof MiddlewareRepository){
				numberOfMiddlewareRepositories++;
			} else if(currObj instanceof EventMiddlewareRepository){
				numberOfEventMiddlewareRepositories++;
			} else if(currObj instanceof MonitorRepository){
				numberOfMonitorRepositories++;
			}
		}
		
		if(numberOfAllocationModels != 1){
			error('Es muss genau ein Allocation Modell angegeben werden', ExpAutoPackage.Literals.INIT_SPECIFICATIONS__SPECIFICATIONS, 'invalidInitModel')
		} else if(numberOfUsageModels != 1){
			error('Es muss genau ein Usage Modell angegeben werden', ExpAutoPackage.Literals.INIT_SPECIFICATIONS__SPECIFICATIONS, 'invalidInitModel')
		} else if(numberOfMiddlewareRepositories > 1){
			error('Es darf maximal ein Middleware Repository angegeben werden', ExpAutoPackage.Literals.INIT_SPECIFICATIONS__SPECIFICATIONS, 'invalidInitModel')
		} else if(numberOfEventMiddlewareRepositories > 1){
			error('Es darf maximal ein Event Middleware Repository angegeben werden', ExpAutoPackage.Literals.INIT_SPECIFICATIONS__SPECIFICATIONS, 'invalidInitModel')
		} else if(numberOfMonitorRepositories != 1){
			error('Es muss genau ein Monitor Repository angegeben werden', ExpAutoPackage.Literals.INIT_SPECIFICATIONS__SPECIFICATIONS, 'invalidInitModel')
		}
	}
	
	int numberOfDescriptions;
	int numberOfInitModels;
	int numberOfVariations;
	int numberOfTimeConditions;
	int numberOfCountConditions;
	int numberOfExperimentCounter;
	int numberOfTooldefinitions;
		int numberOfSeedDefinitions
	int numberOfDatasources;
	
	@Check
	def void checkExperimentSpecification(ExperimentSpecifications specifications){
		numberOfDescriptions = 0;
		numberOfInitModels = 0;
		numberOfVariations = 0;
		numberOfTimeConditions = 0;
		numberOfCountConditions = 0;
		numberOfExperimentCounter = 0;
		numberOfTooldefinitions = 0;
		numberOfSeedDefinitions = 0;
		numberOfDatasources = 0;
		
		for(EObject currObj : specifications.getSpecifications()){
			if(currObj instanceof Description){
				numberOfDescriptions++;
			} else if(currObj instanceof InitialModel){
				numberOfInitModels++;
			} else if(currObj instanceof Variation){
				numberOfVariations++;
			} else if(currObj instanceof StopTimeCondition){
				numberOfTimeConditions++;
			} else if(currObj instanceof StopCountCondition){
				numberOfCountConditions++;
			} else if(currObj instanceof NumberOfExperiments){
				numberOfExperimentCounter++;
			} else if(currObj instanceof ToolDefinition){
				numberOfTooldefinitions++;
			} else if(currObj instanceof SeedDefinition){
				numberOfSeedDefinitions++;
			} else if(currObj instanceof ExperimentDatasource){
				numberOfDatasources++;
			}
		}
		
		if(numberOfDescriptions > 1){
			error('Es darf maximal eine Beschreibung angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		} else if(numberOfInitModels != 1){
			error('Es muss genau ein initiales Modell angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		} else if(numberOfVariations < 1){
			error('Es muss mindestens eine Variation angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		} else if(numberOfTimeConditions > 1){
			error('Es darf maximal eine Zeitabbruchbedingung angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		} else if(numberOfCountConditions > 1){
			error('Es darf maximal eine Z�hlabbruchbedingung angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		} else if(numberOfCountConditions + numberOfTimeConditions < 1){
			error('Es muss mindestens eine Abbruchbedingung angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		} else if(numberOfSeedDefinitions > 1){
			error('Die Seeds d�rfen maximal einmal angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		} else if(numberOfDatasources != 1){
			error('Es muss genau eine Datasource angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		} else if(numberOfExperimentCounter != 1){
			error('Die Anzahl der Experimentdurchl�ufe muss genau einmal angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		} else if(numberOfTooldefinitions < 1){
			error('Es muss mindestens eine Toolkonfiguration angegeben werden', ExpAutoPackage.Literals.EXPERIMENT_SPECIFICATIONS__SPECIFICATIONS, 'invalidExperiment')
		}
	}
}
