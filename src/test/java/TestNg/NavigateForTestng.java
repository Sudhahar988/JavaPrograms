package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NavigateForTestng 

{
	@Test
	public void test() 
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://whoisin.in");
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://google.com");
		
		
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		driver.get("http://test.com");
		
	
	}

}
