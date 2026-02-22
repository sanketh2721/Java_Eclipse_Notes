package A4_IO;

import java.util.Scanner;
public class a2_scanner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner Class
		Scanner sc = new Scanner(System.in);
		
		//Reading Different Data Types
		int age = sc.nextInt(); // reads an int 
		double salary = sc.nextDouble(); // reads a double
		String name = sc.next(); //Reads single word (until space).
		String fullName = sc.nextLine(); //Reads full line including spaces.
		boolean flag = sc.nextBoolean(); //reads an boolean
	}

}
