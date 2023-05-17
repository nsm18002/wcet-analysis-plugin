/**
 */
package customUMLRT.impl;

import customUMLRT.CustomUMLRTPackage;
import customUMLRT.outSignal;
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
 * An implementation of the model object '<em><b>vo Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link customUMLRT.impl.voPairImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link customUMLRT.impl.voPairImpl#getOutSignals <em>Out Signals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class voPairImpl extends MinimalEObjectImpl.Container implements voPair {
	/**
	 * The default value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTION_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected int executionTime = EXECUTION_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutSignals() <em>Out Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<outSignal> outSignals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected voPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomUMLRTPackage.Literals.VO_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExecutionTime() {
		return executionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionTime(int newExecutionTime) {
		int oldExecutionTime = executionTime;
		executionTime = newExecutionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomUMLRTPackage.VO_PAIR__EXECUTION_TIME,
					oldExecutionTime, executionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<outSignal> getOutSignals() {
		if (outSignals == null) {
			outSignals = new EObjectContainmentEList<outSignal>(outSignal.class, this,
					CustomUMLRTPackage.VO_PAIR__OUT_SIGNALS);
		}
		return outSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CustomUMLRTPackage.VO_PAIR__OUT_SIGNALS:
			return ((InternalEList<?>) getOutSignals()).basicRemove(otherEnd, msgs);
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
		case CustomUMLRTPackage.VO_PAIR__EXECUTION_TIME:
			return getExecutionTime();
		case CustomUMLRTPackage.VO_PAIR__OUT_SIGNALS:
			return getOutSignals();
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
		case CustomUMLRTPackage.VO_PAIR__EXECUTION_TIME:
			setExecutionTime((Integer) newValue);
			return;
		case CustomUMLRTPackage.VO_PAIR__OUT_SIGNALS:
			getOutSignals().clear();
			getOutSignals().addAll((Collection<? extends outSignal>) newValue);
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
		case CustomUMLRTPackage.VO_PAIR__EXECUTION_TIME:
			setExecutionTime(EXECUTION_TIME_EDEFAULT);
			return;
		case CustomUMLRTPackage.VO_PAIR__OUT_SIGNALS:
			getOutSignals().clear();
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
		case CustomUMLRTPackage.VO_PAIR__EXECUTION_TIME:
			return executionTime != EXECUTION_TIME_EDEFAULT;
		case CustomUMLRTPackage.VO_PAIR__OUT_SIGNALS:
			return outSignals != null && !outSignals.isEmpty();
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
		result.append(" (executionTime: ");
		result.append(executionTime);
		result.append(')');
		return result.toString();
	}

} //voPairImpl
