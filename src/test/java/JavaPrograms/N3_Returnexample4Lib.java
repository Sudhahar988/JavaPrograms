package JavaPrograms;


import java.util.Scanner;
public class N3_Returnexample4Lib {


	public String Printtext(String Sub)
	{

	//String Sub=A;
	String Sub1="Maths";
	String Sub2="Science";
	String var="not available";
	if(Sub.equals(Sub1))
	{
//	System.out.println("Maths book is avaliable");
	var="available";	
	}
	else if(Sub.equals(Sub2))
	{
//	System.out.println("Science book is avaliable");
		var=" not available";	
	}
//	else
//	{
//	System.out.println("Books not avaliable");
//	}
	return var;
	}
	
	

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subject value:");
		String subjects=sc.next();
		String inputval=subjects;
		
		N3_Returnexample4Lib ret=new N3_Returnexample4Lib();
		String Status=ret.Printtext(inputval);
		System.out.println("The book "+inputval+" is "+Status);
		sc.close();
	}

}
