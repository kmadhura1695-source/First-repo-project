package practice;

import org.testng.annotations.Test;

public class testngfeatures {

	@Test
	public void login()
	{
		System.out.println("login test");
		int i=9/0;
	}

	@Test(dependsOnMethods="login")
	public void homepage()
	{
		System.out.println("homepage test");
	}

	@Test(dependsOnMethods="login")
	public void searchpage()
	{
		System.out.println("searchpage test");
	}
	
	

}
