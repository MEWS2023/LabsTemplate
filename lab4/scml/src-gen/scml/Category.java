/**
 */
package scml;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link scml.Category#getSDG <em>SDG</em>}</li>
 * </ul>
 *
 * @see scml.ScmlPackage#getCategory()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkSDGNumber'"
 * @generated
 */
public interface Category extends NamedElement {
	/**
	 * Returns the value of the '<em><b>SDG</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SDG</em>' attribute list.
	 * @see scml.ScmlPackage#getCategory_SDG()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getSDG();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='      ------ 1. implicit constraint ---------\n\t\t(self.SDG -&gt; size() &lt; 18) and\n\t\t(self.SDG -&gt; forAll(s | s &lt; 18 and s &gt; 0))'"
	 * @generated
	 */
	boolean checkSDGNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Category
