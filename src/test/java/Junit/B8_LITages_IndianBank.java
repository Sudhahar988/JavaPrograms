package Junit;


import java.awt.Desktop.Action;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.interactions.Mouse;


public class B8_LITages_IndianBank {


	WebDriver webdriver;
	WebElement homepage,Deposits,Termdeposit,headoffice;
	@Before
	public void browserfind()
	{
		System.out.println("Browser Started...");
		//System.setProperty("webdriver.ie.driver", "C://InternetExplorer");
		webdriver=new FirefoxDriver();
		webdriver.get("http://www.indian-bank.com/");
		System.out.println("URL opened");

	}
	@Test
	public void indianbanksite() throws InterruptedException
	{
		homepage=webdriver.findElement(By.linkText("Enter Indian Bank Home Page >>"));
		homepage.click();
		System.out.println("home page entered");
		Deposits=webdriver.findElement(By.xpath(".//*[@id='Menubar1']/li[4]/a"));
		Actions act=new Actions(webdriver);
		act.moveToElement(Deposits).clickAndHold().build().perform();
		//Thread.sleep(1000);
		System.out.println("email goes....mouse");
		
		
		Termdeposit=webdriver.findElement(By.xpath(".//*[@id='Menubar1']/li[4]/ul/li[3]/a"));
		act.moveToElement(Termdeposit).clickAndHold().build().perform();;
		System.out.println("wait");
//		
//		headoffice=webdriver.findElement(By.xpath(".//*[@id='Menubar1']/li[8]/ul/li[5]/ul/li[1]/a"));
//		act.moveToElement(headoffice).clickAndHold().build().perform();
//		System.out.println("1");
	}
}
