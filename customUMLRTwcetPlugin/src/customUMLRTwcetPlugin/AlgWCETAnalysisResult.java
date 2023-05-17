package customUMLRTwcetPlugin;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class AlgWCETAnalysisResult {
	public ArrayList<AlgWData> RW = new ArrayList<AlgWData>();
	public ArrayList<AlgWData> EW = new ArrayList<AlgWData>();
	public ArrayList<AlgWData> REW = new ArrayList<AlgWData>();
	public ArrayList<AlgWData> TW = new ArrayList<AlgWData>();
	public ArrayList<AlgWData> IW = new ArrayList<AlgWData>();
	
	public AlgWCETAnalysisResult() {
		
	}
	
	public void addEntry(AlgSignal s, List<AlgVoPair> voPair) {
		
	}
	
	public void remove() {
		
	}
	
	public void Print() {
		System.out.println("Relay Port Analysis:");
		
		for(AlgWData data : RW) {
			System.out.print("("); data.lookupSignal.Print(); System.out.print("{");
			for(AlgVoPair vop : data.voPairs) {
				vop.Print();
			}
		}
		System.out.print("})\n");
		
		System.out.println("External End Port Analysis:");
		for(AlgWData data : EW) {
			System.out.print("("); data.lookupSignal.Print(); System.out.print("{");
			for(AlgVoPair vop : data.voPairs) {
				vop.Print();
			}
		}
		System.out.print("})\n");
		
		System.out.println("Timing Port Analysis");
		for(AlgWData data : TW) {
			System.out.print("("); data.lookupSignal.Print(); System.out.print("{");
			for(AlgVoPair vop : data.voPairs) {
				vop.Print();
			}
		}
		System.out.print("})\n");
		
		/*
		System.out.println("State Machine Init Analysis");
		for(AlgWData data : IW) {
			System.out.print("("); data.lookupSignal.Print(); System.out.print("{");
			for(AlgVoPair vop : data.voPairs) {
				vop.Print();
			}
		}
		*/
		
		System.out.print("})\n");
	}
	
}
