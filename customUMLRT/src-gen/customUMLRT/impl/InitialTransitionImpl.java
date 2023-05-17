/**
 */
package customUMLRT.impl;

import customUMLRT.CustomUMLRTPackage;
import customUMLRT.InitialTransition;
import customUMLRT.State;
import customUMLRT.TransitionEvent;
import customUMLRT.Trigger;

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
 * An implementation of the model object '<em><b>Initial Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.InitialTransitionImpl#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link customUMLRT.impl.InitialTransitionImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link customUMLRT.impl.InitialTransitionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialTransitionImpl extends MinimalEObjectImpl.Container implements InitialTransition {
	/**
	 * The cached value of the '{@link #getTransitionEvent() <em>Transition Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionEvent()
	 * @generated
	 * @ordered
	 */
	protected TransitionEvent transitionEvent;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.INITIAL_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent getTransitionEvent() {
		return transitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransitionEvent(TransitionEvent newTransitionEvent, NotificationChain msgs) {
		TransitionEvent oldTransitionEvent = transitionEvent;
		transitionEvent = newTransitionEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CustomUMLRTPackage.INITIAL_TRANSITION__TRANSITION_EVENT, oldTransitionEvent, newTransitionEvent);
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
	public void setTransitionEvent(TransitionEvent newTransitionEvent) {
		if (newTransitionEvent != transitionEvent) {
			NotificationChain msgs = null;
			if (transitionEvent != null)
				msgs = ((InternalEObject) transitionEvent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.INITIAL_TRANSITION__TRANSITION_EVENT, null, msgs);
			if (newTransitionEvent != null)
				msgs = ((InternalEObject) newTransitionEvent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.INITIAL_TRANSITION__TRANSITION_EVENT, null, msgs);
			msgs = basicSetTransitionEvent(newTransitionEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CustomUMLRTPackage.INITIAL_TRANSITION__TRANSITION_EVENT, newTransitionEvent, newTransitionEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this,
					CustomUMLRTPackage.INITIAL_TRANSITION__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (State) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CustomUMLRTPackage.INITIAL_TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(State newTarget) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.INITIAL_TRANSITION__TARGET,
					oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRANSITION_EVENT:
			return basicSetTransitionEvent(null, msgs);
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRIGGERS:
			return ((InternalEList<?>) getTriggers()).basicRemove(otherEnd, msgs);
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
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRANSITION_EVENT:
			return getTransitionEvent();
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRIGGERS:
			return getTriggers();
		case CustomUMLRTPackage.INITIAL_TRANSITION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRANSITION_EVENT:
			setTransitionEvent((TransitionEvent) newValue);
			return;
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRIGGERS:
			getTriggers().clear();
			getTriggers().addAll((Collection<? extends Trigger>) newValue);
			return;
		case CustomUMLRTPackage.INITIAL_TRANSITION__TARGET:
			setTarget((State) newValue);
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
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRANSITION_EVENT:
			setTransitionEvent((TransitionEvent) null);
			return;
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRIGGERS:
			getTriggers().clear();
			return;
		case CustomUMLRTPackage.INITIAL_TRANSITION__TARGET:
			setTarget((State) null);
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
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRANSITION_EVENT:
			return transitionEvent != null;
		case CustomUMLRTPackage.INITIAL_TRANSITION__TRIGGERS:
			return triggers != null && !triggers.isEmpty();
		case CustomUMLRTPackage.INITIAL_TRANSITION__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

} //InitialTransitionImpl
