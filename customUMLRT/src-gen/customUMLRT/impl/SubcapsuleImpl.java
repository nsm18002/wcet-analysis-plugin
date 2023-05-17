/**
 */
package customUMLRT.impl;

import customUMLRT.CustomUMLRTPackage;
import customUMLRT.Port;
import customUMLRT.Subcapsule;
import customUMLRT.WcetLookup;

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
 * An implementation of the model object '<em><b>Subcapsule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.SubcapsuleImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link customUMLRT.impl.SubcapsuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link customUMLRT.impl.SubcapsuleImpl#getWcetlookup <em>Wcetlookup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubcapsuleImpl extends MinimalEObjectImpl.Container implements Subcapsule {
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWcetlookup() <em>Wcetlookup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcetlookup()
	 * @generated
	 * @ordered
	 */
	protected WcetLookup wcetlookup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubcapsuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.SUBCAPSULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, CustomUMLRTPackage.SUBCAPSULE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.SUBCAPSULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcetLookup getWcetlookup() {
		return wcetlookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWcetlookup(WcetLookup newWcetlookup, NotificationChain msgs) {
		WcetLookup oldWcetlookup = wcetlookup;
		wcetlookup = newWcetlookup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CustomUMLRTPackage.SUBCAPSULE__WCETLOOKUP, oldWcetlookup, newWcetlookup);
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
	public void setWcetlookup(WcetLookup newWcetlookup) {
		if (newWcetlookup != wcetlookup) {
			NotificationChain msgs = null;
			if (wcetlookup != null)
				msgs = ((InternalEObject) wcetlookup).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.SUBCAPSULE__WCETLOOKUP, null, msgs);
			if (newWcetlookup != null)
				msgs = ((InternalEObject) newWcetlookup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.SUBCAPSULE__WCETLOOKUP, null, msgs);
			msgs = basicSetWcetlookup(newWcetlookup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.SUBCAPSULE__WCETLOOKUP,
					newWcetlookup, newWcetlookup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.SUBCAPSULE__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case CustomUMLRTPackage.SUBCAPSULE__WCETLOOKUP:
			return basicSetWcetlookup(null, msgs);
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
		case CustomUMLRTPackage.SUBCAPSULE__PORTS:
			return getPorts();
		case CustomUMLRTPackage.SUBCAPSULE__NAME:
			return getName();
		case CustomUMLRTPackage.SUBCAPSULE__WCETLOOKUP:
			return getWcetlookup();
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
		case CustomUMLRTPackage.SUBCAPSULE__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case CustomUMLRTPackage.SUBCAPSULE__NAME:
			setName((String) newValue);
			return;
		case CustomUMLRTPackage.SUBCAPSULE__WCETLOOKUP:
			setWcetlookup((WcetLookup) newValue);
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
		case CustomUMLRTPackage.SUBCAPSULE__PORTS:
			getPorts().clear();
			return;
		case CustomUMLRTPackage.SUBCAPSULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CustomUMLRTPackage.SUBCAPSULE__WCETLOOKUP:
			setWcetlookup((WcetLookup) null);
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
		case CustomUMLRTPackage.SUBCAPSULE__PORTS:
			return ports != null && !ports.isEmpty();
		case CustomUMLRTPackage.SUBCAPSULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CustomUMLRTPackage.SUBCAPSULE__WCETLOOKUP:
			return wcetlookup != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubcapsuleImpl
