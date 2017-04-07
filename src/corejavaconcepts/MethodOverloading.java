package corejavaconcepts;

public class MethodOverloading {

	public static void main(String[] args) {
		
		//method add has same name but different number/type of parameters in each function performing related operations
		
		MethodOverloading calc = new MethodOverloading();
		int sum1 = calc.add(16, 4);
		int sum2 = calc.add(20,12, 18);
		int sum3 = calc.add(10, 12, 45, 19, 30, 17);
		System.out.println(sum3);

	}
     public int add(int a, int b){
    	return a + b;
          
     }
     public int add(int a, int b, int c){
    	 int sum = a + b + c;
    	 return sum;
     }
     public int add(int ...array){
    	 int sum = 0;
    	 for(int a : array){
    		 sum += a;
    		 
    	 }
    	 return sum;
     }
//     public int add(int a, int ...array){
//    	 System.out.println("A value is " + a);
//    	 int result = 0;
//    	 for(int arr : array){
//    		 System.out.println(arr);
//    	 }
//    	 return result; // gives the value of 1st number in array + second number)
//     }
}
