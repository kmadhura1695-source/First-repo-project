package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class handletitle {
WebDriver driver;

@BeforeClass
public void Setup()

{
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://demoqa.com/browser-windows");

}

@Test
public void handle()

{
	String parent=driver.getWindowHandle();
	driver.findElement(By.id("tabButtonWrapper")).click();
	String title="This is a sample page";
	
	Set<String> win=driver.getWindowHandles();
	
	for(String h:win)
	{
		driver.switchTo().window(h);
		if(driver.getTitle().equals(title))
		{
 String text=driver.findElement(By.id("sampleHeading")).getText()	;
 System.out.println("found window"+text);
		driver.close();
		break;
		}
	}
}
}
