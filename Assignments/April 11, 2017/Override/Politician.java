package corejavainheritance;

public class Politician extends BadPerson {
	
	String position;
	String party;

	public Politician(String fname, String lname, char gender, int age, String location, String bdreput,
			String position, String party) {
		super(fname, lname, gender, age, location, bdreput);
		this.position = position;
		this.party = party;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public void printPersDetails(){
		System.out.println(super.toString() + "\n" + "Reputation: " + getBdreput()  + "\n" + "Position: " + (getPosition() + "\n" + "Party: " + getParty() + "\n" + "-----------------------------------------------"));



	}
       
       
}



