package Junit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FindElements {
public static void main (String [] args){
// Open browser
	System.setProperty("webdriver.gecko.driver", "D:/test/geckodriver.exe");	
	WebDriver driver = new FirefoxDriver();
// To maximize the window
driver.manage().window().maximize();
// Open application
driver.get("https://www.softwaretestingmaterial.com/");
// Get the list of all links
List<WebElement> link = driver.findElements(By.name("Tutorials"));
// Using for loop to display the text of all the links
for(WebElement element:link)
{
System.out.println(element.getText());
}
// Click on the first link
driver.findElement(By.name("Tutorials")).click();
}
}