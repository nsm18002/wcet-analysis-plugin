/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>vo Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.voPair#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link customUMLRT.voPair#getOutSignals <em>Out Signals</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getvoPair()
 * @model
 * @generated
 */
public interface voPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time</em>' attribute.
	 * @see #setExecutionTime(int)
	 * @see customUMLRT.CustomUMLRTPackage#getvoPair_ExecutionTime()
	 * @model
	 * @generated
	 */
	int getExecutionTime();

	/**
	 * Sets the value of the '{@link customUMLRT.voPair#getExecutionTime <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' attribute.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(int value);

	/**
	 * Returns the value of the '<em><b>Out Signals</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.outSignal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Signals</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getvoPair_OutSignals()
	 * @model containment="true"
	 * @generated
	 */
	EList<outSignal> getOutSignals();

} // voPair
