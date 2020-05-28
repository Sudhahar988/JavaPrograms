package Junit;

import org.junit.*;
import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class B6_LiElements {
	WebDriver driver;
	WebElement men;

	@Before
	public void beforemethod() {
		try {
			System.out.println("Before execution started");
			// System.setProperty("webdriver.chrome.driver","D:\\Testing\\selenium\\Drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
		} catch (Exception e) {
			System.out.println("Before execution failed");
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testmethod() {
		try {
			System.out.println("Test execution started");
			driver.get("http://amazon.in");
			Actions action = new Actions(driver);
			men = driver.findElement(By
					.xpath(".//*[@id='nav-link-shopall']/span[2]"));
			men.click();
			Thread.sleep(10000);
			action.moveToElement(men);
			Thread.sleep(10000);
			action.moveToElement(men)
					.moveToElement(
							driver.findElement(By
									.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[3]/span")))
					.moveToElement(
							driver.findElement(By
									.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[3]/div/a[1]/span")))
					.clickAndHold().build().perform();
			Thread.sleep(10000);
		} catch (Exception e) {
			System.out.println("Test execution failed");
			System.out.println(e.getMessage());
		}
	}
}