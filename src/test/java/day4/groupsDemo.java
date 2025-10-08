package day4;

import org.testng.annotations.Test;

public class groupsDemo {

	@Test(groups = {"mac.Smoke"})
	public void test1()
	{
		System.out.println("Test 1{\"Smoke\"}");
	}

	@Test(groups = {"Smoke","Sanity"})
	public void test2() 
	{
		System.out.println("Test 2{\"Smoke\",\"Sanity\"}");
		
	}

	@Test(groups = {"linux.Sanity"})
	public void test3()
	{
		System.out.println("Test 3{\"Sanity\"}");
		
	}

	@Test(groups = {"Regression"})
	public void test4()
	{
		System.out.println("Test 4{\"Regression\"}");
		
	}

	@Test(groups = {"Regression","Sanity"})
	public void test5()
	{
		System.out.println("Test 5{\"Regression\",\"Sanity\"}");
		
	}
	
	@Test(groups = {"Regression","Smoke"})
	public void test6()
	{
		System.out.println("Test 6{\"Regression\",\"Smoke\"}");
		
	}

	@Test(groups = {"Regression","Sanity","Smoke"})
	public void test7()
	{
		System.out.println("Test 7{\"Regression\",\"sanity\",\"Smoke\"}");
		
	}

}
