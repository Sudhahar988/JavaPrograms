package Inhertiance;

public class Child extends Parent {

	String name;
	
	public void Test()
	{
		super.name="Sudhahar";
		name="QAEngineer";
		System.out.println(super.name + " " + name);
	}
	
	public static void main(String args[])
	{
		Child obj=new Child();
		obj.Test();
	}
}
