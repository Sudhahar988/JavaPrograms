package JavaPrograms;

public class L8_WhileCheck {
	
	
	public static void whilemethod()
	{
		int i=10;
		System.out.println("While Value display");
		try
		{
			while(i<=20)
			{
				
				System.out.println(i);
				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println("value is not match");
		}
		
	}
	
	public static void dowhilemethod()
	{
		System.out.println("DOWhile Value display");
		int j=6;
		do
		{
			System.out.println(j);
			j++;
		}
		while(j<10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//whilemethod();
		dowhilemethod();
	}

}
