/**
 */
package scml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.numeric.NumericMinusOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericTimesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.library.string.StringLessThanOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;
import org.eclipse.ocl.pivot.library.string.StringSubstringOperation;
import org.eclipse.ocl.pivot.library.string.StringToIntegerOperation;
import org.eclipse.ocl.pivot.library.string.StringToUpperCaseOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.RealValue;
import scml.AggregatedValue;
import scml.DataType;
import scml.GoalReferenceValue;
import scml.KPIMeasurementDevice;
import scml.Parameter;
import scml.ScmlPackage;
import scml.ScmlTables;
import scml.Status;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPI Measurement Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.KPIMeasurementDeviceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link scml.impl.KPIMeasurementDeviceImpl#getLastCalculation <em>Last Calculation</em>}</li>
 *   <li>{@link scml.impl.KPIMeasurementDeviceImpl#getNextCalculation <em>Next Calculation</em>}</li>
 *   <li>{@link scml.impl.KPIMeasurementDeviceImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KPIMeasurementDeviceImpl extends NamedElementImpl implements KPIMeasurementDevice {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.GOOD;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLastCalculation() <em>Last Calculation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCalculation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> lastCalculation;

	/**
	 * The default value of the '{@link #getNextCalculation() <em>Next Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextCalculation()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_CALCULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextCalculation() <em>Next Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextCalculation()
	 * @generated
	 * @ordered
	 */
	protected String nextCalculation = NEXT_CALCULATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KPIMeasurementDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.KPI_MEASUREMENT_DEVICE__STATUS, oldStatus,
					status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLastCalculation() {
		if (lastCalculation == null) {
			lastCalculation = new EDataTypeUniqueEList<String>(String.class, this,
					ScmlPackage.KPI_MEASUREMENT_DEVICE__LAST_CALCULATION);
		}
		return lastCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNextCalculation() {
		return nextCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextCalculation(String newNextCalculation) {
		String oldNextCalculation = nextCalculation;
		nextCalculation = newNextCalculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.KPI_MEASUREMENT_DEVICE__NEXT_CALCULATION,
					oldNextCalculation, nextCalculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (Parameter) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScmlPackage.KPI_MEASUREMENT_DEVICE__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(Parameter newParameter) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.KPI_MEASUREMENT_DEVICE__PARAMETER,
					oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkStatusCRITICAL(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "KPIMeasurementDevice::checkStatusCRITICAL";
		try {
			/**
			 *
			 * inv checkStatusCRITICAL:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.parameter.observedValue <> null and self.status = Status::CRITICAL and self.parameter.observedValue.type = DataType::INTEGER and self.parameter.goalreferencevalue.type = DataType::INTEGER implies
			 *         self.parameter.observedValue.value.toInteger() >
			 *         self.parameter.goalreferencevalue.value.toInteger() *
			 *         (1 + 0.25
			 *         )
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE___CHECK_STATUS_CRITICAL__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and_1;
					try {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							/*@Caught*/ Object CAUGHT_and;
							try {
								/*@Caught*/ Object CAUGHT_ne;
								try {
									final /*@NonInvalid*/ Parameter parameter = this.getParameter();
									if (parameter == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Parameter::observedValue\'");
									}
									final /*@Thrown*/ AggregatedValue observedValue = parameter.getObservedValue();
									final /*@Thrown*/ boolean ne = observedValue != null;
									CAUGHT_ne = ne;
								} catch (Exception e) {
									CAUGHT_ne = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and;
								if (CAUGHT_ne == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ Status status = this.getStatus();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_status = ScmlTables.ENUMid_Status
											.getEnumerationLiteralId(ClassUtil.nonNullState(status.getName()));
									final /*@NonInvalid*/ boolean eq = BOXED_status == ScmlTables.ELITid_CRITICAL;
									if (!eq) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										if (CAUGHT_ne instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_ne;
										}
										and = ValueUtil.TRUE_VALUE;
									}
								}
								CAUGHT_and = and;
							} catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0;
							if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_eq_0;
								try {
									final /*@NonInvalid*/ Parameter parameter_0 = this.getParameter();
									if (parameter_0 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Parameter::observedValue\'");
									}
									final /*@Thrown*/ AggregatedValue observedValue_0 = parameter_0.getObservedValue();
									if (observedValue_0 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Data::type\'");
									}
									final /*@Thrown*/ DataType type = observedValue_0.getType();
									final /*@Thrown*/ EnumerationLiteralId BOXED_type = ScmlTables.ENUMid_DataType
											.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
									final /*@Thrown*/ boolean eq_0 = BOXED_type == ScmlTables.ELITid_INTEGER;
									CAUGHT_eq_0 = eq_0;
								} catch (Exception e) {
									CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_and instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and;
									}
									if (CAUGHT_eq_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_0;
									}
									if (CAUGHT_and == null) {
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
						final /*@Thrown*/ Boolean and_1;
						if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
							and_1 = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_eq_1;
							try {
								final /*@NonInvalid*/ Parameter parameter_1 = this.getParameter();
								if (parameter_1 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://www.example.org/scml\'::Parameter::goalreferencevalue\'");
								}
								final /*@Thrown*/ GoalReferenceValue goalreferencevalue = parameter_1
										.getGoalreferencevalue();
								final /*@Thrown*/ DataType type_0 = goalreferencevalue.getType();
								final /*@Thrown*/ EnumerationLiteralId BOXED_type_0 = ScmlTables.ENUMid_DataType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
								final /*@Thrown*/ boolean eq_1 = BOXED_type_0 == ScmlTables.ELITid_INTEGER;
								CAUGHT_eq_1 = eq_1;
							} catch (Exception e) {
								CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_and_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_and_0;
								}
								if (CAUGHT_eq_1 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_1;
								}
								if (CAUGHT_and_0 == null) {
									and_1 = null;
								} else {
									and_1 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_1 = and_1;
					} catch (Exception e) {
						CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_gt;
						try {
							final /*@NonInvalid*/ Parameter parameter_3 = this.getParameter();
							if (parameter_3 == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://www.example.org/scml\'::Parameter::goalreferencevalue\'");
							}
							final /*@Thrown*/ AggregatedValue observedValue_1 = parameter_3.getObservedValue();
							if (observedValue_1 == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://www.example.org/scml\'::Data::value\'");
							}
							final /*@Thrown*/ String value = observedValue_1.getValue();
							final /*@Thrown*/ IntegerValue toInteger = StringToIntegerOperation.INSTANCE
									.evaluate(value);
							if (toInteger == null) {
								throw new InvalidValueException(
										"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ GoalReferenceValue goalreferencevalue_0 = parameter_3
									.getGoalreferencevalue();
							final /*@Thrown*/ String value_0 = goalreferencevalue_0.getValue();
							final /*@Thrown*/ IntegerValue toInteger_0 = StringToIntegerOperation.INSTANCE
									.evaluate(value_0);
							if (toInteger_0 == null) {
								throw new InvalidValueException(
										"Null \'\'Real\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@NonInvalid*/ RealValue sum = NumericPlusOperation.INSTANCE
									.evaluate(ScmlTables.INT_1, ScmlTables.REA_0_25);
							final /*@Thrown*/ RealValue prod = NumericTimesOperation.INSTANCE.evaluate(toInteger_0,
									sum);
							if (prod instanceof InvalidValueException) {
								throw (InvalidValueException) prod;
							}
							final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, toInteger, prod).booleanValue();
							CAUGHT_gt = gt;
						} catch (Exception e) {
							CAUGHT_gt = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_1;
							}
							if (CAUGHT_gt instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt;
							}
							if (CAUGHT_and_1 == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
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
	public boolean nameHasParameterPrefix(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "KPIMeasurementDevice::nameHasParameterPrefix";
		try {
			/**
			 *
			 * inv nameHasParameterPrefix:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.name.size() >=
			 *         self.parameter.name.size() and
			 *         self.name.substring(1, self.parameter.name.size() + 11) =
			 *         self.parameter.name.toUpper() + 'measurement'
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE___NAME_HAS_PARAMETER_PREFIX__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_ge;
					try {
						final /*@NonInvalid*/ String name = this.getName();
						final /*@NonInvalid*/ IntegerValue size = StringSizeOperation.INSTANCE.evaluate(name);
						final /*@NonInvalid*/ Parameter parameter = this.getParameter();
						if (parameter == null) {
							throw new InvalidValueException(
									"Null source for \'\'http://www.example.org/scml\'::NamedElement::name\'");
						}
						final /*@Thrown*/ String name_0 = parameter.getName();
						final /*@Thrown*/ IntegerValue size_0 = StringSizeOperation.INSTANCE.evaluate(name_0);
						if (size_0 instanceof InvalidValueException) {
							throw (InvalidValueException) size_0;
						}
						final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
								.evaluate(executor, size, size_0).booleanValue();
						CAUGHT_ge = ge;
					} catch (Exception e) {
						CAUGHT_ge = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_ge == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_eq;
						try {
							final /*@NonInvalid*/ Parameter parameter_1 = this.getParameter();
							if (parameter_1 == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://www.example.org/scml\'::NamedElement::name\'");
							}
							final /*@Thrown*/ String name_3 = parameter_1.getName();
							final /*@NonInvalid*/ String name_1 = this.getName();
							final /*@Thrown*/ IntegerValue size_1 = StringSizeOperation.INSTANCE.evaluate(name_3);
							final /*@Thrown*/ IntegerValue sum = (IntegerValue) NumericPlusOperation.INSTANCE
									.evaluate(size_1, ScmlTables.INT_11);
							if (sum instanceof InvalidValueException) {
								throw (InvalidValueException) sum;
							}
							final /*@Thrown*/ String substring = StringSubstringOperation.INSTANCE.evaluate(name_1,
									ScmlTables.INT_1, sum);
							final /*@Thrown*/ String toUpper = StringToUpperCaseOperation.INSTANCE.evaluate(name_3);
							final /*@Thrown*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(toUpper,
									ScmlTables.STR_measurement);
							final /*@Thrown*/ boolean eq = substring.equals(sum_0);
							CAUGHT_eq = eq;
						} catch (Exception e) {
							CAUGHT_eq = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_ge instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_ge;
							}
							if (CAUGHT_eq instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq;
							}
							result = ValueUtil.TRUE_VALUE;
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
	public boolean checkStatusWARN(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "KPIMeasurementDevice::checkStatusWARN";
		try {
			/**
			 *
			 * inv checkStatusWARN:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.parameter.observedValue <> null and self.status = Status::WARN and self.parameter.observedValue.type = DataType::INTEGER and self.parameter.goalreferencevalue.type = DataType::INTEGER implies
			 *         self.parameter.observedValue.value.toInteger() >=
			 *         self.parameter.goalreferencevalue.value.toInteger() *
			 *         (1 - 0.25
			 *         ) or
			 *         self.parameter.observedValue.value.toInteger() <=
			 *         self.parameter.goalreferencevalue.value.toInteger() *
			 *         (1 + 0.25
			 *         )
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE___CHECK_STATUS_WARN__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and_1;
					try {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							/*@Caught*/ Object CAUGHT_and;
							try {
								/*@Caught*/ Object CAUGHT_ne;
								try {
									final /*@NonInvalid*/ Parameter parameter = this.getParameter();
									if (parameter == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Parameter::observedValue\'");
									}
									final /*@Thrown*/ AggregatedValue observedValue = parameter.getObservedValue();
									final /*@Thrown*/ boolean ne = observedValue != null;
									CAUGHT_ne = ne;
								} catch (Exception e) {
									CAUGHT_ne = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and;
								if (CAUGHT_ne == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ Status status = this.getStatus();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_status = ScmlTables.ENUMid_Status
											.getEnumerationLiteralId(ClassUtil.nonNullState(status.getName()));
									final /*@NonInvalid*/ boolean eq = BOXED_status == ScmlTables.ELITid_WARN;
									if (!eq) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										if (CAUGHT_ne instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_ne;
										}
										and = ValueUtil.TRUE_VALUE;
									}
								}
								CAUGHT_and = and;
							} catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0;
							if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_eq_0;
								try {
									final /*@NonInvalid*/ Parameter parameter_0 = this.getParameter();
									if (parameter_0 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Parameter::observedValue\'");
									}
									final /*@Thrown*/ AggregatedValue observedValue_0 = parameter_0.getObservedValue();
									if (observedValue_0 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Data::type\'");
									}
									final /*@Thrown*/ DataType type = observedValue_0.getType();
									final /*@Thrown*/ EnumerationLiteralId BOXED_type = ScmlTables.ENUMid_DataType
											.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
									final /*@Thrown*/ boolean eq_0 = BOXED_type == ScmlTables.ELITid_INTEGER;
									CAUGHT_eq_0 = eq_0;
								} catch (Exception e) {
									CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_and instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and;
									}
									if (CAUGHT_eq_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_0;
									}
									if (CAUGHT_and == null) {
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
						final /*@Thrown*/ Boolean and_1;
						if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
							and_1 = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_eq_1;
							try {
								final /*@NonInvalid*/ Parameter parameter_1 = this.getParameter();
								if (parameter_1 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://www.example.org/scml\'::Parameter::goalreferencevalue\'");
								}
								final /*@Thrown*/ GoalReferenceValue goalreferencevalue = parameter_1
										.getGoalreferencevalue();
								final /*@Thrown*/ DataType type_0 = goalreferencevalue.getType();
								final /*@Thrown*/ EnumerationLiteralId BOXED_type_0 = ScmlTables.ENUMid_DataType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
								final /*@Thrown*/ boolean eq_1 = BOXED_type_0 == ScmlTables.ELITid_INTEGER;
								CAUGHT_eq_1 = eq_1;
							} catch (Exception e) {
								CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_and_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_and_0;
								}
								if (CAUGHT_eq_1 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_1;
								}
								if (CAUGHT_and_0 == null) {
									and_1 = null;
								} else {
									and_1 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_1 = and_1;
					} catch (Exception e) {
						CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_ge;
							try {
								final /*@NonInvalid*/ Parameter parameter_3 = this.getParameter();
								if (parameter_3 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://www.example.org/scml\'::Parameter::goalreferencevalue\'");
								}
								final /*@Thrown*/ AggregatedValue observedValue_1 = parameter_3.getObservedValue();
								if (observedValue_1 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://www.example.org/scml\'::Data::value\'");
								}
								final /*@Thrown*/ String value = observedValue_1.getValue();
								final /*@Thrown*/ IntegerValue toInteger = StringToIntegerOperation.INSTANCE
										.evaluate(value);
								if (toInteger == null) {
									throw new InvalidValueException(
											"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
								}
								final /*@Thrown*/ GoalReferenceValue goalreferencevalue_0 = parameter_3
										.getGoalreferencevalue();
								final /*@Thrown*/ String value_0 = goalreferencevalue_0.getValue();
								final /*@Thrown*/ IntegerValue toInteger_0 = StringToIntegerOperation.INSTANCE
										.evaluate(value_0);
								if (toInteger_0 == null) {
									throw new InvalidValueException(
											"Null \'\'Real\'\' rather than \'\'OclVoid\'\' value required");
								}
								final /*@NonInvalid*/ RealValue diff = NumericMinusOperation.INSTANCE
										.evaluate(ScmlTables.INT_1, ScmlTables.REA_0_25);
								final /*@Thrown*/ RealValue prod = NumericTimesOperation.INSTANCE.evaluate(toInteger_0,
										diff);
								if (prod instanceof InvalidValueException) {
									throw (InvalidValueException) prod;
								}
								final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
										.evaluate(executor, toInteger, prod).booleanValue();
								CAUGHT_ge = ge;
							} catch (Exception e) {
								CAUGHT_ge = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_ge == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_le_0;
								try {
									final /*@NonInvalid*/ Parameter parameter_5 = this.getParameter();
									if (parameter_5 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Parameter::goalreferencevalue\'");
									}
									final /*@Thrown*/ AggregatedValue observedValue_2 = parameter_5.getObservedValue();
									if (observedValue_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Data::value\'");
									}
									final /*@Thrown*/ String value_1 = observedValue_2.getValue();
									final /*@Thrown*/ IntegerValue toInteger_1 = StringToIntegerOperation.INSTANCE
											.evaluate(value_1);
									if (toInteger_1 == null) {
										throw new InvalidValueException(
												"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ GoalReferenceValue goalreferencevalue_1 = parameter_5
											.getGoalreferencevalue();
									final /*@Thrown*/ String value_2 = goalreferencevalue_1.getValue();
									final /*@Thrown*/ IntegerValue toInteger_2 = StringToIntegerOperation.INSTANCE
											.evaluate(value_2);
									if (toInteger_2 == null) {
										throw new InvalidValueException(
												"Null \'\'Real\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@NonInvalid*/ RealValue sum = NumericPlusOperation.INSTANCE
											.evaluate(ScmlTables.INT_1, ScmlTables.REA_0_25);
									final /*@Thrown*/ RealValue prod_0 = NumericTimesOperation.INSTANCE
											.evaluate(toInteger_2, sum);
									if (prod_0 instanceof InvalidValueException) {
										throw (InvalidValueException) prod_0;
									}
									final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
											.evaluate(executor, toInteger_1, prod_0).booleanValue();
									CAUGHT_le_0 = le_0;
								} catch (Exception e) {
									CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_le_0 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_ge instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_ge;
									}
									if (CAUGHT_le_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_le_0;
									}
									or = ValueUtil.FALSE_VALUE;
								}
							}
							CAUGHT_or = or;
						} catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_1;
							}
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or;
							}
							if ((CAUGHT_and_1 == null) || (CAUGHT_or == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
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
	public boolean checkStatusGOOD(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "KPIMeasurementDevice::checkStatusGOOD";
		try {
			/**
			 *
			 * inv checkStatusGOOD:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.parameter.observedValue <> null and self.status = Status::GOOD and self.parameter.observedValue.type = DataType::INTEGER and self.parameter.goalreferencevalue.type = DataType::INTEGER implies
			 *         self.parameter.observedValue.value.toInteger() >=
			 *         self.parameter.goalreferencevalue.value.toInteger() *
			 *         (1 - 0.05
			 *         ) or
			 *         self.parameter.observedValue.value.toInteger() <=
			 *         self.parameter.goalreferencevalue.value.toInteger() *
			 *         (1 + 0.05
			 *         )
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE___CHECK_STATUS_GOOD__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and_1;
					try {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							/*@Caught*/ Object CAUGHT_and;
							try {
								/*@Caught*/ Object CAUGHT_ne;
								try {
									final /*@NonInvalid*/ Parameter parameter = this.getParameter();
									if (parameter == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Parameter::observedValue\'");
									}
									final /*@Thrown*/ AggregatedValue observedValue = parameter.getObservedValue();
									final /*@Thrown*/ boolean ne = observedValue != null;
									CAUGHT_ne = ne;
								} catch (Exception e) {
									CAUGHT_ne = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and;
								if (CAUGHT_ne == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ Status status = this.getStatus();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_status = ScmlTables.ENUMid_Status
											.getEnumerationLiteralId(ClassUtil.nonNullState(status.getName()));
									final /*@NonInvalid*/ boolean eq = BOXED_status == ScmlTables.ELITid_GOOD;
									if (!eq) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										if (CAUGHT_ne instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_ne;
										}
										and = ValueUtil.TRUE_VALUE;
									}
								}
								CAUGHT_and = and;
							} catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and_0;
							if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_eq_0;
								try {
									final /*@NonInvalid*/ Parameter parameter_0 = this.getParameter();
									if (parameter_0 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Parameter::observedValue\'");
									}
									final /*@Thrown*/ AggregatedValue observedValue_0 = parameter_0.getObservedValue();
									if (observedValue_0 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Data::type\'");
									}
									final /*@Thrown*/ DataType type = observedValue_0.getType();
									final /*@Thrown*/ EnumerationLiteralId BOXED_type = ScmlTables.ENUMid_DataType
											.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
									final /*@Thrown*/ boolean eq_0 = BOXED_type == ScmlTables.ELITid_INTEGER;
									CAUGHT_eq_0 = eq_0;
								} catch (Exception e) {
									CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_and instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and;
									}
									if (CAUGHT_eq_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_0;
									}
									if (CAUGHT_and == null) {
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
						final /*@Thrown*/ Boolean and_1;
						if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
							and_1 = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_eq_1;
							try {
								final /*@NonInvalid*/ Parameter parameter_1 = this.getParameter();
								if (parameter_1 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://www.example.org/scml\'::Parameter::goalreferencevalue\'");
								}
								final /*@Thrown*/ GoalReferenceValue goalreferencevalue = parameter_1
										.getGoalreferencevalue();
								final /*@Thrown*/ DataType type_0 = goalreferencevalue.getType();
								final /*@Thrown*/ EnumerationLiteralId BOXED_type_0 = ScmlTables.ENUMid_DataType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
								final /*@Thrown*/ boolean eq_1 = BOXED_type_0 == ScmlTables.ELITid_INTEGER;
								CAUGHT_eq_1 = eq_1;
							} catch (Exception e) {
								CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_and_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_and_0;
								}
								if (CAUGHT_eq_1 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_1;
								}
								if (CAUGHT_and_0 == null) {
									and_1 = null;
								} else {
									and_1 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_1 = and_1;
					} catch (Exception e) {
						CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_ge;
							try {
								final /*@NonInvalid*/ Parameter parameter_3 = this.getParameter();
								if (parameter_3 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://www.example.org/scml\'::Parameter::goalreferencevalue\'");
								}
								final /*@Thrown*/ AggregatedValue observedValue_1 = parameter_3.getObservedValue();
								if (observedValue_1 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://www.example.org/scml\'::Data::value\'");
								}
								final /*@Thrown*/ String value = observedValue_1.getValue();
								final /*@Thrown*/ IntegerValue toInteger = StringToIntegerOperation.INSTANCE
										.evaluate(value);
								if (toInteger == null) {
									throw new InvalidValueException(
											"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
								}
								final /*@Thrown*/ GoalReferenceValue goalreferencevalue_0 = parameter_3
										.getGoalreferencevalue();
								final /*@Thrown*/ String value_0 = goalreferencevalue_0.getValue();
								final /*@Thrown*/ IntegerValue toInteger_0 = StringToIntegerOperation.INSTANCE
										.evaluate(value_0);
								if (toInteger_0 == null) {
									throw new InvalidValueException(
											"Null \'\'Real\'\' rather than \'\'OclVoid\'\' value required");
								}
								final /*@NonInvalid*/ RealValue diff = NumericMinusOperation.INSTANCE
										.evaluate(ScmlTables.INT_1, ScmlTables.REA_0_05);
								final /*@Thrown*/ RealValue prod = NumericTimesOperation.INSTANCE.evaluate(toInteger_0,
										diff);
								if (prod instanceof InvalidValueException) {
									throw (InvalidValueException) prod;
								}
								final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE
										.evaluate(executor, toInteger, prod).booleanValue();
								CAUGHT_ge = ge;
							} catch (Exception e) {
								CAUGHT_ge = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_ge == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_le_0;
								try {
									final /*@NonInvalid*/ Parameter parameter_5 = this.getParameter();
									if (parameter_5 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Parameter::goalreferencevalue\'");
									}
									final /*@Thrown*/ AggregatedValue observedValue_2 = parameter_5.getObservedValue();
									if (observedValue_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://www.example.org/scml\'::Data::value\'");
									}
									final /*@Thrown*/ String value_1 = observedValue_2.getValue();
									final /*@Thrown*/ IntegerValue toInteger_1 = StringToIntegerOperation.INSTANCE
											.evaluate(value_1);
									if (toInteger_1 == null) {
										throw new InvalidValueException(
												"Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ GoalReferenceValue goalreferencevalue_1 = parameter_5
											.getGoalreferencevalue();
									final /*@Thrown*/ String value_2 = goalreferencevalue_1.getValue();
									final /*@Thrown*/ IntegerValue toInteger_2 = StringToIntegerOperation.INSTANCE
											.evaluate(value_2);
									if (toInteger_2 == null) {
										throw new InvalidValueException(
												"Null \'\'Real\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@NonInvalid*/ RealValue sum = NumericPlusOperation.INSTANCE
											.evaluate(ScmlTables.INT_1, ScmlTables.REA_0_05);
									final /*@Thrown*/ RealValue prod_0 = NumericTimesOperation.INSTANCE
											.evaluate(toInteger_2, sum);
									if (prod_0 instanceof InvalidValueException) {
										throw (InvalidValueException) prod_0;
									}
									final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
											.evaluate(executor, toInteger_1, prod_0).booleanValue();
									CAUGHT_le_0 = le_0;
								} catch (Exception e) {
									CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_le_0 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_ge instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_ge;
									}
									if (CAUGHT_le_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_le_0;
									}
									or = ValueUtil.FALSE_VALUE;
								}
							}
							CAUGHT_or = or;
						} catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_and_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_1;
							}
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or;
							}
							if ((CAUGHT_and_1 == null) || (CAUGHT_or == null)) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
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
	public boolean calculationDateComparison(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "KPIMeasurementDevice::calculationDateComparison";
		try {
			/**
			 *
			 * inv calculationDateComparison:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.lastCalculation->forAll(d | d < self.nextCalculation)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.KPI_MEASUREMENT_DEVICE___CALCULATION_DATE_COMPARISON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<String> lastCalculation = this.getLastCalculation();
				final /*@NonInvalid*/ OrderedSetValue BOXED_lastCalculation = idResolver
						.createOrderedSetOfAll(ScmlTables.ORD_PRIMid_String, lastCalculation);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_d = BOXED_lastCalculation.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_d.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ String d = (String) ITERATOR_d.next();
					/**
					 * d < self.nextCalculation
					 */
					final /*@NonInvalid*/ String nextCalculation = this.getNextCalculation();
					final /*@NonInvalid*/ boolean lt = StringLessThanOperation.INSTANCE.evaluate(d, nextCalculation)
							.booleanValue();
					//
					if (!lt) { // Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (lt) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__STATUS:
			return getStatus();
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__LAST_CALCULATION:
			return getLastCalculation();
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__NEXT_CALCULATION:
			return getNextCalculation();
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__STATUS:
			setStatus((Status) newValue);
			return;
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__LAST_CALCULATION:
			getLastCalculation().clear();
			getLastCalculation().addAll((Collection<? extends String>) newValue);
			return;
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__NEXT_CALCULATION:
			setNextCalculation((String) newValue);
			return;
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__PARAMETER:
			setParameter((Parameter) newValue);
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
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__LAST_CALCULATION:
			getLastCalculation().clear();
			return;
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__NEXT_CALCULATION:
			setNextCalculation(NEXT_CALCULATION_EDEFAULT);
			return;
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__PARAMETER:
			setParameter((Parameter) null);
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
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__STATUS:
			return status != STATUS_EDEFAULT;
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__LAST_CALCULATION:
			return lastCalculation != null && !lastCalculation.isEmpty();
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__NEXT_CALCULATION:
			return NEXT_CALCULATION_EDEFAULT == null ? nextCalculation != null
					: !NEXT_CALCULATION_EDEFAULT.equals(nextCalculation);
		case ScmlPackage.KPI_MEASUREMENT_DEVICE__PARAMETER:
			return parameter != null;
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
		case ScmlPackage.KPI_MEASUREMENT_DEVICE___CHECK_STATUS_CRITICAL__DIAGNOSTICCHAIN_MAP:
			return checkStatusCRITICAL((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case ScmlPackage.KPI_MEASUREMENT_DEVICE___NAME_HAS_PARAMETER_PREFIX__DIAGNOSTICCHAIN_MAP:
			return nameHasParameterPrefix((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case ScmlPackage.KPI_MEASUREMENT_DEVICE___CHECK_STATUS_WARN__DIAGNOSTICCHAIN_MAP:
			return checkStatusWARN((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case ScmlPackage.KPI_MEASUREMENT_DEVICE___CHECK_STATUS_GOOD__DIAGNOSTICCHAIN_MAP:
			return checkStatusGOOD((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case ScmlPackage.KPI_MEASUREMENT_DEVICE___CALCULATION_DATE_COMPARISON__DIAGNOSTICCHAIN_MAP:
			return calculationDateComparison((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (status: ");
		result.append(status);
		result.append(", lastCalculation: ");
		result.append(lastCalculation);
		result.append(", nextCalculation: ");
		result.append(nextCalculation);
		result.append(')');
		return result.toString();
	}

} //KPIMeasurementDeviceImpl
