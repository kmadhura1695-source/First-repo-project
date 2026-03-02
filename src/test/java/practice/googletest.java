package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletest {

	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test(priority=1,groups="title")
	public void googleTileTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	@Test(priority=2,groups="logo")
	public void validgoogle()
	{
		WebElement display=driver.findElement(By.id("hplogo"));
		if(display.isDisplayed())
		{
		System.out.println("The Element google is displayed");
		
	}
		else
		{
			System.out.println("Not displayed");
		}
	}
	
	@Test(priority=3,groups="link")
	public void maillinkdisplay()
	{
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=4)
	public void test1()

	{
		System.out.println("test1");
	}
	
	@Test(priority=5)
	public void test2()

	{
		System.out.println("test2");
	}
	@Test(priority=6)
	public void test3()

	{
		System.out.println("test3");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
}

