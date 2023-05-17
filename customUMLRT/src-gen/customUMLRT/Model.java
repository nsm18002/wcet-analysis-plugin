/**
 */
package customUMLRT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.Model#getCapsules <em>Capsules</em>}</li>
 *   <li>{@link customUMLRT.Model#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Capsules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capsules</em>' containment reference.
	 * @see #setCapsules(Capsule)
	 * @see customUMLRT.CustomUMLRTPackage#getModel_Capsules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Capsule getCapsules();

	/**
	 * Sets the value of the '{@link customUMLRT.Model#getCapsules <em>Capsules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capsules</em>' containment reference.
	 * @see #getCapsules()
	 * @generated
	 */
	void setCapsules(Capsule value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see customUMLRT.CustomUMLRTPackage#getModel_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link customUMLRT.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Model
