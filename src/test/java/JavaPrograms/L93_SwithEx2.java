package JavaPrograms;


import java.util.Scanner;




public class L93_SwithEx2 {
	
	
public void Ageverify(int age)
	{
	//int Age=10;

	switch(age)
	{

	case 5:
		System.out.println("Your Age is 5 ");
		break;

	case 7:
		System.out.println("Your Age is 7 ");
		break;

	case 10:
		System.out.println("Your Age is 10 ");
		break;	

	default :
		System.out.println("Wrong Age");
	}
	//System.out.println(Subject);
	
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter your age:");
		String agevalue=obj.nextLine();
		int agevalue1=Integer.parseInt(agevalue);
		
		
		L93_SwithEx2 reg=new L93_SwithEx2();
		reg.Ageverify(agevalue1);
		
		
		
		
	}



	

}
