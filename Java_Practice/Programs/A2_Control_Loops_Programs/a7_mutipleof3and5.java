package A2_Control_Loops_Programs;

public class a7_mutipleof3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num = 30;   // Change to test

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }
        
        //ternary 
        String answer = (num % 3 == 0 && num % 5 == 0)? "It is Divisible by both 3 and 5" :
        	"It is not Divisible by both 3 and 5";
        System.out.println(answer);
	}

}
