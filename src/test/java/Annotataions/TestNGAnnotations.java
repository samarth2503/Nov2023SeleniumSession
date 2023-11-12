package Annotataions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeTest
	public void connectWithDb()
	{
		System.out.println("BT -- connect With DB");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC --launch browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("BM --login to app");
	}
	
	@Test(priority=1)
	public void serachTest()
	{
		System.out.println("serach Test...");
	}
	
	@Test(priority=2)
	public void serachPatient()
	{
		System.out.println("serach Patient...");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("AM --logout to app");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AC -- close browser");
	}
	
	@AfterTest
	public void DisconnectWithDb()
	{
		System.out.println("AT -- disconnect With DB");
	}

}
