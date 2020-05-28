
//System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//driver = new InternetExplorerDriver();
//	 driver.get("http://199.79.63.241/appsuite/#!&app=io.ox/mail&folder=default0/INBOX"); //Open the URL in firefox browser


package Junit;



import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C6_FireFoxDriverlink {

	public static void main(String[] args)
	{
		//Run with Chrome browser
		WebDriver driver;
		//System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		driver.get("http://whoisin.in/Default.aspx");
		driver.close();
	}
	

}