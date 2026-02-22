package A2_Var;

public class a5_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Type casting = Converting one data type into another.
		
		//Implicit Casting (Widening) : Small → Large
		int a = 10;
		double b = a;  
		System.out.println(b);
		// byte>short>int>long>float>double (Order)
		
		//Explicit Casting (Narrowing) :Large → Small
		
		double d = 10.5;
		int i = (int) d; //define like this 
		System.out.println(i); // data loss 
		}

}
