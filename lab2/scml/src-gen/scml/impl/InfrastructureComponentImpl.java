/**
 */
package scml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludesOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringAtOperation;
import org.eclipse.ocl.pivot.library.string.StringIndexOfOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;
import scml.DataValue;
import scml.Device;
import scml.InfrastructureComponent;
import scml.Location;
import scml.Parameter;
import scml.Project;
import scml.ScmlPackage;
import scml.ScmlTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infrastructure Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.InfrastructureComponentImpl#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link scml.impl.InfrastructureComponentImpl#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link scml.impl.InfrastructureComponentImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link scml.impl.InfrastructureComponentImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link scml.impl.InfrastructureComponentImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link scml.impl.InfrastructureComponentImpl#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InfrastructureComponentImpl extends NamedElementImpl implements InfrastructureComponent {
	/**
	 * The cached value of the '{@link #getIsPartOf() <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPartOf()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureComponent isPartOf;

	/**
	 * The cached value of the '{@link #getComposedOf() <em>Composed Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedOf()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureComponent> composedOf;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<DataValue> produces;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureComponent getIsPartOf() {
		if (isPartOf != null && isPartOf.eIsProxy()) {
			InternalEObject oldIsPartOf = (InternalEObject) isPartOf;
			isPartOf = (InfrastructureComponent) eResolveProxy(oldIsPartOf);
			if (isPartOf != oldIsPartOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF, oldIsPartOf, isPartOf));
			}
		}
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureComponent basicGetIsPartOf() {
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPartOf(InfrastructureComponent newIsPartOf, NotificationChain msgs) {
		InfrastructureComponent oldIsPartOf = isPartOf;
		isPartOf = newIsPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF, oldIsPartOf, newIsPartOf);
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
	public void setIsPartOf(InfrastructureComponent newIsPartOf) {
		if (newIsPartOf != isPartOf) {
			NotificationChain msgs = null;
			if (isPartOf != null)
				msgs = ((InternalEObject) isPartOf).eInverseRemove(this,
						ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF, InfrastructureComponent.class, msgs);
			if (newIsPartOf != null)
				msgs = ((InternalEObject) newIsPartOf).eInverseAdd(this,
						ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF, InfrastructureComponent.class, msgs);
			msgs = basicSetIsPartOf(newIsPartOf, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF,
					newIsPartOf, newIsPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InfrastructureComponent> getComposedOf() {
		if (composedOf == null) {
			composedOf = new EObjectWithInverseResolvingEList<InfrastructureComponent>(InfrastructureComponent.class,
					this, ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF,
					ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF);
		}
		return composedOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScmlPackage.INFRASTRUCTURE_COMPONENT__LOCATION, oldLocation, newLocation);
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
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.INFRASTRUCTURE_COMPONENT__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.INFRASTRUCTURE_COMPONENT__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.INFRASTRUCTURE_COMPONENT__LOCATION,
					newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataValue> getProduces() {
		if (produces == null) {
			produces = new EObjectContainmentEList<DataValue>(DataValue.class, this,
					ScmlPackage.INFRASTRUCTURE_COMPONENT__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScmlPackage.INFRASTRUCTURE_COMPONENT__PARAMETER, oldParameter, newParameter);
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
	public void setParameter(Parameter newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject) parameter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.INFRASTRUCTURE_COMPONENT__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject) newParameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.INFRASTRUCTURE_COMPONENT__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.INFRASTRUCTURE_COMPONENT__PARAMETER,
					newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Device> getDevice() {
		if (device == null) {
			device = new EObjectContainmentEList<Device>(Device.class, this,
					ScmlPackage.INFRASTRUCTURE_COMPONENT__DEVICE);
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean checkNotPartOfItself(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "InfrastructureComponent::checkNotPartOfItself";
		try {
			/**
			 *
			 * inv checkNotPartOfItself:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.composedOf->excludes(self) and
			 *         self.isPartOf->excludes(self)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<InfrastructureComponent> composedOf = this.getComposedOf();
					final /*@NonInvalid*/ OrderedSetValue BOXED_composedOf = idResolver
							.createOrderedSetOfAll(ScmlTables.ORD_CLSSid_InfrastructureComponent, composedOf);
					final /*@NonInvalid*/ boolean excludes = CollectionExcludesOperation.INSTANCE
							.evaluate(BOXED_composedOf, this).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!excludes) {
						result = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_excludes_0;
						try {
							final /*@NonInvalid*/ InfrastructureComponent isPartOf = this.getIsPartOf();
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
									ScmlTables.SET_CLSSid_InfrastructureComponent, isPartOf);
							final /*@Thrown*/ boolean excludes_0 = CollectionExcludesOperation.INSTANCE
									.evaluate(oclAsSet, this).booleanValue();
							CAUGHT_excludes_0 = excludes_0;
						} catch (Exception e) {
							CAUGHT_excludes_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_excludes_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_excludes_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_excludes_0;
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
	public boolean nameHasPrefixInitialOfProject(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "InfrastructureComponent::nameHasPrefixInitialOfProject";
		try {
			/**
			 *
			 * inv nameHasPrefixInitialOfProject:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.oclContainer()
			 *         .oclIsTypeOf(Project) implies
			 *         self.name.at(1) =
			 *         self.oclContainer()
			 *         .oclAsType(Project)
			 *         .name.at(1) and
			 *         (
			 *           self.oclContainer()
			 *           .oclAsType(Project)
			 *           .name.indexOf(' ') <> 0 implies
			 *           self.name.at(2) =
			 *           self.oclContainer()
			 *           .oclAsType(Project)
			 *           .name.at(
			 *             self.oclContainer()
			 *             .oclAsType(Project)
			 *             .name.indexOf(' ') + 1)
			 *         )
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					ScmlPackage.Literals.INFRASTRUCTURE_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, ScmlTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_oclIsTypeOf;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_scml_c_c_Project = idResolver
								.getClass(ScmlTables.CLSSid_Project, null);
						final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE
								.evaluate(executor, this);
						final /*@Thrown*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
								.evaluate(executor, oclContainer, TYP_scml_c_c_Project).booleanValue();
						CAUGHT_oclIsTypeOf = oclIsTypeOf;
					} catch (Exception e) {
						CAUGHT_oclIsTypeOf = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_oclIsTypeOf == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and;
						try {
							/*@Caught*/ Object CAUGHT_eq;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_scml_c_c_Project_0 = idResolver
										.getClass(ScmlTables.CLSSid_Project, null);
								final /*@NonInvalid*/ String name = this.getName();
								final /*@Thrown*/ String at = StringAtOperation.INSTANCE.evaluate(name,
										ScmlTables.INT_1);
								final /*@NonInvalid*/ Object oclContainer_0 = ClassifierOclContainerOperation.INSTANCE
										.evaluate(executor, this);
								final /*@Thrown*/ Project oclAsType = (Project) OclAnyOclAsTypeOperation.INSTANCE
										.evaluate(executor, oclContainer_0, TYP_scml_c_c_Project_0);
								final /*@Thrown*/ String name_0 = oclAsType.getName();
								final /*@Thrown*/ String at_0 = StringAtOperation.INSTANCE.evaluate(name_0,
										ScmlTables.INT_1);
								final /*@Thrown*/ boolean eq = at.equals(at_0);
								CAUGHT_eq = eq;
							} catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and;
							if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_implies;
								try {
									/*@Caught*/ Object CAUGHT_ne;
									try {
										final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_scml_c_c_Project_1 = idResolver
												.getClass(ScmlTables.CLSSid_Project, null);
										final /*@NonInvalid*/ Object oclContainer_1 = ClassifierOclContainerOperation.INSTANCE
												.evaluate(executor, this);
										final /*@Thrown*/ Project oclAsType_0 = (Project) OclAnyOclAsTypeOperation.INSTANCE
												.evaluate(executor, oclContainer_1, TYP_scml_c_c_Project_1);
										final /*@Thrown*/ String name_1 = oclAsType_0.getName();
										final /*@Thrown*/ IntegerValue indexOf = StringIndexOfOperation.INSTANCE
												.evaluate(name_1, ScmlTables.STR__32);
										final /*@Thrown*/ boolean ne = !indexOf.equals(ScmlTables.INT_0);
										CAUGHT_ne = ne;
									} catch (Exception e) {
										CAUGHT_ne = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean implies;
									if (CAUGHT_ne == ValueUtil.FALSE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_eq_0;
										try {
											final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_scml_c_c_Project_2 = idResolver
													.getClass(ScmlTables.CLSSid_Project, null);
											final /*@NonInvalid*/ Object oclContainer_2 = ClassifierOclContainerOperation.INSTANCE
													.evaluate(executor, this);
											final /*@Thrown*/ Project oclAsType_1 = (Project) OclAnyOclAsTypeOperation.INSTANCE
													.evaluate(executor, oclContainer_2, TYP_scml_c_c_Project_2);
											final /*@Thrown*/ String name_3 = oclAsType_1.getName();
											final /*@NonInvalid*/ String name_2 = this.getName();
											final /*@Thrown*/ String at_1 = StringAtOperation.INSTANCE.evaluate(name_2,
													ScmlTables.INT_2);
											final /*@Thrown*/ IntegerValue indexOf_0 = StringIndexOfOperation.INSTANCE
													.evaluate(name_3, ScmlTables.STR__32);
											final /*@Thrown*/ IntegerValue sum = (IntegerValue) NumericPlusOperation.INSTANCE
													.evaluate(indexOf_0, ScmlTables.INT_1);
											if (sum instanceof InvalidValueException) {
												throw (InvalidValueException) sum;
											}
											final /*@Thrown*/ String at_2 = StringAtOperation.INSTANCE.evaluate(name_3,
													sum);
											final /*@Thrown*/ boolean eq_0 = at_1.equals(at_2);
											CAUGHT_eq_0 = eq_0;
										} catch (Exception e) {
											CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
											implies = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_ne instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_ne;
											}
											if (CAUGHT_eq_0 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_0;
											}
											implies = ValueUtil.FALSE_VALUE;
										}
									}
									CAUGHT_implies = implies;
								} catch (Exception e) {
									CAUGHT_implies = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_implies == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_eq instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq;
									}
									if (CAUGHT_implies instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_implies;
									}
									if (CAUGHT_implies == null) {
										and = null;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						} catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_oclIsTypeOf instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_oclIsTypeOf;
							}
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if (CAUGHT_and == null) {
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF:
			if (isPartOf != null)
				msgs = ((InternalEObject) isPartOf).eInverseRemove(this,
						ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF, InfrastructureComponent.class, msgs);
			return basicSetIsPartOf((InfrastructureComponent) otherEnd, msgs);
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getComposedOf()).basicAdd(otherEnd, msgs);
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
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF:
			return basicSetIsPartOf(null, msgs);
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF:
			return ((InternalEList<?>) getComposedOf()).basicRemove(otherEnd, msgs);
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__LOCATION:
			return basicSetLocation(null, msgs);
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PRODUCES:
			return ((InternalEList<?>) getProduces()).basicRemove(otherEnd, msgs);
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PARAMETER:
			return basicSetParameter(null, msgs);
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__DEVICE:
			return ((InternalEList<?>) getDevice()).basicRemove(otherEnd, msgs);
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
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF:
			if (resolve)
				return getIsPartOf();
			return basicGetIsPartOf();
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF:
			return getComposedOf();
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__LOCATION:
			return getLocation();
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PRODUCES:
			return getProduces();
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PARAMETER:
			return getParameter();
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__DEVICE:
			return getDevice();
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
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF:
			setIsPartOf((InfrastructureComponent) newValue);
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF:
			getComposedOf().clear();
			getComposedOf().addAll((Collection<? extends InfrastructureComponent>) newValue);
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__LOCATION:
			setLocation((Location) newValue);
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PRODUCES:
			getProduces().clear();
			getProduces().addAll((Collection<? extends DataValue>) newValue);
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PARAMETER:
			setParameter((Parameter) newValue);
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__DEVICE:
			getDevice().clear();
			getDevice().addAll((Collection<? extends Device>) newValue);
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
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF:
			setIsPartOf((InfrastructureComponent) null);
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF:
			getComposedOf().clear();
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__LOCATION:
			setLocation((Location) null);
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PRODUCES:
			getProduces().clear();
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PARAMETER:
			setParameter((Parameter) null);
			return;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__DEVICE:
			getDevice().clear();
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
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__IS_PART_OF:
			return isPartOf != null;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__COMPOSED_OF:
			return composedOf != null && !composedOf.isEmpty();
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__LOCATION:
			return location != null;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PRODUCES:
			return produces != null && !produces.isEmpty();
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__PARAMETER:
			return parameter != null;
		case ScmlPackage.INFRASTRUCTURE_COMPONENT__DEVICE:
			return device != null && !device.isEmpty();
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
		case ScmlPackage.INFRASTRUCTURE_COMPONENT___CHECK_NOT_PART_OF_ITSELF__DIAGNOSTICCHAIN_MAP:
			return checkNotPartOfItself((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case ScmlPackage.INFRASTRUCTURE_COMPONENT___NAME_HAS_PREFIX_INITIAL_OF_PROJECT__DIAGNOSTICCHAIN_MAP:
			return nameHasPrefixInitialOfProject((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InfrastructureComponentImpl
