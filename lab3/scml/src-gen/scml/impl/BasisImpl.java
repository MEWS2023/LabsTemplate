/**
 */
package scml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import scml.Basis;
import scml.PrincipleType;
import scml.ScmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.BasisImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link scml.impl.BasisImpl#getPrincipleType <em>Principle Type</em>}</li>
 *   <li>{@link scml.impl.BasisImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasisImpl extends MinimalEObjectImpl.Container implements Basis {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrincipleType() <em>Principle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipleType()
	 * @generated
	 * @ordered
	 */
	protected static final PrincipleType PRINCIPLE_TYPE_EDEFAULT = PrincipleType.LAW;

	/**
	 * The cached value of the '{@link #getPrincipleType() <em>Principle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrincipleType()
	 * @generated
	 * @ordered
	 */
	protected PrincipleType principleType = PRINCIPLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.BASIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.BASIS__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrincipleType getPrincipleType() {
		return principleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrincipleType(PrincipleType newPrincipleType) {
		PrincipleType oldPrincipleType = principleType;
		principleType = newPrincipleType == null ? PRINCIPLE_TYPE_EDEFAULT : newPrincipleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.BASIS__PRINCIPLE_TYPE, oldPrincipleType,
					principleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScmlPackage.BASIS__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ScmlPackage.BASIS__DESCRIPTION:
			return getDescription();
		case ScmlPackage.BASIS__PRINCIPLE_TYPE:
			return getPrincipleType();
		case ScmlPackage.BASIS__SOURCE:
			return getSource();
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
		case ScmlPackage.BASIS__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ScmlPackage.BASIS__PRINCIPLE_TYPE:
			setPrincipleType((PrincipleType) newValue);
			return;
		case ScmlPackage.BASIS__SOURCE:
			setSource((String) newValue);
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
		case ScmlPackage.BASIS__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ScmlPackage.BASIS__PRINCIPLE_TYPE:
			setPrincipleType(PRINCIPLE_TYPE_EDEFAULT);
			return;
		case ScmlPackage.BASIS__SOURCE:
			setSource(SOURCE_EDEFAULT);
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
		case ScmlPackage.BASIS__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ScmlPackage.BASIS__PRINCIPLE_TYPE:
			return principleType != PRINCIPLE_TYPE_EDEFAULT;
		case ScmlPackage.BASIS__SOURCE:
			return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", principleType: ");
		result.append(principleType);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //BasisImpl
