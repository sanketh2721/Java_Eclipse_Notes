package A6_recursion;

public class a4_print1toN {

	static void printNumbers(int n) {

        // Base condition (stopping condition)
        if(n == 0)
            return;

        // Recursive call
        printNumbers(n - 1);
        
        //print
        System.out.println(n);


    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(4);
	}

}
