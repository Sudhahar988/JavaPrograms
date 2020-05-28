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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class A2_DropDown {
	WebDriver driver;
	WebElement element;

	@Before
	public void startmethod(){
		try{
			System.out.println("Start execution");

			//		to open IE bowser
			//		System.setProperty("webdriver.ie.driver","F:\\workspace\\Drivers\\IEDriverServer.exe");
			//		driver = new InternetExplorerDriver();

			//		to open chrome browser
			//System.setProperty("webdriver.chrome.driver","C:\\Sudhahar\\Selenium2015\\Selenium Jar and Driver\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver",  "D:/test/geckodriver.exe");
			driver=new FirefoxDriver();


			//	     driver = new FirefoxDriver();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void TestMethod(){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 10);
			System.out.println("Testing the application");
			driver.get("http://newtours.demoaut.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//    	Thread.sleep(10000);
			//    	element=wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userName")));
			element=driver.findElement(By.name("userName"));
			element.sendKeys("GOPI");
			element=driver.findElement(By.name("password"));
			element.sendKeys("GOPI");
			element=driver.findElement(By.name("login"));
			element.click();
			element=driver.findElement(By.xpath("(//a[contains(@href, 'mercuryregister.php')])[2]"));
			element.click();
			element=driver.findElement(By.name("country"));
			Select sel=new Select(element); 	
			sel.selectByVisibleText("BAKER ISLAND");
			Thread.sleep(1000);
			sel.selectByIndex(16);//AZERBAIJAN 
			Thread.sleep(1000);
			sel.selectByValue("22");//BOLIVIA 
			Thread.sleep(10000);
		}
		catch(Exception e){
			System.out.println(e.getMessage());	
		}
	}

	@After
	public void endmethod(){
		try{
			driver.quit();
			System.out.println("End execution");
		}
		catch(Exception e){
			System.out.println(e.getMessage());	
		}
	}

}



