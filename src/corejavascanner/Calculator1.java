package corejavascanner;

import java.util.Scanner;

public class Calculator1 {
   public static void main(String args[]){
	   Scanner Sarah = new Scanner(System.in);
	   double fnum, snum, answer;
	   System.out.println("Enter first num: ");
	   fnum = Sarah.nextDouble();
	   System.out.println("Enter second num: ");
	   snum = Sarah.nextDouble();
	   answer = fnum + snum;
	   System.out.println(answer);
   }
   
}
