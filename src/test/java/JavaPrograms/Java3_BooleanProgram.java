package JavaPrograms;

//import java.util.Scanner;

import java.util.*;
//import java.uitl.Scanner;



public class Java3_BooleanProgram {


	public static void main(String[] args)
	{

		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Boolean value:");
			boolean scc=sc.nextBoolean();
			boolean user=scc;
			if ( user == true) {
				System.out.println("Input value is True");
			}
			else {
				System.out.println("Input value is Fales");
			}

		}
		catch(Exception e)
		{
			System.out.println("Not");
		}
	}
}
