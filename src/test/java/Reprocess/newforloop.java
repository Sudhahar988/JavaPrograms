package Reprocess;

public class newforloop {

	public static void main(String[] args)
	{
		newforloop obj=new newforloop();
		//obj.oldForloop();
		//obj.newForloop();
		obj.newForLoopnumbers();
	}


	public void oldForloop()
	{
		int[] arr={9,2,9,4,9};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("*******************");
	}
	public void newForloop()
	{
		String[]	array={"Ram","Sudhahar"};
		for(String element :array)
		{
			System.out.println("Elemets:" + element);
		}
	}
	public void newForLoopnumbers()
	{
		int[] arr={9,5,47,45,6};
		for(int element : arr )
		{
			System.out.println("OutPut :" +element);
		}
	}

}
