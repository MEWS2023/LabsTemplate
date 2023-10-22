/**
 */
package scml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import scml.Category;
import scml.Project;
import scml.ScmlPackage;
import scml.SmartCity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart City</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link scml.impl.SmartCityImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link scml.impl.SmartCityImpl#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SmartCityImpl extends NamedElementImpl implements SmartCity {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> project;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartCityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScmlPackage.Literals.SMART_CITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectContainmentEList<Category>(Category.class, this, ScmlPackage.SMART_CITY__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Project> getProject() {
		if (project == null) {
			project = new EObjectContainmentEList<Project>(Project.class, this, ScmlPackage.SMART_CITY__PROJECT);
		}
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScmlPackage.SMART_CITY__CATEGORY:
			return ((InternalEList<?>) getCategory()).basicRemove(otherEnd, msgs);
		case ScmlPackage.SMART_CITY__PROJECT:
			return ((InternalEList<?>) getProject()).basicRemove(otherEnd, msgs);
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
		case ScmlPackage.SMART_CITY__CATEGORY:
			return getCategory();
		case ScmlPackage.SMART_CITY__PROJECT:
			return getProject();
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
		case ScmlPackage.SMART_CITY__CATEGORY:
			getCategory().clear();
			getCategory().addAll((Collection<? extends Category>) newValue);
			return;
		case ScmlPackage.SMART_CITY__PROJECT:
			getProject().clear();
			getProject().addAll((Collection<? extends Project>) newValue);
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
		case ScmlPackage.SMART_CITY__CATEGORY:
			getCategory().clear();
			return;
		case ScmlPackage.SMART_CITY__PROJECT:
			getProject().clear();
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
		case ScmlPackage.SMART_CITY__CATEGORY:
			return category != null && !category.isEmpty();
		case ScmlPackage.SMART_CITY__PROJECT:
			return project != null && !project.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SmartCityImpl
