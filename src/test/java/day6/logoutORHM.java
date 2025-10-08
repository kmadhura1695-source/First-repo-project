package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoutORHM {
	WebDriver driver;
	public logoutORHM(WebDriver driver)
	{
		this.driver=driver;
		
	}

	//Repository

By profile=By.className("oxd-userdropdown-tab");
By logout=By.linkText("Logout");

public void ClickOnProfile()

{
	driver.findElement(profile).click();
}

public void clickOnLogout()
{
	driver.findElement(logout).click();
}

}
