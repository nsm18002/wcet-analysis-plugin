package customUMLRTwcetPlugin;

import java.util.ArrayList;

import customUMLRT.PortKind;
import customUMLRT.SignalType;

public class TestingExternalSignal {
	
	public static AlgCapsule getTestCapsule() {
		AlgCapsule c = new AlgCapsule("ExternalTestCapsule");
		
		AlgPort p1 = new AlgPort("p1", PortKind.EXTERNAL, false);
		AlgPort p2 = new AlgPort("p2", PortKind.INTERNAL, false);
		AlgPort p3 = new AlgPort("p3", PortKind.RELAY, true);
		AlgPort p4 = new AlgPort("p4", PortKind.RELAY, true);
		AlgPort p5 = new AlgPort("p5", PortKind.RELAY, false);
		AlgPort p6 = new AlgPort("p6", PortKind.EXTERNAL, false);
		
		AlgSignal s1src = new AlgSignal("s1", SignalType.IN, null, p1, p1);
		p1.AddSignal(s1src); 
		
		AlgSignal s2src = new AlgSignal("s2", SignalType.OUT, p4, p5, p4);
		AlgSignal s2tar = new AlgSignal("s2", SignalType.OUT, p5, null, p5);
		p4.AddSignal(s2src); 
		p5.AddSignal(s2tar);
		
		AlgSignal s3src = new AlgSignal("s3", SignalType.OUT, p4, p5, p4);
		AlgSignal s3tar = new AlgSignal("s3", SignalType.OUT, p5, null, p5);
		p4.AddSignal(s3src); 
		p5.AddSignal(s3tar);
		
		AlgSignal s4src = new AlgSignal("s4", SignalType.OUT, p6, null, p6);
		p6.AddSignal(s4src);
		AlgSignal s5src = new AlgSignal("s5", SignalType.OUT, p6, null, p6);
		p6.AddSignal(s5src);
		AlgSignal s6src = new AlgSignal("s6", SignalType.OUT, p6, null, p6);
		p6.AddSignal(s6src);
		
		
		AlgSignal s10src = new AlgSignal("s10", SignalType.OUT, p2, p3, p2);
		AlgSignal s10tar = new AlgSignal("s10", SignalType.IN, p2, p3, p3);
		p2.AddSignal(s10src); 
		p3.AddSignal(s10tar);
		
		c.ports.add(p1);
		c.ports.add(p2);
		c.ports.add(p3);
		c.ports.add(p4);
		c.ports.add(p5);
		c.ports.add(p6);

		//Subcapsule
		AlgSubcapsule sc = new AlgSubcapsule("sc");
		
		ArrayList<AlgSignal> signalList1 = new ArrayList<AlgSignal>();
		signalList1.add(s2src);
		signalList1.add(s3src);
		sc.AddlookupEntry(s10tar, new AlgVoPair(100, signalList1));
		
		sc.ports.add(p3);
		sc.ports.add(p4);
		
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
		transition1.event.sentSignals.add(s10src);
		transition1.event.sentSignals.add(s4src);
		transition1.source = state1;
		transition1.target = state2;
		transition1.trigger = new AlgTrigger(p1, s1src);
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
