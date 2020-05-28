package Junit;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FindElement {
public static void main (String [] args){
// Open browser
	System.setProperty("webdriver.gecko.driver", "D:/test/geckodriver.exe");	
WebDriver driver = new FirefoxDriver();
// To maximize the window
driver.manage().window().maximize();
// Open Application
driver.get("https://www.softwaretestingmaterial.com/");
// Get text of a particular link
String xpathvaltest="Tutorials";
String FindElement = driver.findElement(By.name("xpathvaltest")).getText();
// Print the value of the link
System.out.println(FindElement);
// Click on the link
driver.findElement(By.name("xpathvaltest")).click();
}
}