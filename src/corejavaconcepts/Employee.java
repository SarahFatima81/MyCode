package corejavaconcepts;

public class Employee {
	
	String firstName;
	int empId;
	char gender;
	int age;

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.firstName = "Michelle";
		emp1.empId = 111;
		emp1.gender = 'F';
		emp1.age = 25;
		
		Employee emp2 = new Employee();
		emp2.firstName = "David";
		emp2.empId = 122;
		emp2.gender = 'M';
		emp2.age = 32;
		
		System.out.println("Employee"+"\t\t"+"ID"+"\t\t"+"Gender"+"\t\t"+"Age");
		System.out.println(emp1.firstName + "\t\t" + emp1.empId + "\t\t" + emp1.gender + "\t\t" + emp1.age);
		System.out.println(emp2.firstName + "\t\t\t" + emp2.empId + "\t\t" + emp2.gender + "\t\t" + emp2.age);

	}

}
