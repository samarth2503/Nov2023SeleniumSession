package com.ExtentReport;

import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentLogger {
	
	private ExtentLogger() {}
	
	public static void pass(String message)
	{
		ExtentManager.getTest().pass(message);
		ExtentManager.getTest().pass(MarkupHelper.createCodeBlock(message, CodeLanguage.JSON));
		ExtentManager.getTest().pass(MarkupHelper.createLabel(message, ExtentColor.RED));
	}
	
	public static void fail(String message)
	{
		ExtentManager.getTest().fail(message);
	}
	
	public static void skip(String message)
	{
		ExtentManager.getTest().skip(message);
	}

}
