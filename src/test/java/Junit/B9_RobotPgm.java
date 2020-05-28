package Junit;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.List;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


	
 
@SuppressWarnings("unused")
public class B9_RobotPgm {
 
 @Test
 public void TestRobo()throws Exception
 {
  // Open Firefox
  WebDriver driver=new FirefoxDriver();
                
  // Maximize the window
  driver.manage().window().maximize();
 
  // Open facebook
  driver.get("http://www.facebook.com");
 
  // Enter Username
  driver.findElement(By.id("email")).sendKeys("9585732022");
 
  // Enter password
  driver.findElement(By.id("pass")).sendKeys("sudha");
 
  // Create object of Robot class
  Robot r=new Robot();
 
   // Press Enter
   r.keyPress(KeyEvent.VK_ENTER);
 
   // Release Enter
   r.keyRelease(KeyEvent.VK_ENTER);
   
   driver.close();
                  
}
 
}