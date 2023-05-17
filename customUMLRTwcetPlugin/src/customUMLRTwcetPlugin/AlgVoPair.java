package customUMLRTwcetPlugin;

import java.util.ArrayList;

public class AlgVoPair {
	public int executionTime = 0;
	public ArrayList<AlgSignal> signals = new ArrayList<AlgSignal>();
	
	public AlgVoPair() {
		
	}
	
	public AlgVoPair(int v, ArrayList<AlgSignal> s) {
		executionTime = v;
		
		if(s == null) {
			signals = new ArrayList<AlgSignal>();
		}
		else {
			signals = s;
		}
		
	}
	
	public void AddSignal(AlgSignal signal) {
		signals.add(signal);
	}
	
	public void AddSignals(ArrayList<AlgSignal> sigs) {
		for(AlgSignal s : sigs) {
			signals.add(s);
		}
	}
	
	public void Print() {
		System.out.print("(" + executionTime + ", {");
		for(AlgSignal signal : signals) {
			System.out.print(signal.owner.name + "." + signal.name + ", ");
		}
		System.out.print("})");
	}
}
