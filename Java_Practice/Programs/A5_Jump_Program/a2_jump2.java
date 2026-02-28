package A5_Jump_Program;

public class a2_jump2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print numbers 1–20 but skip multiples of 3.
		
//		for(int i=1; i<=20; i++) {
//		    if(i%3==0)
//		    {
//		        continue;
//		    }
//		        System.out.println(i);
//		}
		


		        for(int i = 1; i <= 100; i++) {

		            if(i % 3 == 0 && i % 7 == 0) {
		                System.out.println(i);
		            
		            }
		        }
	}

}
