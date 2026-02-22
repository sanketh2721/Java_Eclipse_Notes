package A2_Control_Loops_Programs;

public class a2_even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		
		if(a%2==0)
		{
			System.out.println("Even no");
		}
		else
		{
			System.out.println("Odd no");
		}
		
		//ternary
		String result = (a%2==0)? "Even Number" : "Odd Number";
		System.out.println(result);
	}

}
