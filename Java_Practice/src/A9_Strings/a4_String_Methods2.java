package A9_Strings;

public class a4_String_Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Java";
        String s2 = "Java1";
		
// 1. compareTo() compares two strings lexicographically (dictionary order).It returns a number, not true/false.
        System.out.println(s1.compareTo(s2));
		
// 2. substring() Extract part of string.		
        String s = "Automation";

        System.out.println(s.substring(0,4));
        
// 3. split()  Splits string into array.		
        String ss = "Java Selenium TestNG";

        String[] words = ss.split(" ");
//        for(String Words : words){
//            System.out.println(Words);
//        }
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
		
        String ss1 = "Java-Selenium-With";
        String[] words1= ss1.split("-");
        for(String re : words1)
        {
        	System.out.println(re);
        }
//4. Replace : replaces the character
        String s22 = "Java";
        System.out.println(s22.replace('a','o'));
	}

}
