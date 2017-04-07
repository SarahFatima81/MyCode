package corejavaconcepts;

public class Method {

	public static void main(String[] args) {
		Method meth = new Method();
//		meth.add(20, 40);
		 
		int sum1 = meth.runMath(20, 40);
		 int sum2 = meth.runMath(40, 10);
		 int sum3 = meth.runMath(30, 10);
		 int result = sum1 + sum2 + sum3;
		 int finalResult = result/3;
		 
		 System.out.println("Final result is " + finalResult);
	    
	    
	}
//     public void add (int a, int b){
//    	 System.out.println(a + b);
//     }
     public int runMath (int a, int b){
    	int sum = (a + b) + (a/b) * 20;
    	 return (sum); 
     }
}
