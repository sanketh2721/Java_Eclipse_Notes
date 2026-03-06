package A7_Strings;

public class a4_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program to check whether a string is a palindrome.
		
		String s = "madama";
		String reverse ="";
	
		
		for (int i = s.length()-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i) ;
		}
		System.out.println("The reverse string is :"+reverse);
		
		if(s.equals(reverse))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}
	}

}
