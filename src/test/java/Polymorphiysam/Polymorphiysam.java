package Polymorphiysam;

public class Polymorphiysam
{
public void classA(int a)
{
		System.out.println(a);
}
public void clsaaA(int a,int b)
{
	
	System.out.println(a);
	System.out.println(b);
}
public static void main(String args[])
{
	
	int a=10,b=20;
	Polymorphiysam obj=new Polymorphiysam();
	obj.classA(a);
	obj.clsaaA(a, b);
	
}
}
