package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginORHM {
   WebDriver driver;
   
	public loginORHM(WebDriver driver)
	{
		this.driver=driver;
	}

	//Repository

	By UserNM=By.name("username");
	By pass=By.name("password");
	By login=By.xpath("//button[@type='submit']");

	public void url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	public void enterUserName(String un)
	{
		driver.findElement(UserNM).sendKeys(un);
		
	}
	
	public void enterPassword(String pw)
	{
		driver.findElement(pass).sendKeys(pw);
		
	}

	public void clickOnLoginpage()
	{
		driver.findElement(login).click();
	}
}
