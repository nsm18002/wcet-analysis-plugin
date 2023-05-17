/**
 */
package customUMLRT.impl;

import customUMLRT.Capsule;
import customUMLRT.Connector;
import customUMLRT.CustomUMLRTPackage;
import customUMLRT.Port;
import customUMLRT.Protocol;
import customUMLRT.StateMachine;
import customUMLRT.Subcapsule;

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
 * An implementation of the model object '<em><b>Capsule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.CapsuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link customUMLRT.impl.CapsuleImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link customUMLRT.impl.CapsuleImpl#getSubcapsules <em>Subcapsules</em>}</li>
 *   <li>{@link customUMLRT.impl.CapsuleImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link customUMLRT.impl.CapsuleImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link customUMLRT.impl.CapsuleImpl#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapsuleImpl extends MinimalEObjectImpl.Container implements Capsule {
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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getSubcapsules() <em>Subcapsules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcapsules()
	 * @generated
	 * @ordered
	 */
	protected EList<Subcapsule> subcapsules;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<Protocol> protocols;

	/**
	 * The cached value of the '{@link #getStatemachine() <em>Statemachine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatemachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine statemachine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapsuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.CAPSULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.CAPSULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this, CustomUMLRTPackage.CAPSULE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subcapsule> getSubcapsules() {
		if (subcapsules == null) {
			subcapsules = new EObjectContainmentEList<Subcapsule>(Subcapsule.class, this,
					CustomUMLRTPackage.CAPSULE__SUBCAPSULES);
		}
		return subcapsules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connector>(Connector.class, this,
					CustomUMLRTPackage.CAPSULE__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Protocol> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectContainmentEList<Protocol>(Protocol.class, this,
					CustomUMLRTPackage.CAPSULE__PROTOCOLS);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStatemachine() {
		return statemachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatemachine(StateMachine newStatemachine, NotificationChain msgs) {
		StateMachine oldStatemachine = statemachine;
		statemachine = newStatemachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CustomUMLRTPackage.CAPSULE__STATEMACHINE, oldStatemachine, newStatemachine);
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
	public void setStatemachine(StateMachine newStatemachine) {
		if (newStatemachine != statemachine) {
			NotificationChain msgs = null;
			if (statemachine != null)
				msgs = ((InternalEObject) statemachine).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.CAPSULE__STATEMACHINE, null, msgs);
			if (newStatemachine != null)
				msgs = ((InternalEObject) newStatemachine).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.CAPSULE__STATEMACHINE, null, msgs);
			msgs = basicSetStatemachine(newStatemachine, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.CAPSULE__STATEMACHINE,
					newStatemachine, newStatemachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.CAPSULE__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case CustomUMLRTPackage.CAPSULE__SUBCAPSULES:
			return ((InternalEList<?>) getSubcapsules()).basicRemove(otherEnd, msgs);
		case CustomUMLRTPackage.CAPSULE__CONNECTORS:
			return ((InternalEList<?>) getConnectors()).basicRemove(otherEnd, msgs);
		case CustomUMLRTPackage.CAPSULE__PROTOCOLS:
			return ((InternalEList<?>) getProtocols()).basicRemove(otherEnd, msgs);
		case CustomUMLRTPackage.CAPSULE__STATEMACHINE:
			return basicSetStatemachine(null, msgs);
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
		case CustomUMLRTPackage.CAPSULE__NAME:
			return getName();
		case CustomUMLRTPackage.CAPSULE__PORTS:
			return getPorts();
		case CustomUMLRTPackage.CAPSULE__SUBCAPSULES:
			return getSubcapsules();
		case CustomUMLRTPackage.CAPSULE__CONNECTORS:
			return getConnectors();
		case CustomUMLRTPackage.CAPSULE__PROTOCOLS:
			return getProtocols();
		case CustomUMLRTPackage.CAPSULE__STATEMACHINE:
			return getStatemachine();
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
		case CustomUMLRTPackage.CAPSULE__NAME:
			setName((String) newValue);
			return;
		case CustomUMLRTPackage.CAPSULE__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case CustomUMLRTPackage.CAPSULE__SUBCAPSULES:
			getSubcapsules().clear();
			getSubcapsules().addAll((Collection<? extends Subcapsule>) newValue);
			return;
		case CustomUMLRTPackage.CAPSULE__CONNECTORS:
			getConnectors().clear();
			getConnectors().addAll((Collection<? extends Connector>) newValue);
			return;
		case CustomUMLRTPackage.CAPSULE__PROTOCOLS:
			getProtocols().clear();
			getProtocols().addAll((Collection<? extends Protocol>) newValue);
			return;
		case CustomUMLRTPackage.CAPSULE__STATEMACHINE:
			setStatemachine((StateMachine) newValue);
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
		case CustomUMLRTPackage.CAPSULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CustomUMLRTPackage.CAPSULE__PORTS:
			getPorts().clear();
			return;
		case CustomUMLRTPackage.CAPSULE__SUBCAPSULES:
			getSubcapsules().clear();
			return;
		case CustomUMLRTPackage.CAPSULE__CONNECTORS:
			getConnectors().clear();
			return;
		case CustomUMLRTPackage.CAPSULE__PROTOCOLS:
			getProtocols().clear();
			return;
		case CustomUMLRTPackage.CAPSULE__STATEMACHINE:
			setStatemachine((StateMachine) null);
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
		case CustomUMLRTPackage.CAPSULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CustomUMLRTPackage.CAPSULE__PORTS:
			return ports != null && !ports.isEmpty();
		case CustomUMLRTPackage.CAPSULE__SUBCAPSULES:
			return subcapsules != null && !subcapsules.isEmpty();
		case CustomUMLRTPackage.CAPSULE__CONNECTORS:
			return connectors != null && !connectors.isEmpty();
		case CustomUMLRTPackage.CAPSULE__PROTOCOLS:
			return protocols != null && !protocols.isEmpty();
		case CustomUMLRTPackage.CAPSULE__STATEMACHINE:
			return statemachine != null;
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

} //CapsuleImpl
