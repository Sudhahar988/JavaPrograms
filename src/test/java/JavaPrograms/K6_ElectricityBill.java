package JavaPrograms;
import java.io.*;
public class K6_ElectricityBill {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		System.out.print("Enter Your Name : ");
		String nm=br.readLine();

		System.out.print("Enter the units consumed : ");
		int units=Integer.parseInt(br.readLine());

		double charges=0,fbill=0;

		if(units<=100)
			charges=units*1.50;
		else if(units<=200)
			charges=(100*1.50)+(units-100)*2;
		else if(units<=250)
			charges=(100*1.50)+(100*2)+(units-200)*2.50;
		else
			charges=(100*1.50)+(100*2)+(50*2.50)+(units-250)*4;

		fbill=charges+250;
		System.out.print("\f");
		//printing the bill
		System.out.println("Your Electricity Bill");
		System.out.println("*********************");
		System.out.println();
		System.out.println("Costumers Name : "+nm);
		System.out.println("Units Consumed : "+units);
		System.out.println("Charges : "+charges);
		System.out.println("Rent Charges : 250 Rs.");
		System.out.println("Total Bill : "+fbill);
	}
}