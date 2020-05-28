package Junit;

//Learning Purpose:

/*//Sending F5 key  
driver.findElement(By.id("name")).sendKeys(Keys.F5);  

//Sending arrow down key   
driver.findElement(By.id("name")).sendKeys(Keys.ARROW_DOWN);  

//sending pagedown key from keyboard  
driver.findElement(By.id("name")).sendKeys(Keys.PAGE_DOWN);  

//sending space key   
driver.findElement(By.id("name")).sendKeys(Keys.SPACE);  

//sending tab key  
driver.findElement(By.id("name")).sendKeys(Keys.TAB);  

//sending alt key  
driver.findElement(By.id("name")).sendKeys(Keys.ALT); */



import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
  
public class A9_KeysUsing {  
   
WebDriver driver;  
   
@BeforeTest  
 public void start()
{  
  driver = new FirefoxDriver(); 
  driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
}
@Test  
public void sendkeysmethod(){  
  
 driver.findElement(By.name("Email")).sendKeys(Keys.F5);  
 driver.findElement(By.name("Email")).sendKeys("sudhahar988@gmail.com");  
 driver.findElement(By.name("next")).click(); 
 //driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);  
   
    }  
}  

