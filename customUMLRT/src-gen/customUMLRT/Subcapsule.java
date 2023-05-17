/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subcapsule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.Subcapsule#getPorts <em>Ports</em>}</li>
 *   <li>{@link customUMLRT.Subcapsule#getName <em>Name</em>}</li>
 *   <li>{@link customUMLRT.Subcapsule#getWcetlookup <em>Wcetlookup</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getSubcapsule()
 * @model
 * @generated
 */
public interface Subcapsule extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getSubcapsule_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see customUMLRT.CustomUMLRTPackage#getSubcapsule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link customUMLRT.Subcapsule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Wcetlookup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcetlookup</em>' containment reference.
	 * @see #setWcetlookup(WcetLookup)
	 * @see customUMLRT.CustomUMLRTPackage#getSubcapsule_Wcetlookup()
	 * @model containment="true"
	 * @generated
	 */
	WcetLookup getWcetlookup();

	/**
	 * Sets the value of the '{@link customUMLRT.Subcapsule#getWcetlookup <em>Wcetlookup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcetlookup</em>' containment reference.
	 * @see #getWcetlookup()
	 * @generated
	 */
	void setWcetlookup(WcetLookup value);

} // Subcapsule
