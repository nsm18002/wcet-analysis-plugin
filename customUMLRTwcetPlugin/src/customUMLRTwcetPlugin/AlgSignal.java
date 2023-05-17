package customUMLRTwcetPlugin;
import customUMLRT.Port;
import customUMLRT.SignalType;

public class AlgSignal {
	public String name = "";
	public SignalType signalType = SignalType.IN;
	public AlgPort source = null;
	public AlgPort target = null;
	public AlgPort owner = null;

	
	public AlgSignal() {
	}
	
	public AlgSignal(String n) {
		this.name = n;
	}
	
	public AlgSignal(String n, SignalType t) {
		this.name = n;
		this.signalType = t;
	}
	
	public AlgSignal(String n, AlgPort own) {
		this.name = n;
		owner = own;
	}
	
	public AlgSignal(String n, SignalType type, AlgPort src, AlgPort tar, AlgPort own) {
		this.name = n;
		signalType = type;
		source = src;
		target = tar;
		owner = own;
	}
	
	public void Print() {
		if(owner != null) {
			System.out.print(owner.name +"." + name);
		}else {
			System.out.print("''." + name);
		}
	}
	
}
