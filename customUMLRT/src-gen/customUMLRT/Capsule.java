/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capsule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.Capsule#getName <em>Name</em>}</li>
 *   <li>{@link customUMLRT.Capsule#getPorts <em>Ports</em>}</li>
 *   <li>{@link customUMLRT.Capsule#getSubcapsules <em>Subcapsules</em>}</li>
 *   <li>{@link customUMLRT.Capsule#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link customUMLRT.Capsule#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link customUMLRT.Capsule#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getCapsule()
 * @model
 * @generated
 */
public interface Capsule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see customUMLRT.CustomUMLRTPackage#getCapsule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link customUMLRT.Capsule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getCapsule_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Subcapsules</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.Subcapsule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcapsules</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getCapsule_Subcapsules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subcapsule> getSubcapsules();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getCapsule_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getCapsule_Protocols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Protocol> getProtocols();

	/**
	 * Returns the value of the '<em><b>Statemachine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachine</em>' containment reference.
	 * @see #setStatemachine(StateMachine)
	 * @see customUMLRT.CustomUMLRTPackage#getCapsule_Statemachine()
	 * @model containment="true"
	 * @generated
	 */
	StateMachine getStatemachine();

	/**
	 * Sets the value of the '{@link customUMLRT.Capsule#getStatemachine <em>Statemachine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statemachine</em>' containment reference.
	 * @see #getStatemachine()
	 * @generated
	 */
	void setStatemachine(StateMachine value);

} // Capsule
