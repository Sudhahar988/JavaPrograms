package abstraction;


public class abstractmain_learn
{
	public static void main(String args[])
	{
		phone obj=new Samsung();
		obj.run();
	}
}

	abstract class phone
	{
		public abstract void run();
	}
	class Samsung extends phone
	{
		public  void run()
		{
			System.out.println("TOUCH");
		}
	}
	
	
