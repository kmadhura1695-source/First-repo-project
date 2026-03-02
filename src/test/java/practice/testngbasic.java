package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasic {
@BeforeSuite
public void setup()
{
	System.out.println("Setup sys property");


}
	@BeforeClass
	public void launchbrowser()
	{
		System.out.println("launch the browser");	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("enter URL");
	}
	
	@BeforeTest()
	public void login()
	{
		
		
	}
	
	@Test()
	public void googletitle()
	{
		System.out.println("google title text");
	}
	
	@AfterMethod()
	public void logout()
	{
		System.out.println("Logout from app");
	}

	@AfterTest()
	public void deleteallcookies()
	{
		System.out.println("delete all cookies");
		}
	
	@AfterClass()
public void closebrowser()
{
		System.out.println("close browser");
}
	@AfterSuite()
	public void generatereport()
	{
		System.out.println("report genrated");
	}
}
