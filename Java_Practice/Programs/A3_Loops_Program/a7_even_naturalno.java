package A3_Loops_Program;

public class a7_even_naturalno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Sum of even numbers till N
		
		int n=5;  
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
			sum =sum+i;
			}
	
		}
		System.out.println(sum);
	}

}
