package JavaPrograms;

import java.util.Scanner;

public class K8_Greatestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);  

		System.out.print("Enter the value of A:");
		int A=sc.nextInt();  

		System.out.print("Enter the value of B:");
		int B=sc.nextInt(); 


		System.out.print("Enter the value of C:");
		int C=sc.nextInt(); 

		if((A>B)&&(A>C))
		{
			System.out.println("A is greater then B and C");
		}
		else if((B>A)&&(B>C))
		{
			System.out.println("B is greater then A and C");	
		}
		else if((C>A)&&(C>B))
		{
			System.out.println("C is greater then A and B");	
		}
		}

	}


