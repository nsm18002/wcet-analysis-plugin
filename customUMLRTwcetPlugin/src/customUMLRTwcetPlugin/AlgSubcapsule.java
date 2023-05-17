package customUMLRTwcetPlugin;

import java.util.ArrayList;

import customUMLRT.PortKind;
import customUMLRT.SignalType;

import java.util.*;

public class AlgSubcapsule {
	public String name = "";
	//public AlgWCETAnalysisResult wcetData = new AlgWCETAnalysisResult();
	public ArrayList<AlgPort> ports = new ArrayList<AlgPort>();
	public Map<AlgSignal, AlgWData> lookupEntries = new HashMap<AlgSignal, AlgWData>();
	public Map<String, AlgWData> lookupIW = new HashMap<String, AlgWData>(); //subcap name
	public Map<String, AlgWData> lookupTW = new HashMap<String, AlgWData>(); //subcapname.portname.timeout
	
	public AlgSubcapsule() {
	
	}
	
	public AlgSubcapsule(String n) {
		name = n;
	}
	
	public void AddlookupEntry(AlgSignal s, AlgVoPair vop) {
		if(lookupEntries.containsKey(s)) {
			lookupEntries.get(s).voPairs.add(vop);
		}else {
			AlgWData Wdata = new AlgWData();
			Wdata.voPairs.add(vop);
			lookupEntries.put(s, Wdata);
		}
	}
	
	public AlgWData lookUpSignal(AlgSignal timeout) {
		if(lookupEntries.containsKey(timeout)) {
			return lookupEntries.get(timeout);
		}else {
			return null;
		}
	}
	
	public void AddIWlookupEntry(String scname, AlgVoPair vop) {
		if(lookupIW.containsKey(scname)) {
			lookupIW.get(scname).voPairs.add(vop);
		}else {
			AlgWData Wdata = new AlgWData();
			Wdata.voPairs.add(vop);
			lookupIW.put(scname, Wdata);
		}
	}
	
	public AlgWData lookUpIW(String subcap) {
		if(lookupIW.containsKey(subcap)) {
			return lookupIW.get(subcap);
		}else {
			return null;
		}
	}
	
	public void AddTWlookupEntry(String scporttimeout, AlgVoPair vop) {
		if(lookupTW.containsKey(scporttimeout)) {
			lookupTW.get(scporttimeout).voPairs.add(vop);
		}else {
			AlgWData Wdata = new AlgWData();
			Wdata.voPairs.add(vop);
			lookupTW.put(scporttimeout, Wdata);
		}
	}
	
	public AlgWData lookupTW(String portsignal) {
		if(lookupTW.containsKey(portsignal)) {
			return lookupTW.get(portsignal);
		}else {
			return null;
		}
	}
	
	
	public void Print() {
		System.out.println("Subcapsule " + name + " ports and signals:");
		for(AlgPort port : ports) {
			System.out.println(port.name);
			for(AlgSignal signal : port.signals) {
				System.out.println("\t" + signal.signalType +" "+ signal.owner.name +"."+ signal.name);
			}
		}
		
		System.out.println("Subcapsule " + name + " Lookup Entries / WData");
		for (AlgSignal signal: lookupEntries.keySet()) {
		    System.out.print("(");
		    signal.Print(); System.out.print(", ");
		    lookupEntries.get(signal).Print();
		    System.out.print(")");
		}
	}
}
