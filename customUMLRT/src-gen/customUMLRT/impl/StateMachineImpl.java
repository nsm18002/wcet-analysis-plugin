/**
 */
package customUMLRT.impl;

import customUMLRT.CustomUMLRTPackage;
import customUMLRT.DefaultState;
import customUMLRT.State;
import customUMLRT.StateMachine;

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
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.StateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link customUMLRT.impl.StateMachineImpl#getDefaultStates <em>Default States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getDefaultStates() <em>Default States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultStates()
	 * @generated
	 * @ordered
	 */
	protected DefaultState defaultStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, CustomUMLRTPackage.STATE_MACHINE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultState getDefaultStates() {
		return defaultStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultStates(DefaultState newDefaultStates, NotificationChain msgs) {
		DefaultState oldDefaultStates = defaultStates;
		defaultStates = newDefaultStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CustomUMLRTPackage.STATE_MACHINE__DEFAULT_STATES, oldDefaultStates, newDefaultStates);
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
	public void setDefaultStates(DefaultState newDefaultStates) {
		if (newDefaultStates != defaultStates) {
			NotificationChain msgs = null;
			if (defaultStates != null)
				msgs = ((InternalEObject) defaultStates).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.STATE_MACHINE__DEFAULT_STATES, null, msgs);
			if (newDefaultStates != null)
				msgs = ((InternalEObject) newDefaultStates).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.STATE_MACHINE__DEFAULT_STATES, null, msgs);
			msgs = basicSetDefaultStates(newDefaultStates, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.STATE_MACHINE__DEFAULT_STATES,
					newDefaultStates, newDefaultStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.STATE_MACHINE__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		case CustomUMLRTPackage.STATE_MACHINE__DEFAULT_STATES:
			return basicSetDefaultStates(null, msgs);
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
		case CustomUMLRTPackage.STATE_MACHINE__STATES:
			return getStates();
		case CustomUMLRTPackage.STATE_MACHINE__DEFAULT_STATES:
			return getDefaultStates();
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
		case CustomUMLRTPackage.STATE_MACHINE__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
			return;
		case CustomUMLRTPackage.STATE_MACHINE__DEFAULT_STATES:
			setDefaultStates((DefaultState) newValue);
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
		case CustomUMLRTPackage.STATE_MACHINE__STATES:
			getStates().clear();
			return;
		case CustomUMLRTPackage.STATE_MACHINE__DEFAULT_STATES:
			setDefaultStates((DefaultState) null);
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
		case CustomUMLRTPackage.STATE_MACHINE__STATES:
			return states != null && !states.isEmpty();
		case CustomUMLRTPackage.STATE_MACHINE__DEFAULT_STATES:
			return defaultStates != null;
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
