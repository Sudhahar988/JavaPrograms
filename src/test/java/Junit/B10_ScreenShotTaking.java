package Junit;



import java.io.File;  
import java.io.IOException;  
import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.By;  
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
  
public class B10_ScreenShotTaking {  
   
   WebDriver driver;  
   
 @BeforeTest  
 public void start(){  
  driver = new FirefoxDriver();  
 }  
   
 @Test  
 public void Test() throws IOException{  
 try{  
  driver.get("https://mail.google.com/");  
  driver.findElement(By.id("link-signup")).click();  
  driver.findElement(By.name("FirstName")).sendKeys("First Name");  
  driver.findElement(By.name("LastName")).sendKeys("Last Name");  
  driver.findElement(By.name("GmailAddress1")).sendKeys("GmailAddress@gmail.com");  
    
 }catch(Exception e){  
  //Takes the screenshot  when test fails  
     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
     FileUtils.copyFile(scrFile, new File("C:\\Users\\Public\\Pictures\\failure.png"));  
     
  }  
 }  
}