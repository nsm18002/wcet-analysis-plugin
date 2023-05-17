package customUMLRTwcetPlugin;

import java.util.ArrayList;

public class AlgState {
	public String name = null;
	public AlgEvent entryEvent = new AlgEvent();
	public AlgEvent exitEvent = new AlgEvent();
	
	public AlgState() {
		entryEvent = new AlgEvent();
		exitEvent = new AlgEvent();
	}
	
	public AlgState(String n) {
		this.name = n;
	}
}
