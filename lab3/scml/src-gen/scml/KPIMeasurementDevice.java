/**
 */
package scml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KPI Measurement Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.KPIMeasurementDevice#getStatus <em>Status</em>}</li>
 *   <li>{@link scml.KPIMeasurementDevice#getLastCalculation <em>Last Calculation</em>}</li>
 *   <li>{@link scml.KPIMeasurementDevice#getNextCalculation <em>Next Calculation</em>}</li>
 *   <li>{@link scml.KPIMeasurementDevice#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getKPIMeasurementDevice()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='calculationDateComparison'"
 * @generated
 */
public interface KPIMeasurementDevice extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link scml.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see scml.Status
	 * @see #setStatus(Status)
	 * @see scml.ScmlPackage#getKPIMeasurementDevice_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link scml.KPIMeasurementDevice#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see scml.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Last Calculation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Calculation</em>' attribute list.
	 * @see scml.ScmlPackage#getKPIMeasurementDevice_LastCalculation()
	 * @model
	 * @generated
	 */
	EList<String> getLastCalculation();

	/**
	 * Returns the value of the '<em><b>Next Calculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Calculation</em>' attribute.
	 * @see #setNextCalculation(String)
	 * @see scml.ScmlPackage#getKPIMeasurementDevice_NextCalculation()
	 * @model required="true"
	 * @generated
	 */
	String getNextCalculation();

	/**
	 * Sets the value of the '{@link scml.KPIMeasurementDevice#getNextCalculation <em>Next Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Calculation</em>' attribute.
	 * @see #getNextCalculation()
	 * @generated
	 */
	void setNextCalculation(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see scml.ScmlPackage#getKPIMeasurementDevice_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link scml.KPIMeasurementDevice#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='      ------ 3. explicit constraint ---------\n\t\t(\n\t\t\tself.parameter.observedValue &lt;&gt; null and \n\t\t\tself.status=Status::CRITICAL and \n\t\t\tself.parameter.observedValue.type = DataType::INTEGER and\n\t\t\tself.parameter.goalreferencevalue.type = DataType::INTEGER\n\t\t) implies\n\t\t(self.parameter.observedValue.value.toInteger() &gt; (self.parameter.goalreferencevalue.value.toInteger() * (1+0.25)))'"
	 * @generated
	 */
	boolean checkStatusCRITICAL(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='     ------ 2. implicit constraint ---------\n\t\tself.name.size() &gt;= self.parameter.name.size() and \n\t\tself.name.substring(1, self.parameter.name.size() + 11) = (self.parameter.name.toUpper() + \'measurement\')'"
	 * @generated
	 */
	boolean nameHasParameterPrefix(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='            ------ 2. explicit constraint ---------\n\t\t(\n\t\t\tself.parameter.observedValue &lt;&gt; null and \n\t\t\tself.status=Status::WARN and \n\t\t\tself.parameter.observedValue.type = DataType::INTEGER and\n\t\t\tself.parameter.goalreferencevalue.type = DataType::INTEGER\n\t\t) implies\n\t\t(\n\t\t\t(self.parameter.observedValue.value.toInteger() &gt;= (self.parameter.goalreferencevalue.value.toInteger() * (1-0.25))) or \n\t\t\t(self.parameter.observedValue.value.toInteger() &lt;= (self.parameter.goalreferencevalue.value.toInteger() * (1+0.25)))\n\t\t)'"
	 * @generated
	 */
	boolean checkStatusWARN(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='                ------ 2. explicit constraint ---------\n\t\t(\n\t\t\tself.parameter.observedValue &lt;&gt; null and \n\t\t\tself.status=Status::GOOD and \n\t\t\tself.parameter.observedValue.type = DataType::INTEGER and\n\t\t\tself.parameter.goalreferencevalue.type = DataType::INTEGER\n\t\t) implies\n\t\t(\n\t\t\t(self.parameter.observedValue.value.toInteger() &gt;= (self.parameter.goalreferencevalue.value.toInteger() * (1-0.05))) or \n\t\t\t(self.parameter.observedValue.value.toInteger() &lt;= (self.parameter.goalreferencevalue.value.toInteger() * (1+0.05)))\n\t\t)'"
	 * @generated
	 */
	boolean checkStatusGOOD(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='   ------ 1. explicit constraint ---------\n\t\tself.lastCalculation -&gt; forAll(d | d &lt; self.nextCalculation)'"
	 * @generated
	 */
	boolean calculationDateComparison(DiagnosticChain diagnostics, Map<Object, Object> context);

} // KPIMeasurementDevice
