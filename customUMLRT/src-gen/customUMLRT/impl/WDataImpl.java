/**
 */
package customUMLRT.impl;

import customUMLRT.CustomUMLRTPackage;
import customUMLRT.LookupSignal;
import customUMLRT.WData;
import customUMLRT.voPair;

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
 * An implementation of the model object '<em><b>WData</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.WDataImpl#getLookupsignal <em>Lookupsignal</em>}</li>
 *   <li>{@link customUMLRT.impl.WDataImpl#getVopair <em>Vopair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WDataImpl extends MinimalEObjectImpl.Container implements WData {
	/**
	 * The cached value of the '{@link #getLookupsignal() <em>Lookupsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookupsignal()
	 * @generated
	 * @ordered
	 */
	protected LookupSignal lookupsignal;

	/**
	 * The cached value of the '{@link #getVopair() <em>Vopair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVopair()
	 * @generated
	 * @ordered
	 */
	protected EList<voPair> vopair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.WDATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupSignal getLookupsignal() {
		return lookupsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookupsignal(LookupSignal newLookupsignal, NotificationChain msgs) {
		LookupSignal oldLookupsignal = lookupsignal;
		lookupsignal = newLookupsignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CustomUMLRTPackage.WDATA__LOOKUPSIGNAL, oldLookupsignal, newLookupsignal);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookupsignal(LookupSignal newLookupsignal) {
		if (newLookupsignal != lookupsignal) {
			NotificationChain msgs = null;
			if (lookupsignal != null)
				msgs = ((InternalEObject) lookupsignal).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.WDATA__LOOKUPSIGNAL, null, msgs);
			if (newLookupsignal != null)
				msgs = ((InternalEObject) newLookupsignal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.WDATA__LOOKUPSIGNAL, null, msgs);
			msgs = basicSetLookupsignal(newLookupsignal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.WDATA__LOOKUPSIGNAL,
					newLookupsignal, newLookupsignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<voPair> getVopair() {
		if (vopair == null) {
			vopair = new EObjectContainmentEList<voPair>(voPair.class, this, CustomUMLRTPackage.WDATA__VOPAIR);
		}
		return vopair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.WDATA__LOOKUPSIGNAL:
			return basicSetLookupsignal(null, msgs);
		case CustomUMLRTPackage.WDATA__VOPAIR:
			return ((InternalEList<?>) getVopair()).basicRemove(otherEnd, msgs);
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
		case CustomUMLRTPackage.WDATA__LOOKUPSIGNAL:
			return getLookupsignal();
		case CustomUMLRTPackage.WDATA__VOPAIR:
			return getVopair();
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
		case CustomUMLRTPackage.WDATA__LOOKUPSIGNAL:
			setLookupsignal((LookupSignal) newValue);
			return;
		case CustomUMLRTPackage.WDATA__VOPAIR:
			getVopair().clear();
			getVopair().addAll((Collection<? extends voPair>) newValue);
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
		case CustomUMLRTPackage.WDATA__LOOKUPSIGNAL:
			setLookupsignal((LookupSignal) null);
			return;
		case CustomUMLRTPackage.WDATA__VOPAIR:
			getVopair().clear();
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
		case CustomUMLRTPackage.WDATA__LOOKUPSIGNAL:
			return lookupsignal != null;
		case CustomUMLRTPackage.WDATA__VOPAIR:
			return vopair != null && !vopair.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WDataImpl
