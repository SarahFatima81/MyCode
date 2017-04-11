package corejavamultipleclasses;

public class Person {
   private String fname;
   private String lname;
   private char gender;
   Address address;
   String relationship;
   Person persons[];
   Pet pet;
   
   
public Person(String fname, String lname, char gender) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.gender = gender;
}


public String getFname() {
	return fname;
}


public void setFname(String fname) {
	this.fname = fname;
}


public String getLname() {
	return lname;
}


public void setLname(String lname) {
	this.lname = lname;
}


public char getGender() {
	return gender;
}


public void setGender(char gender) {
	this.gender = gender;
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


public Person[] getPersons() {
	return persons;
}


public void setPersons(Person[] persons) {
	this.persons = persons;
}


public Pet getPet() {
	return pet;
}


public void setPet(Pet pet) {
	this.pet = pet;
}

public String toString()
{
	String per = this.fname + " " + this.lname + "\n" + this.gender + "\n" + this.address + "\n" + "-----------------" + "\n";
	String p = this.pet + "\n" + "----------------------" + "\n";
	if(persons != null)
	{for(int i=0;i<persons.length; i++)
	{
		per = per + persons[i].fname + " "+ persons[i].lname + "\n" + persons[i].gender + "\n" + persons[i].relationship +  "\n" + "-----------------" + "\n";
	}
		}
	

	return per + p;
}
   public boolean isRich(){
	   if(this.address.address2.equals("Banjara Hills") && pet != null){
		   return true;
		   
	   }
	      return false;
   }
}
  