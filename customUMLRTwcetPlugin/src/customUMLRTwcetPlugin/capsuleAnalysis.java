package customUMLRTwcetPlugin;

import java.util.Map;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import customUMLRT.Model;
import customUMLRT.Capsule;
import customUMLRT.Connector;
import customUMLRT.Port;
import customUMLRT.PortKind;
import customUMLRT.Signal;
import customUMLRT.SignalType;
import customUMLRT.Subcapsule;
import customUMLRT.TempMachine;
import customUMLRT.Protocol;
import customUMLRT.CustomUMLRTFactory;
import customUMLRT.CustomUMLRTPackage;
import customUMLRT.impl.CustomUMLRTPackageImpl;


public class capsuleAnalysis {
	public static EList<Connector> connectors;
	public static EList<Port> ports;
	public static EList<Protocol> protocols;
	public static EList<Subcapsule> subcapsules;
	public static TempMachine tempmachine;
	public static enum analyzeType {RELAY, EXTERNAL, TIMEOUT, SMINIT}
	public static analyzeType analyzetype = analyzeType.RELAY;

	public Model loadModel(String modelPath) {
		
		//Initialize model
		CustomUMLRTPackage.eINSTANCE.eClass();
		
		//Register XMI resource factory for .customumlrt files
		Resource.Factory.Registry factoryRegistry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> registryMap = factoryRegistry.getExtensionToFactoryMap();
		registryMap.put("customumlrt", new XMIResourceFactoryImpl());
		
		//Load the resource (miniUML Model)
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI(modelPath), true);
		
		//Get root object
		Model m = (Model) resource.getContents().get(0);
		return m;	
	}
	
	public static void main(String[] args) {
		/*
		String modelPath = "models/My.customumlrt";
		
		capsuleAnalysis printer = new capsuleAnalysis();
		Model m = printer.loadModel(modelPath);
		
		connectors = m.getCapsules().getConnectors();
		ports = m.getCapsules().getPorts();
		protocols = m.getCapsules().getProtocols();
		subcapsules = m.getCapsules().getSubcapsules();
		//tempmachine = m.getCapsules().getTempmachine();
		

		*/
		//AlgCapsule c = ModelAbstractor.prepCapsule(m);
		//ModelAbstractor.printAlgCap(c);
		
		AlgCapsule c;
		
		if(analyzetype == analyzeType.RELAY) {
			c = TestingRelaySignal.getTestCapsule();
		}else if (analyzetype == analyzeType.EXTERNAL) {
			c = TestingExternalSignal.getTestCapsule();
		}else if(analyzetype == analyzeType.TIMEOUT) {
			c = TestingTimeout.getTestCapsule();
		}else {
			c = TestingSmInit.getTestCapsule();
		}

		
		analyze(c);
	}
	
	public static AlgWCETAnalysisResult analyze(AlgCapsule c) {
		AlgWCETAnalysisResult result = new AlgWCETAnalysisResult();
		System.out.println("Analyzing capsule " + c.name);
		ArrayList<AlgSignal> relaySignals = c.getRelayInSignals();
		ArrayList<AlgSignal> externalSignals = c.getExternalInSignals();
		
		ArrayList<AlgWData> RW = new ArrayList<AlgWData>();
		ArrayList<AlgWData> EW = new ArrayList<AlgWData>();
		ArrayList<AlgWData> TW = new ArrayList<AlgWData>();
		ArrayList<AlgWData> IW = new ArrayList<AlgWData>();
		
		if(analyzetype == analyzeType.RELAY) {
			for (AlgSignal signal : relaySignals) {
				History HC = new History();
				signal.Print();
				AlgWData W = traverse(c, signal, HC);
				
				W.lookupSignal = signal;
				
				System.out.println("\n\n\n\n ----- Relay signal results -----\n");
				W.Print();
				RW.add(W);
			}
		}
		
		
		if(analyzetype == analyzeType.EXTERNAL) {
			for (AlgSignal signal : externalSignals) {
				
				AlgWData SMW = smAnalysis(c, signal);
				
				
				History HC = new History();
				AlgWData E = traverseSmSignals(c, SMW, HC);
				E.lookupSignal = signal;
				System.out.println("\n\n\n\n ----- External signal results -----\n");
				E.Print();
			}
		}
			
		
		if(analyzetype == analyzeType.TIMEOUT) {
			TW = timeoutAnalysis(c);
			
			System.out.println("\n\n\n\n ----- Timeout WCET results -----\n");
			for(AlgWData wdata : TW) {
				wdata.Print();
			}
		}
		
		if(analyzetype == analyzeType.SMINIT) {
			IW = smInitAnalysis(c);
			
			System.out.println("\n\n\n\n ----- State machine Initialization WCET results -----\n");
			for(AlgWData wdata : IW) {
				wdata.Print();
			}
		}
		
		
		/*
		
		AlgCapsule c2 = TestingSM.getTestCapsule();
		c2.Print();
		AlgWData smr = smTraverse(c2.statemachine, TestingSM.t1, new History());
		System.out.println("---smr---");
		smr.Print();
		
		*/
		
		result.RW = RW;
		result.EW = EW;
		result.TW = TW;
		result.IW = IW;
		return result;
	}
	
	public static ArrayList<AlgWData> smInitAnalysis(AlgCapsule c) {
		ArrayList<AlgWData> IWList = new ArrayList<AlgWData>();
		
		AlgWData SMW = new AlgWData();
		
		if(c.statemachine != null) {
			AlgTransition initTransition = c.statemachine.getTransition("smInitial");
			History HS = new History();
			
			if(initTransition != null) {
				SMW = smTraverse(c.statemachine, initTransition, HS);
			}
			
		}
		
		AlgWData IW = traverseSmSignals(c, SMW, new History());
		IW.altLookupName = c.name+".smInitial";
		IWList.add(IW);
		
		for(AlgSubcapsule sc : c.subcapsules) {
			AlgWData SCIWin = wcet(sc);
			AlgWData SCIWout = new AlgWData();
			SCIWout.altLookupName = sc.name+".smInitial";
			
			for(AlgVoPair SCTWvo : SCIWin.voPairs) {
				AlgWData mixers = new AlgWData();
				AlgVoPair newPair = new AlgVoPair();
				newPair.executionTime = SCTWvo.executionTime;
				mixers.AddVoPair(newPair);
				
				for(AlgSignal ps : SCTWvo.signals) {
					History HC = new History();
					AlgWData mixer = traverse(c, ps, HC);
					
					AlgWData newMixers = new AlgWData();
					
					for(AlgVoPair A : mixers.voPairs) {
						for(AlgVoPair B : mixer.voPairs) {
							AlgVoPair newMixer = new AlgVoPair();
							
							newMixer.executionTime = A.executionTime + B.executionTime;
							
							for(AlgSignal sA : A.signals) {
								newMixer.AddSignal(sA);
							}
							for(AlgSignal sB : B.signals) {
								newMixer.AddSignal(sB);
							}
							
							newMixers.AddVoPair(newMixer);
						}
					}
					
					mixers = newMixers;
				}
				
				for(AlgVoPair mixer : mixers.voPairs) {
					SCIWout.AddVoPair(mixer);
				}
			}
		
			IWList.add(SCIWout);
		}
		
		return IWList;
	}
	
	public static ArrayList<AlgWData> timeoutAnalysis(AlgCapsule c) {
		ArrayList<AlgWData> TWList = new ArrayList<AlgWData>();
		
		AlgWData SMW = new AlgWData();
		AlgWData TW = new AlgWData();
		
		ArrayList<AlgPort> timingPorts = c.getTimingPorts();
		for(AlgPort port : timingPorts) {
			History HC = new History();
			SMW = smAnalysis(c, port.signals.get(0));
			
			TW = traverseSmSignals(c, SMW, HC);		
			
			TW.lookupSignal = port.signals.get(0);
			TWList.add(TW);
		}
		
			
		for(AlgSubcapsule sc : c.subcapsules) {
			AlgWData SCTWin = wcetTW(sc, "timing.timeout");
			
			AlgWData SCTWout = new AlgWData();
			SCTWout.altLookupName = sc.name+".timing.timeout";
			
			for(AlgVoPair SCTWvo : SCTWin.voPairs) {
				AlgWData mixers = new AlgWData();
				AlgVoPair newPair = new AlgVoPair();
				newPair.executionTime = SCTWvo.executionTime;
				mixers.AddVoPair(newPair);
				
				for(AlgSignal ps : SCTWvo.signals) {
					History HC = new History();
					AlgWData mixer = traverse(c, ps, HC);
					
					AlgWData newMixers = new AlgWData();
					
					for(AlgVoPair A : mixers.voPairs) {
						for(AlgVoPair B : mixer.voPairs) {
							AlgVoPair newMixer = new AlgVoPair();
							
							newMixer.executionTime = A.executionTime + B.executionTime;
							
							for(AlgSignal sA : A.signals) {
								newMixer.AddSignal(sA);
							}
							for(AlgSignal sB : B.signals) {
								newMixer.AddSignal(sB);
							}
							
							newMixers.AddVoPair(newMixer);
						}
					}
					
					mixers = newMixers;
				}
				
				for(AlgVoPair mixer : mixers.voPairs) {
					SCTWout.AddVoPair(mixer);
				}
			}
			TWList.add(SCTWout);
		}
		
		
		return TWList;
	}
	
	public static AlgWData traverse(AlgCapsule c, AlgSignal ps, History HC) {
		AlgWData W = new AlgWData();
		
		if(HC.ContainsSignal(ps)) {
			AlgVoPair vop = new AlgVoPair();
			vop.executionTime = 9999999;
			W.AddVoPair(vop);
			return W;
		}
		
		HC.AddSignal(ps);
		
		if(ps.target.belongToSubcapsule) {
			AlgWData Wprime = wcet(c, ps);
			
			for(AlgVoPair Wpvo : Wprime.voPairs) {
				AlgWData mixers = new AlgWData();
				AlgVoPair newPair = new AlgVoPair();
				newPair.executionTime = Wpvo.executionTime;
				mixers.AddVoPair(newPair);
				
				for(AlgSignal psp : Wpvo.signals) {
					History HCp = new History();
					AlgWData mixer = traverse(c, psp, HCp);
					
					AlgWData newMixers = new AlgWData();
					
					for(AlgVoPair A : mixers.voPairs) {
						for(AlgVoPair B : mixer.voPairs) {
							AlgVoPair newMixer = new AlgVoPair();
							
							newMixer.executionTime = A.executionTime + B.executionTime;
							
							for(AlgSignal sA : A.signals) {
								newMixer.AddSignal(sA);
							}
							for(AlgSignal sB : B.signals) {
								newMixer.AddSignal(sB);
							}
							
							newMixers.AddVoPair(newMixer);
						}
					}
					
					mixers = newMixers;
				}
				
				for(AlgVoPair mixer : mixers.voPairs) {
					W.AddVoPair(mixer);
				}

			}
			return W;
	}
		
		if(ps.target.portKind == PortKind.RELAY) {
			//Found an end
			AlgSignal outSignal = null;
			
			//Get corresponding signal in capsule interface relay port
			for(AlgSignal signal : ps.target.signals) {
				if(signal.name == ps.name)
					outSignal = signal;
			}
						
			AlgVoPair outPair = new AlgVoPair();
			outPair.executionTime = 0;
			outPair.AddSignal(outSignal);
			W.AddVoPair(outPair);
			
			return W;
		}
		
		if(ps.target.portKind == PortKind.INTERNAL) {
			AlgSignal signalToBeAnalyzed= null;
			
			for(AlgSignal signal : ps.target.signals) {
				if(ps.name == signal.name) {
					signalToBeAnalyzed = signal;
				}
			}
			
			AlgWData SMW = smAnalysis(c, signalToBeAnalyzed);
			W = traverseSmSignals(c, SMW, HC);
			
			return W;
		
		}
		
		return W;
	}
	
	public static AlgWData traverseSmSignals(AlgCapsule c, AlgWData W_voPairs, History HC) {
		AlgWData W = new AlgWData();
		
		for(AlgVoPair voPair : W_voPairs.voPairs) {
			AlgWData mixers = new AlgWData();
			AlgVoPair newPair = new AlgVoPair();
			newPair.executionTime = voPair.executionTime;
			mixers.AddVoPair(newPair);
			
			for(AlgSignal ps : voPair.signals) {
				
				AlgWData mixer = new AlgWData();
				if(voPair.signals.size() == 0) {
					AlgVoPair vonly = new AlgVoPair();
					//vonly.executionTime = voPair.executionTime;
					mixer.AddVoPair(voPair);
				}else {
					if(ps.owner.portKind == PortKind.EXTERNAL) {
						AlgVoPair extPair = new AlgVoPair();
						//extPair.executionTime = voPair.executionTime;
						extPair.AddSignal(ps);
						mixer.AddVoPair(extPair);
					}else {
					
					History HCp = HC.getCopy();
					mixer = traverse(c, ps, HCp);
					}
				}
					
				AlgWData newMixers = new AlgWData();
					
				for(AlgVoPair A : mixers.voPairs) {
					for(AlgVoPair B : mixer.voPairs) {
						AlgVoPair newMixer = new AlgVoPair();
							
						newMixer.executionTime = A.executionTime + B.executionTime;
							
						for(AlgSignal sA : A.signals) {
							newMixer.AddSignal(sA);
						}
						for(AlgSignal sB : B.signals) {
							newMixer.AddSignal(sB);
						}
							
						newMixers.AddVoPair(newMixer);
					}
				}
					
				mixers = newMixers;
			}
				
			for(AlgVoPair mixer : mixers.voPairs) {
				W.AddVoPair(mixer);
			}
			
		}
		
		return W;
	}
	
	public static AlgWData smAnalysis(AlgCapsule c, AlgSignal signal) {
		
		AlgWData SMW = new AlgWData();
		SMW.lookupSignal = signal;
		
		for(AlgTransition transition : c.statemachine.transitions) {
			if(transition.trigger != null) {
				if((transition.trigger.port.name == signal.owner.name) && (transition.trigger.signal.name == signal.name)) {
					History HS = new History();
					AlgWData W = smTraverse(c.statemachine, transition, HS);
					
					for(AlgVoPair vop : W.voPairs) {
						SMW.AddVoPair(vop);
					}
				}
			}
		}

		return SMW;
	}
	
	public static AlgWData smTraverse(AlgStatemachine sm, AlgTransition t, History history) {
		AlgWData W = null;
		
		if(history.ContainsTransition(t)) {
			W = new AlgWData();
			W.AddVoPair(new AlgVoPair(99999999, null));
			return W;
		}
		
		history.AddTransition(t);
		
		AlgEvent f = t.source.exitEvent;
		AlgEvent g = t.event;
		AlgEvent h = t.target.entryEvent;

		AlgVoPair srcWcet = new AlgVoPair(f.executionTime, f.sentSignals); 
		AlgVoPair traWcet = new AlgVoPair(g.executionTime, g.sentSignals); 
		AlgVoPair tarWcet = new AlgVoPair(h.executionTime, h.sentSignals); 

		AlgVoPair Wprime = new AlgVoPair();
		Wprime.executionTime = srcWcet.executionTime + traWcet.executionTime + tarWcet.executionTime;
		Wprime.AddSignals(srcWcet.signals);
		Wprime.AddSignals(traWcet.signals);
		Wprime.AddSignals(tarWcet.signals);
		
		
		for(AlgTransition tprime : sm.transitions) {
			if(tprime.source.name == t.target.name) {
				if(tprime.trigger == null) {
					AlgWData Wprimeprime = smTraverse(sm, tprime, history);
					
						for(AlgVoPair vop : Wprimeprime.voPairs) {
							AlgVoPair mergedVo = new AlgVoPair();
								
							mergedVo.executionTime = vop.executionTime + Wprime.executionTime;
								
							for(AlgSignal s : vop.signals) {
								mergedVo.signals.add(s);
							}
							for(AlgSignal s : Wprime.signals) {	
								mergedVo.signals.add(s);
							}
									
							if(W == null) {
								W = new AlgWData();
							}
							W.AddVoPair(mergedVo);
								
						}
				}
			}
		}
		
		if(W == null) {
			W = new AlgWData();
			W.AddVoPair(Wprime);;
		}
		
		return W;
	}
	
	public static AlgWData wcet(AlgCapsule c, AlgSignal s) {
		AlgPort targetPort = s.target;
		
		for(AlgSubcapsule sc : c.subcapsules) {
			for(AlgPort scport : sc.ports) {
				for(AlgSignal signal : scport.signals) {
					if(s.name == signal.name) {
						return sc.lookUpSignal(signal);
					}
				}
			}
		}
		return null;
	}
	
	public static AlgWData wcet(AlgSubcapsule sc) {
		
		return sc.lookUpIW(sc.name);
		
	}
	
	public static AlgWData wcetTW(AlgSubcapsule sc, String portsignal) {
		return sc.lookupTW(portsignal);
	}
	
	public static void WaitForInput() {
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


