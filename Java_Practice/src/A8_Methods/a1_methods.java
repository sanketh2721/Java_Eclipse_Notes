package A8_Methods;

public class a1_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Methods
//A method is a block of code that performs a specific task and can be executed whenever needed.		
	
//Why Methods Are Used?
//Without methods: Code repeats again and again 
//With methods:Write once → use many times 
	
//syntax
		
//		accessModifier returnType methodName(parameters) {
//		    // method body
//		}
	
// Access Modifier :Controls visibility.
	//ex 
//		public
//		private
//		protected
//		default
		
//Return Type :Type of value method gives back.
	//ex
//		int
//		double
//		String
//		void
		
//Method Name : Follow camelCase.		
	//ex
//		calculateTotal()
//		printName()
//		findMax()
	
//Parameters : Inputs received by method.
	//ex
//		(int a, int b)
		
		
		//calling method
//		a1_methods a1= new a1_methods();
//		int result = a1.add(1,2);
//		System.out.println("Sum is : " +result);
//		a1_methods a1=new a1_methods();
//        int re = a1.add(1,2);
//        System.out.println(re);
		a1_methods a1= new a1_methods();
				int re = a1.add(1,2);
//	int re=	a1_methods.add(1,2);
	System.out.println(re);
	}

	 int add(int a, int b) {
	    return a + b;
	}
}
