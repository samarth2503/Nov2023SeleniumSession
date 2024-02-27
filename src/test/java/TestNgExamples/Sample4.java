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

public class Sample4 {
	
	
	@Test
	public void m4()
	{
		System.out.println("Inside method m4...");
		System.out.println("Thread Id of m4 is "+Thread.currentThread().getId());
	}
	
	@Test
	public void m5()
	{
		System.out.println("Inside method m5...");
		System.out.println("Thread Id of m5 is "+Thread.currentThread().getId());
	}
	
	@Test
	public void m6()
	{
		System.out.println("Inside method m6...");
		System.out.println("Thread Id of m6 is "+Thread.currentThread().getId());
	}
	
	

}
