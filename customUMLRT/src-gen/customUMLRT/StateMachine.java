/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link customUMLRT.StateMachine#getDefaultStates <em>Default States</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Default States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default States</em>' containment reference.
	 * @see #setDefaultStates(DefaultState)
	 * @see customUMLRT.CustomUMLRTPackage#getStateMachine_DefaultStates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DefaultState getDefaultStates();

	/**
	 * Sets the value of the '{@link customUMLRT.StateMachine#getDefaultStates <em>Default States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default States</em>' containment reference.
	 * @see #getDefaultStates()
	 * @generated
	 */
	void setDefaultStates(DefaultState value);

} // StateMachine
