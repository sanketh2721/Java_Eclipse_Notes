package A6_recursion;

public class a1_factorial {

	
	static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int num =5;
		int result = factorial(num);
		System.out.println("The Factorial of 5! is : "+result);
	}

}
