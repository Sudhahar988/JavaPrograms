package Junit;

import org.junit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C2_ElementfindingusingIe {

	
	
	
	@Test
	
	public void Testmethod()
	{
	WebDriver webdrive;
	WebElement username,password,signin;
	
	
	try
	{
	//System.setProperty("WebDriver.ie.driver", "");
		webdrive=new FirefoxDriver();
		webdrive.get("http://whoisin.in/");

	username =webdrive.findElement(By.id("LoginPanel_txtUserName_I"));
	username.clear();
	username.sendKeys("admin");


	password =webdrive.findElement(By.name("LoginPanel$txtPassword"));
	password.clear();
	password.sendKeys("pass");
	//webdriver.close();
//	
//	signin=webdrive.findElement(By.xpath("//div[@id='LoginPanel_btnLogin_CD']/span"));
//	signin.click();
	
	
	signin=webdrive.findElement(By.xpath("/html/body/form/div[3]/table[1]/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td/input"));
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
