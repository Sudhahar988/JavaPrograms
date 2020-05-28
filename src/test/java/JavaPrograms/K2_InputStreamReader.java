package JavaPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class K2_InputStreamReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader istream = new InputStreamReader(System.in) ;
		BufferedReader bufRead = new BufferedReader(istream) ;

		System.out.print("Enter the value of Area:");
	//	String Area=bufRead.readLine();

		System.out.print("Enter the value of length:");
		//String length=bufRead.readLine();


		System.out.print("Enter the value of breadth:");
		//String breadth = bufRead.readLine();

		int Area = 0;
		int Square=Integer.parseInt(null, Area+Area);
		int length = 0;
		int breadth = 0;
		int retangle=Integer.parseInt(null, length+breadth);


		System.out.println("The Square Value is:"+Square);
		System.out.println("The Retangle Value is:"+retangle);
	}

}
