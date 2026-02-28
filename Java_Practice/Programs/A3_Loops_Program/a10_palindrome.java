package A3_Loops_Program;

public class a10_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =1231;
		int org = num;
		int reverse =0;
		
		while(num!=0)
		{
		   int digit = num%10;
		   reverse = reverse*10+digit;
		   num =num/10;
		}
		
		if(org==reverse)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}

}
