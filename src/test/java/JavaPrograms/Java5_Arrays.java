package JavaPrograms;

public class Java5_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intvar={1,3,5,4,8,7,9};
		String[] strvalue={"ram","kannan"};
		char[] charvalue={'a','b','c'};

		/*for(int i=0;i<intvar.length;i++)
		{
			System.out.println("value is"+intvar[i]);

		}
		System.out.println(intvar.length);*/
		
	// New for loop :	
		for(int arrValues :intvar)
		{
			System.out.println(arrValues);
		}
	
		/*for(int j=0;j<strvalue.length;j++)
		{
			System.out.println("value is"+strvalue[j]);
		}
		System.out.println(strvalue.length);*/
	// New for loop :
		for (String arrValue :strvalue )
		{
			System.out.println(arrValue);
		}
		System.out.println(strvalue.length);
		
		/*for(int k=0;k<charvalue.length;k++)
		{
			System.out.println("value is"+charvalue[k]);
		}
		System.out.println(charvalue.length);*/
	// New for loop :
		for(char charvaluelist : charvalue )
		{
			System.out.println("value is"+charvaluelist);
		}
		System.out.println(charvalue.length);
	}

}
