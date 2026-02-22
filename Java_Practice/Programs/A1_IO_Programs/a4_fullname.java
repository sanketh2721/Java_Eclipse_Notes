package A1_IO_Programs;

import java.util.Scanner;

public class a4_fullname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Take Full Name Using nextLine()
//		Write a program that: Takes full name (first name + last name with space)
//		Prints: Welcome, <Full Name>
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the full name:");
		String fullname = sc.next();
		System.out.println("Welcome, "+fullname);

	}

}
