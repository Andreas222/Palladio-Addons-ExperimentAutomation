/**
 */
package org.palladiosimulator.experimentautomation.variation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.experimentautomation.variation.VariationPackage;
import org.palladiosimulator.experimentautomation.variation.VariationRepository;
import org.palladiosimulator.experimentautomation.variation.VariationType;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Repository</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.variation.impl.VariationRepositoryImpl#getVariation <em>Variation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariationRepositoryImpl extends MinimalEObjectImpl.Container implements VariationRepository {

    /**
	 * The cached value of the '{@link #getVariation() <em>Variation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariation()
	 * @generated
	 * @ordered
	 */
	protected EList<VariationType> variation;
				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected VariationRepositoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return VariationPackage.Literals.VARIATION_REPOSITORY;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public EList<VariationType> getVariation() {
		if (variation == null) {
			variation = new EObjectContainmentEList<VariationType>(VariationType.class, this, VariationPackage.VARIATION_REPOSITORY__VARIATION);
		}
		return variation;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VariationPackage.VARIATION_REPOSITORY__VARIATION:
				return ((InternalEList<?>)getVariation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VariationPackage.VARIATION_REPOSITORY__VARIATION:
				return getVariation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VariationPackage.VARIATION_REPOSITORY__VARIATION:
				getVariation().clear();
				getVariation().addAll((Collection<? extends VariationType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case VariationPackage.VARIATION_REPOSITORY__VARIATION:
				getVariation().clear();
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VariationPackage.VARIATION_REPOSITORY__VARIATION:
				return variation != null && !variation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // VariationRepositoryImpl
