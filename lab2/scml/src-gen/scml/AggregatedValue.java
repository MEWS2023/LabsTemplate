/**
 */
package scml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.AggregatedValue#getAggregator <em>Aggregator</em>}</li>
 *   <li>{@link scml.AggregatedValue#getAggregatedTime <em>Aggregated Time</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getAggregatedValue()
 * @model
 * @generated
 */
public interface AggregatedValue extends Data {
	/**
	 * Returns the value of the '<em><b>Aggregator</b></em>' attribute.
	 * The default value is <code>"SUM"</code>.
	 * The literals are from the enumeration {@link scml.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregator</em>' attribute.
	 * @see scml.Operation
	 * @see #setAggregator(Operation)
	 * @see scml.ScmlPackage#getAggregatedValue_Aggregator()
	 * @model default="SUM" required="true"
	 * @generated
	 */
	Operation getAggregator();

	/**
	 * Sets the value of the '{@link scml.AggregatedValue#getAggregator <em>Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregator</em>' attribute.
	 * @see scml.Operation
	 * @see #getAggregator()
	 * @generated
	 */
	void setAggregator(Operation value);

	/**
	 * Returns the value of the '<em><b>Aggregated Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Time</em>' attribute.
	 * @see #setAggregatedTime(String)
	 * @see scml.ScmlPackage#getAggregatedValue_AggregatedTime()
	 * @model required="true"
	 * @generated
	 */
	String getAggregatedTime();

	/**
	 * Sets the value of the '{@link scml.AggregatedValue#getAggregatedTime <em>Aggregated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregated Time</em>' attribute.
	 * @see #getAggregatedTime()
	 * @generated
	 */
	void setAggregatedTime(String value);

} // AggregatedValue
