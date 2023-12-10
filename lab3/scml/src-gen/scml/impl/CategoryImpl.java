/**
 */
package scml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import scml.Category;
import scml.ScmlPackage;
import scml.ScmlTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.CategoryImpl#getSDG <em>SDG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends NamedElementImpl implements Category {
	/**
	 * The cached value of the '{@link #getSDG() <em>SDG</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDG()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sdg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSDG() {
		if (sdg == null) {
			sdg = new EDataTypeUniqueEList<Integer>(Integer.class, this, ScmlPackage.CATEGORY__SDG);
		}
		return sdg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkSDGNumber(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Category::checkSDGNumber";
		try {
			/**
			 *
			 * inv checkSDGNumber:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.SDG->size() < 18 and
			 *         self.SDG->forAll(s | s < 18 and s > 0)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.CATEGORY___CHECK_SDG_NUMBER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Integer> SDG_0 = this.getSDG();
					final /*@NonInvalid*/ OrderedSetValue BOXED_SDG_0 = idResolver
							.createOrderedSetOfAll(ScmlTables.ORD_DATAid_EInt, SDG_0);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_SDG_0);
					final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE
							.evaluate(executor, size, ScmlTables.INT_18).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!lt) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_s = BOXED_SDG_0.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_s.hasNext()) {
									if (accumulator == null) {
										forAll = null;
									} else if (accumulator == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ IntegerValue s = (IntegerValue) ITERATOR_s.next();
								/**
								 * s < 18 and s > 0
								 */
								final /*@NonInvalid*/ boolean lt_0 = OclComparableLessThanOperation.INSTANCE
										.evaluate(executor, s, ScmlTables.INT_18).booleanValue();
								final /*@NonInvalid*/ Boolean and;
								if (!lt_0) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
											.evaluate(executor, s, ScmlTables.INT_0).booleanValue();
									if (!gt) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
								//
								if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break; // Stop immediately
								} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									; // Carry on
								} else if (and == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.TRUE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll;
							}
							if (CAUGHT_forAll == null) {
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
		case ScmlPackage.CATEGORY__SDG:
			return getSDG();
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
		case ScmlPackage.CATEGORY__SDG:
			getSDG().clear();
			getSDG().addAll((Collection<? extends Integer>) newValue);
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
		case ScmlPackage.CATEGORY__SDG:
			getSDG().clear();
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
		case ScmlPackage.CATEGORY__SDG:
			return sdg != null && !sdg.isEmpty();
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
		case ScmlPackage.CATEGORY___CHECK_SDG_NUMBER__DIAGNOSTICCHAIN_MAP:
			return checkSDGNumber((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (SDG: ");
		result.append(sdg);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
