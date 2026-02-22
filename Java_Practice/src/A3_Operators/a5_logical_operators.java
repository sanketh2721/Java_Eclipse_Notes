package A3_Operators;

public class a5_logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String role = "Admin";
		if(role.equals("Admin") || role.equals("Manager"))
		{
			System.out.println("Access granted");
		}
		
		String role1="Mnager";
		if(!role1.equals("Manager"))
		{
			System.out.println("Granted");
		}
		
		
//		int a = 5;
//		int b = 10;
//        int c =7;
//		boolean result = a++ > 5 && ++b > 10;
//		System.out.println(a + " " + b + " " + result);
		
//		String result1 = (a%2==0)? "even" : "odd";
//		System.out.println(result1);
		
		int a = 10;
		int b = 25;
		int c = 15;

		int largest = (a > b) 
		               ? (a > c ? a : c) 
		               : (b > c ? b : c);

		System.out.println("Largest = " + largest);

	}

}
