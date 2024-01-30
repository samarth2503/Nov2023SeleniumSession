package com.ExtentReport;

import java.util.Objects;

import org.bouncycastle.crypto.digests.SparkleDigest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportdemo{
	
	private ExtentReportdemo() {}
	
	private static ExtentReports extent;
	public static ExtentTest test;
	
	public static void initReport()
	{
		if(Objects.isNull(extent))
		{
			extent = new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
			extent.attachReporter(spark);
			spark.config().setTheme(Theme.DARK);
			spark.config().setDocumentTitle("TMB Report");
			spark.config().setReportName("Youtube Traning");
		
		}
	}
	
	public static void flushReports()
	{
		if(Objects.isNull(extent))
		{
			extent.flush();
		}
	}
	
	public static void createTest(String testcaseName)
	{
		test = extent.createTest(testcaseName);
		ExtentManager.setTest(test);
	}
	
	public static void initReport1()
	{
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		extent.attachReporter(spark);
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("TMB Report");
		spark.config().setReportName("Report name");
		
	}
	
	public static void createTest1()
	{
		test=extent.createTest("method1");
		
	}
	
}