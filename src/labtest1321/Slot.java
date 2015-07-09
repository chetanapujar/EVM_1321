package labtest1321;

public class Slot {

		String CName;
		Button CButton;
		
		Slot(String Cname){
			CName = Cname;
			this.CButton = new Button("Candidate Button");
		}

		public String getCandidateName() {
			return CName;
		}
		
}
