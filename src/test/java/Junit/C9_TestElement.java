package Junit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C9_TestElement {




	WebDriver webdriver;
	WebElement username,password,signin,link;

	@Test
	public void test()
	{
		
		try
		{
		//System.setProperty("WebDriver.ie.driver", "");
		webdriver=new FirefoxDriver();
		webdriver.get("http://newtours.demoaut.com/");

		username =webdriver.findElement(By.name("userName"));
		username.clear();
		username.sendKeys("admin");


		password =webdriver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("pass");
		//webdriver.close();
		
		signin=webdriver.findElement(By.name("login"));
		signin.click();
		
		//link=webdriver.findElement(By.linkText("mercurysignon.php?osCsid=7b99c7f31c630a26a1bdc27eb030b7db"));
		//link.click();
		
		
		}
		catch(Exception e)
		{
			System.out.println("Invalid Login");
		}
		
	}

}
