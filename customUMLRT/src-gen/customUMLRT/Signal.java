/**
 */
package customUMLRT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.Signal#getName <em>Name</em>}</li>
 *   <li>{@link customUMLRT.Signal#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see customUMLRT.CustomUMLRTPackage#getSignal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link customUMLRT.Signal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link customUMLRT.SignalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see customUMLRT.SignalType
	 * @see #setType(SignalType)
	 * @see customUMLRT.CustomUMLRTPackage#getSignal_Type()
	 * @model
	 * @generated
	 */
	SignalType getType();

	/**
	 * Sets the value of the '{@link customUMLRT.Signal#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see customUMLRT.SignalType
	 * @see #getType()
	 * @generated
	 */
	void setType(SignalType value);

} // Signal
