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

public class DataDrivenFramework {


	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Login_ORHM_pagefactory lin=new Login_ORHM_pagefactory(driver);
		logoutORHM lout=new logoutORHM(driver);
		
		
		String filepath="D:\\TestingORHM.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("data");
		int rows=sheet.getLastRowNum();
		System.out.println("Total No of Rows:"+rows);
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell un=row.getCell(0);
			XSSFCell pw=row.getCell(1);
		
		System.out.println("Username ------>"+un+ "password------->"+pw);
		
		lin.enterUserName(un.toString());
		lin.enterPassword(pw.toString());
		lin.clickOnLoginpage();
		lout.ClickOnProfile();
		lout.clickOnLogout();
		}
	}

}
