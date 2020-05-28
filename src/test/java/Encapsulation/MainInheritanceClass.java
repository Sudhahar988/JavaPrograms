package Encapsulation;

public class MainInheritanceClass 
{
	
	public void myclass()
	{
		System.out.println("Inheritance program pratice");
	}

	
public static void main(String args[])
{
	MainInheritanceClass obj=new MainInheritanceClass();
	obj.myclass();
	InheritanceClassA obj1=new InheritanceClassA();
	obj1.classa();
	InheritanceClassB obj2=new InheritanceClassB();
	obj2.classa();
	InheritanceClassC obj3=new InheritanceClassC();
	obj3.classa();
}
}
