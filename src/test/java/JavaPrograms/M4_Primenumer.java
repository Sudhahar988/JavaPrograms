package JavaPrograms;
import java.util.Scanner;
public class M4_Primenumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter upto which number prime numbers are needed");
		n=s.nextInt();
		for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(i);
		}
	}

}
