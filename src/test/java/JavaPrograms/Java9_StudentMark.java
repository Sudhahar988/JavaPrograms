package JavaPrograms;


import java.util.Scanner;
public class Java9_StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Employee name:");
		String Employeename=sc.next();
		System.out.println("Enter Mark1 Value:");
		String mark1=sc.next();
		int iMark=Integer.parseInt(mark1);
		System.out.println("Enter Mark2 value :");
		String mark2=sc.next();
		int iMark2=Integer.parseInt(mark2);
		System.out.println("RESULT:");
		System.out.println("STUDENTNAME:"+Employeename);
		if (iMark<=30)
		{
			System.out.println("MARK1: Result is fail");
			
		}
		else if((iMark>=40)&&(iMark<=50))
		{
			System.out.println("MARK1: Result is Pass");
			
		}
		else if((iMark>50)&& (iMark<=60))
		{
		System.out.println("MARK1: Result is pass with Second class");
		}
		else if((iMark>60)&&(iMark<=100))
		{
			System.out.println("MARK1: Result is Pass with FirstClass");
		}
		else
		{
			System.out.println("MARK1:InvalidInput");
			}


		if (iMark2<=30)
		{
			System.out.println("MARK2: Result is fail");
			
		}
		else if((iMark2>=40)&&(iMark2<=50))
		{
			System.out.println("MARK2: Result is Pass");
			
		}
		else if((iMark2>50)&& (iMark2<=60))
		{
		System.out.println("MARK2: Result is pass with Second class");
		}
		else if((iMark2>60)&&(iMark2<=100))
		{
			System.out.println("Mark2 Result is Pass with FirstClass");
		}
		else
		{
			System.out.println("MARK2: InvalidInput");
			}
		
		
		}
	}


