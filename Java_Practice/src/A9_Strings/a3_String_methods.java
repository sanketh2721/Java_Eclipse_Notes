package A9_Strings;

public class a3_String_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String s = "   Automation JavaStr       ";
        String s1 = "  Automation JavaStr";

// 1. length() : Returns number of characters.
        System.out.println("The Number of character: "+s.length());
        System.out.println("The Number of index: "+(s.length()-1));
// 2. charAt() : Returns character at given index. (Index starts from 0 to n-1).
        System.out.println("The character index: "+s.charAt(2));
        
// 3. equals() : Used to compare string content.
        System.out.println(s.equals(s1));

// 4. equalsIgnoreCase() : Ignores uppercase/lowercase.
        System.out.println(s.equalsIgnoreCase(s1));
        
// 5. contains() : Checks if substring exists.
        System.out.println("It contains :"+s.contains("mation"));
        
// 6. startsWith() : checks whether a string begins with a specific prefix.
        System.out.println(s.startsWith("Java",11));
        
// 7. endsWith() : checks whether a string ends with a specific suffix.
        System.out.println("Will it end with:"+s.endsWith("Automation"));
        
//8. toUpperCase() // converts uppercase
        System.out.println("Uppercase letter:"+s.toUpperCase());
        
//9. to lowerCase() // converts lowercase
        System.out.println("Lowercase letter:"+s.toLowerCase());
        
//10. trim() // removes extra spaces at the beginning and end of a string.        
        System.out.println(s.trim());
        

	}

}
