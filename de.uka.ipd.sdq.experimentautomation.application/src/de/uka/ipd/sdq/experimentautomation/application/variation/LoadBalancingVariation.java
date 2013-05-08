package de.uka.ipd.sdq.experimentautomation.application.variation;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.core.CoreFactory;
import de.uka.ipd.sdq.pcm.core.PCMRandomVariable;
import de.uka.ipd.sdq.pcm.parameter.VariableUsage;
import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.RequiredRole;
import de.uka.ipd.sdq.pcm.seff.AbstractAction;
import de.uka.ipd.sdq.pcm.seff.AbstractBranchTransition;
import de.uka.ipd.sdq.pcm.seff.BranchAction;
import de.uka.ipd.sdq.pcm.seff.ProbabilisticBranchTransition;
import de.uka.ipd.sdq.pcm.seff.ResourceDemandingSEFF;
import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;

public class LoadBalancingVariation implements IVariationStrategy {

	private BasicComponent loadBalancer;
	private static final Logger logger = Logger
			.getLogger(LoadBalancingVariation.class);

	@Override
	public void setVariedObject(EObject o) {
		if (!BasicComponent.class.isInstance(o))
			throw new RuntimeException(
					"Expected a BasicComponent, but encountered a "
							+ o.getClass().getName());
		loadBalancer = (BasicComponent) o;
	}

	@Override
	public String vary(long value) {
		String semaphoreResult = adjustSemaphore(value);
		String branchProbresult = adjustBranchProbabilities(value);
		return semaphoreResult + "\n" + branchProbresult;
	}

	private String adjustSemaphore(long value) {
		VariableUsage semaphore = getFirstComponentParameter(loadBalancer);
		
		PCMRandomVariable newValue = CoreFactory.eINSTANCE
				.createPCMRandomVariable();
		newValue.setSpecification(Long.toString(value));
		
		semaphore.getVariableCharacterisation_VariableUsage().get(0)
			.setSpecification_VariableCharacterisation(newValue);
		
		return "Parameter value of '"
			+ semaphore.getNamedReference__VariableUsage()
			.getReferenceName() + "' = " + value + ": "
			+ semaphore.eClass().getName();
	}

	private VariableUsage getFirstComponentParameter(BasicComponent loadBalancer) {
		return loadBalancer.getComponentParameterUsage_ImplementationComponentType().get(0);
	}

	private String adjustBranchProbabilities(long value) {
		double branchProbability = 1.0 / value;

		List<ServiceEffectSpecification> seffs = loadBalancer.getServiceEffectSpecifications__BasicComponent();
		for (ServiceEffectSpecification serviceEffectSpecification : seffs) {
			
			BranchAction branch = getBranchAction(serviceEffectSpecification);
			logger.debug("Number of branches: " + branch.getBranches_Branch().size() + ", new BranchProbability: " + branchProbability);
			
			for(int i = 0; i < branch.getBranches_Branch().size(); i++) {
				
				AbstractBranchTransition t = branch.getBranches_Branch().get(i);
				if(!(t instanceof ProbabilisticBranchTransition))
					throw new RuntimeException("ProbabilisticBranchTransition expected. Found " + t.getClass().getName());
				
				ProbabilisticBranchTransition pTrans = (ProbabilisticBranchTransition) t;
				if (i < value) {
					pTrans.setBranchProbability(branchProbability);
				} else {
					pTrans.setBranchProbability(0.0);
				}
			}
		}
		
		return "Branch probabilities of BranchActions within SEFFs" + seffs.toString() + " adjusted.";
	}

	private BranchAction getBranchAction(ServiceEffectSpecification seff) {
		ResourceDemandingSEFF rdSeff = (ResourceDemandingSEFF) seff;
		List<AbstractAction> setps = rdSeff.getSteps_Behaviour();
		for (AbstractAction abstractAction : setps) {
			if (abstractAction instanceof BranchAction)
				return (BranchAction) abstractAction;
		}
		return null;
	}

}
