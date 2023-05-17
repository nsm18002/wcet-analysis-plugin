/**
 */
package customUMLRT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.DefaultState#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link customUMLRT.DefaultState#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getDefaultState()
 * @model
 * @generated
 */
public interface DefaultState extends EObject {
	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference.
	 * @see #setTransitions(InitialTransition)
	 * @see customUMLRT.CustomUMLRTPackage#getDefaultState_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InitialTransition getTransitions();

	/**
	 * Sets the value of the '{@link customUMLRT.DefaultState#getTransitions <em>Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions</em>' containment reference.
	 * @see #getTransitions()
	 * @generated
	 */
	void setTransitions(InitialTransition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see customUMLRT.CustomUMLRTPackage#getDefaultState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link customUMLRT.DefaultState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DefaultState
