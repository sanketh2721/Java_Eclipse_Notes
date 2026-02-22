package A2_Control_Loops_Programs;

public class a5_leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year =1000;


		        if (year % 400 == 0) {
		            System.out.println("Leap Year");
		        }
		        else if (year % 100 == 0) {
		            System.out.println("Not a Leap Year");
		        }
		        else if (year % 4 == 0) {
		            System.out.println("Leap Year");
		        }
		        else {
		            System.out.println("Not a Leap Year");
		        }
		        
		      //ternary
		    	int year1 =2023;
		    	String result = ((year1%4==0&&year1%100!=0)||year1%400==0)? "Leap Year" : "Not a Leap Year";
		    	System.out.println(result);
		    }
		
	

}
