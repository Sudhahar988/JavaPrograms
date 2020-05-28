package Junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class B7_LiElementsFind {
	WebDriver driver;
	WebElement waytobank,BankOnline,watching;
	@Before
	public void HDFCBankSteLaunch() throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/"); Thread.sleep(1000);
		driver.manage().window().maximize();
		System.out.println("HDFCBankSteLaunched");
	}
	@Test
	public void LITagusing() throws InterruptedException
	{

		//	Actions act=new Actions(driver);
		//	System.out.println("1");
		//	waytobank=driver.findElement(By.linkText("Ways to bank"));
		//	System.out.println("2");
		//	Thread.sleep(1000);
		//	act.moveToElement(waytobank).build().perform();  //single line click
		//
		//	act.click();

		// Moving WaytoBank

		Actions moving= new Actions(driver);
		waytobank=driver.findElement(By.cssSelector("a[href*=ways_to_bank]"));
		moving.moveToElement(waytobank).build().perform();
		Thread.sleep(1000);
		//moving.click();
		System.out.println("Cursor move to way to bank");

		// Moving BankOnline
		BankOnline=driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[4]/div[2]/div[2]/div[1]/ul/li[3]/span"));
		moving.moveToElement(BankOnline).build().perform();
		System.out.println("Cursor moving to BankOnline");

		//watching
		//watching=driver.findElement(By.cssSelector("a[href*=watchbanking]"));
		watching=driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[4]/div[2]/div[2]/div[2]/div[3]/div/ul/li/a"));
//		moving.moveToElement(watching).click().build().perform();
		Thread.sleep(1000);
		watching.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
		
	}
}