package JavaPrograms;
import java.util.Scanner;

public class M7_Factorialinput {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of value calculate in factorial:");
		String factorial=sc.next();
		int fact1=Integer.parseInt(factorial);
			
	int i;
		int j = 1;
		
		for(i=1;i<=fact1;i++)
		{			
			j=i*j;
			System.out.println(j);
		}
			
		}
	}

