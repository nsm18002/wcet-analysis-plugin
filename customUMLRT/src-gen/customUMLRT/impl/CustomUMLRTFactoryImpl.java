/**
 */
package customUMLRT.impl;

import customUMLRT.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomUMLRTFactoryImpl extends EFactoryImpl implements CustomUMLRTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomUMLRTFactory init() {
		try {
			CustomUMLRTFactory theCustomUMLRTFactory = (CustomUMLRTFactory) EPackage.Registry.INSTANCE
					.getEFactory(CustomUMLRTPackage.eNS_URI);
			if (theCustomUMLRTFactory != null) {
				return theCustomUMLRTFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CustomUMLRTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomUMLRTFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CustomUMLRTPackage.MODEL:
			return createModel();
		case CustomUMLRTPackage.SIGNAL:
			return createSignal();
		case CustomUMLRTPackage.CAPSULE:
			return createCapsule();
		case CustomUMLRTPackage.PORT:
			return createPort();
		case CustomUMLRTPackage.STATE_MACHINE:
			return createStateMachine();
		case CustomUMLRTPackage.STATE:
			return createState();
		case CustomUMLRTPackage.TRANSITION:
			return createTransition();
		case CustomUMLRTPackage.STATE_ENTRY_EVENT:
			return createStateEntryEvent();
		case CustomUMLRTPackage.TRANSITION_EVENT:
			return createTransitionEvent();
		case CustomUMLRTPackage.STATE_EXIT_EVENT:
			return createStateExitEvent();
		case CustomUMLRTPackage.SUBCAPSULE:
			return createSubcapsule();
		case CustomUMLRTPackage.TEMP_MACHINE:
			return createTempMachine();
		case CustomUMLRTPackage.PROTOCOL:
			return createProtocol();
		case CustomUMLRTPackage.CONNECTOR:
			return createConnector();
		case CustomUMLRTPackage.DEFAULT_STATE:
			return createDefaultState();
		case CustomUMLRTPackage.TRIGGER:
			return createTrigger();
		case CustomUMLRTPackage.INITIAL_TRANSITION:
			return createInitialTransition();
		case CustomUMLRTPackage.SEND_SIGNAL:
			return createsendSignal();
		case CustomUMLRTPackage.WDATA:
			return createWData();
		case CustomUMLRTPackage.WCET_LOOKUP:
			return createWcetLookup();
		case CustomUMLRTPackage.PORT_SET:
			return createportSet();
		case CustomUMLRTPackage.LOOKUP_SIGNAL:
			return createLookupSignal();
		case CustomUMLRTPackage.VO_PAIR:
			return createvoPair();
		case CustomUMLRTPackage.OUT_SIGNAL:
			return createoutSignal();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CustomUMLRTPackage.SIGNAL_TYPE:
			return createSignalTypeFromString(eDataType, initialValue);
		case CustomUMLRTPackage.PORT_KIND:
			return createPortKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CustomUMLRTPackage.SIGNAL_TYPE:
			return convertSignalTypeToString(eDataType, instanceValue);
		case CustomUMLRTPackage.PORT_KIND:
			return convertPortKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capsule createCapsule() {
		CapsuleImpl capsule = new CapsuleImpl();
		return capsule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEntryEvent createStateEntryEvent() {
		StateEntryEventImpl stateEntryEvent = new StateEntryEventImpl();
		return stateEntryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionEvent createTransitionEvent() {
		TransitionEventImpl transitionEvent = new TransitionEventImpl();
		return transitionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateExitEvent createStateExitEvent() {
		StateExitEventImpl stateExitEvent = new StateExitEventImpl();
		return stateExitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subcapsule createSubcapsule() {
		SubcapsuleImpl subcapsule = new SubcapsuleImpl();
		return subcapsule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TempMachine createTempMachine() {
		TempMachineImpl tempMachine = new TempMachineImpl();
		return tempMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultState createDefaultState() {
		DefaultStateImpl defaultState = new DefaultStateImpl();
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialTransition createInitialTransition() {
		InitialTransitionImpl initialTransition = new InitialTransitionImpl();
		return initialTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sendSignal createsendSignal() {
		sendSignalImpl sendSignal = new sendSignalImpl();
		return sendSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WData createWData() {
		WDataImpl wData = new WDataImpl();
		return wData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WcetLookup createWcetLookup() {
		WcetLookupImpl wcetLookup = new WcetLookupImpl();
		return wcetLookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public portSet createportSet() {
		portSetImpl portSet = new portSetImpl();
		return portSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupSignal createLookupSignal() {
		LookupSignalImpl lookupSignal = new LookupSignalImpl();
		return lookupSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public voPair createvoPair() {
		voPairImpl voPair = new voPairImpl();
		return voPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public outSignal createoutSignal() {
		outSignalImpl outSignal = new outSignalImpl();
		return outSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalType createSignalTypeFromString(EDataType eDataType, String initialValue) {
		SignalType result = SignalType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortKind createPortKindFromString(EDataType eDataType, String initialValue) {
		PortKind result = PortKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomUMLRTPackage getCustomUMLRTPackage() {
		return (CustomUMLRTPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CustomUMLRTPackage getPackage() {
		return CustomUMLRTPackage.eINSTANCE;
	}

} //CustomUMLRTFactoryImpl
