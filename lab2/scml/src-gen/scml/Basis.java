/**
 */
package scml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.Basis#getDescription <em>Description</em>}</li>
 *   <li>{@link scml.Basis#getPrincipleType <em>Principle Type</em>}</li>
 *   <li>{@link scml.Basis#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getBasis()
 * @model
 * @generated
 */
public interface Basis extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see scml.ScmlPackage#getBasis_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link scml.Basis#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Principle Type</b></em>' attribute.
	 * The literals are from the enumeration {@link scml.PrincipleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principle Type</em>' attribute.
	 * @see scml.PrincipleType
	 * @see #setPrincipleType(PrincipleType)
	 * @see scml.ScmlPackage#getBasis_PrincipleType()
	 * @model required="true"
	 * @generated
	 */
	PrincipleType getPrincipleType();

	/**
	 * Sets the value of the '{@link scml.Basis#getPrincipleType <em>Principle Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principle Type</em>' attribute.
	 * @see scml.PrincipleType
	 * @see #getPrincipleType()
	 * @generated
	 */
	void setPrincipleType(PrincipleType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see scml.ScmlPackage#getBasis_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link scml.Basis#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

} // Basis
