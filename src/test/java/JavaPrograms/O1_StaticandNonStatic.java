package JavaPrograms;

public class O1_StaticandNonStatic {

	
	public static int a,b,var;  //static variable
	public String G; // non static 
	public static String result; // static variable used in nonstatic1
	public String city;  //Static variable used in non static method
	public int phone;
	public static void Staticmethodstaticvariable()
	{		
		a=70;
		b=15;   //Static method using static variable
		var=a+b;	
		System.out.println("**Static method using static variable**");
		System.out.println("Result value:"+var);
		//System.out.println("");
	}

	// Using static method inside of non static variable
	public static void Staticmethodnonstaticvariable()
	{
		O1_StaticandNonStatic value1=new O1_StaticandNonStatic();
		value1.G="SUDHAHAR";
		//String S=value1;

		//String result=value1;
		System.out.println("Using for non static variable");
		System.out.println(value1.G);

	}

	// Using  NON static method inside of  static variable
	public void nonstaticmethodstaticvariable()
	{
		city="chennai";
		if(city.equals(city))
		{
			System.out.println("City is chennai");
		}
		else
		{

			System.out.println("City is Mumbai");
		}
	}

	// Using  NON static method inside of NON static variable

	public void nonstaticmethodnonstaticvariable()
	{

		O1_StaticandNonStatic phoneval=new O1_StaticandNonStatic();
		phoneval.phone=958573202;
		//			int phoneno=phoneval;
		System.out.println(phoneval.phone);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staticmethodstaticvariable();  // calling from (Static method using static variable)
		Staticmethodnonstaticvariable(); //calling from (Static method using  non static variable)
		O1_StaticandNonStatic nonstaticresult=new O1_StaticandNonStatic();
		nonstaticresult.nonstaticmethodstaticvariable(); // calling form (non static method using static variable)

		O1_StaticandNonStatic nonstaticresult1=new O1_StaticandNonStatic();
		nonstaticresult1.nonstaticmethodnonstaticvariable();
		
	}

}
