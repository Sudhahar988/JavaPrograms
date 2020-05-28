package Junit;




import java.util.Scanner;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class B9_Whoisin {

	WebDriver webdriver;
	WebElement username,password,signin,reportlink,hrreport,LeaveDetails,report;
	

	@Test
	public void testclass()
	{
	try
	{
	Scanner obj=new Scanner(System.in);
	

		
	
	
	System.out.println("Enter the value for username:");
	String name=obj.next();
	String EName=name;
	
	System.out.println("Enter the password:");
	String Password=obj.next();
	String Epass=Password;	
	
	
	
	webdriver=new FirefoxDriver();
	webdriver.get("http://www.whoisin.in/");
	
	username=webdriver.findElement(By.id("LoginPanel_txtUserName_I"));
	username.clear();
	//username.sendKeys("WS196");
	
	username.sendKeys(EName);
	
	password=webdriver.findElement(By.id("LoginPanel_txtPassword_I"));
	password.clear();
	password.sendKeys(Epass);
	signin=webdriver.findElement(By.xpath("//div[@id='LoginPanel_btnLogin_CD']"));
	signin.click();
	
	report = webdriver.findElement(By.linkText("Reports"));
	report.click();
	
	
	
	//HR Reports
	//reportlink = webdriver.findElement(By.id("//a[@id='1009']"));
	//	System.out.println(reportlink.getText());

	
	hrreport = webdriver.findElement(By.linkText("HR Reports"));
	hrreport.click();

	

	hrreport = webdriver.findElement(By.linkText("Leave Details"));
	hrreport.click();
//	
//	LeaveDetails = webdriver.findElement(By.xpath("//ul[@id='nav']/li/div[3]/ul/li[3]/div[2]/ul/li[4]/a"));
//	LeaveDetails.click();
	
	
	

	}
	catch(Exception e)
	{
	System.out.println("Login Failed");
	}

	}



}