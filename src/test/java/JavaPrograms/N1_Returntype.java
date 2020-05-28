package JavaPrograms;

public class N1_Returntype {

	public int sum()
	{

		int a=10;
		int b=15;
		int c=a+b;
	return c;
	}
	
	public double sum1()
	{
		double d=5;
		double e=10;
	 double f=d*e;
	 return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		N1_Returntype obj1=new N1_Returntype();
		obj1.sum();
		N1_Returntype obj2=new N1_Returntype();
		
		obj2.sum1();
		int sumval=obj1.sum();
		System.out.println(sumval);
double sumval2=obj2.sum1();
		System.out.println(sumval2);

	}

}
