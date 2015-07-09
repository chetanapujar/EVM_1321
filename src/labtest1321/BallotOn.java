package labtest1321;

public class BallotOn extends State {

	BallotOn(){
	state="on";
	}
	

	public void switchState(BallotUnit bu) {
		// TODO Auto-generated method stub
		BallotOff on = new BallotOff();
		bu.setState(on);
	}
}


