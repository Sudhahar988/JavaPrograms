
package JavaPrograms;

import java.util.Scanner;

public class K9_InputAndOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);  

		System.out.print("Enter the value of Area:");
		int Area=sc.nextInt();  

		System.out.print("Enter the value of length:");
		int length=sc.nextInt(); 


		System.out.print("Enter the value of breadth:");
		int breadth=sc.nextInt(); 

		int Square=Area*Area;
		int rectangle=length*breadth;

		
		

		System.out.println("The Square Value is:"+Square);
		System.out.println("The Retangle Value is:"+rectangle);
		sc.close();
	}

}
