package corejavainheritance;

public class PersonProfile {

	public static void main(String[] args) {

		Teacher tcr = new Teacher ("Richard", " Smith", 'M', 40, "IL", "Clean", "Bolingbrook High School", "Math");
		tcr.printTeacherDetails();
		Student stu = new Student ("Susan", " Johnson", 'F', 18, "FL", "Clean", "University of Florida", "MS Computer Science");
		stu.printStudentDetails();
		Manager mang = new Manager ("Harry", " Smith", 'M', 38, "NY", "Bad", "Infosys", "Software Engineer");
		mang.printManagerDetails();
		Politician pol = new Politician ("Lewis", " Stewart", 'M', 55, "OH", "Dubious","Mayor", "Republican");
		pol.printPoliticianDetails();



	}


}

