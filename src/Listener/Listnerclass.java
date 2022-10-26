package Listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listnerclass extends TestListenerAdapter {
	
	public void onTestStart(ITestResult tr) {
		System.out.println("inside the start");
	}
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("iside the success");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("iside the Failure");
	}
	
	public void onTestSKipped(ITestResult tr) {
		System.out.println("iside the skipped");
	}

}
