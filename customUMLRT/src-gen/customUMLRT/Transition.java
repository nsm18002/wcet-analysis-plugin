/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.Transition#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link customUMLRT.Transition#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link customUMLRT.Transition#getTar <em>Tar</em>}</li>
 *   <li>{@link customUMLRT.Transition#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Transition Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Event</em>' containment reference.
	 * @see #setTransitionEvent(TransitionEvent)
	 * @see customUMLRT.CustomUMLRTPackage#getTransition_TransitionEvent()
	 * @model containment="true"
	 * @generated
	 */
	TransitionEvent getTransitionEvent();

	/**
	 * Sets the value of the '{@link customUMLRT.Transition#getTransitionEvent <em>Transition Event</em>}' containment reference.
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
	 * @see customUMLRT.CustomUMLRTPackage#getTransition_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Tar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tar</em>' reference.
	 * @see #setTar(State)
	 * @see customUMLRT.CustomUMLRTPackage#getTransition_Tar()
	 * @model required="true"
	 * @generated
	 */
	State getTar();

	/**
	 * Sets the value of the '{@link customUMLRT.Transition#getTar <em>Tar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tar</em>' reference.
	 * @see #getTar()
	 * @generated
	 */
	void setTar(State value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(State)
	 * @see customUMLRT.CustomUMLRTPackage#getTransition_Src()
	 * @model required="true"
	 * @generated
	 */
	State getSrc();

	/**
	 * Sets the value of the '{@link customUMLRT.Transition#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(State value);

} // Transition
