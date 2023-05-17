package customUMLRTwcetPlugin;

import java.util.ArrayList;

import customUMLRT.PortKind;
import customUMLRT.SignalType;

public class AlgCapsule {
	public String name = "";
	public ArrayList<AlgSubcapsule> subcapsules = new ArrayList<AlgSubcapsule>();
	public ArrayList<AlgPort> ports = new ArrayList<AlgPort>();
	public AlgWCETAnalysisResult wcetData = new AlgWCETAnalysisResult();
	public AlgStatemachine statemachine = new AlgStatemachine();
	
	public AlgCapsule() {
		
	}
	
	public AlgCapsule(String n) {
		this.name = n;
	}
	
	public ArrayList<AlgSignal> getRelayInSignals(){
		ArrayList<AlgSignal> sigs = new ArrayList<AlgSignal>();
		
		for(AlgPort port : ports) {
			if(port.portKind == PortKind.RELAY && port.belongToSubcapsule == false) {
				for(AlgSignal signal : port.signals) {
					if(signal.signalType == SignalType.IN) {
						sigs.add(signal);
					}
				}
			}
		}
		
		return sigs;
	}
	public ArrayList<AlgSignal> getExternalInSignals(){
			ArrayList<AlgSignal> sigs = new ArrayList<AlgSignal>();
			
			for(AlgPort port : ports) {
				if(port.portKind == PortKind.EXTERNAL && port.belongToSubcapsule == false) {
					for(AlgSignal signal : port.signals) {
						if(signal.signalType == SignalType.IN) {
							sigs.add(signal);
						}
					}
				}
			}
			
			return sigs;
	}
	
	public ArrayList<AlgPort> getTimingPorts(){
		ArrayList<AlgPort> timingPorts = new ArrayList<AlgPort>();
		for(AlgPort port : ports) {
			if(port.portKind == PortKind.TIMING) {
				timingPorts.add(port);
			}
		}
		
		return timingPorts;
	}
	
	public void Print() {
		for(AlgPort port : ports) {
			System.out.println(port.name);
			for(AlgSignal signal : port.signals) {
				System.out.println("\t" + signal.signalType +" "+ signal.owner.name +"."+ signal.name);
			}
		}
		statemachine.Print();
	}
	
}
