package customUMLRTwcetPlugin;

import java.util.ArrayList;

public class AlgStatemachine {
	public String name = "";
	public ArrayList<AlgState> states = new ArrayList<AlgState>();
	public ArrayList<AlgTransition> transitions = new ArrayList<AlgTransition>();
	public AlgTransition smInitial;
	
	public AlgStatemachine() {
		
	}
	
	public AlgStatemachine(String n) {
		name = n;
	}
	
	public AlgTransition getTransition(AlgTrigger t) {
		for(AlgTransition transition : transitions) {
			if(t.port.name == transition.trigger.port.name && t.signal.name == transition.trigger.signal.name) {
				return transition;
			}
		}
		return null;
	}
	
	public AlgTransition getTransition(String name) {
		for(AlgTransition t : transitions) {
			if(t.name == name) {
				return t;
			}
		}
		
		return null;
	}
	
	public void Print() {
		for(AlgTransition transition : transitions) {
			String trig = "";
			
			if(transition.trigger != null) {
				trig = (transition.trigger.port.name +"."+transition.trigger.signal.name);
			}
			
			System.out.println("["+trig+"]"+transition.source.name +"--"+transition.name+"--"+transition.target.name);
		}
	}

}
