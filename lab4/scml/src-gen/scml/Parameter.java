/**
 */
package scml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.Parameter#getUnit <em>Unit</em>}</li>
 *   <li>{@link scml.Parameter#getGoalreferencevalue <em>Goalreferencevalue</em>}</li>
 *   <li>{@link scml.Parameter#getObservedValue <em>Observed Value</em>}</li>
 *   <li>{@link scml.Parameter#getComponent <em>Component</em>}</li>
 *   <li>{@link scml.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link scml.Parameter#getKpimeasurementdevice <em>Kpimeasurementdevice</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see scml.ScmlPackage#getParameter_Unit()
	 * @model required="true"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link scml.Parameter#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Goalreferencevalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goalreferencevalue</em>' containment reference.
	 * @see #setGoalreferencevalue(GoalReferenceValue)
	 * @see scml.ScmlPackage#getParameter_Goalreferencevalue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GoalReferenceValue getGoalreferencevalue();

	/**
	 * Sets the value of the '{@link scml.Parameter#getGoalreferencevalue <em>Goalreferencevalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goalreferencevalue</em>' containment reference.
	 * @see #getGoalreferencevalue()
	 * @generated
	 */
	void setGoalreferencevalue(GoalReferenceValue value);

	/**
	 * Returns the value of the '<em><b>Observed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Value</em>' containment reference.
	 * @see #setObservedValue(AggregatedValue)
	 * @see scml.ScmlPackage#getParameter_ObservedValue()
	 * @model containment="true"
	 * @generated
	 */
	AggregatedValue getObservedValue();

	/**
	 * Sets the value of the '{@link scml.Parameter#getObservedValue <em>Observed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Value</em>' containment reference.
	 * @see #getObservedValue()
	 * @generated
	 */
	void setObservedValue(AggregatedValue value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(InfrastructureComponent)
	 * @see scml.ScmlPackage#getParameter_Component()
	 * @model required="true"
	 * @generated
	 */
	InfrastructureComponent getComponent();

	/**
	 * Sets the value of the '{@link scml.Parameter#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(InfrastructureComponent value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link scml.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see scml.ParameterType
	 * @see #setType(ParameterType)
	 * @see scml.ScmlPackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getType();

	/**
	 * Sets the value of the '{@link scml.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see scml.ParameterType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterType value);

	/**
	 * Returns the value of the '<em><b>Kpimeasurementdevice</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scml.KPIMeasurementDevice#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpimeasurementdevice</em>' reference.
	 * @see #setKpimeasurementdevice(KPIMeasurementDevice)
	 * @see scml.ScmlPackage#getParameter_Kpimeasurementdevice()
	 * @see scml.KPIMeasurementDevice#getParameter
	 * @model opposite="parameter"
	 * @generated
	 */
	KPIMeasurementDevice getKpimeasurementdevice();

	/**
	 * Sets the value of the '{@link scml.Parameter#getKpimeasurementdevice <em>Kpimeasurementdevice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kpimeasurementdevice</em>' reference.
	 * @see #getKpimeasurementdevice()
	 * @generated
	 */
	void setKpimeasurementdevice(KPIMeasurementDevice value);

} // Parameter
