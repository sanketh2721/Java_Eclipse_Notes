package A6_recursion;

public class a2_fibanacci_series {


	    static int fib(int n) {

	        // base cases
	        if(n == 0)
	            return 0;

	        if(n == 1)
	            return 1;

	        // recursive rule
	        return fib(n-1) + fib(n-2);
	    }

	    public static void main(String[] args) {

	        int num = 5;

	        System.out.println("Fibonacci value: ");
	        
	        for (int i = 0; i < num; i++) {
	            System.out.print(fib(i) + ",");
	        }
	    }
	
}
