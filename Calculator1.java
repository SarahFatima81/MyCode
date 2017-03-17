import java.util.Scanner;

public class Calculator1 {
 
	public static void main(String args[]){
		
		double fnum, snum, answer;
		
		Scanner Sarah = new Scanner(System.in);
		
	    System.out.println("Enter first num:");
	    fnum = Sarah.nextDouble();
	    System.out.println("Enter second num:");
	    snum = Sarah.nextDouble();
	    answer = fnum + snum;
	    System.out.println(answer);
	}
	

}
