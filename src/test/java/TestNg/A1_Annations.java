package TestNg;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class A1_Annations {

	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("beforeMethod");
	}
	@Test(priority=1)
	public void f() 
	{
		System.out.println("priority=1");
	}
	@Test(priority=2)
	public void f2() 
	{
		System.out.println("priority=2");
	}
	
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("AfterMethod");
	}	

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}

}
