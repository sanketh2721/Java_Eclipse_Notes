package A2_Control_Loops_Programs;

public class a1_positiveno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=0;
		
		if(num>0)
		{
			System.out.println("Positive number");
		}
		else if(num<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Zero");
		}
		
		int num1=10;
		//ternary
		String result = (num1>0)? "Positive number" : (num1<0)? "Negative number" : "Zero";
		System.out.println(result);
	}

}
