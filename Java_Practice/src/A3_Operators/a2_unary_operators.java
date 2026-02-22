package A3_Operators;

public class a2_unary_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//increment 
		//pre (++a) and post (a++)
		//pre : it incremeet and uses that value
		//post : it uses the values and den increment.
		
		int a = 5;
		int b = a++; //b = 5
		System.out.println("Post increment is :"+b); 

		int c =6;
		int d =++c; // d = 7
		System.out.println("Pre increment is :"+d);
		
		int a1 = 5;
		System.out.println(a1++);  // 5
		System.out.println(++a1);  // 7
		System.out.println(a1);    //7
		
		int a2 =6;
		System.out.println(a2--);  // 6
		System.out.println(--a2);  // 4
		System.out.println(a2);    //4
	}

}
