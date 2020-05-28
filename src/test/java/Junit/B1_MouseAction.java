package Junit;

import java.awt.Desktop.Action;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B1_MouseAction {



	WebDriver driver;
	WebElement waytobank,onlinebank,emailstat;


	@Before
	public void startmethod()
	{

		System.out.println("Start execution");

		driver=new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		System.out.println("Testing the application");
		driver.get("http://www.hdfcbank.com/");
	}
	
	@Test
	public void Testmethod() throws InterruptedException

	{
		Actions act=new Actions(driver);
		System.out.println("1");
		waytobank=driver.findElement(By.linkText("Ways to bank"));
		System.out.println("2");
		Thread.sleep(1000);
		act.moveToElement(waytobank).build().perform();  //single line click
	
		act.click();
		
		
		act.moveToElement(driver.findElement(By.cssSelector("a[href*=ways_to_bank]"))); 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href*=ways_to_bank]")).sendKeys(Keys.ENTER);
		
		act.moveToElement(driver.findElement(By.cssSelector("a[href*=ways_to_bank]"))); 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href*=ways_to_bank]")).sendKeys(Keys.ENTER);
		
		
		//act.moveToElement(driver.findElement(By.cssSelector("css=html > body > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > ul > li[value=' + value + '] > div:nth-of-type(1) > div:nth-of-type(1) > div > ul > li[value=' + value + '] > span")));
		//act.click();
	//act.moveToElement(waytobank).moveToElement(driver.findElement(By.cssSelector("css=html > body > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > ul > li[value=' + value + '] > div:nth-of-type(1) > div:nth-of-type(1) > div > ul > li[value=' + value + '] > span"))).moveToElement(driver.findElement(By.cssSelector("css=html > body > div > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > ul > li[value=' + value + '] > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div > div > ul > li[value=' + value + '] > a"))).click().build().perform();
	
	System.out.println("test comleted");
	
	
	
	System.out.println("Tested");
		Thread.sleep(1000);
		
		
		
		


	}
}