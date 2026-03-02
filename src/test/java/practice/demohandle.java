package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demohandle {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demoqa.com/browser-windows");
	}

@Test
public void handlewindow() throws InterruptedException
{
	
	
	driver.findElement(By.id("tabButton")).click();
	
	Thread.sleep(2000);
	
	Set<String> windows=driver.getWindowHandles();
	Iterator<String> itr=windows.iterator();
	String parent=itr.next();
	String child=itr.next();
	driver.switchTo().window(child);
	Thread.sleep(2000);
	String text=driver.findElement(By.id("sampleHeading")).getText();
	System.out.println("child text:"+text);
	driver.close();
	driver.switchTo().window(parent);
	
}
@AfterClass()
public void tearDown() {
	driver.quit();
}
}



