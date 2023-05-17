package customUMLRTwcetPlugin;

import java.util.ArrayList;

public class AlgWData {
	public String altLookupName = "";
	public AlgSignal lookupSignal;
	public AlgTransition lookupTransition;
	public ArrayList<AlgVoPair> voPairs = new ArrayList<AlgVoPair>(); 
	
	
	public void Union(AlgWData WPrime) {
		for(AlgVoPair vop : WPrime.voPairs) {
			voPairs.add(vop);
		}
	}
	
	public void AddExecutionTime(int v) {
		for(AlgVoPair vop : voPairs) {
			vop.executionTime = vop.executionTime + v;
		}
	}
	
	public void AddVoPair(AlgVoPair vop) {
		voPairs.add(vop);
	}
	
	public void PrintDetailedSignals() {
		
		if(lookupSignal != null) {
		System.out.println("(" + lookupSignal.owner.name + "." + lookupSignal.name + "):");
		}else {
			System.out.println("(''):");
		}
		
		int i = 0;
		for(AlgVoPair vop : voPairs){
			i++;
			System.out.println("Pair: " + i);
			for(AlgSignal s : vop.signals) {
				if(s.target == null) {
					System.out.println("\t" + s.name + " " + s.signalType + " " + s.source.name + " -> " + "null" + " [" + s.owner.name + "]");
				}else {
					System.out.println("\t" + s.name + " " + s.signalType + " " + s.source.name + " -> " + s.target.name + " [" + s.owner.name + "]");
				}
			}
		}
	}
	
	public void Print() {
		
		if(lookupSignal != null) {
			System.out.print("AlgWData: (" + lookupSignal.owner.name + "." + lookupSignal.name + ", {");
		}else {
			System.out.print("AlgWData: (" + altLookupName); System.out.print(", {");
		}
		
		for(AlgVoPair vop : voPairs){
			vop.Print();
		}
		
		System.out.print("})\n");
	}
	
	public void PrintSM() {
		
		if(lookupTransition != null) {
		System.out.print("AlgWData: (" + lookupTransition.name + ", {");
		}else {
			System.out.print("AlgWData: ( '' {");
		}
		
		for(AlgVoPair vop : voPairs){
			vop.Print();
		}
		
		System.out.print("})\n");
	}
}
