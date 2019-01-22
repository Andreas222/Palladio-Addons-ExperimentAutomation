package org.palladiosimulator.experimentautomation.dsl.application.workflow;

import java.util.ArrayList;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.experimentautomation.application.config.ExperimentAutomationConfiguration;
import org.palladiosimulator.experimentautomation.experiments.Experiment;
import org.palladiosimulator.experimentautomation.experiments.ExperimentRepository;
import org.eclipse.core.runtime.CoreException;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import org.palladiosimulator.experimentautomation.dsl.application.transformation.ExpautoToExperimentsTransformation;
import org.palladiosimulator.experimentautomation.dsl.expAuto.Model;
import org.palladiosimulator.experimentautomation.dsl.expAuto.ExpAutoPackage;

public class ExperimentAutomationDslLaunchConfigurationBasedConfigBuilder extends AbstractWorkflowConfigurationBuilder {

    public ExperimentAutomationDslLaunchConfigurationBasedConfigBuilder(ILaunchConfiguration configuration, String mode)
            throws CoreException {
        super(configuration, mode);
    }

    @Override
    public void fillConfiguration(AbstractWorkflowBasedRunConfiguration configuration) throws CoreException {
    	ExpautoToExperimentsTransformation transformation = new ExpautoToExperimentsTransformation();
        final ExperimentAutomationConfiguration config = (ExperimentAutomationConfiguration) configuration;

        config.setExperiments(new ArrayList<Experiment>()); // TODO determine default experiment

        //final String experimentsURI = hasAttribute(ExperimentAutomationDslConfigurationTab.EXPERIMENT_AUTOMATION)
        //? getStringAttribute(ExperimentAutomationDslConfigurationTab.EXPERIMENT_AUTOMATION)
        //: ExperimentAutomationDslConfigurationTab.DEFAULT_EXPERIMENTS;
        
        final String dslURI = hasAttribute(ExperimentAutomationDslConfigurationTab.EXPERIMENT_AUTOMATION)
        ? getStringAttribute(ExperimentAutomationDslConfigurationTab.EXPERIMENT_AUTOMATION)
        : ExperimentAutomationDslConfigurationTab.DEFAULT_EXPERIMENTS;

        //config.setExperiments(getExperimentRepository(experimentsURI).getExperiments());
        Model model = getDSLRepository(dslURI);
        ExperimentRepository expRepo = transformation.transformExpautoToExperiments(model);
        EList<Experiment> expList = expRepo.getExperiments();
        config.setExperiments(expList);
        //config.setExperiments(transformation.transformExpautoToExperiments(getDSLRepository(dslURI)).getExperiments());
        config.setAttributes(this.properties);
    }

    private Model getDSLRepository(final String dslURIString) {
        final URI dslURI = URI.createURI(dslURIString);
        final ResourceSet resourceSet = new ResourceSetImpl();
        final Resource resource = resourceSet.getResource(dslURI, true);
        final EObject eObject = resource.getContents().get(0);
        
        if(ExpAutoPackage.eINSTANCE.getModel().isInstance(eObject)) {
        	return (Model) eObject;
        } else {
        	throw new RuntimeException("The root element of the loaded resource is not of the expected type "
        			+ ExpAutoPackage.eINSTANCE.getModel().getName());
        }
    }

}
