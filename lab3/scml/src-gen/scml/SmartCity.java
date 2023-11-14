/**
 */
package scml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.SmartCity#getCategory <em>Category</em>}</li>
 *   <li>{@link scml.SmartCity#getProject <em>Project</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getSmartCity()
 * @model
 * @generated
 */
public interface SmartCity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link scml.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see scml.ScmlPackage#getSmartCity_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference list.
	 * The list contents are of type {@link scml.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference list.
	 * @see scml.ScmlPackage#getSmartCity_Project()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProject();

} // SmartCity
