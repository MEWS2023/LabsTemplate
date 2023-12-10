/**
 */
package scml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.InfrastructureComponent#getIsPartOf <em>Is Part Of</em>}</li>
 *   <li>{@link scml.InfrastructureComponent#getComposedOf <em>Composed Of</em>}</li>
 *   <li>{@link scml.InfrastructureComponent#getLocation <em>Location</em>}</li>
 *   <li>{@link scml.InfrastructureComponent#getProduces <em>Produces</em>}</li>
 *   <li>{@link scml.InfrastructureComponent#getParameter <em>Parameter</em>}</li>
 *   <li>{@link scml.InfrastructureComponent#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getInfrastructureComponent()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameHasPrefixInitialOfProject'"
 * @generated
 */
public interface InfrastructureComponent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Part Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link scml.InfrastructureComponent#getComposedOf <em>Composed Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of</em>' reference.
	 * @see #setIsPartOf(InfrastructureComponent)
	 * @see scml.ScmlPackage#getInfrastructureComponent_IsPartOf()
	 * @see scml.InfrastructureComponent#getComposedOf
	 * @model opposite="composedOf"
	 * @generated
	 */
	InfrastructureComponent getIsPartOf();

	/**
	 * Sets the value of the '{@link scml.InfrastructureComponent#getIsPartOf <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of</em>' reference.
	 * @see #getIsPartOf()
	 * @generated
	 */
	void setIsPartOf(InfrastructureComponent value);

	/**
	 * Returns the value of the '<em><b>Composed Of</b></em>' reference list.
	 * The list contents are of type {@link scml.InfrastructureComponent}.
	 * It is bidirectional and its opposite is '{@link scml.InfrastructureComponent#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Of</em>' reference list.
	 * @see scml.ScmlPackage#getInfrastructureComponent_ComposedOf()
	 * @see scml.InfrastructureComponent#getIsPartOf
	 * @model opposite="isPartOf"
	 * @generated
	 */
	EList<InfrastructureComponent> getComposedOf();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see scml.ScmlPackage#getInfrastructureComponent_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link scml.InfrastructureComponent#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' containment reference list.
	 * The list contents are of type {@link scml.DataValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' containment reference list.
	 * @see scml.ScmlPackage#getInfrastructureComponent_Produces()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataValue> getProduces();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Parameter)
	 * @see scml.ScmlPackage#getInfrastructureComponent_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link scml.InfrastructureComponent#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference list.
	 * The list contents are of type {@link scml.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference list.
	 * @see scml.ScmlPackage#getInfrastructureComponent_Device()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevice();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='             --------- 3. implicit constraint ---------\n\t\tself.composedOf -&gt; excludes(self) and self.isPartOf -&gt; excludes(self)'"
	 * @generated
	 */
	boolean checkNotPartOfItself(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='     ------ 4. implicit constraint ---------\n\t\tself.oclContainer().oclIsTypeOf(Project) implies\n\t\tself.name.at(1) = self.oclContainer().oclAsType(Project).name.at(1) and\n\t\t(self.oclContainer().oclAsType(Project).name.indexOf(\' \') &lt;&gt; 0 implies\n\t\tself.name.at(2) = self.oclContainer().oclAsType(Project).name.at(self.oclContainer().oclAsType(Project).name.indexOf(\' \') + 1))'"
	 * @generated
	 */
	boolean nameHasPrefixInitialOfProject(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InfrastructureComponent
