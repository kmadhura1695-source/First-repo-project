package day7;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day6.Login_ORHM_pagefactory;
import day6.logoutORHM;

public class KeywordDriven {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Login_ORHM_pagefactory lin=new Login_ORHM_pagefactory(driver);
		logoutORHM lout=new logoutORHM(driver);                        
		
		
		
		
		
		
		
		
		String filepath="D:\\TestingORHM.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Keyword");
		int rows=sheet.getLastRowNum();
		System.out.println("Total No of Rows:"+rows);
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell key=row.getCell(1);
			System.out.println("Keyword------->"+key);		
		
			switch(key.toString())
			{
			case "url" :
				lin.url();
				System.out.println("URL Keyword is matching");
			break;
			
			case "enterUseerName" : 
				lin.enterUserName("Admin");
				System.out.println("enterUserName Keyword is matching");
				break;
			
			case "enterPassword" :
				lin.enterPassword("admin123");
				System.out.println("enterPassword Keyword is matching");
			break;
			
			case "clickOnLoginpage()":
				lin.clickOnLoginpage();
				System.out.println("clickOnLoginpage Keyword is matching");
			break;
			
			case "clickOnprofile":
				lout.ClickOnProfile();
				System.out.println("ClickOnProfile Keyword is matching");
				break;
			
			case "clickOnLogout":
				lout.clickOnLogout();
				System.out.println("clickOnLogout Keyword is matching");
				break;
				
				default:System.out.println("Invalid Keyword");
			
			}
		
}
		fis.close();
}	
}


		