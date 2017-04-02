package corejavaconcepts;

public class Employee {
	
	String firstName;
	int empId;
	char gender;
	int age;

	public static void main(String[] args) {
		
		Employee one = new Employee();
		one.firstName = "Michelle";
		one.empId = 111;
		one.gender = 'F';
		one.age = 25;
		
		Employee two = new Employee();
		two.firstName = "David";
		two.empId = 122;
		two.gender = 'M';
		two.age = 32;
		
		System.out.println("Employee"+"\t\t"+"ID"+"\t\t"+"Gender"+"\t\t"+"Age");
		System.out.println(one.firstName + "\t\t" + one.empId + "\t\t" + one.gender + "\t\t" + one.age);
		System.out.println(two.firstName + "\t\t\t" + two.empId + "\t\t" + two.gender + "\t\t" + two.age);

	}

}
