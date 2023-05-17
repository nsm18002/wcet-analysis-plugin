package customUMLRTwcetPlugin;

import java.util.ArrayList;
import java.util.List;
import customUMLRTwcetPlugin.AlgSignal;

public class History {
	public List<AlgSignal> visitedSignals = new ArrayList<AlgSignal>();
	public List<AlgTransition> visitedTransitions = new ArrayList<AlgTransition>();
	
	public void AddSignal(String signal) {
		visitedSignals.add(new AlgSignal(signal));
	}
	
	public void AddSignal(AlgSignal refSig) {
		visitedSignals.add(refSig);
	}
	
	public boolean ContainsSignal(String portName, String signalName) {
		for(AlgSignal sig : visitedSignals) {
			if(sig.name == signalName && sig.source.name == portName) {
				return true;
			}
		}
		return false;
	}
	
	public History getCopy() {
		History h = new History();
		
		for(AlgSignal s : visitedSignals) {
			h.AddSignal(s);
		}
		
		for(AlgTransition t : visitedTransitions) {
			h.AddTransition(t);
		}
		
		return h;
	}
	
	public boolean ContainsSignal(AlgSignal signal) {
		for(AlgSignal sig : visitedSignals) {
			if(signal.name == sig.name && signal.source.name == sig.source.name) {
				return true;
			}
		}
		return false;
	}
	
	public void AddTransition(AlgTransition transition) {
		visitedTransitions.add(transition);
	}
	
	public boolean ContainsTransition(AlgTransition transition) {
		for(AlgTransition s : visitedTransitions) {
			if(s.name == transition.name) {
				return true;
			}
		}
		return false;
	}
}
