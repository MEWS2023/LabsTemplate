/**
 */
package scml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scml.AggregatedValue;
import scml.Operation;
import scml.ScmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregated Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.AggregatedValueImpl#getAggregator <em>Aggregator</em>}</li>
 *   <li>{@link scml.impl.AggregatedValueImpl#getAggregatedTime <em>Aggregated Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregatedValueImpl extends DataImpl implements AggregatedValue {
	/**
	 * The default value of the '{@link #getAggregator() <em>Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregator()
	 * @generated
	 * @ordered
	 */
	protected static final Operation AGGREGATOR_EDEFAULT = Operation.SUM;

	/**
	 * The cached value of the '{@link #getAggregator() <em>Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregator()
	 * @generated
	 * @ordered
	 */
	protected Operation aggregator = AGGREGATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregatedTime() <em>Aggregated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregatedTime() <em>Aggregated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregatedTime()
	 * @generated
	 * @ordered
	 */
	protected String aggregatedTime = AGGREGATED_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregatedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.AGGREGATED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getAggregator() {
		return aggregator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregator(Operation newAggregator) {
		Operation oldAggregator = aggregator;
		aggregator = newAggregator == null ? AGGREGATOR_EDEFAULT : newAggregator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.AGGREGATED_VALUE__AGGREGATOR,
					oldAggregator, aggregator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAggregatedTime() {
		return aggregatedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregatedTime(String newAggregatedTime) {
		String oldAggregatedTime = aggregatedTime;
		aggregatedTime = newAggregatedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.AGGREGATED_VALUE__AGGREGATED_TIME,
					oldAggregatedTime, aggregatedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScmlPackage.AGGREGATED_VALUE__AGGREGATOR:
			return getAggregator();
		case ScmlPackage.AGGREGATED_VALUE__AGGREGATED_TIME:
			return getAggregatedTime();
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
		case ScmlPackage.AGGREGATED_VALUE__AGGREGATOR:
			setAggregator((Operation) newValue);
			return;
		case ScmlPackage.AGGREGATED_VALUE__AGGREGATED_TIME:
			setAggregatedTime((String) newValue);
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
		case ScmlPackage.AGGREGATED_VALUE__AGGREGATOR:
			setAggregator(AGGREGATOR_EDEFAULT);
			return;
		case ScmlPackage.AGGREGATED_VALUE__AGGREGATED_TIME:
			setAggregatedTime(AGGREGATED_TIME_EDEFAULT);
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
		case ScmlPackage.AGGREGATED_VALUE__AGGREGATOR:
			return aggregator != AGGREGATOR_EDEFAULT;
		case ScmlPackage.AGGREGATED_VALUE__AGGREGATED_TIME:
			return AGGREGATED_TIME_EDEFAULT == null ? aggregatedTime != null
					: !AGGREGATED_TIME_EDEFAULT.equals(aggregatedTime);
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
		result.append(" (aggregator: ");
		result.append(aggregator);
		result.append(", aggregatedTime: ");
		result.append(aggregatedTime);
		result.append(')');
		return result.toString();
	}

} //AggregatedValueImpl
