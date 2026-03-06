package A7_Strings;

public class a3_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//3. Write a Java program to reverse a string.
	
		//Method 1
		String s = "Java";
		String reverse ="";
		
		for (int i = s.length()-1;i>=0;i--)
		{
			reverse = reverse + s.charAt(i) ;
		}
		
		System.out.println("The reverse string is :"+reverse);
		
		//Method 2
        String str = "Java";
        char[] arr = str.toCharArray();

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
		
		
	}

}
