package A7_Strings;

public class a5_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		5. Write a program to count vowels and consonants in a string.
		
		String s = "Hello"; //vowels : 'e','o' , Consonants : 'H','l','l'
		
		char[] ch = s.toCharArray();
		int vowelCount=0;
		int consonantCount=0;
		for(char c : ch)
		{
		
			if(c =='a'||c =='e'||c =='i'||c =='o'||c =='u')
			{
				vowelCount++;
			}
			else
			{
				consonantCount++;
			}
			
		}
		System.out.println(s+ ":" + "The vowel count is : "+vowelCount);
		System.out.println(s+ ":" + "The consonants count is : "+consonantCount);
	}
	

}
