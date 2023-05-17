/**
 */
package customUMLRT.impl;

import customUMLRT.CustomUMLRTPackage;
import customUMLRT.State;
import customUMLRT.Transition;
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
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.TransitionImpl#getTransitionEvent <em>Transition Event</em>}</li>
 *   <li>{@link customUMLRT.impl.TransitionImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link customUMLRT.impl.TransitionImpl#getTar <em>Tar</em>}</li>
 *   <li>{@link customUMLRT.impl.TransitionImpl#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	 * The cached value of the '{@link #getTar() <em>Tar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTar()
	 * @generated
	 * @ordered
	 */
	protected State tar;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected State src;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.TRANSITION;
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
					CustomUMLRTPackage.TRANSITION__TRANSITION_EVENT, oldTransitionEvent, newTransitionEvent);
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
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.TRANSITION__TRANSITION_EVENT, null, msgs);
			if (newTransitionEvent != null)
				msgs = ((InternalEObject) newTransitionEvent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CustomUMLRTPackage.TRANSITION__TRANSITION_EVENT, null, msgs);
			msgs = basicSetTransitionEvent(newTransitionEvent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.TRANSITION__TRANSITION_EVENT,
					newTransitionEvent, newTransitionEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this,
					CustomUMLRTPackage.TRANSITION__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTar() {
		if (tar != null && tar.eIsProxy()) {
			InternalEObject oldTar = (InternalEObject) tar;
			tar = (State) eResolveProxy(oldTar);
			if (tar != oldTar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomUMLRTPackage.TRANSITION__TAR,
							oldTar, tar));
			}
		}
		return tar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTar() {
		return tar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTar(State newTar) {
		State oldTar = tar;
		tar = newTar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.TRANSITION__TAR, oldTar, tar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (State) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomUMLRTPackage.TRANSITION__SRC,
							oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(State newSrc) {
		State oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.TRANSITION__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.TRANSITION__TRANSITION_EVENT:
			return basicSetTransitionEvent(null, msgs);
		case CustomUMLRTPackage.TRANSITION__TRIGGERS:
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
		case CustomUMLRTPackage.TRANSITION__TRANSITION_EVENT:
			return getTransitionEvent();
		case CustomUMLRTPackage.TRANSITION__TRIGGERS:
			return getTriggers();
		case CustomUMLRTPackage.TRANSITION__TAR:
			if (resolve)
				return getTar();
			return basicGetTar();
		case CustomUMLRTPackage.TRANSITION__SRC:
			if (resolve)
				return getSrc();
			return basicGetSrc();
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
		case CustomUMLRTPackage.TRANSITION__TRANSITION_EVENT:
			setTransitionEvent((TransitionEvent) newValue);
			return;
		case CustomUMLRTPackage.TRANSITION__TRIGGERS:
			getTriggers().clear();
			getTriggers().addAll((Collection<? extends Trigger>) newValue);
			return;
		case CustomUMLRTPackage.TRANSITION__TAR:
			setTar((State) newValue);
			return;
		case CustomUMLRTPackage.TRANSITION__SRC:
			setSrc((State) newValue);
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
		case CustomUMLRTPackage.TRANSITION__TRANSITION_EVENT:
			setTransitionEvent((TransitionEvent) null);
			return;
		case CustomUMLRTPackage.TRANSITION__TRIGGERS:
			getTriggers().clear();
			return;
		case CustomUMLRTPackage.TRANSITION__TAR:
			setTar((State) null);
			return;
		case CustomUMLRTPackage.TRANSITION__SRC:
			setSrc((State) null);
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
		case CustomUMLRTPackage.TRANSITION__TRANSITION_EVENT:
			return transitionEvent != null;
		case CustomUMLRTPackage.TRANSITION__TRIGGERS:
			return triggers != null && !triggers.isEmpty();
		case CustomUMLRTPackage.TRANSITION__TAR:
			return tar != null;
		case CustomUMLRTPackage.TRANSITION__SRC:
			return src != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
