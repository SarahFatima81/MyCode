package corejavamultipleclasses;

public class ComplexClient {

	public static void main(String[] args) {
		Person ambani = new Person("Anil", "Ambani",'M');
		
		Address address = new Address("Ambani Villa", System.getProperty("line.separator") + "Banjara Hills", System.getProperty("line.separator") + "Hyderabad");
		
		ambani.setAddress(address);
		
		
	    Person ambani1 = new Person("Neetu","Ambani", 'F');
		ambani1.relationship = "Wife";
		
		
		Person ambani2 = new Person ("Rahul", "Ambani",'M');
		ambani2.relationship = "Son";
		
		
		Person ambani3 = new Person ("Sakshi", "Ambani",'F');
		ambani3.relationship = "Daughter";
		
		
        Person persons[] = {ambani1,ambani2,ambani3};
		ambani.setPersons(persons);
		
		Pet dog = new Pet("Pet\nRocky", System.getProperty("line.separator") + "Brown", System.getProperty("line.separator") + "Alsation dog");
		ambani.setPet(dog);
	
		System.out.println(ambani);
	    
		if(true){
		System.out.println("Ambanis are rich.");
	   }else{
		System.out.println("Ambanis are not as rich.");
	}
	}

}
