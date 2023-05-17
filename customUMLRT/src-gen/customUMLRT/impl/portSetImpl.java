/**
 */
package customUMLRT.impl;

import customUMLRT.CustomUMLRTPackage;
import customUMLRT.WData;
import customUMLRT.portSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>port Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.portSetImpl#getSetName <em>Set Name</em>}</li>
 *   <li>{@link customUMLRT.impl.portSetImpl#getWdata <em>Wdata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class portSetImpl extends MinimalEObjectImpl.Container implements portSet {
	/**
	 * The default value of the '{@link #getSetName() <em>Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetName() <em>Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetName()
	 * @generated
	 * @ordered
	 */
	protected String setName = SET_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWdata() <em>Wdata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWdata()
	 * @generated
	 * @ordered
	 */
	protected EList<WData> wdata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected portSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.PORT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetName() {
		return setName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetName(String newSetName) {
		String oldSetName = setName;
		setName = newSetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.PORT_SET__SET_NAME, oldSetName,
					setName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WData> getWdata() {
		if (wdata == null) {
			wdata = new EObjectContainmentEList<WData>(WData.class, this, CustomUMLRTPackage.PORT_SET__WDATA);
		}
		return wdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.PORT_SET__WDATA:
			return ((InternalEList<?>) getWdata()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CustomUMLRTPackage.PORT_SET__SET_NAME:
			return getSetName();
		case CustomUMLRTPackage.PORT_SET__WDATA:
			return getWdata();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CustomUMLRTPackage.PORT_SET__SET_NAME:
			setSetName((String) newValue);
			return;
		case CustomUMLRTPackage.PORT_SET__WDATA:
			getWdata().clear();
			getWdata().addAll((Collection<? extends WData>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CustomUMLRTPackage.PORT_SET__SET_NAME:
			setSetName(SET_NAME_EDEFAULT);
			return;
		case CustomUMLRTPackage.PORT_SET__WDATA:
			getWdata().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CustomUMLRTPackage.PORT_SET__SET_NAME:
			return SET_NAME_EDEFAULT == null ? setName != null : !SET_NAME_EDEFAULT.equals(setName);
		case CustomUMLRTPackage.PORT_SET__WDATA:
			return wdata != null && !wdata.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (setName: ");
		result.append(setName);
		result.append(')');
		return result.toString();
	}

} //portSetImpl
