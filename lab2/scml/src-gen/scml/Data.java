/**
 */
package scml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.Data#getType <em>Type</em>}</li>
 *   <li>{@link scml.Data#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getData()
 * @model abstract="true"
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link scml.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see scml.DataType
	 * @see #setType(DataType)
	 * @see scml.ScmlPackage#getData_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link scml.Data#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see scml.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see scml.ScmlPackage#getData_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link scml.Data#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Data
