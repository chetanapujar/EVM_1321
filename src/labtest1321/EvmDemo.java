package labtest1321;

public class EvmDemo {
	
	ControlUnit CU;
	BallotUnit BU;
	
	EvmDemo(){
		CU = new ControlUnit();
		BU = new BallotUnit();
	}
	
	public void registerCandidate(String name){
		BU.setCandidateSlot(name);
	}
	
	
	
	
	
	
	
	

}
