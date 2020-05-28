package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B1_ColorGettingprogram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub+
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://sqa.stackexchange.com/questions/12698/selenium-webdriver-detecting-element-color");
	 	String color=driver.findElement(By.xpath(".//*[@id='question-header']/h1/a")).getCssValue("color");
		System.out.println(color);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
