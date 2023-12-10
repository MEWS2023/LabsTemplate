/**
 */
package scml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scml.AggregatedValue;
import scml.GoalReferenceValue;
import scml.InfrastructureComponent;
import scml.KPIMeasurementDevice;
import scml.Parameter;
import scml.ParameterType;
import scml.ScmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.ParameterImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link scml.impl.ParameterImpl#getGoalreferencevalue <em>Goalreferencevalue</em>}</li>
 *   <li>{@link scml.impl.ParameterImpl#getObservedValue <em>Observed Value</em>}</li>
 *   <li>{@link scml.impl.ParameterImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link scml.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link scml.impl.ParameterImpl#getKpimeasurementdevice <em>Kpimeasurementdevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends NamedElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGoalreferencevalue() <em>Goalreferencevalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalreferencevalue()
	 * @generated
	 * @ordered
	 */
	protected GoalReferenceValue goalreferencevalue;

	/**
	 * The cached value of the '{@link #getObservedValue() <em>Observed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservedValue()
	 * @generated
	 * @ordered
	 */
	protected AggregatedValue observedValue;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureComponent component;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterType TYPE_EDEFAULT = ParameterType.AIRQUALITY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ParameterType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKpimeasurementdevice() <em>Kpimeasurementdevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpimeasurementdevice()
	 * @generated
	 * @ordered
	 */
	protected KPIMeasurementDevice kpimeasurementdevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.PARAMETER__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GoalReferenceValue getGoalreferencevalue() {
		return goalreferencevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoalreferencevalue(GoalReferenceValue newGoalreferencevalue,
			NotificationChain msgs) {
		GoalReferenceValue oldGoalreferencevalue = goalreferencevalue;
		goalreferencevalue = newGoalreferencevalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScmlPackage.PARAMETER__GOALREFERENCEVALUE, oldGoalreferencevalue, newGoalreferencevalue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoalreferencevalue(GoalReferenceValue newGoalreferencevalue) {
		if (newGoalreferencevalue != goalreferencevalue) {
			NotificationChain msgs = null;
			if (goalreferencevalue != null)
				msgs = ((InternalEObject) goalreferencevalue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.PARAMETER__GOALREFERENCEVALUE, null, msgs);
			if (newGoalreferencevalue != null)
				msgs = ((InternalEObject) newGoalreferencevalue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.PARAMETER__GOALREFERENCEVALUE, null, msgs);
			msgs = basicSetGoalreferencevalue(newGoalreferencevalue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.PARAMETER__GOALREFERENCEVALUE,
					newGoalreferencevalue, newGoalreferencevalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregatedValue getObservedValue() {
		return observedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservedValue(AggregatedValue newObservedValue, NotificationChain msgs) {
		AggregatedValue oldObservedValue = observedValue;
		observedValue = newObservedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScmlPackage.PARAMETER__OBSERVED_VALUE, oldObservedValue, newObservedValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservedValue(AggregatedValue newObservedValue) {
		if (newObservedValue != observedValue) {
			NotificationChain msgs = null;
			if (observedValue != null)
				msgs = ((InternalEObject) observedValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.PARAMETER__OBSERVED_VALUE, null, msgs);
			if (newObservedValue != null)
				msgs = ((InternalEObject) newObservedValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.PARAMETER__OBSERVED_VALUE, null, msgs);
			msgs = basicSetObservedValue(newObservedValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.PARAMETER__OBSERVED_VALUE,
					newObservedValue, newObservedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureComponent getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (InfrastructureComponent) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScmlPackage.PARAMETER__COMPONENT,
							oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent(InfrastructureComponent newComponent) {
		InfrastructureComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.PARAMETER__COMPONENT, oldComponent,
					component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ParameterType newType) {
		ParameterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KPIMeasurementDevice getKpimeasurementdevice() {
		if (kpimeasurementdevice != null && kpimeasurementdevice.eIsProxy()) {
			InternalEObject oldKpimeasurementdevice = (InternalEObject) kpimeasurementdevice;
			kpimeasurementdevice = (KPIMeasurementDevice) eResolveProxy(oldKpimeasurementdevice);
			if (kpimeasurementdevice != oldKpimeasurementdevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScmlPackage.PARAMETER__KPIMEASUREMENTDEVICE, oldKpimeasurementdevice,
							kpimeasurementdevice));
			}
		}
		return kpimeasurementdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPIMeasurementDevice basicGetKpimeasurementdevice() {
		return kpimeasurementdevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKpimeasurementdevice(KPIMeasurementDevice newKpimeasurementdevice,
			NotificationChain msgs) {
		KPIMeasurementDevice oldKpimeasurementdevice = kpimeasurementdevice;
		kpimeasurementdevice = newKpimeasurementdevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScmlPackage.PARAMETER__KPIMEASUREMENTDEVICE, oldKpimeasurementdevice, newKpimeasurementdevice);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKpimeasurementdevice(KPIMeasurementDevice newKpimeasurementdevice) {
		if (newKpimeasurementdevice != kpimeasurementdevice) {
			NotificationChain msgs = null;
			if (kpimeasurementdevice != null)
				msgs = ((InternalEObject) kpimeasurementdevice).eInverseRemove(this,
						ScmlPackage.KPI_MEASUREMENT_DEVICE__PARAMETER, KPIMeasurementDevice.class, msgs);
			if (newKpimeasurementdevice != null)
				msgs = ((InternalEObject) newKpimeasurementdevice).eInverseAdd(this,
						ScmlPackage.KPI_MEASUREMENT_DEVICE__PARAMETER, KPIMeasurementDevice.class, msgs);
			msgs = basicSetKpimeasurementdevice(newKpimeasurementdevice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.PARAMETER__KPIMEASUREMENTDEVICE,
					newKpimeasurementdevice, newKpimeasurementdevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScmlPackage.PARAMETER__KPIMEASUREMENTDEVICE:
			if (kpimeasurementdevice != null)
				msgs = ((InternalEObject) kpimeasurementdevice).eInverseRemove(this,
						ScmlPackage.KPI_MEASUREMENT_DEVICE__PARAMETER, KPIMeasurementDevice.class, msgs);
			return basicSetKpimeasurementdevice((KPIMeasurementDevice) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScmlPackage.PARAMETER__GOALREFERENCEVALUE:
			return basicSetGoalreferencevalue(null, msgs);
		case ScmlPackage.PARAMETER__OBSERVED_VALUE:
			return basicSetObservedValue(null, msgs);
		case ScmlPackage.PARAMETER__KPIMEASUREMENTDEVICE:
			return basicSetKpimeasurementdevice(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScmlPackage.PARAMETER__UNIT:
			return getUnit();
		case ScmlPackage.PARAMETER__GOALREFERENCEVALUE:
			return getGoalreferencevalue();
		case ScmlPackage.PARAMETER__OBSERVED_VALUE:
			return getObservedValue();
		case ScmlPackage.PARAMETER__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case ScmlPackage.PARAMETER__TYPE:
			return getType();
		case ScmlPackage.PARAMETER__KPIMEASUREMENTDEVICE:
			if (resolve)
				return getKpimeasurementdevice();
			return basicGetKpimeasurementdevice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ScmlPackage.PARAMETER__UNIT:
			setUnit((String) newValue);
			return;
		case ScmlPackage.PARAMETER__GOALREFERENCEVALUE:
			setGoalreferencevalue((GoalReferenceValue) newValue);
			return;
		case ScmlPackage.PARAMETER__OBSERVED_VALUE:
			setObservedValue((AggregatedValue) newValue);
			return;
		case ScmlPackage.PARAMETER__COMPONENT:
			setComponent((InfrastructureComponent) newValue);
			return;
		case ScmlPackage.PARAMETER__TYPE:
			setType((ParameterType) newValue);
			return;
		case ScmlPackage.PARAMETER__KPIMEASUREMENTDEVICE:
			setKpimeasurementdevice((KPIMeasurementDevice) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ScmlPackage.PARAMETER__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case ScmlPackage.PARAMETER__GOALREFERENCEVALUE:
			setGoalreferencevalue((GoalReferenceValue) null);
			return;
		case ScmlPackage.PARAMETER__OBSERVED_VALUE:
			setObservedValue((AggregatedValue) null);
			return;
		case ScmlPackage.PARAMETER__COMPONENT:
			setComponent((InfrastructureComponent) null);
			return;
		case ScmlPackage.PARAMETER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ScmlPackage.PARAMETER__KPIMEASUREMENTDEVICE:
			setKpimeasurementdevice((KPIMeasurementDevice) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ScmlPackage.PARAMETER__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case ScmlPackage.PARAMETER__GOALREFERENCEVALUE:
			return goalreferencevalue != null;
		case ScmlPackage.PARAMETER__OBSERVED_VALUE:
			return observedValue != null;
		case ScmlPackage.PARAMETER__COMPONENT:
			return component != null;
		case ScmlPackage.PARAMETER__TYPE:
			return type != TYPE_EDEFAULT;
		case ScmlPackage.PARAMETER__KPIMEASUREMENTDEVICE:
			return kpimeasurementdevice != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (unit: ");
		result.append(unit);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
