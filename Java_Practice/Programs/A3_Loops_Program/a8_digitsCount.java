package A3_Loops_Program;

public class a8_digitsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num = 332;   // Change to test
	        int count = 0;

	        if (num == 0) {
	            count = 1;
	        } 
	        else {
	            for (; num != 0; num = num / 10) {
	                count++;
	            }
	        }

	        System.out.println("Number of digits: " + count);
	}

}
