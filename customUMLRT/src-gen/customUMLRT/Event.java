/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.Event#getWcet <em>Wcet</em>}</li>
 *   <li>{@link customUMLRT.Event#getSendSignals <em>Send Signals</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wcet</em>' attribute.
	 * @see #setWcet(int)
	 * @see customUMLRT.CustomUMLRTPackage#getEvent_Wcet()
	 * @model
	 * @generated
	 */
	int getWcet();

	/**
	 * Sets the value of the '{@link customUMLRT.Event#getWcet <em>Wcet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wcet</em>' attribute.
	 * @see #getWcet()
	 * @generated
	 */
	void setWcet(int value);

	/**
	 * Returns the value of the '<em><b>Send Signals</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.sendSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Signals</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getEvent_SendSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<sendSignal> getSendSignals();

} // Event
