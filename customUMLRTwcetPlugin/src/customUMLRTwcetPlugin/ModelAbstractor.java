package customUMLRTwcetPlugin;

import org.eclipse.emf.common.util.EList;

import customUMLRT.Connector;
import customUMLRT.Model;
import customUMLRT.Port;
import customUMLRT.PortKind;
import customUMLRT.Protocol;
import customUMLRT.Signal;
import customUMLRT.SignalType;
import customUMLRT.Subcapsule;
import customUMLRT.TempMachine;

public class ModelAbstractor {
	
	public static EList<Connector> connectors;
	public static EList<Port> ports;
	public static EList<Protocol> protocols;
	public static EList<Subcapsule> subcapsules;
	public static TempMachine tempmachine;
	
	public static AlgCapsule prepCapsule(Model model) {
		
		//Grab model objects
		connectors = model.getCapsules().getConnectors();
		ports = model.getCapsules().getPorts();
		protocols = model.getCapsules().getProtocols();
		subcapsules = model.getCapsules().getSubcapsules();
		//tempmachine = model.getCapsules().getTempmachine();
		
		//Capsule
		AlgCapsule algCapsule = new AlgCapsule();
		algCapsule.name = model.getCapsules().getName();
		
		//Subcapsules
		for(Subcapsule subcap : subcapsules) {
			
			AlgSubcapsule algSubcapsule = new AlgSubcapsule();
			algSubcapsule.name = subcap.getName();
			/*
			for(wcetData wdata : subcap.getWcetlookup().getWcetEntries()) {
				System.out.println("\t trigger: " + wdata.getInSignal().getPort().getName() + "." +wdata.getInSignal().getSignal().getName());
				System.out.println("\t wcet: " + wdata.getWcet());
				System.out.print("\t outsignals: " );
				for(wcetOutSignal outsignal : wdata.getOutSignals()) {
					System.out.print(outsignal.getPort().getName() + "." + outsignal.getSignal().getName() + ", ");
				}
				
			}
			*/
			
			for(Port port : subcap.getPorts()) {
				AlgPort algPort = new AlgPort();
				algPort.name = port.getName();
				algPort.portKind = port.getKind();
				algPort.belongToSubcapsule = true;
				algSubcapsule.ports.add(algPort);
			}
			
			algCapsule.subcapsules.add(algSubcapsule);
        }
		
		//Ports
		for(Port port : ports) {
			System.out.println("Port Name: " + port.getName());
			AlgPort algPort = new AlgPort();
			algPort.name = port.getName();
			algPort.portKind = port.getKind();
			algPort.belongToSubcapsule = false;
			algCapsule.ports.add(algPort);
        }
		
		//Signals
		for(Port port : ports) {			
			for(Signal signal : port.getProtocol().getSignals()) {
				AlgSignal algSignal = new AlgSignal();
				algSignal.name = signal.getName();
				
				//Abstract away conjugated status by determining if signal is in/out for this port
				if((signal.getType() == SignalType.IN && port.isConjugated() == false) || (signal.getType() == SignalType.OUT && port.isConjugated() == true)) {
					algSignal.signalType = SignalType.IN;
				}else if((signal.getType() == SignalType.OUT && port.isConjugated() == false) || (signal.getType() == SignalType.IN && port.isConjugated() == true)) {
					algSignal.signalType = SignalType.OUT;
				}else {
					algSignal.signalType = SignalType.INOUT;
				}
				
				//Handle External Port signals in capsule
				//*Will never have connector*
				if(port.getKind() == PortKind.EXTERNAL) {
					
					//Signal is coming from outside the capsule
					if(algSignal.signalType == SignalType.IN) {
						algSignal.target = getAlgSignalTarget(port, algCapsule);
						algSignal.source = null;
					}
					//Signal is being sent to the outside from the capsule
					else if(algSignal.signalType == SignalType.OUT) {
						algSignal.target = null;
						algSignal.source = getAlgSignalTarget(port, algCapsule);
					}
					//Can both send and receive //INOUT
					else if (algSignal.signalType == SignalType.INOUT){
						algSignal.target = getAlgSignalTarget(port, algCapsule);
						algSignal.source = getAlgSignalTarget(port, algCapsule);
					}
				}
				
				//Handle Internal Port signals
				//*Will always send/receive from relay/subcapsule
				if(port.getKind() == PortKind.INTERNAL) {
					//Signal leaving internal port
					if(algSignal.signalType == SignalType.OUT) {
						algSignal.target = getAlgSignalTarget(port, algCapsule);
						algSignal.source = getAlgPort(port, algCapsule);
					}
					//Signal entering internal port
					else if (algSignal.signalType == SignalType.IN) {
						algSignal.target = getAlgPort(port, algCapsule); //self
						algSignal.source = getAlgSignalTarget(port, algCapsule);
					}else if(algSignal.signalType == SignalType.INOUT) {
						algSignal.target = getAlgSignalTarget(port, algCapsule);
						algSignal.source = getAlgSignalTarget(port, algCapsule);
					}
				}
				
				//Handle Relay Port signals
				if(port.getKind() == PortKind.RELAY) {
					//Signal leaving relay port
					if(algSignal.signalType == SignalType.OUT) {
						algSignal.target = getAlgSignalTarget(port, algCapsule);
						algSignal.source = getAlgPort(port, algCapsule);
					}
					//Signal entering relay port
					else if (algSignal.signalType == SignalType.IN) {
						algSignal.target = getAlgSignalTarget(port, algCapsule);
						algSignal.source = getAlgPort(port, algCapsule);
					}else if(algSignal.signalType == SignalType.INOUT) {
						algSignal.target = getAlgSignalTarget(port, algCapsule);
						algSignal.source = getAlgSignalTarget(port, algCapsule);
					}
				}

				(getAlgPort(port, algCapsule)).signals.add(algSignal);
			}
        }
		
		//Subcap Signals
		for(Subcapsule subcap : subcapsules) {
			for(Port port : subcap.getPorts()) {			
				for(Signal signal : port.getProtocol().getSignals()) {
					AlgSignal algSignal = new AlgSignal();
					algSignal.name = signal.getName();
					
					//Abstract away conjugated status by determining if signal is in/out for this port
					if((signal.getType() == SignalType.IN && port.isConjugated() == false) || (signal.getType() == SignalType.OUT && port.isConjugated() == true)) {
						algSignal.signalType = SignalType.IN;
					}else if((signal.getType() == SignalType.OUT && port.isConjugated() == false) || (signal.getType() == SignalType.IN && port.isConjugated() == true)) {
						algSignal.signalType = SignalType.OUT;
					}else {
						algSignal.signalType = SignalType.INOUT;
					}
					
					//Handle External Port signals in capsule
					//*Will never have connector*
					if(port.getKind() == PortKind.EXTERNAL) {
						//Some relay or internal port sent it to this subcap external port
						if(algSignal.signalType == SignalType.IN) {
							algSignal.target = getAlgPort(port, algCapsule);
							algSignal.source = getAlgSignalTarget(port, algCapsule);
						}
						//Signal is being sent from subcaps external port
						else if(algSignal.signalType == SignalType.OUT) {
							algSignal.target = getAlgSignalTarget(port, algCapsule);
							algSignal.source = getAlgPort(port, algCapsule); //self
						}
						//Can both send and receive //INOUT
						else if (algSignal.signalType == SignalType.INOUT){
							algSignal.target = getAlgSignalTarget(port, algCapsule);
							algSignal.source = getAlgSignalTarget(port, algCapsule);
						}
					}
					
					///////////////////////////////////////////////////
					//Subcaps cant have visible Internal Ports as they are wholly encapsulated.
					///////////////////////////////////////////////////
					
					//Handle Relay Port signals
					if(port.getKind() == PortKind.RELAY) {
						//Signal leaving relay port
						if(algSignal.signalType == SignalType.OUT) {
							algSignal.target = getAlgSignalTarget(port, algCapsule);
							algSignal.source = getAlgPort(port, algCapsule);
						}
						//Signal entering relay port
						else if (algSignal.signalType == SignalType.IN) {
							algSignal.target = null;
							algSignal.source = getAlgPort(port, algCapsule); //self
						}else if(algSignal.signalType == SignalType.INOUT) {
							algSignal.target = getAlgSignalTarget(port, algCapsule);
							algSignal.source = getAlgSignalTarget(port, algCapsule);
						}
					}

					(getAlgPort(port, algCapsule)).signals.add(algSignal);
				}
	        }
		}
		
		
		return algCapsule;
	}
	
	
	public static AlgWCETAnalysisResult capsuleAnalysis(AlgCapsule c) {
		return null;
	}
	
	public static AlgWCETAnalysisResult traverse(AlgCapsule c) {
		return null;
	}
	
	
	//HELPER METHODS//
	public static Protocol getProtocol(String name) {
		for(Protocol protocol : protocols) {
			if(protocol.getName() == name) {
				return protocol;
			}
		}
		return null;
	}
	
	public static EList<Signal> getProtocolSignals(String protocolName) {
		for(Protocol protocol : protocols) {
			if(protocol.getName() == protocolName) {
				return protocol.getSignals();
			}
		}
		return null;
	}
	
	public static Port getSignalTarget(Port sender) {
		for(Connector connector : connectors) {
			
			Port portA = connector.getPort().get(0);
			Port portB = connector.getPort().get(1);
			System.out.println("getSignalTarget for sender " + sender.getName());
			
			if(portA.getName() == sender.getName()) {
				System.out.println(", returning " + portB.getName());
				return portB;
			}
			if(portB.getName() == sender.getName()) {
				System.out.println(", returning " + portB.getName());
				return portA;
			}
			
		}
		System.out.println(", returning null");
		return null;
	}
	
	public static AlgPort getAlgSignalTarget(Port sender, AlgCapsule algCapsule) {
		Port p = getSignalTarget(sender);
		if(p == null) {
			return null;
		}
		
		for(AlgPort algPort : algCapsule.ports) {
			if(p.getName() == algPort.name) {
				return algPort;
			}
		}
		
		for(AlgSubcapsule algSubcapsule : algCapsule.subcapsules) {
			for(AlgPort algPort : algSubcapsule.ports) {
				if(p.getName() == algPort.name) {
					return algPort;
				}
			}
		}
		
		
		return null;
	}
	
	public static AlgPort getAlgPort(Port sender, AlgCapsule algCapsule) {
		for(AlgPort algPort : algCapsule.ports) {
			if(sender.getName() == algPort.name) {
				return algPort;
			}
		}
		
		for(AlgSubcapsule algSubcapsule : algCapsule.subcapsules) {
			for(AlgPort algPort : algSubcapsule.ports) {
				if(sender.getName() == algPort.name) {
					return algPort;
				}
			}
		}
		return null;
	}
	
	public static void printAlgCap(AlgCapsule c) {
		System.out.println("\n\n PRINTING ALGCAPSULE \n");
		System.out.println("Capsule: " + c.name);
		
		System.out.println("Ports-> ");
		for(AlgPort algPort : c.ports) {
			System.out.println("\t Port: " + algPort.name + " " + algPort.portKind);
			System.out.println("\t Signals-> ");
			for(AlgSignal algSignal : algPort.signals) {
				if(algSignal.target != null) {
					System.out.println("\t\t Signal: " + algSignal.signalType + " " + algSignal.name + " -> " + algSignal.target.name);
				}
				else {
					System.out.println("\t\t Signal: " + algSignal.signalType + " " + algSignal.name + " -> null");
				}
			}
		}
		
		System.out.println("SubCapsules-> ");
		for(AlgSubcapsule algSubcapsule : c.subcapsules) {
			System.out.println("\t SubCapsule: " + algSubcapsule.name);
			System.out.println("\t Ports-> ");
			for(AlgPort algPort : algSubcapsule.ports) {
				System.out.println("\t\t Port: " + algPort.name + " " + algPort.portKind);
				System.out.println("\t\t Signals-> ");
				for(AlgSignal algSignal : algPort.signals) {
					if(algSignal.target != null) {
						System.out.println("\t\t\t Signal: " + algSignal.signalType + " " + algSignal.name + " -> " + algSignal.target.name);
					}
					else {
						System.out.println("\t\t\t Signal: " + algSignal.signalType + " " + algSignal.name + " -> null");
					}
				}
			}
		}
	}
	
	public static AlgStatemachine prepStatemachine(Model model, AlgCapsule c) {
		return null;
	}

}
