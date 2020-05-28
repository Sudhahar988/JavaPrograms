package Junit;
import java.sql.Driver;
import java.util.List;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A7_RadioAndDropAndCheckbox {
	static WebDriver webdriver;
	static WebElement dropdown;
	static List<WebElement>  radiobutton;
	WebElement checkbox;
	WebElement alert;
	@Before
	public void beforemethod()
	{
	//System.setProperty("webdriver.ie.driver", "C:/");
	
		System.out.println("Browser Started");
		webdriver=new FirefoxDriver();
	webdriver.get("http://chennaicorporation.gov.in/online-civic-services/birthCertificate.do?do=show");
	
	}
	
	public static void radiobutton() throws InterruptedException
	{
	radiobutton=webdriver.findElements(By.xpath("//input[@type='Radiobutton']"));
	radiobutton.get(1).click();
	Thread.sleep(1000);
	radiobutton.get(2).click();
	Thread.sleep(1000);
	radiobutton.get(4).click();
	Thread.sleep(1000);
	System.out.println("Radio Button sucessfully tested");
	}

	public static void dropdown() throws InterruptedException
	{
dropdown=webdriver.findElement(By.name("sel_day"));
	Select sel=new Select(dropdown);
	sel.selectByIndex(9);
	Thread.sleep(1000);
//	sel.selectByValue(null);
//	Thread.sleep(1000);
//	sel.selectByVisibleText("Thanjavur");
//	Thread.sleep(1000);
	}
	
	
	
	@Test
	public void testmenthod() throws InterruptedException 
	{
		radiobutton();
		dropdown();
	}
	
}