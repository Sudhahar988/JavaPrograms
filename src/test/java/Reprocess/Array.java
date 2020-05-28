package Reprocess;

public class Array {

	
	public void inter_Test()
	{
		int[] testArray={1,2,3,4,5};

		for(int i=0;i<testArray.length;i++)
		{
			//System.out.println(i);
			System.out.println(testArray[i]);
		}

	}
	public void string_Arr()
	{
		String[] strVal={"Ram","Sudhahar"};
		for(int j=0;j<strVal.length;j++)
		{
			System.out.println(strVal[j]);
		}
		
		/*String[] strvalue={"ram","kannan"};
		for(int j=0;j<strvalue.length;j++)
		{
			System.out.println("value is"+strvalue[j]);
		}
		System.out.println(strvalue.length);*/
		
	}
	public static void main(String args[])
	{
		Array obj=new Array();
		obj.string_Arr();
		obj.inter_Test();
		obj.char_test();
	}
	public void char_test()
	{
		char[] charvalue={'a','b','c'};
		for(int k=0;k<charvalue.length;k++)
		{
			System.out.println(charvalue[k]);
		}
	}
}
