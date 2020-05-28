package TestNg;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A6_Facebook {


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
			driver.get("https://www.facebook.com/");
		}
		catch(Exception e)
		{
			System.out.println("Url is incorrect");
		}
	}
	
	
	@DataProvider
	public Object[][] obmethod()
	{
		
		Object[][] obj=new Object[3][2];
		obj[0][0]="email@gmail.com";
		obj[0][1]="password1";
		
		obj[1][0]="raj@gmail.com";
		obj[1][1]="password2";
		
		
		obj[2][0]="kamal@gmail.com";
		obj[2][1]="password3";
			
		
		return obj;
		
	}
	@Test
	public void testmethodfun(String username1,String password1)
	{
		try
		{
	/*		String email="email";
			String passw="pass";
			String Xpath=".//*[@id='u_0_x']";
			username=driver.findElement(By.id(email));
			username.clear();
			System.out.println("username has enter");
			username.sendKeys("9585732022");
			Thread.sleep(1000);
			password=driver.findElement(By.id(passw));
			System.out.println("password has enter");
			password.sendKeys("sudhahar");
			Thread.sleep(1000);
			login=driver.findElement(By.xpath(Xpath));
			login.click();*/

			String email="email";
			String passw="pass";
			String Xpath=".//*[@id='u_0_x']";
			username=driver.findElement(By.id(email));
			username.clear();
			System.out.println("username has enter");
			username.sendKeys("9585732022");
			Thread.sleep(1000);
			password=driver.findElement(By.id(passw));
			System.out.println("password has enter");
			password.sendKeys("sudhahar");
			Thread.sleep(1000);
			login=driver.findElement(By.xpath(Xpath));
			login.click();

			
			
		}catch(Exception e)
		{
			System.out.println("login failed");
		}
	}
}
