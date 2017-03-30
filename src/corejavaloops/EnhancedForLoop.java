package corejavaloops;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		double values[] = {5, 10, 2.5, 20};
		double total = 0;
		
		for(double element: values){
			total += element; 
			
		}
		
		    System.out.println(total);
		    
		 double average = 0;
		 
		 if (values.length > 0){
			 average = total/values.length;
			 
		 }
		    System.out.println(average);
	}

}
