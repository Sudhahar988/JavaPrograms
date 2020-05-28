package JavaPrograms;
import java.util.Scanner;
public class N4_Returntype {
	public int printtest(int Sub)
	{
	int Sub1=10;
	int Sub2=15;
	if(Sub==Sub1)
	{
	System.out.println("Maths book is avaliable:");
	}
	else if(Sub==Sub2)
	{
	System.out.println("Science book is avaliable:");
	}
	else
	{
	System.out.println("Books not avaliable");
	}
	return Sub;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subject value:");
		String subjects=sc.next();
		int inputval=Integer.parseInt(subjects);
		int R=	inputval;
		N4_Returntype ret=new N4_Returntype();
		ret.printtest(R);
	}

}
