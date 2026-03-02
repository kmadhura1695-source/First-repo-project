package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletitleTest {
	WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test
	public void googleTileTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google","title is not matched");
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
}