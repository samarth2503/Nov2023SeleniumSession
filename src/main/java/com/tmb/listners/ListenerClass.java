package com.tmb.listners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ExtentReport.ExtentLogger;
import com.ExtentReport.ExtentReportdemo;

public class ListenerClass implements ITestListener, ISuiteListener {

	public void onTestStart(ITestResult result)
	{
		ExtentReportdemo.createTest(result.getMethod().getMethodName());
		
	}

	/**
	 * Invoked each time a test succeeds.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#SUCCESS
	 */
	public void onTestSuccess(ITestResult result) {
		
		ExtentLogger.pass("Test is passed "+result.getMethod().getMethodName());

	}

	/**
	 * Invoked each time a test fails.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#FAILURE
	 */
	public void onTestFailure(ITestResult result) {

	}

	/**
	 * Invoked each time a test is skipped.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#SKIP
	 */
	public void onTestSkipped(ITestResult result) {
		
		

	}

	/**
	 * Invoked each time a method fails but has been annotated with
	 * successPercentage and this failure still keeps it within the success
	 * percentage requested.
	 *
	 * @param result <code>ITestResult</code> containing information about the run
	 *               test
	 * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	 */
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	/**
	 * Invoked after the test class is instantiated and before any configuration
	 * method is called.
	 */
	public void onStart(ITestContext context) {
		ExtentReportdemo.initReport();
	}

	/**
	 * Invoked after all the tests have run and all their Configuration methods have
	 * been called.
	 */
	public void onFinish(ITestContext context) {
		
		ExtentReportdemo.flushReports();
		

	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

}
