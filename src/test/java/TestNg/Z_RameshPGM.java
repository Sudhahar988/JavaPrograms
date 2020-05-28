package TestNg;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Z_RameshPGM {
    
    DesiredCapabilities capabilities;
    WebDriver driver;
    WebElement element;    
    boolean Status;
    int i=1;
    
    File file;
    FileInputStream inputStream;
    XSSFWorkbook InputWorkbook;
    FileOutputStream out;
    XSSFSheet InputSheet;
    Row rows;
    
    
   
@BeforeTest
    
    public void BeforeTestmethod(){
        capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability("ignoreZoomSetting", true);
    }
    
@BeforeMethod
    
    public void Beforemethod(){
//    System.setProperty("webdriver.ie.driver","F:\\workspace\\Drivers\\IEDriverServer.exe");
//    driver = new InternetExplorerDriver(capabilities);
    
    
    driver=new FirefoxDriver();
    driver.manage().window().maximize();
    }

@Test(dataProvider="datapro")
public void Testmethod1(String Username,String pwd,String excelname) throws InterruptedException{
    driver.get("https://www.facebook.com/");
    element=driver.findElement(By.name("email"));
    element.sendKeys(Username);
    element=driver.findElement(By.name("pass"));
    element.sendKeys(pwd);
    element=driver.findElement(By.xpath("//input[@id='u_0_x']"));
    element.click();
    
    Thread.sleep(20000);
    String name=driver.findElement(By.xpath("//div[@id='blueBarNAXAnchor']/div[1]/div/div/div[1]/ul/li[1]/a/span")).getText();
    System.out.println(name);
    rows=InputSheet.getRow(i);
    if(name.equalsIgnoreCase(excelname))
    {
        rows.createCell(3).setCellValue("Pass");
        i+=1;
    }
        else
    {
        rows.createCell(3).setCellValue("fail");
        i+=1;
    }
}

@AfterMethod

public void AfterMethod() throws IOException{
    driver.quit();
}


@AfterTest

public void AfterTest() throws IOException{
    out=new FileOutputStream("F:\\workspace\\Selenium\\output\\Ouputsheet.xlsx");
    InputWorkbook.write(out);
    out.close();
    InputWorkbook.close();
}

@DataProvider(name="datapro")
public Object[][] getData() throws IOException
{
    
    file=new File("F:\\workspace\\Selenium\\input\\inputsheet.xlsx");
   //Create an object of FileInputStream class to read excel file
    inputStream = new FileInputStream(file);
   //Create an object for workbook
    InputWorkbook = new XSSFWorkbook(inputStream);
   //Read sheet inside the workbook by its name
    InputSheet = InputWorkbook.getSheetAt(0);
    //Find number of rows in excel file
    int rowCount = InputSheet.getLastRowNum();
    
  //Rows - Number of times your test has to be repeated.
  //Columns - Number of parameters in test data.
    Object[][] data=new Object[rowCount][3];
    for(int row=1;row<=rowCount;row++)
    {
         rows=InputSheet.getRow(row);
           // 1st row
        data[row-1][0]=rows.getCell(0).getStringCellValue();
        data[row-1][1]=rows.getCell(1).getStringCellValue();
        data[row-1][2]=rows.getCell(2).getStringCellValue();
    
    }


        
return data;
}

}