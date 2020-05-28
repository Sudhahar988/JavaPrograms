package Junit;


import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class C7_InternetExplorerDriverLink {

	WebDriver driver;

	@Test


	public void Testmethod()
	{

		
		WebDriver driver;
		WebElement element;
		System.setProperty("webdriver.ie.driver", "C:\\Sudhahar\\Selenium2015\\Selenium Jar and Driver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://wsportal.in:8080/dmp_uat/main.html");
		driver.quit();


	}
}
