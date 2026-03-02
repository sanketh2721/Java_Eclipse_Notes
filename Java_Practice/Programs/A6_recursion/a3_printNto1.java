package A6_recursion;

public class a3_printNto1 {


	static void printNumbers(int n) {

        // Base condition (stopping condition)
        if(n == 0)
            return;

        // Work
        System.out.println(n);

        // Recursive call
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }

}
