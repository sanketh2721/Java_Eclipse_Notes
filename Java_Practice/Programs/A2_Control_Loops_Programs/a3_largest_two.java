package A2_Control_Loops_Programs;

public class a3_largest_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b =20;
		
		if(a>b)
		{
			System.out.println("A is largest");
		}
		else if(b>a)
		{
			System.out.println("B is largest");
		}
		else
		{
			System.out.println("Both are equal");
		}
		
		//ternary
		String result = (a>b)?"A is largest: " +a:(b>a)?"B is larger: "+b:"Both are equal";
		System.out.println(result);
	}

}
