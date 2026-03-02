package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class myntrahandle {
WebDriver driver;

@BeforeClass
public void setUp()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.myntra.com/");
}

@Test()
public void windowhand()
{
	WebElement women=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div"));
	Actions act=new Actions(driver);
	act.moveToElement(women).perform();
	driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
	List<WebElement> kurtis=driver.findElements(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]"));
	System.out.println("the size are:"+kurtis.size());
	
	for(int i=0;i<3;i++)
	{
		kurtis.get(i).click();
		
	}
	


	
}
@AfterClass
public void tearDown()
{
	
}
}
