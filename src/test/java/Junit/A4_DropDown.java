package Junit;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class A4_DropDown {
	WebDriver driver;
	WebElement Username,password,signin,registration,FirstName,LastName,Phone,Email,Address,City,PostalCode,Country,checkbox;
	@Before
	public void beforemethod()
	{

	try
	{
	//System.setProperty("webdriver.ie.driver", "D:\\TESTING Courses_Sudhahar\\My Testing\\SOFTWARES\\WebDrivres\\chromedriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	System.out.println("Browse is Started");
	}
	catch(Exception e)
	{
	System.out.println("Browser getting some issue");
	}


	}

	@Test
	public void TestMethod(){
	try
	{

	WebDriverWait wait = new WebDriverWait(driver, 10);
	Username=driver.findElement(By.name("userName"));
	Username.sendKeys("Sudhahar");
	password=driver.findElement(By.name("password"));
	password.sendKeys("pass");
	signin=driver.findElement(By.name("login"));
	signin.click();
	registration=driver.findElement(By.linkText("registration form"));
	registration.click();	
	FirstName=driver.findElement(By.name("firstName"));
	FirstName.sendKeys("Sudhahar");
	Thread.sleep(1000);
	LastName=driver.findElement(By.name("lastName"));
	LastName.sendKeys("jagadessan");
	Thread.sleep(1000);
	Phone=driver.findElement(By.name("phone"));
	Phone.sendKeys("9585732022");
	Thread.sleep(1000);
	Email=driver.findElement(By.id("userName"));
	Email.sendKeys("sudhahar988@gmail.com");
	Address=driver.findElement(By.name("address1"));
	Address.sendKeys("Rajan Nager");
	Thread.sleep(1000);
	City=driver.findElement(By.name("city"));
	City.sendKeys("Thanjavur");
	Thread.sleep(1000);
	Country=driver.findElement(By.name("country"));
	Select sel=new Select(Country);
	sel.selectByValue("2");
	Thread.sleep(1000);
	sel.selectByValue("239");
	Thread.sleep(1000);
	sel.selectByValue("97");
	Thread.sleep(1000);
	sel.selectByIndex(12);
	Thread.sleep(1000);
	sel.selectByVisibleText("GUYANA ");
	Thread.sleep(1000);
	//address1,city,postalCode	
	
	
	//isChecked = e.findElement(By.tagName("input")).Selected;
	
	}
	catch(Exception e){
	System.out.println(e.getMessage());	
	}
	}

	@After
	public void endmethod(){
	try{
	//driver.quit();
	System.out.println("End execution");
	}
	catch(Exception e){
	System.out.println(e.getMessage());	
	}
	}

}