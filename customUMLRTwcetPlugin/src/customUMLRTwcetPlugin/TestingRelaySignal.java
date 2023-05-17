package customUMLRTwcetPlugin;

import java.util.ArrayList;

import customUMLRT.PortKind;
import customUMLRT.SignalType;

public class TestingRelaySignal {
	
	public static AlgCapsule getTestCapsule() {
		AlgCapsule c = new AlgCapsule("superCapsule1");
		
		AlgPort p1 = new AlgPort("p1", PortKind.RELAY, false);
		AlgPort p2 = new AlgPort("p2", PortKind.RELAY, true);
		AlgPort p3 = new AlgPort("p3", PortKind.RELAY, true);
		AlgPort p4 = new AlgPort("p4", PortKind.RELAY, false);
		AlgPort p5 = new AlgPort("p5", PortKind.RELAY, true);
		AlgPort p6 = new AlgPort("p6", PortKind.INTERNAL, false);
		AlgPort p7 = new AlgPort("p7", PortKind.EXTERNAL, false);
		
		AlgSignal s1src = new AlgSignal("s1", SignalType.IN, p1, p2, p1);
		AlgSignal s1tar = new AlgSignal("s1", SignalType.IN, p2, null, p2);
		p1.AddSignal(s1src); 
		p2.AddSignal(s1tar);
		
		AlgSignal s2src = new AlgSignal("s2", SignalType.OUT, p3, p4, p3);
		AlgSignal s2tar = new AlgSignal("s2", SignalType.OUT, p4, null, p4);
		p3.AddSignal(s2src); 
		p4.AddSignal(s2tar);
		
		AlgSignal s3src = new AlgSignal("s3", SignalType.OUT, p3, p4, p3);
		AlgSignal s3tar = new AlgSignal("s3", SignalType.OUT, p4, null, p4);
		p3.AddSignal(s3src); 
		p4.AddSignal(s3tar);
		
		AlgSignal s4src = new AlgSignal("s4", SignalType.OUT, p7, null, p7);
		p7.AddSignal(s4src);
		AlgSignal s5src = new AlgSignal("s5", SignalType.OUT, p7, null, p7);
		p7.AddSignal(s5src);
		AlgSignal s6src = new AlgSignal("s6", SignalType.OUT, p7, null, p7);
		p7.AddSignal(s6src);
		
		AlgSignal s7src = new AlgSignal("s7", SignalType.OUT, p5, p6, p5);
		AlgSignal s7tar = new AlgSignal("s7", SignalType.IN, p5, p6, p6);
		p5.AddSignal(s7src); 
		p6.AddSignal(s7tar);
		
		c.ports.add(p1);
		c.ports.add(p2);
		c.ports.add(p3);
		c.ports.add(p4);
		c.ports.add(p5);
		c.ports.add(p6);
		c.ports.add(p7);
		
		//Subcapsule
		AlgSubcapsule sc = new AlgSubcapsule("sc");
		
		ArrayList<AlgSignal> signalList1 = new ArrayList<AlgSignal>();
		signalList1.add(s7src);
		sc.AddlookupEntry(s1tar, new AlgVoPair(100, signalList1));
		
		ArrayList<AlgSignal> signalList2 = new ArrayList<AlgSignal>();
		signalList2.add(s2src);
		signalList2.add(s3src);
		sc.AddlookupEntry(s1tar, new AlgVoPair(200, signalList2));
		
		sc.ports.add(p2);
		sc.ports.add(p3);
		sc.ports.add(p5);
		
		c.subcapsules.add(sc);
		
		
		
		//Statemachine
		AlgStatemachine sm = new AlgStatemachine("sm");
		
		AlgState initState = new AlgState("initialState");
		AlgState state1 = new AlgState("state1");
		AlgState state2 = new AlgState("state2");
		AlgState state3 = new AlgState("state3");
		state3.entryEvent.executionTime = 3;
		AlgState state4 = new AlgState("state4");
		state4.entryEvent.executionTime = 4;
		state4.entryEvent.sentSignals.add(s6src);
		
		AlgTransition transition1 = new AlgTransition("transition1");
		transition1.event.executionTime = 10;
		transition1.event.sentSignals.add(s4src);
		transition1.source = state1;
		transition1.target = state2;
		transition1.trigger = new AlgTrigger(p6, s7tar);
		AlgTransition transition2 = new AlgTransition("transition2");
		transition2.event.executionTime = 20;
		transition2.event.sentSignals.add(s5src);
		transition2.source = state2;
		transition2.target = state3;
		AlgTransition transition3 = new AlgTransition("transition3");
		transition3.event.executionTime = 30;
		transition3.source = state2;
		transition3.target = state4;
		AlgTransition initTransition = new AlgTransition("smInitial");
		initTransition.source = initState;
		initTransition.target = state1;
		
		sm.states.add(state1);
		sm.states.add(state2);
		sm.states.add(state3);
		sm.states.add(state4);

		sm.transitions.add(initTransition);
		sm.transitions.add(transition1);
		sm.transitions.add(transition2);
		sm.transitions.add(transition3);
		
		c.statemachine = sm;
		
		return c;
	}
	
	public static AlgStatemachine getStateMachine() {
		AlgStatemachine sm = new AlgStatemachine();
		
		return sm;
	}
	
	
}
