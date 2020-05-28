package Junit;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class C3_Elementsfinding {


	@Test
	public void testmethod() {
		WebDriver driver;
		WebElement element;


		System.setProperty("webdriver.ie.driver", "C:\\Sudhahar\\Softwares\\IEDriverServer_Win32_2.45.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com/"); //Open the URL in firefox browser


		try
		{
			Thread.sleep(10000);
			element = driver.findElement(By.name("userName"));
			element.sendKeys("sudhahar");

			element = driver.findElement(By.name("password"));
			element.sendKeys("9898");
			
			

			//nameInputField = driver.findElement(By.name("username"));
			//nameInputField.getAttribute("sudhahar");

		}
		catch(Exception e)
		{
			System.out.println("login failed");
		}
	}
}
