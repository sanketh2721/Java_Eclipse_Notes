package A1_IO_Programs;

import java.util.Scanner;

public class a2_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calculate Area of Rectangle
		//Write a program that: Takes length and breadth calculates area using formula:
		
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your length:");
		double length = sc.nextDouble();
		System.out.print("Enter your breadth:");
		double breadth = sc.nextDouble();
		double area = length * breadth;
		System.out.println("Area of rectangle is: "+area);
		
		//Because rectangle dimensions can have decimal values, so double is safer.
		
	}

}
