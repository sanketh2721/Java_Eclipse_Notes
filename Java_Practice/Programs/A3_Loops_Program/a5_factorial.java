package A3_Loops_Program;

public class a5_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int n = 5;   // Change this value to test
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
	}

}
