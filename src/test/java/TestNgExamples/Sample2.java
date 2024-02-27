package TestNgExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample2 {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("-------------Inside BeforeSuite-------------");
		
	}
	
	@BeforeTest
//	@Parameters({"class3","class4"})
	public void beforeTest()
	{
		System.out.println("-------------Inside BeforeTest-------------");
//		System.out.println("Inside Before Test "+class1);
//		System.out.println("Inside Before Test "+class2);
	}
	
	@BeforeClass
	@Parameters({"class3","class4"})
	public void beforeClass(String class1, String class2)
	{
		System.out.println("-------------Inside Before class-------------");
		System.out.println("Inside Before Class "+class1);
		System.out.println("Inside Before Class "+class2);
	}
	
	@BeforeMethod
	@Parameters({"class3","class4"})
	public void beforeMethod(String class1, String class2)
	{
		System.out.println("-------------Inside BeforeMethod-------------");
		System.out.println("Inside Before Method "+class1);
		System.out.println("Inside Before Method "+class2);
	}
	
	@Test
	@Parameters({"class3","class4"})
	public void m4(String class1, String class2)
	{
		System.out.println("-------------Inside method-------------");
		System.out.println("Inside Test Method "+class1);
		System.out.println("Inside Test Method "+class2);
	}
	
	@Test
	public void m5()
	{
		System.out.println("-------------Test M5-------------");
	}
	
	@Test
	public void m6()
	{
		System.out.println("-------------Test M6-------------");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("-------------After Suite-------------");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("-------------After Test-------------");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("-------------After Class-------------");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("-------------After Method-------------");
	}

}
