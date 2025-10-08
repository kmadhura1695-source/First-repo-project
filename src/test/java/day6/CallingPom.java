package day6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingPom {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Login_ORHM_pagefactory ln=new Login_ORHM_pagefactory(driver);
		//loginORHM ln=new loginORHM(driver);
		logoutORHM lo=new logoutORHM(driver);
		
		
		ln.url();
		ln.enterUserName("Admin");
		ln.enterPassword("admin123");
		ln.clickOnLoginpage();
		lo.ClickOnProfile();
		lo.clickOnLogout();
		
	}

}
