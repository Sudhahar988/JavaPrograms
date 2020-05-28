package JavaPrograms;
import java.util.Scanner;
public class N5_Returnvalue

{
	public class Wspack {

		public void subject(Object object, Object object2, Object object3) {
			// TODO Auto-generated method stub
			
		}
}

	public String subject(String maths,String science,String social){
	String sub;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the subject");
	sub=s1.next();
	
	if(sub.equalsIgnoreCase("maths"))
	{
	System.out.println("maths book is avialable");
	}
	else if(sub.equalsIgnoreCase("Science")){
	System.out.println("Science book is avialable");
	}
	else if(sub.equalsIgnoreCase("Social"))
	{ 
	System.out.println("Social book is avialable");
	}
	return sub;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N5_Returnvalue l1=new N5_Returnvalue();
		l1.subject(null, null, null);
	}

}
