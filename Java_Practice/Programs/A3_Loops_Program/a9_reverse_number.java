package A3_Loops_Program;

public class a9_reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1234;
		int reverse =0;
		
		while(num!=0)
		{
			
	        int digit = num % 10;           // Get last digit
            reverse = reverse * 10 + digit; // Build reversed number
            num = num / 10;                 // Remove last digit
	    }

	        System.out.println("Reversed number: " + reverse);
	}

}
