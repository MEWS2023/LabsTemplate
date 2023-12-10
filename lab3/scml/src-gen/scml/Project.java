/**
 */
package scml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.Project#getComponent <em>Component</em>}</li>
 *   <li>{@link scml.Project#getCategory <em>Category</em>}</li>
 *   <li>{@link scml.Project#getIndicator <em>Indicator</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link scml.InfrastructureComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see scml.ScmlPackage#getProject_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfrastructureComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link scml.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see scml.ScmlPackage#getProject_Category()
	 * @model
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link scml.KPIMeasurementDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicator</em>' containment reference list.
	 * @see scml.ScmlPackage#getProject_Indicator()
	 * @model containment="true"
	 * @generated
	 */
	EList<KPIMeasurementDevice> getIndicator();

} // Project
