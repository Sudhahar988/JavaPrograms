package JavaPrograms;

public class PalindromeString 

{

	

	public void reverseandpalidrome()
	{
		String str="madamer";	

		String reverse=new StringBuffer(str).reverse().toString();

		System.out.println(reverse);

		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println("This is palindrome String");
		}
		else
		{
			System.out.println("This is not a palindrome String");
		}


	}
	

	public void count()
	{
		String countval="thisisnotgood4567890";
		int i=0;
		for(i=0;i<=countval.length();i++)
		{
		
		}		System.out.println(i-1);

	}
	
	public void vowels()
	{
		String vs="Chennai";
		for(int i=0;i<vs.length();i++)
		{
			if((vs.charAt(i)=='a')|| (vs.charAt(i)=='e') ||(vs.charAt(i)=='i')||(vs.charAt(i)=='o') ||(vs.charAt(i)=='u'))
					
			{
				System.out.println(vs.charAt(i));
			}
		}}
	
	public static void main(String args[])
	{
		System.out.println("***********************");
		PalindromeString obj=new PalindromeString();
		obj.count();
		System.out.println("***********************");
		obj.reverseandpalidrome();
		System.out.println("***********************");
		obj.vowels();
		System.out.println("***********************");
	}

}
