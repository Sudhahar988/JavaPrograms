package JavaPrograms;

import java.util.Scanner;

import javax.xml.bind.ParseConversionEvent;

public class K7_ElectricityBillEx1 {


	public static void Unitcalcmethod(double units)
	{
		if(units<=100)

		{
			units=(units*1.50)+250;
			System.out.println("Your EB bill value is:"+units);
		}
		else if(units<=150)
		{
			units=(100*1.50)+((units-100)*2.50)+250;
			System.out.println(units);
		}	
		else if(units<=200)
		{
			units=(100*1.50)+((50*2.50)+((units-150)*3.50));
			System.out.println(units);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the units value:");
		String unitval=sc.nextLine();
		double u=Double.parseDouble(unitval);
		Unitcalcmethod(u);

	}
	
}



// java class to calculate and print the electricity bill to be paid by a customer.
//Assume that the customer pays a rent of Rs. 250.00 .
//Upto 100 units Rs. 1.50. For the next 100 units Rs. 2.00.
// For next 50 units Rs. 2.50. Beyond 250 units Rs. 4.00.