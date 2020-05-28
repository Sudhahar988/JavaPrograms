package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FindLastCountryinDropDownlist {
	WebDriver driver;
	WebElement iframeElement,drop_down;

	@Test
	public void test() throws InterruptedException
	{
		System.out.println("Findind For last Country");


		System.setProperty("webdriver.ie.driver", "C:\\Users\\sudhaharj\\Downloads\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://www.mercurytravels.co.in/Register");

		drop_down =driver.findElement(By.id("registration:searchPageBody:personal:countryId"));
		Select se = new Select(drop_down);
		int i=0;
		for(i=0 ;i<se.getOptions().size(); i++)
		{

		}
		se.selectByIndex(i-1);	


	}
}