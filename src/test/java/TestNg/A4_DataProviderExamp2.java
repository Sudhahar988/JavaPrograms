package TestNg;

import org.testng.annotations.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A4_DataProviderExamp2 {


	WebDriver driver;
	WebElement username,password,login;

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Started");
	}

	@BeforeTest
	public void beforetest()
	{
		try
		{
			driver=new FirefoxDriver();
			driver.get("http://whoisin.in/");
		}
		catch(Exception e)
		{
			System.out.println("Url is incorrect");
		}
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] obj = new Object[3][2];
		obj[0][0]="9585732022";
		obj[0][1]="SUDHA123";
		
		obj[1][0]="9585732022";
		obj[1][1]="password2";
			
		obj[2][0]="WS196";
		obj[2][1]="SUDHA123";
			
		return obj;
		
	}
	@Test(dataProvider="getData")
	public void testmethodfun(String username1,String password1)
	{
		try
		{			
			String usernameinput="LoginPanel_txtUserName_I";
			String passwordinput="LoginPanel_txtPassword_I";
			String Xpath="LoginPanel_btnLogin_CD";
				
			
			username=driver.findElement(By.id(usernameinput));
			username.clear();
			username.sendKeys(username1);
			Thread.sleep(1000);
			
			password=driver.findElement(By.id(passwordinput));
			password.clear();
			password.sendKeys(password1);
			Thread.sleep(1000);
			
			login=driver.findElement(By.id(Xpath));
			login.click();
			
		
		/*	Alert alert=driver.switchTo().alert();
			alert.accept();
			*/
		}catch(Exception e)
		{
			System.out.println("login failed");
			

		}
	}
}