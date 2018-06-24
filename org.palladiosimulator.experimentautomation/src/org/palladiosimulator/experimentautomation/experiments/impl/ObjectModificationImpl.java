/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.ObjectModification;
import org.palladiosimulator.experimentautomation.variation.VariationType;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>Object
 * Modification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl#getVariedObjectId <em>Varied Object Id</em>}</li>
 *   <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.ObjectModificationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectModificationImpl extends ModificationImpl implements ObjectModification {

    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VariationType type;

				/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

				/**
	 * The default value of the '{@link #getVariedObjectId() <em>Varied Object Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariedObjectId()
	 * @generated
	 * @ordered
	 */
    protected static final String VARIED_OBJECT_ID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getVariedObjectId() <em>Varied Object Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariedObjectId()
	 * @generated
	 * @ordered
	 */
	protected String variedObjectId = VARIED_OBJECT_ID_EDEFAULT;

				/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc
     * --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
    protected static final long VALUE_EDEFAULT = 0L;

    /**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected long value = VALUE_EDEFAULT;

				/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected ObjectModificationImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ExperimentsPackage.Literals.OBJECT_MODIFICATION;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public VariationType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (VariationType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExperimentsPackage.OBJECT_MODIFICATION__TYPE, oldType, type));
			}
		}
		return type;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public VariationType basicGetType() {
		return type;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setType(VariationType newType) {
		VariationType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.OBJECT_MODIFICATION__TYPE, oldType, type));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.OBJECT_MODIFICATION__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String getVariedObjectId() {
		return variedObjectId;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setVariedObjectId(String newVariedObjectId) {
		String oldVariedObjectId = variedObjectId;
		variedObjectId = newVariedObjectId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID, oldVariedObjectId, variedObjectId));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public long getValue() {
		return value;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void setValue(long newValue) {
		long oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExperimentsPackage.OBJECT_MODIFICATION__VALUE, oldValue, value));
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExperimentsPackage.OBJECT_MODIFICATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ExperimentsPackage.OBJECT_MODIFICATION__NAME:
				return getName();
			case ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID:
				return getVariedObjectId();
			case ExperimentsPackage.OBJECT_MODIFICATION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExperimentsPackage.OBJECT_MODIFICATION__TYPE:
				setType((VariationType)newValue);
				return;
			case ExperimentsPackage.OBJECT_MODIFICATION__NAME:
				setName((String)newValue);
				return;
			case ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID:
				setVariedObjectId((String)newValue);
				return;
			case ExperimentsPackage.OBJECT_MODIFICATION__VALUE:
				setValue((Long)newValue);
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
			case ExperimentsPackage.OBJECT_MODIFICATION__TYPE:
				setType((VariationType)null);
				return;
			case ExperimentsPackage.OBJECT_MODIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID:
				setVariedObjectId(VARIED_OBJECT_ID_EDEFAULT);
				return;
			case ExperimentsPackage.OBJECT_MODIFICATION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ExperimentsPackage.OBJECT_MODIFICATION__TYPE:
				return type != null;
			case ExperimentsPackage.OBJECT_MODIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExperimentsPackage.OBJECT_MODIFICATION__VARIED_OBJECT_ID:
				return VARIED_OBJECT_ID_EDEFAULT == null ? variedObjectId != null : !VARIED_OBJECT_ID_EDEFAULT.equals(variedObjectId);
			case ExperimentsPackage.OBJECT_MODIFICATION__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", variedObjectId: ");
		result.append(variedObjectId);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // ObjectModificationImpl
