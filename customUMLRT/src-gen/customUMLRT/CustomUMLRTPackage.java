/**
 */
package customUMLRT;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see customUMLRT.CustomUMLRTFactory
 * @model kind="package"
 * @generated
 */
public interface CustomUMLRTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "customUMLRT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/customUMLRT";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "customUMLRT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomUMLRTPackage eINSTANCE = customUMLRT.impl.CustomUMLRTPackageImpl.init();

	/**
	 * The meta object id for the '{@link customUMLRT.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.ModelImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Capsules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CAPSULES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.SignalImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.CapsuleImpl <em>Capsule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.CapsuleImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getCapsule()
	 * @generated
	 */
	int CAPSULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Subcapsules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE__SUBCAPSULES = 2;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE__CONNECTORS = 3;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE__PROTOCOLS = 4;

	/**
	 * The feature id for the '<em><b>Statemachine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE__STATEMACHINE = 5;

	/**
	 * The number of structural features of the '<em>Capsule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Capsule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPSULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.PortImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__KIND = 1;

	/**
	 * The feature id for the '<em><b>Conjugated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONJUGATED = 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PROTOCOL = 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.StateMachineImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Default States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__DEFAULT_STATES = 1;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.StateImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>State Entry Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_ENTRY_EVENT = 2;

	/**
	 * The feature id for the '<em><b>State Exit Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_EXIT_EVENT = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.TransitionImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Transition Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGERS = 1;

	/**
	 * The feature id for the '<em><b>Tar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TAR = 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SRC = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.EventImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__WCET = 0;

	/**
	 * The feature id for the '<em><b>Send Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SEND_SIGNALS = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.StateEntryEventImpl <em>State Entry Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.StateEntryEventImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getStateEntryEvent()
	 * @generated
	 */
	int STATE_ENTRY_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ENTRY_EVENT__WCET = EVENT__WCET;

	/**
	 * The feature id for the '<em><b>Send Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ENTRY_EVENT__SEND_SIGNALS = EVENT__SEND_SIGNALS;

	/**
	 * The number of structural features of the '<em>State Entry Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ENTRY_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Entry Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_ENTRY_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.TransitionEventImpl <em>Transition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.TransitionEventImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getTransitionEvent()
	 * @generated
	 */
	int TRANSITION_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__WCET = EVENT__WCET;

	/**
	 * The feature id for the '<em><b>Send Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT__SEND_SIGNALS = EVENT__SEND_SIGNALS;

	/**
	 * The number of structural features of the '<em>Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.StateExitEventImpl <em>State Exit Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.StateExitEventImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getStateExitEvent()
	 * @generated
	 */
	int STATE_EXIT_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Wcet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EXIT_EVENT__WCET = EVENT__WCET;

	/**
	 * The feature id for the '<em><b>Send Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EXIT_EVENT__SEND_SIGNALS = EVENT__SEND_SIGNALS;

	/**
	 * The number of structural features of the '<em>State Exit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EXIT_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Exit Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_EXIT_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.SubcapsuleImpl <em>Subcapsule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.SubcapsuleImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getSubcapsule()
	 * @generated
	 */
	int SUBCAPSULE = 11;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPSULE__PORTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPSULE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Wcetlookup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPSULE__WCETLOOKUP = 2;

	/**
	 * The number of structural features of the '<em>Subcapsule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPSULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subcapsule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBCAPSULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.TempMachineImpl <em>Temp Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.TempMachineImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getTempMachine()
	 * @generated
	 */
	int TEMP_MACHINE = 12;

	/**
	 * The number of structural features of the '<em>Temp Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_MACHINE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Temp Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.ProtocolImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 13;

	/**
	 * The feature id for the '<em><b>Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__SIGNALS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.ConnectorImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 14;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PORT = 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.DefaultStateImpl <em>Default State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.DefaultStateImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getDefaultState()
	 * @generated
	 */
	int DEFAULT_STATE = 15;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE__TRANSITIONS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Default State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Default State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.TriggerImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 16;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__PORT = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__SIGNAL = 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.InitialTransitionImpl <em>Initial Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.InitialTransitionImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getInitialTransition()
	 * @generated
	 */
	int INITIAL_TRANSITION = 17;

	/**
	 * The feature id for the '<em><b>Transition Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TRANSITION__TRANSITION_EVENT = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TRANSITION__TRIGGERS = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TRANSITION__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Initial Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Initial Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.sendSignalImpl <em>send Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.sendSignalImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getsendSignal()
	 * @generated
	 */
	int SEND_SIGNAL = 18;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL__SIGNAL = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL__PORT = 1;

	/**
	 * The number of structural features of the '<em>send Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>send Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.WDataImpl <em>WData</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.WDataImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getWData()
	 * @generated
	 */
	int WDATA = 19;

	/**
	 * The feature id for the '<em><b>Lookupsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDATA__LOOKUPSIGNAL = 0;

	/**
	 * The feature id for the '<em><b>Vopair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDATA__VOPAIR = 1;

	/**
	 * The number of structural features of the '<em>WData</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>WData</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.WcetLookupImpl <em>Wcet Lookup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.WcetLookupImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getWcetLookup()
	 * @generated
	 */
	int WCET_LOOKUP = 20;

	/**
	 * The feature id for the '<em><b>Portset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET_LOOKUP__PORTSET = 0;

	/**
	 * The number of structural features of the '<em>Wcet Lookup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET_LOOKUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Wcet Lookup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCET_LOOKUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.portSetImpl <em>port Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.portSetImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getportSet()
	 * @generated
	 */
	int PORT_SET = 21;

	/**
	 * The feature id for the '<em><b>Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SET__SET_NAME = 0;

	/**
	 * The feature id for the '<em><b>Wdata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SET__WDATA = 1;

	/**
	 * The number of structural features of the '<em>port Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>port Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.LookupSignalImpl <em>Lookup Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.LookupSignalImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getLookupSignal()
	 * @generated
	 */
	int LOOKUP_SIGNAL = 22;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_SIGNAL__PORT = 0;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_SIGNAL__SIGNAL = 1;

	/**
	 * The number of structural features of the '<em>Lookup Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_SIGNAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lookup Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.voPairImpl <em>vo Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.voPairImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getvoPair()
	 * @generated
	 */
	int VO_PAIR = 23;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VO_PAIR__EXECUTION_TIME = 0;

	/**
	 * The feature id for the '<em><b>Out Signals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VO_PAIR__OUT_SIGNALS = 1;

	/**
	 * The number of structural features of the '<em>vo Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VO_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>vo Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VO_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.impl.outSignalImpl <em>out Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.impl.outSignalImpl
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getoutSignal()
	 * @generated
	 */
	int OUT_SIGNAL = 24;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_SIGNAL__SIGNAL = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_SIGNAL__PORT = 1;

	/**
	 * The number of structural features of the '<em>out Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_SIGNAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>out Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_SIGNAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link customUMLRT.SignalType <em>Signal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.SignalType
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getSignalType()
	 * @generated
	 */
	int SIGNAL_TYPE = 25;

	/**
	 * The meta object id for the '{@link customUMLRT.PortKind <em>Port Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see customUMLRT.PortKind
	 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getPortKind()
	 * @generated
	 */
	int PORT_KIND = 26;

	/**
	 * Returns the meta object for class '{@link customUMLRT.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see customUMLRT.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.Model#getCapsules <em>Capsules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capsules</em>'.
	 * @see customUMLRT.Model#getCapsules()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Capsules();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customUMLRT.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link customUMLRT.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see customUMLRT.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Signal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customUMLRT.Signal#getName()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Name();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Signal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see customUMLRT.Signal#getType()
	 * @see #getSignal()
	 * @generated
	 */
	EAttribute getSignal_Type();

	/**
	 * Returns the meta object for class '{@link customUMLRT.Capsule <em>Capsule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capsule</em>'.
	 * @see customUMLRT.Capsule
	 * @generated
	 */
	EClass getCapsule();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Capsule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customUMLRT.Capsule#getName()
	 * @see #getCapsule()
	 * @generated
	 */
	EAttribute getCapsule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.Capsule#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see customUMLRT.Capsule#getPorts()
	 * @see #getCapsule()
	 * @generated
	 */
	EReference getCapsule_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.Capsule#getSubcapsules <em>Subcapsules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcapsules</em>'.
	 * @see customUMLRT.Capsule#getSubcapsules()
	 * @see #getCapsule()
	 * @generated
	 */
	EReference getCapsule_Subcapsules();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.Capsule#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see customUMLRT.Capsule#getConnectors()
	 * @see #getCapsule()
	 * @generated
	 */
	EReference getCapsule_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.Capsule#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see customUMLRT.Capsule#getProtocols()
	 * @see #getCapsule()
	 * @generated
	 */
	EReference getCapsule_Protocols();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.Capsule#getStatemachine <em>Statemachine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statemachine</em>'.
	 * @see customUMLRT.Capsule#getStatemachine()
	 * @see #getCapsule()
	 * @generated
	 */
	EReference getCapsule_Statemachine();

	/**
	 * Returns the meta object for class '{@link customUMLRT.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see customUMLRT.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Port#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customUMLRT.Port#getName()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Name();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Port#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see customUMLRT.Port#getKind()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Kind();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Port#isConjugated <em>Conjugated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conjugated</em>'.
	 * @see customUMLRT.Port#isConjugated()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Conjugated();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.Port#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol</em>'.
	 * @see customUMLRT.Port#getProtocol()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Protocol();

	/**
	 * Returns the meta object for class '{@link customUMLRT.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see customUMLRT.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see customUMLRT.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.StateMachine#getDefaultStates <em>Default States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default States</em>'.
	 * @see customUMLRT.StateMachine#getDefaultStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_DefaultStates();

	/**
	 * Returns the meta object for class '{@link customUMLRT.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see customUMLRT.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customUMLRT.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.State#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see customUMLRT.State#getTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transitions();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.State#getStateEntryEvent <em>State Entry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Entry Event</em>'.
	 * @see customUMLRT.State#getStateEntryEvent()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateEntryEvent();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.State#getStateExitEvent <em>State Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Exit Event</em>'.
	 * @see customUMLRT.State#getStateExitEvent()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateExitEvent();

	/**
	 * Returns the meta object for class '{@link customUMLRT.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see customUMLRT.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.Transition#getTransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Event</em>'.
	 * @see customUMLRT.Transition#getTransitionEvent()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TransitionEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.Transition#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see customUMLRT.Transition#getTriggers()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Triggers();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.Transition#getTar <em>Tar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tar</em>'.
	 * @see customUMLRT.Transition#getTar()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Tar();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.Transition#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see customUMLRT.Transition#getSrc()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Src();

	/**
	 * Returns the meta object for class '{@link customUMLRT.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see customUMLRT.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Event#getWcet <em>Wcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wcet</em>'.
	 * @see customUMLRT.Event#getWcet()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Wcet();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.Event#getSendSignals <em>Send Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Send Signals</em>'.
	 * @see customUMLRT.Event#getSendSignals()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_SendSignals();

	/**
	 * Returns the meta object for class '{@link customUMLRT.StateEntryEvent <em>State Entry Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Entry Event</em>'.
	 * @see customUMLRT.StateEntryEvent
	 * @generated
	 */
	EClass getStateEntryEvent();

	/**
	 * Returns the meta object for class '{@link customUMLRT.TransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Event</em>'.
	 * @see customUMLRT.TransitionEvent
	 * @generated
	 */
	EClass getTransitionEvent();

	/**
	 * Returns the meta object for class '{@link customUMLRT.StateExitEvent <em>State Exit Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Exit Event</em>'.
	 * @see customUMLRT.StateExitEvent
	 * @generated
	 */
	EClass getStateExitEvent();

	/**
	 * Returns the meta object for class '{@link customUMLRT.Subcapsule <em>Subcapsule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subcapsule</em>'.
	 * @see customUMLRT.Subcapsule
	 * @generated
	 */
	EClass getSubcapsule();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.Subcapsule#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see customUMLRT.Subcapsule#getPorts()
	 * @see #getSubcapsule()
	 * @generated
	 */
	EReference getSubcapsule_Ports();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Subcapsule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customUMLRT.Subcapsule#getName()
	 * @see #getSubcapsule()
	 * @generated
	 */
	EAttribute getSubcapsule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.Subcapsule#getWcetlookup <em>Wcetlookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Wcetlookup</em>'.
	 * @see customUMLRT.Subcapsule#getWcetlookup()
	 * @see #getSubcapsule()
	 * @generated
	 */
	EReference getSubcapsule_Wcetlookup();

	/**
	 * Returns the meta object for class '{@link customUMLRT.TempMachine <em>Temp Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temp Machine</em>'.
	 * @see customUMLRT.TempMachine
	 * @generated
	 */
	EClass getTempMachine();

	/**
	 * Returns the meta object for class '{@link customUMLRT.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see customUMLRT.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.Protocol#getSignals <em>Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Signals</em>'.
	 * @see customUMLRT.Protocol#getSignals()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Signals();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.Protocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customUMLRT.Protocol#getName()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_Name();

	/**
	 * Returns the meta object for class '{@link customUMLRT.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see customUMLRT.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference list '{@link customUMLRT.Connector#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see customUMLRT.Connector#getPort()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Port();

	/**
	 * Returns the meta object for class '{@link customUMLRT.DefaultState <em>Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default State</em>'.
	 * @see customUMLRT.DefaultState
	 * @generated
	 */
	EClass getDefaultState();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.DefaultState#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transitions</em>'.
	 * @see customUMLRT.DefaultState#getTransitions()
	 * @see #getDefaultState()
	 * @generated
	 */
	EReference getDefaultState_Transitions();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.DefaultState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see customUMLRT.DefaultState#getName()
	 * @see #getDefaultState()
	 * @generated
	 */
	EAttribute getDefaultState_Name();

	/**
	 * Returns the meta object for class '{@link customUMLRT.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see customUMLRT.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.Trigger#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see customUMLRT.Trigger#getPort()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Port();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.Trigger#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see customUMLRT.Trigger#getSignal()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Signal();

	/**
	 * Returns the meta object for class '{@link customUMLRT.InitialTransition <em>Initial Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Transition</em>'.
	 * @see customUMLRT.InitialTransition
	 * @generated
	 */
	EClass getInitialTransition();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.InitialTransition#getTransitionEvent <em>Transition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Event</em>'.
	 * @see customUMLRT.InitialTransition#getTransitionEvent()
	 * @see #getInitialTransition()
	 * @generated
	 */
	EReference getInitialTransition_TransitionEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.InitialTransition#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see customUMLRT.InitialTransition#getTriggers()
	 * @see #getInitialTransition()
	 * @generated
	 */
	EReference getInitialTransition_Triggers();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.InitialTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see customUMLRT.InitialTransition#getTarget()
	 * @see #getInitialTransition()
	 * @generated
	 */
	EReference getInitialTransition_Target();

	/**
	 * Returns the meta object for class '{@link customUMLRT.sendSignal <em>send Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>send Signal</em>'.
	 * @see customUMLRT.sendSignal
	 * @generated
	 */
	EClass getsendSignal();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.sendSignal#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see customUMLRT.sendSignal#getSignal()
	 * @see #getsendSignal()
	 * @generated
	 */
	EReference getsendSignal_Signal();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.sendSignal#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see customUMLRT.sendSignal#getPort()
	 * @see #getsendSignal()
	 * @generated
	 */
	EReference getsendSignal_Port();

	/**
	 * Returns the meta object for class '{@link customUMLRT.WData <em>WData</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WData</em>'.
	 * @see customUMLRT.WData
	 * @generated
	 */
	EClass getWData();

	/**
	 * Returns the meta object for the containment reference '{@link customUMLRT.WData#getLookupsignal <em>Lookupsignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookupsignal</em>'.
	 * @see customUMLRT.WData#getLookupsignal()
	 * @see #getWData()
	 * @generated
	 */
	EReference getWData_Lookupsignal();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.WData#getVopair <em>Vopair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vopair</em>'.
	 * @see customUMLRT.WData#getVopair()
	 * @see #getWData()
	 * @generated
	 */
	EReference getWData_Vopair();

	/**
	 * Returns the meta object for class '{@link customUMLRT.WcetLookup <em>Wcet Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wcet Lookup</em>'.
	 * @see customUMLRT.WcetLookup
	 * @generated
	 */
	EClass getWcetLookup();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.WcetLookup#getPortset <em>Portset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portset</em>'.
	 * @see customUMLRT.WcetLookup#getPortset()
	 * @see #getWcetLookup()
	 * @generated
	 */
	EReference getWcetLookup_Portset();

	/**
	 * Returns the meta object for class '{@link customUMLRT.portSet <em>port Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>port Set</em>'.
	 * @see customUMLRT.portSet
	 * @generated
	 */
	EClass getportSet();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.portSet#getSetName <em>Set Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Name</em>'.
	 * @see customUMLRT.portSet#getSetName()
	 * @see #getportSet()
	 * @generated
	 */
	EAttribute getportSet_SetName();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.portSet#getWdata <em>Wdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wdata</em>'.
	 * @see customUMLRT.portSet#getWdata()
	 * @see #getportSet()
	 * @generated
	 */
	EReference getportSet_Wdata();

	/**
	 * Returns the meta object for class '{@link customUMLRT.LookupSignal <em>Lookup Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Signal</em>'.
	 * @see customUMLRT.LookupSignal
	 * @generated
	 */
	EClass getLookupSignal();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.LookupSignal#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see customUMLRT.LookupSignal#getPort()
	 * @see #getLookupSignal()
	 * @generated
	 */
	EReference getLookupSignal_Port();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.LookupSignal#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see customUMLRT.LookupSignal#getSignal()
	 * @see #getLookupSignal()
	 * @generated
	 */
	EReference getLookupSignal_Signal();

	/**
	 * Returns the meta object for class '{@link customUMLRT.voPair <em>vo Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>vo Pair</em>'.
	 * @see customUMLRT.voPair
	 * @generated
	 */
	EClass getvoPair();

	/**
	 * Returns the meta object for the attribute '{@link customUMLRT.voPair#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time</em>'.
	 * @see customUMLRT.voPair#getExecutionTime()
	 * @see #getvoPair()
	 * @generated
	 */
	EAttribute getvoPair_ExecutionTime();

	/**
	 * Returns the meta object for the containment reference list '{@link customUMLRT.voPair#getOutSignals <em>Out Signals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Signals</em>'.
	 * @see customUMLRT.voPair#getOutSignals()
	 * @see #getvoPair()
	 * @generated
	 */
	EReference getvoPair_OutSignals();

	/**
	 * Returns the meta object for class '{@link customUMLRT.outSignal <em>out Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>out Signal</em>'.
	 * @see customUMLRT.outSignal
	 * @generated
	 */
	EClass getoutSignal();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.outSignal#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signal</em>'.
	 * @see customUMLRT.outSignal#getSignal()
	 * @see #getoutSignal()
	 * @generated
	 */
	EReference getoutSignal_Signal();

	/**
	 * Returns the meta object for the reference '{@link customUMLRT.outSignal#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see customUMLRT.outSignal#getPort()
	 * @see #getoutSignal()
	 * @generated
	 */
	EReference getoutSignal_Port();

	/**
	 * Returns the meta object for enum '{@link customUMLRT.SignalType <em>Signal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Type</em>'.
	 * @see customUMLRT.SignalType
	 * @generated
	 */
	EEnum getSignalType();

	/**
	 * Returns the meta object for enum '{@link customUMLRT.PortKind <em>Port Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Kind</em>'.
	 * @see customUMLRT.PortKind
	 * @generated
	 */
	EEnum getPortKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomUMLRTFactory getCustomUMLRTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link customUMLRT.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.ModelImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Capsules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CAPSULES = eINSTANCE.getModel_Capsules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.SignalImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL__TYPE = eINSTANCE.getSignal_Type();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.CapsuleImpl <em>Capsule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.CapsuleImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getCapsule()
		 * @generated
		 */
		EClass CAPSULE = eINSTANCE.getCapsule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPSULE__NAME = eINSTANCE.getCapsule_Name();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPSULE__PORTS = eINSTANCE.getCapsule_Ports();

		/**
		 * The meta object literal for the '<em><b>Subcapsules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPSULE__SUBCAPSULES = eINSTANCE.getCapsule_Subcapsules();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPSULE__CONNECTORS = eINSTANCE.getCapsule_Connectors();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPSULE__PROTOCOLS = eINSTANCE.getCapsule_Protocols();

		/**
		 * The meta object literal for the '<em><b>Statemachine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPSULE__STATEMACHINE = eINSTANCE.getCapsule_Statemachine();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.PortImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__NAME = eINSTANCE.getPort_Name();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__KIND = eINSTANCE.getPort_Kind();

		/**
		 * The meta object literal for the '<em><b>Conjugated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__CONJUGATED = eINSTANCE.getPort_Conjugated();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PROTOCOL = eINSTANCE.getPort_Protocol();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.StateMachineImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Default States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__DEFAULT_STATES = eINSTANCE.getStateMachine_DefaultStates();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.StateImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

		/**
		 * The meta object literal for the '<em><b>State Entry Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_ENTRY_EVENT = eINSTANCE.getState_StateEntryEvent();

		/**
		 * The meta object literal for the '<em><b>State Exit Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_EXIT_EVENT = eINSTANCE.getState_StateExitEvent();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.TransitionImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Transition Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITION_EVENT = eINSTANCE.getTransition_TransitionEvent();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGERS = eINSTANCE.getTransition_Triggers();

		/**
		 * The meta object literal for the '<em><b>Tar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TAR = eINSTANCE.getTransition_Tar();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SRC = eINSTANCE.getTransition_Src();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.EventImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Wcet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__WCET = eINSTANCE.getEvent_Wcet();

		/**
		 * The meta object literal for the '<em><b>Send Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__SEND_SIGNALS = eINSTANCE.getEvent_SendSignals();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.StateEntryEventImpl <em>State Entry Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.StateEntryEventImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getStateEntryEvent()
		 * @generated
		 */
		EClass STATE_ENTRY_EVENT = eINSTANCE.getStateEntryEvent();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.TransitionEventImpl <em>Transition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.TransitionEventImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getTransitionEvent()
		 * @generated
		 */
		EClass TRANSITION_EVENT = eINSTANCE.getTransitionEvent();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.StateExitEventImpl <em>State Exit Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.StateExitEventImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getStateExitEvent()
		 * @generated
		 */
		EClass STATE_EXIT_EVENT = eINSTANCE.getStateExitEvent();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.SubcapsuleImpl <em>Subcapsule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.SubcapsuleImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getSubcapsule()
		 * @generated
		 */
		EClass SUBCAPSULE = eINSTANCE.getSubcapsule();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCAPSULE__PORTS = eINSTANCE.getSubcapsule_Ports();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBCAPSULE__NAME = eINSTANCE.getSubcapsule_Name();

		/**
		 * The meta object literal for the '<em><b>Wcetlookup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBCAPSULE__WCETLOOKUP = eINSTANCE.getSubcapsule_Wcetlookup();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.TempMachineImpl <em>Temp Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.TempMachineImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getTempMachine()
		 * @generated
		 */
		EClass TEMP_MACHINE = eINSTANCE.getTempMachine();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.ProtocolImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__SIGNALS = eINSTANCE.getProtocol_Signals();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.ConnectorImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PORT = eINSTANCE.getConnector_Port();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.DefaultStateImpl <em>Default State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.DefaultStateImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getDefaultState()
		 * @generated
		 */
		EClass DEFAULT_STATE = eINSTANCE.getDefaultState();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_STATE__TRANSITIONS = eINSTANCE.getDefaultState_Transitions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STATE__NAME = eINSTANCE.getDefaultState_Name();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.TriggerImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__PORT = eINSTANCE.getTrigger_Port();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__SIGNAL = eINSTANCE.getTrigger_Signal();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.InitialTransitionImpl <em>Initial Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.InitialTransitionImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getInitialTransition()
		 * @generated
		 */
		EClass INITIAL_TRANSITION = eINSTANCE.getInitialTransition();

		/**
		 * The meta object literal for the '<em><b>Transition Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_TRANSITION__TRANSITION_EVENT = eINSTANCE.getInitialTransition_TransitionEvent();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_TRANSITION__TRIGGERS = eINSTANCE.getInitialTransition_Triggers();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIAL_TRANSITION__TARGET = eINSTANCE.getInitialTransition_Target();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.sendSignalImpl <em>send Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.sendSignalImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getsendSignal()
		 * @generated
		 */
		EClass SEND_SIGNAL = eINSTANCE.getsendSignal();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_SIGNAL__SIGNAL = eINSTANCE.getsendSignal_Signal();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_SIGNAL__PORT = eINSTANCE.getsendSignal_Port();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.WDataImpl <em>WData</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.WDataImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getWData()
		 * @generated
		 */
		EClass WDATA = eINSTANCE.getWData();

		/**
		 * The meta object literal for the '<em><b>Lookupsignal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WDATA__LOOKUPSIGNAL = eINSTANCE.getWData_Lookupsignal();

		/**
		 * The meta object literal for the '<em><b>Vopair</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WDATA__VOPAIR = eINSTANCE.getWData_Vopair();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.WcetLookupImpl <em>Wcet Lookup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.WcetLookupImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getWcetLookup()
		 * @generated
		 */
		EClass WCET_LOOKUP = eINSTANCE.getWcetLookup();

		/**
		 * The meta object literal for the '<em><b>Portset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WCET_LOOKUP__PORTSET = eINSTANCE.getWcetLookup_Portset();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.portSetImpl <em>port Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.portSetImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getportSet()
		 * @generated
		 */
		EClass PORT_SET = eINSTANCE.getportSet();

		/**
		 * The meta object literal for the '<em><b>Set Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_SET__SET_NAME = eINSTANCE.getportSet_SetName();

		/**
		 * The meta object literal for the '<em><b>Wdata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_SET__WDATA = eINSTANCE.getportSet_Wdata();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.LookupSignalImpl <em>Lookup Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.LookupSignalImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getLookupSignal()
		 * @generated
		 */
		EClass LOOKUP_SIGNAL = eINSTANCE.getLookupSignal();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_SIGNAL__PORT = eINSTANCE.getLookupSignal_Port();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_SIGNAL__SIGNAL = eINSTANCE.getLookupSignal_Signal();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.voPairImpl <em>vo Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.voPairImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getvoPair()
		 * @generated
		 */
		EClass VO_PAIR = eINSTANCE.getvoPair();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VO_PAIR__EXECUTION_TIME = eINSTANCE.getvoPair_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Out Signals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VO_PAIR__OUT_SIGNALS = eINSTANCE.getvoPair_OutSignals();

		/**
		 * The meta object literal for the '{@link customUMLRT.impl.outSignalImpl <em>out Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.impl.outSignalImpl
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getoutSignal()
		 * @generated
		 */
		EClass OUT_SIGNAL = eINSTANCE.getoutSignal();

		/**
		 * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_SIGNAL__SIGNAL = eINSTANCE.getoutSignal_Signal();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_SIGNAL__PORT = eINSTANCE.getoutSignal_Port();

		/**
		 * The meta object literal for the '{@link customUMLRT.SignalType <em>Signal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.SignalType
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getSignalType()
		 * @generated
		 */
		EEnum SIGNAL_TYPE = eINSTANCE.getSignalType();

		/**
		 * The meta object literal for the '{@link customUMLRT.PortKind <em>Port Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see customUMLRT.PortKind
		 * @see customUMLRT.impl.CustomUMLRTPackageImpl#getPortKind()
		 * @generated
		 */
		EEnum PORT_KIND = eINSTANCE.getPortKind();

	}

} //CustomUMLRTPackage
