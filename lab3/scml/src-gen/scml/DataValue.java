/**
 */
package scml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.DataValue#isCollected <em>Collected</em>}</li>
 *   <li>{@link scml.DataValue#getProducedTime <em>Produced Time</em>}</li>
 *   <li>{@link scml.DataValue#getConsumedTime <em>Consumed Time</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getDataValue()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkConsumedTimeSet'"
 * @generated
 */
public interface DataValue extends Data {
	/**
	 * Returns the value of the '<em><b>Collected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collected</em>' attribute.
	 * @see #setCollected(boolean)
	 * @see scml.ScmlPackage#getDataValue_Collected()
	 * @model required="true"
	 * @generated
	 */
	boolean isCollected();

	/**
	 * Sets the value of the '{@link scml.DataValue#isCollected <em>Collected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collected</em>' attribute.
	 * @see #isCollected()
	 * @generated
	 */
	void setCollected(boolean value);

	/**
	 * Returns the value of the '<em><b>Produced Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced Time</em>' attribute.
	 * @see #setProducedTime(String)
	 * @see scml.ScmlPackage#getDataValue_ProducedTime()
	 * @model required="true"
	 * @generated
	 */
	String getProducedTime();

	/**
	 * Sets the value of the '{@link scml.DataValue#getProducedTime <em>Produced Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced Time</em>' attribute.
	 * @see #getProducedTime()
	 * @generated
	 */
	void setProducedTime(String value);

	/**
	 * Returns the value of the '<em><b>Consumed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumed Time</em>' attribute.
	 * @see #setConsumedTime(String)
	 * @see scml.ScmlPackage#getDataValue_ConsumedTime()
	 * @model
	 * @generated
	 */
	String getConsumedTime();

	/**
	 * Sets the value of the '{@link scml.DataValue#getConsumedTime <em>Consumed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumed Time</em>' attribute.
	 * @see #getConsumedTime()
	 * @generated
	 */
	void setConsumedTime(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='      --------- 3. explicit constraint ---------\n\t\tself.consumedTime &lt;&gt; null implies self.consumedTime &gt; self.producedTime'"
	 * @generated
	 */
	boolean checkConsumedTimeProducedTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='      --------- 3. explicit constraint ---------\n\t\tself.consumedTime &lt;&gt; null implies self.collected = true'"
	 * @generated
	 */
	boolean checkConsumedTimeSet(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DataValue
