package A8_Methods;

public class a2_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Method Overloading : Multiple methods having the same name(method name) but different parameters.
		
		a2_method_overloading a2= new a2_method_overloading();
		 a2.add(2, 3);
		 a2.add(1,2,3);
		 a2.display(2, "Sanketh");
		 a2.display("Mahenjeeb", 3);
	}
	
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    
    void display (int a , String b)
    {
    	System.out.println("My age is :"+a);
    	System.out.println("My name is :"+b);

    }

    void display (String b , int a)
    {
    	System.out.println("My name is :"+b);
    	System.out.println("My age is :"+a);
    }
}
