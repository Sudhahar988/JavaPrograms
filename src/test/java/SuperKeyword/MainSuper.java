package SuperKeyword;

public class MainSuper extends TestClassSuper
{
	String name;
	
	public void child()
	{
		/*super.name="Parent";
		name="child";
		System.out.println(super.name);
		System.out.println(name);*/
		
		super.parent();
		name="child";
		System.out.println(name);
		
	}
public static void main(String arg[])
{
	MainSuper obj=new MainSuper();
	obj.child();
}

}
