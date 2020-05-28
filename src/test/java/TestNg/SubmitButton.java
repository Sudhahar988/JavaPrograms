package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SubmitButton
{
@Test
public void test()

{
	WebDriver driver = new FirefoxDriver();
	WebElement Button=driver.findElement(By.xpath(""));
	Button.submit();
	
	
}
}
