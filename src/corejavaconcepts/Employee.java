package corejavaconcepts;

public class Employee {
	
	String firstName;
	int empId;
	char gender;
	int age;

	public static void main(String[] args) {
		
		Employee michelle = new Employee();
		michelle.firstName = "Michelle";
		michelle.empId = 111;
		michelle.gender = 'F';
		michelle.age = 25;
		
		Employee david = new Employee();
		david.firstName = "David";
		david.empId = 122;
		david.gender = 'M';
		david.age = 32;
		
		System.out.println("Employee Name"+"\t\t"+"ID"+"\t\t"+"Gender"+"\t\t"+"Age");
		System.out.println(michelle.firstName + "\t\t" + michelle.empId + "\t\t" + michelle.gender + "\t\t" + michelle.age);
		System.out.println(david.firstName + "\t\t\t" + david.empId + "\t\t" + david.gender + "\t\t" + david.age);

	}

}
