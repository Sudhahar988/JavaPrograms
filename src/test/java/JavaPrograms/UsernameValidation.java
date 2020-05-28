package JavaPrograms;

import java.util.Scanner;

public class UsernameValidation

{
	public static void main(String[] args)
	{
		try
		{
			
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the username:");
		String username=sc.nextLine();
		System.out.println("Enter your password");
		String password=sc.nextLine();
		
		System.out.println(username);
		System.out.println(password);
		
		if((username.equalsIgnoreCase("admin"))&&(password.equalsIgnoreCase("pass")))
		{
			System.out.println("username is:"+username +"Password is:"+password);
		}
		else if((username.equals("Sudha"))&&(password.equals("pass")))
		{
			System.out.println("Username is :+username"+ "Password is :"+password);
			
		}else
		{
			
			System.out.println("user name & password is incorrect");
	
		}}
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}
	}
	

}
