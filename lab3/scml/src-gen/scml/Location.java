/**
 */
package scml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.Location#getLat <em>Lat</em>}</li>
 *   <li>{@link scml.Location#getLong <em>Long</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getLocation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='latLongInRange'"
 * @generated
 */
public interface Location extends EObject {
	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(float)
	 * @see scml.ScmlPackage#getLocation_Lat()
	 * @model required="true"
	 * @generated
	 */
	float getLat();

	/**
	 * Sets the value of the '{@link scml.Location#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(float value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(float)
	 * @see scml.ScmlPackage#getLocation_Long()
	 * @model required="true"
	 * @generated
	 */
	float getLong();

	/**
	 * Sets the value of the '{@link scml.Location#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(float value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='       ------ 4. explicit constraint ---------\n\t\tself.Lat &gt;= (-90) and self.Lat &lt;= 90 and self.Long &gt;= (-180) and self.Long &lt;= 180'"
	 * @generated
	 */
	boolean latLongInRange(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Location
