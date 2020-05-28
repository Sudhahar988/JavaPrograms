package JavaPrograms;

public class N9_Count {
	public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{

			String str1="chennai";

			for(int i=0;i<str1.charAt(count);i++)
			{
				count++;


			}
		}
		catch(Exception e)
		{
			//			System.out.println("Count value is"+count);
			System.out.println(e.getMessage()); // index out of range used exception handing
		}
		//		
		//		String str1="chennai";
		//		int count=0;
		//		for(int i=0;i<str1.charAt(count);i++)
		//		{
		//			count++;
		//			System.out.println(count);
		//		
		//	}

	}
}
