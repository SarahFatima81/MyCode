package corejavaconcepts;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x =1; 
		
		do{
		try{
		System.out.println("Enter first num: ");
		int n1= input.nextInt();
		System.out.println("Enter second num: ");
		int n2 = input.nextInt();
		int div = n1/n2;
		System.out.println(div);
		x =2;
		}
		catch(ArithmeticException ae){
			System.out.println("Invalid entry");
		}
		
		}while( x == 1);{
		
		}
	}
		
	



}


