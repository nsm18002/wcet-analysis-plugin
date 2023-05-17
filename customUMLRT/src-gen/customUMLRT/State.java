/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.State#getName <em>Name</em>}</li>
 *   <li>{@link customUMLRT.State#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link customUMLRT.State#getStateEntryEvent <em>State Entry Event</em>}</li>
 *   <li>{@link customUMLRT.State#getStateExitEvent <em>State Exit Event</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see customUMLRT.CustomUMLRTPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link customUMLRT.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getState_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>State Entry Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Entry Event</em>' containment reference.
	 * @see #setStateEntryEvent(StateEntryEvent)
	 * @see customUMLRT.CustomUMLRTPackage#getState_StateEntryEvent()
	 * @model containment="true"
	 * @generated
	 */
	StateEntryEvent getStateEntryEvent();

	/**
	 * Sets the value of the '{@link customUMLRT.State#getStateEntryEvent <em>State Entry Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Entry Event</em>' containment reference.
	 * @see #getStateEntryEvent()
	 * @generated
	 */
	void setStateEntryEvent(StateEntryEvent value);

	/**
	 * Returns the value of the '<em><b>State Exit Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Exit Event</em>' containment reference.
	 * @see #setStateExitEvent(StateExitEvent)
	 * @see customUMLRT.CustomUMLRTPackage#getState_StateExitEvent()
	 * @model containment="true"
	 * @generated
	 */
	StateExitEvent getStateExitEvent();

	/**
	 * Sets the value of the '{@link customUMLRT.State#getStateExitEvent <em>State Exit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Exit Event</em>' containment reference.
	 * @see #getStateExitEvent()
	 * @generated
	 */
	void setStateExitEvent(StateExitEvent value);

} // State
