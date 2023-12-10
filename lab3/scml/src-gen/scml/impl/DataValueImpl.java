/**
 */
package scml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringGreaterThanOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import scml.DataValue;
import scml.ScmlPackage;
import scml.ScmlTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.DataValueImpl#isCollected <em>Collected</em>}</li>
 *   <li>{@link scml.impl.DataValueImpl#getProducedTime <em>Produced Time</em>}</li>
 *   <li>{@link scml.impl.DataValueImpl#getConsumedTime <em>Consumed Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataValueImpl extends DataImpl implements DataValue {
	/**
	 * The default value of the '{@link #isCollected() <em>Collected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COLLECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollected() <em>Collected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollected()
	 * @generated
	 * @ordered
	 */
	protected boolean collected = COLLECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProducedTime() <em>Produced Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProducedTime() <em>Produced Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedTime()
	 * @generated
	 * @ordered
	 */
	protected String producedTime = PRODUCED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumedTime() <em>Consumed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumedTime() <em>Consumed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedTime()
	 * @generated
	 * @ordered
	 */
	protected String consumedTime = CONSUMED_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.DATA_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCollected() {
		return collected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollected(boolean newCollected) {
		boolean oldCollected = collected;
		collected = newCollected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.DATA_VALUE__COLLECTED, oldCollected,
					collected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProducedTime() {
		return producedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProducedTime(String newProducedTime) {
		String oldProducedTime = producedTime;
		producedTime = newProducedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.DATA_VALUE__PRODUCED_TIME,
					oldProducedTime, producedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsumedTime() {
		return consumedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumedTime(String newConsumedTime) {
		String oldConsumedTime = consumedTime;
		consumedTime = newConsumedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.DATA_VALUE__CONSUMED_TIME,
					oldConsumedTime, consumedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkConsumedTimeProducedTime(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "DataValue::checkConsumedTimeProducedTime";
		try {
			/**
			 *
			 * inv checkConsumedTimeProducedTime:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.consumedTime <> null implies self.consumedTime > self.producedTime
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.DATA_VALUE___CHECK_CONSUMED_TIME_PRODUCED_TIME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String consumedTime = this.getConsumedTime();
					final /*@NonInvalid*/ boolean ne = consumedTime != null;
					final /*@Thrown*/ Boolean result;
					if (!ne) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_gt;
						try {
							if (consumedTime == null) {
								throw new InvalidValueException(
										"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@NonInvalid*/ String producedTime = this.getProducedTime();
							final /*@Thrown*/ boolean gt = StringGreaterThanOperation.INSTANCE
									.evaluate(consumedTime, producedTime).booleanValue();
							CAUGHT_gt = gt;
						} catch (Exception e) {
							CAUGHT_gt = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_gt instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt;
							}
							result = ValueUtil.FALSE_VALUE;
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, ScmlTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkConsumedTimeSet(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "DataValue::checkConsumedTimeSet";
		try {
			/**
			 *
			 * inv checkConsumedTimeSet:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.consumedTime <> null implies self.collected = true
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.DATA_VALUE___CHECK_CONSUMED_TIME_SET__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ String consumedTime = this.getConsumedTime();
				final /*@NonInvalid*/ boolean ne = consumedTime != null;
				final /*@NonInvalid*/ Boolean result;
				if (!ne) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ boolean collected = this.isCollected();
					if (collected) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, ScmlTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScmlPackage.DATA_VALUE__COLLECTED:
			return isCollected();
		case ScmlPackage.DATA_VALUE__PRODUCED_TIME:
			return getProducedTime();
		case ScmlPackage.DATA_VALUE__CONSUMED_TIME:
			return getConsumedTime();
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
		case ScmlPackage.DATA_VALUE__COLLECTED:
			setCollected((Boolean) newValue);
			return;
		case ScmlPackage.DATA_VALUE__PRODUCED_TIME:
			setProducedTime((String) newValue);
			return;
		case ScmlPackage.DATA_VALUE__CONSUMED_TIME:
			setConsumedTime((String) newValue);
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
		case ScmlPackage.DATA_VALUE__COLLECTED:
			setCollected(COLLECTED_EDEFAULT);
			return;
		case ScmlPackage.DATA_VALUE__PRODUCED_TIME:
			setProducedTime(PRODUCED_TIME_EDEFAULT);
			return;
		case ScmlPackage.DATA_VALUE__CONSUMED_TIME:
			setConsumedTime(CONSUMED_TIME_EDEFAULT);
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
		case ScmlPackage.DATA_VALUE__COLLECTED:
			return collected != COLLECTED_EDEFAULT;
		case ScmlPackage.DATA_VALUE__PRODUCED_TIME:
			return PRODUCED_TIME_EDEFAULT == null ? producedTime != null : !PRODUCED_TIME_EDEFAULT.equals(producedTime);
		case ScmlPackage.DATA_VALUE__CONSUMED_TIME:
			return CONSUMED_TIME_EDEFAULT == null ? consumedTime != null : !CONSUMED_TIME_EDEFAULT.equals(consumedTime);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ScmlPackage.DATA_VALUE___CHECK_CONSUMED_TIME_PRODUCED_TIME__DIAGNOSTICCHAIN_MAP:
			return checkConsumedTimeProducedTime((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case ScmlPackage.DATA_VALUE___CHECK_CONSUMED_TIME_SET__DIAGNOSTICCHAIN_MAP:
			return checkConsumedTimeSet((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (collected: ");
		result.append(collected);
		result.append(", producedTime: ");
		result.append(producedTime);
		result.append(", consumedTime: ");
		result.append(consumedTime);
		result.append(')');
		return result.toString();
	}

} //DataValueImpl
