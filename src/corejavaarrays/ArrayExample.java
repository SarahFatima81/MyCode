package corejavaarrays;

public class ArrayExample {

	public static void main(String[] args) {
	    int num[] = new int[10];
	    
	    num[0] = 22;
	    num[1] = 45;
	    num[2] = 56;
	    
	    System.out.println(num[0]);
	    
     
	    
	    int numb[] = {22, 45, 56};
	    
	    System.out.println(numb[1]);
	    
	    
	    for(int i = 0; i < numb.length; i++){
		    
		    System.out.println(numb[i]);
		   
	    // if i <= numb.length, error message arrayindexoutofboundsexception will be displayed
	    }
	   
	}
	
}	

	


