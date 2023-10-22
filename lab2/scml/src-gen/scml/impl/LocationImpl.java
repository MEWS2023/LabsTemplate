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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.RealValue;
import scml.Location;
import scml.ScmlPackage;
import scml.ScmlTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.LocationImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link scml.impl.LocationImpl#getLong <em>Long</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final float LAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected float lat = LAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected static final float LONG_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected float long_ = LONG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLat(float newLat) {
		float oldLat = lat;
		lat = newLat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.LOCATION__LAT, oldLat, lat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLong() {
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLong(float newLong) {
		float oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.LOCATION__LONG, oldLong, long_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean latLongInRange(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Location::latLongInRange";
		try {
			/**
			 *
			 * inv latLongInRange:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.Lat >= -90 and self.Lat <= 90 and self.Long >= -180 and self.Long <= 180
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.LOCATION___LAT_LONG_IN_RANGE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ float Long1_0 = this.getLong();
					final /*@NonInvalid*/ RealValue BOXED_Long1_0 = ValueUtil.realValueOf(Long1_0);
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						final /*@NonInvalid*/ float Lat_0 = this.getLat();
						final /*@NonInvalid*/ RealValue BOXED_Lat_0 = ValueUtil.realValueOf(Lat_0);
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(ScmlTables.INT_90);
						final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, BOXED_Lat_0, diff).booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!ge) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_Lat_0, ScmlTables.INT_90).booleanValue();
							if (!le_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						final /*@Thrown*/ Boolean and_0;
						if (and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ IntegerValue diff_0 = (IntegerValue) NumericNegateOperation.INSTANCE
									.evaluate(ScmlTables.INT_180);
							final /*@NonInvalid*/ boolean ge_0 = OclComparableGreaterThanEqualOperation.INSTANCE
									.evaluate(executor, BOXED_Long1_0, diff_0).booleanValue();
							if (!ge_0) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								if (and == null) {
									and_0 = null;
								} else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_0 = and_0;
					} catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean le_1 = OclComparableLessThanEqualOperation.INSTANCE
								.evaluate(executor, BOXED_Long1_0, ScmlTables.INT_180).booleanValue();
						if (!le_1) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_0;
							}
							if (CAUGHT_and_0 == null) {
								result = null;
							} else {
								result = ValueUtil.TRUE_VALUE;
							}
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScmlPackage.LOCATION__LAT:
			return getLat();
		case ScmlPackage.LOCATION__LONG:
			return getLong();
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
		case ScmlPackage.LOCATION__LAT:
			setLat((Float) newValue);
			return;
		case ScmlPackage.LOCATION__LONG:
			setLong((Float) newValue);
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
		case ScmlPackage.LOCATION__LAT:
			setLat(LAT_EDEFAULT);
			return;
		case ScmlPackage.LOCATION__LONG:
			setLong(LONG_EDEFAULT);
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
		case ScmlPackage.LOCATION__LAT:
			return lat != LAT_EDEFAULT;
		case ScmlPackage.LOCATION__LONG:
			return long_ != LONG_EDEFAULT;
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
		case ScmlPackage.LOCATION___LAT_LONG_IN_RANGE__DIAGNOSTICCHAIN_MAP:
			return latLongInRange((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (Lat: ");
		result.append(lat);
		result.append(", Long: ");
		result.append(long_);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
