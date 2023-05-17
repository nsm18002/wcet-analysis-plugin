/**
 */
package customUMLRT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.Port#getName <em>Name</em>}</li>
 *   <li>{@link customUMLRT.Port#getKind <em>Kind</em>}</li>
 *   <li>{@link customUMLRT.Port#isConjugated <em>Conjugated</em>}</li>
 *   <li>{@link customUMLRT.Port#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see customUMLRT.CustomUMLRTPackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link customUMLRT.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link customUMLRT.PortKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see customUMLRT.PortKind
	 * @see #setKind(PortKind)
	 * @see customUMLRT.CustomUMLRTPackage#getPort_Kind()
	 * @model
	 * @generated
	 */
	PortKind getKind();

	/**
	 * Sets the value of the '{@link customUMLRT.Port#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see customUMLRT.PortKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PortKind value);

	/**
	 * Returns the value of the '<em><b>Conjugated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conjugated</em>' attribute.
	 * @see #setConjugated(boolean)
	 * @see customUMLRT.CustomUMLRTPackage#getPort_Conjugated()
	 * @model
	 * @generated
	 */
	boolean isConjugated();

	/**
	 * Sets the value of the '{@link customUMLRT.Port#isConjugated <em>Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugated</em>' attribute.
	 * @see #isConjugated()
	 * @generated
	 */
	void setConjugated(boolean value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see #setProtocol(Protocol)
	 * @see customUMLRT.CustomUMLRTPackage#getPort_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link customUMLRT.Port#getProtocol <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' reference.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

} // Port
