/**
 */
package scml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import scml.Basis;
import scml.GoalReferenceValue;
import scml.ScmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.GoalReferenceValueImpl#getBasis <em>Basis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalReferenceValueImpl extends DataImpl implements GoalReferenceValue {
	/**
	 * The cached value of the '{@link #getBasis() <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasis()
	 * @generated
	 * @ordered
	 */
	protected Basis basis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalReferenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.GOAL_REFERENCE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis getBasis() {
		return basis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasis(Basis newBasis, NotificationChain msgs) {
		Basis oldBasis = basis;
		basis = newBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ScmlPackage.GOAL_REFERENCE_VALUE__BASIS, oldBasis, newBasis);
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
	public void setBasis(Basis newBasis) {
		if (newBasis != basis) {
			NotificationChain msgs = null;
			if (basis != null)
				msgs = ((InternalEObject) basis).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.GOAL_REFERENCE_VALUE__BASIS, null, msgs);
			if (newBasis != null)
				msgs = ((InternalEObject) newBasis).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ScmlPackage.GOAL_REFERENCE_VALUE__BASIS, null, msgs);
			msgs = basicSetBasis(newBasis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.GOAL_REFERENCE_VALUE__BASIS, newBasis,
					newBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScmlPackage.GOAL_REFERENCE_VALUE__BASIS:
			return basicSetBasis(null, msgs);
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
		case ScmlPackage.GOAL_REFERENCE_VALUE__BASIS:
			return getBasis();
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
		case ScmlPackage.GOAL_REFERENCE_VALUE__BASIS:
			setBasis((Basis) newValue);
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
		case ScmlPackage.GOAL_REFERENCE_VALUE__BASIS:
			setBasis((Basis) null);
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
		case ScmlPackage.GOAL_REFERENCE_VALUE__BASIS:
			return basis != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalReferenceValueImpl
