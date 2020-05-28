package Reprocess;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Boolean value:");
		boolean enterVal=sc.nextBoolean();
		
		if(enterVal==true)
		{
			System.out.println("Entered valeu is TRUE");
		}else
		{
			System.out.println("Entered valeu is FALSE");
		}
		
	}

}

