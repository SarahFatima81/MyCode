package corejavaoperators;

public class IncrementOperators {

	public static void main(String args[]){
		
		
		int age = 5;
		age = age+1;
				
		System.out.println(age);
				
		// post increment operator requires 2 commands to give the incremented value
		
		double distance = 15.6;
		
		System.out.println(distance++);
		System.out.println(distance);
		
		//with pre-increment operator one command is enough to give the incremented value
		
		float height = 5.8f;
	
		System.out.println(++height);
		
	    
	}
	
}
