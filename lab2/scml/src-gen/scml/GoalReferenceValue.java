/**
 */
package scml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.GoalReferenceValue#getBasis <em>Basis</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getGoalReferenceValue()
 * @model
 * @generated
 */
public interface GoalReferenceValue extends Data {
	/**
	 * Returns the value of the '<em><b>Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis</em>' containment reference.
	 * @see #setBasis(Basis)
	 * @see scml.ScmlPackage#getGoalReferenceValue_Basis()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Basis getBasis();

	/**
	 * Sets the value of the '{@link scml.GoalReferenceValue#getBasis <em>Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis</em>' containment reference.
	 * @see #getBasis()
	 * @generated
	 */
	void setBasis(Basis value);

} // GoalReferenceValue
