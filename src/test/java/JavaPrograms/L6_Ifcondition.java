package JavaPrograms;
import java.util.Scanner;
public class L6_Ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the I value:");
		String Ivalue=sc.next();
		int ivalue=Integer.parseInt(Ivalue);


		//		
		//		int i=2;

		if (ivalue==10)
		{
			System.out.println("value is 10");

		}
		else if(ivalue==15)
		{
			System.out.println("value is 15");

		}
		else
		{
			System.out.println("value is wrong");
		}
	}



}
