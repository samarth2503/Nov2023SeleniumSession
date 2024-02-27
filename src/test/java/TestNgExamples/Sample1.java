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

public class Sample1 {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("-------------Before Suite Method-------------");
//		System.out.println("Before Suite "+ " "+"Url is "+url);
//		System.out.println("Before Suite "+ " "+"Username is "+username);
	}
	
	@BeforeTest
//	@Parameters({"class2","class1"})
	public void beforeTest()
	{
		System.out.println("-------------Before Test Method-------------");
//		System.out.println("Before Test "+ " "+"class1 "+class1);
//		System.out.println("Before Test "+ " "+"class2 "+class2);
	}
	
	@BeforeClass
//	@Parameters({"class3","class4"})
	public void beforeClass()
	{
		System.out.println("-------------Before Class Method-------------");
//		System.out.println("Before Class "+ " "+"class1 "+class1);
//		System.out.println("Before Test "+ " "+"class2 "+class2);
	}
	
	@BeforeMethod
//	@Parameters({"class2","class1"})
	public void beforeMethod()
	{
		System.out.println("-------------Before Method-------------");
//		System.out.println("Before Method..."+class1);
//		System.out.println("Before Method..."+class2);
	}
	
	@Test
	public void m1()
	{
		System.out.println("-------------Test m1-------------");
		System.out.println("Inside method m1...");
	}
	
	@Test
	public void m2()
	{
		System.out.println("-------------Test m2-------------");
		System.out.println("Inside method m2...");
	}
	
	@Test
	public void m3()
	{
		System.out.println("-------------Test m3-------------");
		System.out.println("Inside method m3...");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite Method...");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("-------------After Test Method-------------");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("-------------After Class Method-------------");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("-------------After Method-------------");
	}

}
