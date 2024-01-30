package SeleniumSession;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	ExtentReports extent;
	WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");            // Will log all the test case irrespctive of their pass fail status     
//		ExtentSparkReporter spark1 = new ExtentSparkReporter("failed-test.html").filter().statusFilter().as(new Status [] {Status.FAIL}).apply();  // will log only failed test case
		extent.attachReporter(spark);
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Automation Reprot");
		spark.config().setReportName("ExtentReport Demo");
	}
	
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}
	
	
	
	@Test
	public void extentTest()
	{
		
		driver = new ChromeDriver();
		
		ExtentTest test = extent.createTest("Login Test").assignAuthor("Samarth").assignCategory("Smoke").assignDevice("Web");	
		test.pass(MarkupHelper.createCodeBlock("Login is successfull..", CodeLanguage.JSON));
		test.pass(MarkupHelper.createLabel("Login Test started sucessfully..",ExtentColor.RED));
		test.info(MarkupHelper.createOrderedList(Arrays.asList(new String[] {"selenium","Java","Maven"})).getMarkup());
		test.pass("Title is "+driver.getTitle());
		test.info("Current url is "+driver.getCurrentUrl());
		test.info("Page source is "+driver.getPageSource() );
		test.pass("Value entered", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotMethod()).build());
	
		
		
		ExtentTest home = extent.createTest("HomePage Test").assignAuthor("Raj").assignCategory("Regression").assignDevice("Mobile");
		home.pass("Homepage is started sucessfully...");
		home.pass("Home page conatin home link in top left corner...");
		
		
		
	}
	
	public String getScreenshotMethod()
	{
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File("image.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return System.getProperty("user.dir") + "image.png";
	}
	

}
