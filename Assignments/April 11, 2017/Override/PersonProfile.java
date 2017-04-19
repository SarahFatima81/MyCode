package corejavainheritance;

public class PersonProfile {

	public static void main(String[] args) {
        
		
//		Teacher tcr = new Teacher ("Richard", " Smith", 'M', 40, "IL", "Clean", "Bolingbrook High School", "Math");
//		tcr.printTeacherDetails();
//		Student stu = new Student ("Susan", " Johnson", 'F', 18, "FL", "Clean", "University of Florida", "MS Computer Science");
//		stu.printStudentDetails();
//		Manager mang = new Manager ("Harry", " Smith", 'M', 38, "NY", "Bad", "Infosys", "Software Engineer");
//		mang.printManagerDetails();
//		Politician pol = new Politician ("Lewis", " Stewart", 'M', 55, "OH", "Dubious","Mayor", "Republican");
//		pol.printPoliticianDetails();
        
		//Method overriding through Dynamic method dispatch/runtime polymorphism.
		
		Person pers[] = new Person[4];
		pers[0] = new Teacher("Richard", " Smith", 'M', 40, "IL", "Clean", "Bolingbrook High School", "Math");
		pers[1] = new Student("Susan", " Johnson", 'F', 18, "FL", "Clean", "University of Florida", "MS Computer Science");
        pers[2] = new Manager("Harry", " Smith", 'M', 38, "NY", "Bad", "Infosys", "Software Engineer");
        pers[3] = new Politician("Lewis", " Stewart", 'M', 55, "OH", "Dubious","Mayor", "Republican");
	    
        for(int i = 0; i<4; i++){
        	pers[i].printPersDetails();
        }
	}
	
	
	}
