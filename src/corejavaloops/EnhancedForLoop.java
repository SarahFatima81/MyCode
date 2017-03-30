package corejavaloops;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		int values[] = {10,20,15,25, 16,60,100};
		int total = 0;
		
		for(int element: values){
			total += element; 
			
		}
		
		    System.out.println(total);
		    
		 int average = 0;
		 
		 if (values.length > 0){
			 average = total/values.length;
			 
		 }
		    System.out.println(average);
	}

}
