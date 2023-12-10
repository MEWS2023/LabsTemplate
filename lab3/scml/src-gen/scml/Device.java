/**
 */
package scml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.Device#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getDevice()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkParameterType'"
 * @generated
 */
public interface Device extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link scml.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see scml.ParameterType
	 * @see #setType(ParameterType)
	 * @see scml.ScmlPackage#getDevice_Type()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link scml.Device#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see scml.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='     ------ 5. implicit constraint ---------\n\t\tself.oclContainer().oclAsType(InfrastructureComponent).parameter.type = self.type'"
	 * @generated
	 */
	boolean checkParameterType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Device
