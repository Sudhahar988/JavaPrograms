package JavaPrograms;

public class O5_Constructor
{
	
	public O5_Constructor()
	{
	System.out.println("I'm a Constructor");
	
	}
	
	public void function1()
	{
		System.out.println("value of function1");
	}
	public void function2()
	{
		System.out.println("value of function2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		O5_Constructor obj1=new O5_Constructor();
		obj1.function1();
		O5_Constructor obj2=new O5_Constructor();
		obj2.function2();
	
		
		
//		System.out.println("welcome to java program");
		
	}

	

}
