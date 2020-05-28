package JavaPrograms;

public class M3_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j=0-1;
		int k=1;

		System.out.println("Fibonacci value:");
		System.out.println("Values:"+"\t"+i+"\t"+j+ "\t");
		System.out.println();
		for (i=0;i<=5;i++)
		{
		i=j;
		j=k;
		k=i+j;
		System.out.println(k);
		}

	}

}





