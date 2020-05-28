package Junit;



import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class B9_Whoisin1 {
	

 
  public static void main(String args[]) throws Exception {

	WebDriver webdriver;
	
webdriver=new FirefoxDriver();
//webdriver.get("http://whoisin.in/");
	 
	 ///download/
	 
	 
    
webdriver.get("http://www.seleniumhq.org/");
  //  WebElement element = webdriver.findElement(By.xpath("/html/body[@class='home blog gecko']/div[@id='wrapper']/div[@id='bottom']/div[1]/a[@class='ext-link']"));
    
//WebElement element = webdriver.findElement(By.id("q"));
//element.sendKeys("Download");
//
//
//
//WebElement submit = webdriver.findElement(By.id("submit"));
//submit.click();


//WebElement submit=webdriver.findElement(By.linkText("View Profile")).click();


WebElement element = webdriver.findElement(By.linkText("Download"));
element.click();
    webdriver.quit();
    
    
    //submit
  }

}

