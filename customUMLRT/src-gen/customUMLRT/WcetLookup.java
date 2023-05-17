/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wcet Lookup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.WcetLookup#getPortset <em>Portset</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getWcetLookup()
 * @model
 * @generated
 */
public interface WcetLookup extends EObject {
	/**
	 * Returns the value of the '<em><b>Portset</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.portSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portset</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getWcetLookup_Portset()
	 * @model containment="true" lower="3" upper="3"
	 * @generated
	 */
	EList<portSet> getPortset();

} // WcetLookup
