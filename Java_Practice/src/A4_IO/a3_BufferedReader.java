package A4_IO;

//import BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a3_BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//BufferedReader:BufferedReader is used to read text efficiently, especially from: Keyboard input ,Files ,Streams


		        BufferedReader br =
		                new BufferedReader(new InputStreamReader(System.in));

		        System.out.print("Enter your name: ");
		        String name = br.readLine();

		        System.out.println("Hello " + name);
		    
		
		
	}

}
