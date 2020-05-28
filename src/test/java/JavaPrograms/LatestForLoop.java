package JavaPrograms;


public class LatestForLoop {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String[] stringAry={"Sudhahar","Jagadeesan"};
		/*for(int i=0;i<stringAry.length;i++)
		{
			System.out.println("test: " + stringAry[i]);
		}*/
		for (String elemenets : stringAry)
		{
			System.out.println("test: " + elemenets);
		}
		
		int[] intValues={58,54,65,774,58};
		
		for(int Values :intValues)
		{
			System.out.println(Values);
		}
		

		
	}

}
