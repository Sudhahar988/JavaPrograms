package Junit;

import org.junit.*;

public class C4_SimpleJunit {


		@Before
		
		public void Beforemethod()
		{
		System.out.println("Welcome To Junit");
		System.out.println("*********************");
		}
		
	@After
	public void Aftermethod()
	{
		System.out.println("*********************");
		System.out.println("Testing has completed");
	}


	@Test
	public void testmethod()
	{


		String Strval="Sudhahar";
		String Strval1="Chennai";
		String Result=Strval.concat(Strval1);
		System.out.println("Welcome to Selenium");
		System.out.println(Strval);
		System.out.println(Strval1);
		System.out.println(Result);
		int i;
		String[] ressplit=Result.split("h");
		for(i=0;i<ressplit.length;i++)	
		{
			System.out.println(ressplit[i]);

		}
		System.out.println(ressplit.length);




	}






}
