package day5;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnertestmethods implements ITestListener {
	public void onTestStart(ITestResult result) {
	   System.out.println("Now the test Method Execution started:"+result.getName());
	  }

	public void onTestSuccess(ITestResult result) {
	    System.out.println("Testmethod is passed:" +result.getName());
	  }

	public void onTestFailure(ITestResult result) {
	   System.out.println("Test method is failed:" +result.getName());
	  }

	public void onTestSkipped(ITestResult result) {
	   System.out.println("Test method is skipped:" +result.getName());
	  }

	  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    
	  }

	  
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	public void onStart(ITestContext context) {
	 System.out.println("Now Execution started");
	  }

	  
	public void onFinish(ITestContext context) {
		System.out.println("Now Execution Completed");
	  }
	}

	
	


