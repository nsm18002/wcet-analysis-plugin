/**
 */
package customUMLRT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>port Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.portSet#getSetName <em>Set Name</em>}</li>
 *   <li>{@link customUMLRT.portSet#getWdata <em>Wdata</em>}</li>
 * </ul>
 *
 * @see customUMLRT.CustomUMLRTPackage#getportSet()
 * @model
 * @generated
 */
public interface portSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Name</em>' attribute.
	 * @see #setSetName(String)
	 * @see customUMLRT.CustomUMLRTPackage#getportSet_SetName()
	 * @model
	 * @generated
	 */
	String getSetName();

	/**
	 * Sets the value of the '{@link customUMLRT.portSet#getSetName <em>Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Name</em>' attribute.
	 * @see #getSetName()
	 * @generated
	 */
	void setSetName(String value);

	/**
	 * Returns the value of the '<em><b>Wdata</b></em>' containment reference list.
	 * The list contents are of type {@link customUMLRT.WData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wdata</em>' containment reference list.
	 * @see customUMLRT.CustomUMLRTPackage#getportSet_Wdata()
	 * @model containment="true"
	 * @generated
	 */
	EList<WData> getWdata();

} // portSet
