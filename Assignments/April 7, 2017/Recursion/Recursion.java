package corejavaconcepts;

public class Recursion {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		  System.out.println(f.fact(4));

	
	}
}
 class Factorial{
	int fact(int val){
		int result;
			if(val == 1)
			return 1;
	result = val* fact(val-1);
	return result;
	
		}
	
 
 
 
 }
 




	
	

