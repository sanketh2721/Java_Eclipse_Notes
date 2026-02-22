package A1_IO_Programs;

import java.util.Scanner;

public class a1_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Take Name & Age → Print Formatted Output
        //Write a Java program that: Takes name (String) Takes age (int)
        // Prints output like: My name is Sanketh and I am 25 years old.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		String name = sc.nextLine();
		System.out.print("Enter your age:");
		int age = sc.nextInt();
		System.out.println("My name is " +name + " and" + " I am " +age + " years old");
	}

}
