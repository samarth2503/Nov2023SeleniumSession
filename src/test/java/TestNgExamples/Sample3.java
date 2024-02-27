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

public class Sample3 {
	
	
	@Test
	public void m1()
	{
		System.out.println("Inside method m1...");
		System.out.println("Thread Id of m1 is "+Thread.currentThread().getId());
	}
	
	@Test
	public void m2()
	{

		System.out.println("Inside method m2...");
		System.out.println("Thread Id of m2 is "+Thread.currentThread().getId());
	}
	
	@Test
	public void m3()
	{
		System.out.println("Inside method m3...");
		System.out.println("Thread Id of m3 is "+Thread.currentThread().getId());
	}
	
	

}
