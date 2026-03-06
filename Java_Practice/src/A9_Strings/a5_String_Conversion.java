package A9_Strings;

public class a5_String_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. String → int 
		
       //Integer.parseInt();
	       String num = "100";
	       int value = Integer.parseInt(num);
	       System.out.println(value + 50);
	    
	   // 2. int → String
	        int num1 = 200;
	        String s = String.valueOf(num1); //method
	        System.out.println(s + 10);
	       
	   // 3. String → char array
	        String s1 = "Java";

	        char[] arr = s1.toCharArray();
	       System.out.println(arr[0]);
	   
	   // 4. char array → String
	       char[] ch = {'J','A','V','A'};
	       String s11 = new String(ch);
	       System.out.println(s11);
	       
	       
	       
	}

}
