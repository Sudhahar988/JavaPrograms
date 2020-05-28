package JavaPrograms;
import java.util.Scanner;
public class K1_RetailBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter Customer Name:");
        String CustomerName=sc.next();
        
        System.out.println("Enter customer Mobile number:");
        String Mobileno=sc.next();
        long iMobile=Long.parseLong(Mobileno);    
        
        System.out.println("Enter Product MRP value is:");
        String MRPvalue=sc.next();
        int iMRPvalue=Integer.parseInt(MRPvalue);
        
        System.out.println("Enter Product TAX % is:");
        String TAXvalue=sc.next();
        float iTAXvalue=Float.parseFloat(TAXvalue);
        
        
        float Taxamount=(iMRPvalue*iTAXvalue)/100;
        float Grossamount=iMRPvalue-Taxamount;
        
        
        System.out.println("Result");
        System.out.println("Customer Name is: "+CustomerName);
        System.out.println("Customer Mobile no is:"+iMobile);
        System.out.println("Product MRP Value is: "+iMRPvalue);
        System.out.println("Product Tax Percentage is: "+iTAXvalue);
        System.out.println("Bill Gross amount: "+Grossamount);
        System.out.println("Bill Tax amount: "+Taxamount);
        
        }    
        catch(NumberFormatException ex){ // handle your exception
            }
	}

}
