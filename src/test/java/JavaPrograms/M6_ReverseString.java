package JavaPrograms;

public class M6_ReverseString {
	public static void main(String[] args)
	{
		
		
		String str="sudhahar";
		System.out.println(str);
		str = new StringBuffer(str).reverse().toString();
	       
	    System.out.println("Reversed String : " + str);
	    
	    //second way:
	    
	    String S= "Hello World";
	    String[] SP = S.split(" ");


	    for(int i=SP.length-1;i>=0;i--)
	    //for (int i=0;i<=SP.length+1;i++)
	    {
	    System.out.println(SP[i]);
	    }
	    }
		
		
	

}
