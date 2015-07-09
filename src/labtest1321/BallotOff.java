package labtest1321;

public class BallotOff extends State {

	BallotOff(){
	state="off";
	}
	

	public void switchState(BallotUnit bu) {
		// TODO Auto-generated method stub
		BallotOn off = new BallotOn();
		bu.setState(off);
	}
}
