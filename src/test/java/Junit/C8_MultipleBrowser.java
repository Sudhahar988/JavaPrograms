package Junit;



import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class C8_MultipleBrowser {

WebDriver driver;
@BeforeMethod   /* The annotated method will be run before all tests in this suite have run */

//browser is the name of parameter that we have used in xml
@Parameters("browser")  /* this annotation is used to insert parameter in test*/
public void openBroswer(String browser){

/*Comparing the value of parameter name if this is FF then It would launch Firefox and script that would run is as follows */
if(browser.equalsIgnoreCase("FF"))
{
System.out.println("Firefox driver would be used");
driver = new FirefoxDriver();
}
else
{
System.out.println("Ie webdriver would be used");
driver = new InternetExplorerDriver();
}
}

@AfterMethod /* this annotation would run once test script execution would complete*/

public void closeBrowser()
{try{
driver.wait(15000);
}
catch(Exception e){}
driver.close();
driver.quit();
}
}



//Read more: http://www.abodeqa.com/2013/02/21/how-to-execute-selenium-webdriver-test-cases-parallel-in-multiple-browser-using-testng-parameter-annotation/#ixzz3eeiNwL79