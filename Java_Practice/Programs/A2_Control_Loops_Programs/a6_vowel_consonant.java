package A2_Control_Loops_Programs;

public class a6_vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch ='1';
		ch = Character.toLowerCase(ch);
//		First check if alphabet
        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

        } else {
            System.out.println("Invalid Input");
        }
		
		char ch1 ='i';
		String answer = (ch1 =='a' ||ch1=='e' || ch1 =='i' ||ch1=='o' ||ch1=='u')?"Vowel: " +ch1 : "Consonant";
		System.out.println(answer);
	}

}
