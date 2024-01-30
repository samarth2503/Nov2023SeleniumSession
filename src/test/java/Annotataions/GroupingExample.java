package Annotataions;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("Test1...");
	}
	
	@Test(groups= {"regression","sanity"})
	public void test2()
	{
		System.out.println("Test2...");
	}
	
	@Test(groups= {"regression"})
	public void test3()
	{
		System.out.println("Test3...");
	}

}
