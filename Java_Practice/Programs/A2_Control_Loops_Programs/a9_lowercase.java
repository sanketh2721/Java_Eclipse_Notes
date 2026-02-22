package A2_Control_Loops_Programs;

public class a9_lowercase {

	public static void main(String [] args)
	{
		char ch = '@';   // Change to test

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        } 
        else {
            System.out.println("Not an Alphabet");
        }
	}
}
