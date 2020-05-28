package JavaPrograms;

public class N6_SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Sudha_har";
		
		String[] splitted=str.split("_");
		
		/*for(int i=0;i<splitted.length;i++)
		{
			System.out.println(splitted[i]);
		}*/
		
		for(String strValue :splitted)
		{
			System.out.println(strValue);
		}
	
	}

}
