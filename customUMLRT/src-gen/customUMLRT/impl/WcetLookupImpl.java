/**
 */
package customUMLRT.impl;

import customUMLRT.CustomUMLRTPackage;
import customUMLRT.WcetLookup;
import customUMLRT.portSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wcet Lookup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.WcetLookupImpl#getPortset <em>Portset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WcetLookupImpl extends MinimalEObjectImpl.Container implements WcetLookup {
	/**
	 * The cached value of the '{@link #getPortset() <em>Portset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortset()
	 * @generated
	 * @ordered
	 */
	protected EList<portSet> portset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WcetLookupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.WCET_LOOKUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<portSet> getPortset() {
		if (portset == null) {
			portset = new EObjectContainmentEList<portSet>(portSet.class, this,
					CustomUMLRTPackage.WCET_LOOKUP__PORTSET);
		}
		return portset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.WCET_LOOKUP__PORTSET:
			return ((InternalEList<?>) getPortset()).basicRemove(otherEnd, msgs);
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
		case CustomUMLRTPackage.WCET_LOOKUP__PORTSET:
			return getPortset();
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
		case CustomUMLRTPackage.WCET_LOOKUP__PORTSET:
			getPortset().clear();
			getPortset().addAll((Collection<? extends portSet>) newValue);
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
		case CustomUMLRTPackage.WCET_LOOKUP__PORTSET:
			getPortset().clear();
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
		case CustomUMLRTPackage.WCET_LOOKUP__PORTSET:
			return portset != null && !portset.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WcetLookupImpl
