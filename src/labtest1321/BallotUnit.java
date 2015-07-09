package labtest1321;

public class BallotUnit {
	
	ArrayList<Slot> slots = new ArrayList<Slot>();
	State state;
	
	public void setCandidateSlot(String name){
		Slot bs = new Slot(name);
		slots.add(bs);
	}
	
	public void setState(State s) {
		state = s;
	}

}
