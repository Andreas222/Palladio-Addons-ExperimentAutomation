package org.palladiosimulator.experimentautomation.dsl.application.transformation;

import org.palladiosimulator.experimentautomation.experiments.Variation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.experimentautomation.dsl.expAuto.NestedIntervalsValueProvider;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsFactory;
import org.palladiosimulator.experimentautomation.experiments.ExponentialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.LinearValueProvider;
import org.palladiosimulator.experimentautomation.experiments.NestedIntervalsLongValueProvider;
import org.palladiosimulator.experimentautomation.experiments.PolynomialValueProvider;
import org.palladiosimulator.experimentautomation.experiments.SetValueProvider;
import org.palladiosimulator.experimentautomation.experiments.ValueProvider;
import org.palladiosimulator.experimentautomation.experiments.impl.ExperimentsFactoryImpl;

import de.uka.ipd.sdq.identifier.Identifier;

public class VariationTransformation {
	private ExperimentsFactory factory;
	
	protected VariationTransformation() {
		factory = ExperimentsFactoryImpl.init();
	}
	
	protected Variation transformVariation(org.palladiosimulator.experimentautomation.dsl.expAuto.Variation old) {
		Variation variation = factory.createVariation();
		
		variation.setMinValue(0);
		variation.setMaxValue(0);
		
		variation.setName(old.getName());
		variation.setMaxVariations(old.getMaxVariations());
		variation.setType(old.getVariationTyp());
		variation.setVariedObjectId(transformVariationTarget(old.getTarget()));
		
		variation.setValueProvider(transformValueProvider(old.getValueProvider()));
		
		return variation;
	}
	
	private String transformVariationTarget(Identifier old) {
		return old.getId();
	}
	
	private ValueProvider transformValueProvider(EObject valueProvider) {
		if (valueProvider instanceof NestedIntervalsValueProvider) {
			return transformNestedIntervalsValueProvider((NestedIntervalsValueProvider)valueProvider);
		} else if(valueProvider instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.SetValueProvider) {
			return transformSetValueProvider((org.palladiosimulator.experimentautomation.dsl.expAuto.SetValueProvider)valueProvider);
		} else if(valueProvider instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.LinearValueProvider) {
			return transformLinearValueProvider((org.palladiosimulator.experimentautomation.dsl.expAuto.LinearValueProvider)valueProvider);
		} else if(valueProvider instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.ExponentialValueProvider) {
			return transformExponentialValueProvider((org.palladiosimulator.experimentautomation.dsl.expAuto.ExponentialValueProvider)valueProvider);
		} else if(valueProvider instanceof org.palladiosimulator.experimentautomation.dsl.expAuto.PolynomialValueProvider) {
			return transformPolynomialValueProvider((org.palladiosimulator.experimentautomation.dsl.expAuto.PolynomialValueProvider)valueProvider);
		} else {
			return null;
		}
	}
	
	private NestedIntervalsLongValueProvider transformNestedIntervalsValueProvider(NestedIntervalsValueProvider old) {
		NestedIntervalsLongValueProvider valueProvider = factory.createNestedIntervalsLongValueProvider();
		
		valueProvider.setMinValue(old.getMin());
		valueProvider.setMaxValue(old.getMax());
		
		return valueProvider;
	}
	
	private SetValueProvider transformSetValueProvider(org.palladiosimulator.experimentautomation.dsl.expAuto.SetValueProvider old) {
		SetValueProvider valueProvider = factory.createSetValueProvider();
		
		String currValueString = "";
		EList<Integer> values = old.getValues();
		for(int i=0; i < values.size(); i++) {
			currValueString = currValueString + values.get(i);
		}
		
		valueProvider.setValues(currValueString);
		
		return valueProvider;
	}
	
	private LinearValueProvider transformLinearValueProvider(org.palladiosimulator.experimentautomation.dsl.expAuto.LinearValueProvider old) {
		LinearValueProvider valueProvider = factory.createLinearValueProvider();
		
		valueProvider.setFactor(old.getFactor());
		valueProvider.setSummand(old.getSummand());
		
		return valueProvider;
	}
	
	private ExponentialValueProvider transformExponentialValueProvider(org.palladiosimulator.experimentautomation.dsl.expAuto.ExponentialValueProvider old) {
		ExponentialValueProvider valueProvider = factory.createExponentialValueProvider();
		
		valueProvider.setBase(old.getBase());
		
		return valueProvider;
	}
	
	private PolynomialValueProvider transformPolynomialValueProvider(org.palladiosimulator.experimentautomation.dsl.expAuto.PolynomialValueProvider old) {
		PolynomialValueProvider valueProvider = factory.createPolynomialValueProvider();
		
		valueProvider.setExponent(old.getExponent());
		valueProvider.setFactor(old.getFactor());
		
		return valueProvider;
	}
}
