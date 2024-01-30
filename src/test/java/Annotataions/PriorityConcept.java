package Annotataions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	// For Same priority testcases the order of execution will be on basis of method name
	// Among priority and non priority based tescases, the testcases with non priority will be executed first
	
	@Test(priority=1)
	public void serachTest()
	{
		System.out.println("serach Test...");
	}
	
	@Test(priority=3)
	public void addToCartTest()
	{
		System.out.println("Add to Cart Test...");
	}
	
	@Test(priority=2)
	public void paymentTest()
	{
		System.out.println("Payment test...");
	}
	
	@Test(priority=4)
	public void a_test()
	{
		System.out.println("A Test");
	}
	
	@Test(priority=4)
	public void b_test()
	{
		System.out.println("B Test");
	}
	
	@Test()
	public void ac_test()
	{
		System.out.println("C Test");
	}
	
	@Test()
	public void acd_test()
	{
		System.out.println("D Test");
	}
	
	

}
