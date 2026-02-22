package A2_Control_Loops_Programs;

public class a4_smallest_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =50;
		int b =300;
		int c =20;
		
		if(a<=b && a<=c)
		{
			System.out.println("A is smallest");
		}
		else if(b<=a && b<=c)
		{
			System.out.println("B is smallest");
		}
		else
		{
			System.out.println("C is smallest");
		}
		
		
		//ternary
		String result = (a<=b && a<=c) ? "A is smaller: "+a : (b<=a && b<=c)? "B is smaller: "+b : "C is smallest: " +c ;
		System.out.println(result);
	}

}
