package day3;//launch the data in diff browser

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {
	
	@DataProvider(name= "dataSet",parallel=true)
	public Object[][] mobileDataSet()
	{
	Object[][]	data=new Object[3][2];
	data[0][0]="iPhone";
	data[0][1]="17";
	
	data[1][0]="Oneplus";
	data[1][1]="13";
	
	data[2][0]="Oppo";
	data[2][1]="Reno 10";
	
	return data;
			}

	@Test(dataProvider = "dataSet")
	public void searchMobile(String brand,String model) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(brand+" "+model);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	
}
