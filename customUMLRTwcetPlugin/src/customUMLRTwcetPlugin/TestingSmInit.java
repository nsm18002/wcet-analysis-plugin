package customUMLRTwcetPlugin;

import java.util.ArrayList;

import customUMLRT.PortKind;
import customUMLRT.SignalType;

public class TestingSmInit{
	
	public static AlgCapsule getTestCapsule() {
		AlgCapsule c = new AlgCapsule("TimeoutTestCapsule");
		
		AlgPort p1 = new AlgPort("p1", PortKind.INTERNAL, false);
		AlgPort p2 = new AlgPort("p2", PortKind.RELAY, true);
		AlgPort p3 = new AlgPort("p3", PortKind.RELAY, true);
		AlgPort p4 = new AlgPort("p4", PortKind.RELAY, false);
		AlgPort p5 = new AlgPort("p5", PortKind.EXTERNAL, false);
		
		AlgSignal s1src = new AlgSignal("s1", SignalType.OUT, p1, p2, p1);
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
		
		AlgSignal s4src = new AlgSignal("s4", SignalType.OUT, p5, null, p5);
		p5.AddSignal(s4src);
		AlgSignal s5src = new AlgSignal("s5", SignalType.OUT, p5, null, p5);
		p5.AddSignal(s5src);
		AlgSignal s6src = new AlgSignal("s6", SignalType.OUT, p5, null, p5);
		p5.AddSignal(s6src);

		
		c.ports.add(p1);
		c.ports.add(p2);
		c.ports.add(p3);
		c.ports.add(p4);
		c.ports.add(p5);
		
		//Subcapsule
		AlgSubcapsule sc = new AlgSubcapsule("sc");
		
		ArrayList<AlgSignal> signalList1 = new ArrayList<AlgSignal>();
		signalList1.add(s4src);
		signalList1.add(s5src);
		signalList1.add(s6src);
		sc.AddlookupEntry(s1tar, new AlgVoPair(100, signalList1));
		
		ArrayList<AlgSignal> scInitList = new ArrayList<AlgSignal>();
		scInitList.add(s2src);
		scInitList.add(s3src);
		sc.AddIWlookupEntry(sc.name, new AlgVoPair(200, scInitList));
		
		sc.ports.add(p2);
		sc.ports.add(p3);
		
		c.subcapsules.add(sc);
			
		//Statemachine
		AlgStatemachine sm = new AlgStatemachine("sm");
		
		AlgState initState = new AlgState("initialState");
		AlgState state1 = new AlgState("state1");
		AlgState state2 = new AlgState("state2");
		
		AlgTransition transition1 = new AlgTransition("transition1");
		transition1.event.executionTime = 10;
		transition1.event.sentSignals.add(s1src);
		transition1.source = state1;
		transition1.target = state2;
		AlgTransition initTransition = new AlgTransition("smInitial");
		initTransition.source = initState;
		initTransition.target = state1;
		
		sm.states.add(state1);
		sm.states.add(state2);

		sm.transitions.add(initTransition);
		sm.transitions.add(transition1);
		
		c.statemachine = sm;
		
		return c;
	}
	
	public static AlgStatemachine getStateMachine() {
		AlgStatemachine sm = new AlgStatemachine();
		
		return sm;
	}
	
	
}