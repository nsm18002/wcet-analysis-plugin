/**
 */
package customUMLRT.impl;

import customUMLRT.CustomUMLRTPackage;
import customUMLRT.State;
import customUMLRT.StateEntryEvent;
import customUMLRT.StateExitEvent;
import customUMLRT.Transition;

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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link customUMLRT.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link customUMLRT.impl.StateImpl#getStateEntryEvent <em>State Entry Event</em>}</li>
 *   <li>{@link customUMLRT.impl.StateImpl#getStateExitEvent <em>State Exit Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getStateEntryEvent() <em>State Entry Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateEntryEvent()
	 * @generated
	 * @ordered
	 */
	protected StateEntryEvent stateEntryEvent;

	/**
	 * The cached value of the '{@link #getStateExitEvent() <em>State Exit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateExitEvent()
	 * @generated
	 * @ordered
	 */
	protected StateExitEvent stateExitEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this,
					CustomUMLRTPackage.STATE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEntryEvent getStateEntryEvent() {
		return stateEntryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateEntryEvent(StateEntryEvent newStateEntryEvent, NotificationChain msgs) {
		StateEntryEvent oldStateEntryEvent = stateEntryEvent;
		stateEntryEvent = newStateEntryEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CustomUMLRTPackage.STATE__STATE_ENTRY_EVENT, oldStateEntryEvent, newStateEntryEvent);
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
	public void setStateEntryEvent(StateEntryEvent newStateEntryEvent) {
		if (newStateEntryEvent != stateEntryEvent) {
			NotificationChain msgs = null;
			if (stateEntryEvent != null)
				msgs = ((InternalEObject) stateEntryEvent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.STATE__STATE_ENTRY_EVENT, null, msgs);
			if (newStateEntryEvent != null)
				msgs = ((InternalEObject) newStateEntryEvent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.STATE__STATE_ENTRY_EVENT, null, msgs);
			msgs = basicSetStateEntryEvent(newStateEntryEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.STATE__STATE_ENTRY_EVENT,
					newStateEntryEvent, newStateEntryEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateExitEvent getStateExitEvent() {
		return stateExitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateExitEvent(StateExitEvent newStateExitEvent, NotificationChain msgs) {
		StateExitEvent oldStateExitEvent = stateExitEvent;
		stateExitEvent = newStateExitEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CustomUMLRTPackage.STATE__STATE_EXIT_EVENT, oldStateExitEvent, newStateExitEvent);
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
	public void setStateExitEvent(StateExitEvent newStateExitEvent) {
		if (newStateExitEvent != stateExitEvent) {
			NotificationChain msgs = null;
			if (stateExitEvent != null)
				msgs = ((InternalEObject) stateExitEvent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.STATE__STATE_EXIT_EVENT, null, msgs);
			if (newStateExitEvent != null)
				msgs = ((InternalEObject) newStateExitEvent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.STATE__STATE_EXIT_EVENT, null, msgs);
			msgs = basicSetStateExitEvent(newStateExitEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.STATE__STATE_EXIT_EVENT,
					newStateExitEvent, newStateExitEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.STATE__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
		case CustomUMLRTPackage.STATE__STATE_ENTRY_EVENT:
			return basicSetStateEntryEvent(null, msgs);
		case CustomUMLRTPackage.STATE__STATE_EXIT_EVENT:
			return basicSetStateExitEvent(null, msgs);
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
		case CustomUMLRTPackage.STATE__NAME:
			return getName();
		case CustomUMLRTPackage.STATE__TRANSITIONS:
			return getTransitions();
		case CustomUMLRTPackage.STATE__STATE_ENTRY_EVENT:
			return getStateEntryEvent();
		case CustomUMLRTPackage.STATE__STATE_EXIT_EVENT:
			return getStateExitEvent();
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
		case CustomUMLRTPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case CustomUMLRTPackage.STATE__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case CustomUMLRTPackage.STATE__STATE_ENTRY_EVENT:
			setStateEntryEvent((StateEntryEvent) newValue);
			return;
		case CustomUMLRTPackage.STATE__STATE_EXIT_EVENT:
			setStateExitEvent((StateExitEvent) newValue);
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
		case CustomUMLRTPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CustomUMLRTPackage.STATE__TRANSITIONS:
			getTransitions().clear();
			return;
		case CustomUMLRTPackage.STATE__STATE_ENTRY_EVENT:
			setStateEntryEvent((StateEntryEvent) null);
			return;
		case CustomUMLRTPackage.STATE__STATE_EXIT_EVENT:
			setStateExitEvent((StateExitEvent) null);
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
		case CustomUMLRTPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CustomUMLRTPackage.STATE__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
		case CustomUMLRTPackage.STATE__STATE_ENTRY_EVENT:
			return stateEntryEvent != null;
		case CustomUMLRTPackage.STATE__STATE_EXIT_EVENT:
			return stateExitEvent != null;
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

} //StateImpl
