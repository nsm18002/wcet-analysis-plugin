/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.InitialTransition#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link customUMLRT.InitialTransition#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link customUMLRT.InitialTransition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getInitialTransition()
 * @model
 * @generated
 */
public interface InitialTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Event</em>' containment reference.
	 * @see #setTransitionEvent(TransitionEvent)
	 * @see customUMLRT.CustomUMLRTPackage#getInitialTransition_TransitionEvent()
	 * @model containment="true"
	 * @generated
	 */
	TransitionEvent getTransitionEvent();

	/**
	 * Sets the value of the '{@link customUMLRT.InitialTransition#getTransitionEvent <em>Transition Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Event</em>' containment reference.
	 * @see #getTransitionEvent()
	 * @generated
	 */
	void setTransitionEvent(TransitionEvent value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getInitialTransition_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see customUMLRT.CustomUMLRTPackage#getInitialTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link customUMLRT.InitialTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

} // InitialTransition
