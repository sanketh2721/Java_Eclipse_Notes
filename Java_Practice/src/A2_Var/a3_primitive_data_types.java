package A2_Var;

public class a3_primitive_data_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Primitive Data Types
       
		//1. byte  : Size: 1 byte , Range: -128 to 127
		byte b = 10;
		System.out.println(b);
		
		//2. short : Size: 2 bytes , Range: -32,768 to 32,767
		short s = 10003;
		System.out.println(s);
		
		//3. int : Size: 4 bytes 
		int number = 100;
		System.out.println(number);
		
		//4. long : Size: 8 bytes , Must add L at end
		long population = 100000L;
		System.out.println(population);
		
		//5. float : Size: 4 bytes , Must add f
		float price = 10.5f;
		System.out.println(price);
		
		//6. double: Size: 8 bytes , Default decimal type
		double salary = 50000.75;
		System.out.println(salary);
		
		//7. char: Size: 2 bytes, Stores single character , Uses single quotes
		char grade = 'A';
		System.out.println(grade);
		
		//8. boolean : Stores true/false , Size: JVM dependent (conceptually 1 bit)
		boolean isActive = true;
		System.out.println(isActive);
	}

}
