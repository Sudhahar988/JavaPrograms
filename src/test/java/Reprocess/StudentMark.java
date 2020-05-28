package Reprocess;

import java.util.Scanner;

public class StudentMark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp name:");
		String empname=sc.next();
		System.out.println("Enter mark1:");
		String mark1=sc.next();
		int markval1=Integer.parseInt(mark1);
		/*System.out.println("Enter mark2:");
		String mark2=sc.next();
		int markval2=Integer.parseInt(mark2);*/
		if(markval1<=30)
		{
			System.out.println("MARK1: Result is fail" );
		}
		else if((markval1>30)&& (markval1<=50))
		{
			System.out.println("Result is pass with Second class" );
		}
		else if((markval1>50)&& (markval1<=80))
		{
			System.out.println("Result is pass with Second class" );
		}
		else if((markval1>80))
		{
			System.out.println("Result is pass with first class" );
		}
		else
		{
			System.out.println("Invalid input");
		}

	}

}
