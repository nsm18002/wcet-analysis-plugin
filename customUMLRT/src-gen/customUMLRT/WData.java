/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WData</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.WData#getLookupsignal <em>Lookupsignal</em>}</li>
 *   <li>{@link customUMLRT.WData#getVopair <em>Vopair</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getWData()
 * @model
 * @generated
 */
public interface WData extends EObject {
	/**
	 * Returns the value of the '<em><b>Lookupsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lookupsignal</em>' containment reference.
	 * @see #setLookupsignal(LookupSignal)
	 * @see customUMLRT.CustomUMLRTPackage#getWData_Lookupsignal()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LookupSignal getLookupsignal();

	/**
	 * Sets the value of the '{@link customUMLRT.WData#getLookupsignal <em>Lookupsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lookupsignal</em>' containment reference.
	 * @see #getLookupsignal()
	 * @generated
	 */
	void setLookupsignal(LookupSignal value);

	/**
	 * Returns the value of the '<em><b>Vopair</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.voPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vopair</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getWData_Vopair()
	 * @model containment="true"
	 * @generated
	 */
	EList<voPair> getVopair();

} // WData
