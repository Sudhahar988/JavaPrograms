package Junit;


import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
public class A3_DropDown1 {
 WebDriver driver;
 WebElement element,amount,linktext,user,pass;
 
	@Before
	public void startmethod()
	{
	try
	{
	System.out.println("Start execution");
	//System.setProperty("webdriver.chrome.driver", "D:\\TESTING Courses_Sudhahar\\My Testing\\SOFTWARES\\chromedriver.exe");
	driver=new FirefoxDriver();
	}
	catch(Exception e)
	{
	System.out.println("execution not started");
	System.out.println(e.getMessage());
	}
	}
	
	@Test
	public void testmethod()
	{
	try{
	System.out.println("testing application started");
	driver.get("https://paytm.com");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("mobileNumber")).sendKeys("9840176689");
	
	
	//element=driver.findElement(By.id("operator"));
	Thread.sleep(2000);
	
	
	amount=driver.findElement(By.id("amount"));
	amount.sendKeys("100");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id='recharge']/div[4]/button")).click();
	Thread.sleep(1000);
	
	//	driver.findElement(By.xpath("//*[@id='recharge']/div[4]/button")).click();
	
	driver.findElement(By.xpath("//*[@id='recharge']/div[4]/button")).click();
	driver.findElement(By.xpath("//*[@id='pc']/div[3]/button")).click();
//	user.findElement(By.name("username")).sendKeys("9840176689");
//	pass.findElement(By.name("password")).sendKeys("paytm@123");
//	
	}
	catch(Exception e)
	{
	System.out.println();
	
	}
	}
	@After
	public void aftermethod()
	{
	
	try{
	//driver.quit();
	    System.out.println("Execution eneded");
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	}
	
}