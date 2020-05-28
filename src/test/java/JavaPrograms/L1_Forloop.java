package JavaPrograms;
import java.util.Scanner;
public class L1_Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i;
		int j;
		
		System.out.println("Enter i value:");
		String ivalue=sc.next();
		int value=Integer.parseInt(ivalue);
		for(i=5;i<value;i++);
//		
//		System.out.println("Enter j value:");
//		String jvalue=sc.next();
//		int value1=Integer.parseInt(jvalue);
//		for(j=0;j>value1;j++)
			
System.out.println("I value is:"+i);
//System.out.println("J value is:"+j);
	}

}
