package customUMLRTwcetPlugin;

public class AlgTransition {
	public String name = "";
	public AlgTrigger trigger = null;
	public AlgState source = null;
	public AlgState target = null;
	public AlgEvent event = new AlgEvent();
	
	public AlgTransition() {
		
	}
	
	public AlgTransition(String n) {
		this.name = n;
	}
}
