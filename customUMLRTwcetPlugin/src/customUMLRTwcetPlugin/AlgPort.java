package customUMLRTwcetPlugin;

//Java
import java.util.ArrayList;

//UMLRT
import customUMLRT.Port;
import customUMLRT.PortKind;

public class AlgPort {
	public String name = "";
	public PortKind portKind = PortKind.RELAY;
	public boolean belongToSubcapsule = false;
	public ArrayList<AlgSignal> signals = new ArrayList<AlgSignal>();
	
	public AlgPort() {
		
	}
	
	public AlgPort(String n) {
		this.name = n;
	}
	
	public AlgPort(String n, PortKind kind, boolean belongToSc) {
		this.name = n;
		portKind = kind;
		belongToSubcapsule = belongToSc;
	}
	
	public void AddSignal(AlgSignal s) {
		s.owner = this;
		signals.add(s);
	}
}
