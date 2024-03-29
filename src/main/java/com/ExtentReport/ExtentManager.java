package com.ExtentReport;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {
	
	private ExtentManager() {}
	
	private static ThreadLocal<ExtentTest> exTest = new ThreadLocal<ExtentTest>();
	
	public static ExtentTest getTest()
	{
		return exTest.get();
	}
	
	public static void setTest(ExtentTest test)
	{
		exTest.set(test);
	}
	

}
