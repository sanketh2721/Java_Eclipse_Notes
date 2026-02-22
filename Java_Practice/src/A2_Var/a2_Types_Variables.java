package A2_Var;

public class a2_Types_Variables {
	
	//Instance Variable
	int age1=20;


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//local Variable
		int age = 23;
		System.out.println("The age is : "+age);
	
	//to call an instance variable
		a2_Types_Variables a = new a2_Types_Variables();
		System.out.println(a.age1);
		
	//to call an Static variable
		System.out.println(Student.college);
		
	}
	
	//Static Variable
	class Student
	{
	    static String college = "ABC";
	}

}
