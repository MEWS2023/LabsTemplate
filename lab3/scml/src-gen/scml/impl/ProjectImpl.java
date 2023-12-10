/**
 */
package scml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scml.Category;
import scml.InfrastructureComponent;
import scml.KPIMeasurementDevice;
import scml.Project;
import scml.ScmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.ProjectImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link scml.impl.ProjectImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link scml.impl.ProjectImpl#getIndicator <em>Indicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends NamedElementImpl implements Project {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureComponent> component;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The cached value of the '{@link #getIndicator() <em>Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<KPIMeasurementDevice> indicator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InfrastructureComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<InfrastructureComponent>(InfrastructureComponent.class, this,
					ScmlPackage.PROJECT__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, ScmlPackage.PROJECT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KPIMeasurementDevice> getIndicator() {
		if (indicator == null) {
			indicator = new EObjectContainmentEList<KPIMeasurementDevice>(KPIMeasurementDevice.class, this,
					ScmlPackage.PROJECT__INDICATOR);
		}
		return indicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScmlPackage.PROJECT__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case ScmlPackage.PROJECT__INDICATOR:
			return ((InternalEList<?>) getIndicator()).basicRemove(otherEnd, msgs);
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
		case ScmlPackage.PROJECT__COMPONENT:
			return getComponent();
		case ScmlPackage.PROJECT__CATEGORY:
			return getCategory();
		case ScmlPackage.PROJECT__INDICATOR:
			return getIndicator();
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
		case ScmlPackage.PROJECT__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends InfrastructureComponent>) newValue);
			return;
		case ScmlPackage.PROJECT__CATEGORY:
			getCategory().clear();
			getCategory().addAll((Collection<? extends Category>) newValue);
			return;
		case ScmlPackage.PROJECT__INDICATOR:
			getIndicator().clear();
			getIndicator().addAll((Collection<? extends KPIMeasurementDevice>) newValue);
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
		case ScmlPackage.PROJECT__COMPONENT:
			getComponent().clear();
			return;
		case ScmlPackage.PROJECT__CATEGORY:
			getCategory().clear();
			return;
		case ScmlPackage.PROJECT__INDICATOR:
			getIndicator().clear();
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
		case ScmlPackage.PROJECT__COMPONENT:
			return component != null && !component.isEmpty();
		case ScmlPackage.PROJECT__CATEGORY:
			return category != null && !category.isEmpty();
		case ScmlPackage.PROJECT__INDICATOR:
			return indicator != null && !indicator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
