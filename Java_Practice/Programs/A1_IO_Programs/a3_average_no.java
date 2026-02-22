package A1_IO_Programs;

import java.util.Scanner;

public class a3_average_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Take 3 Numbers → Print Average
//		Write a program that: Takes three numbers Calculates average 
//		Prints:Average is: ___
		
	      Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();

	        System.out.print("Enter third number: ");
	        double num3 = sc.nextDouble();

	        double average = (num1 + num2 + num3) / 3;

	        System.out.println("Average is: " + average);
	}

}
