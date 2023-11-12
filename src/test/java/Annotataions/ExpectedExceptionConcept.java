package Annotataions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name = "Tom";
	
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void loginTest()
	{
		System.out.println("login to app....");
		int i = 9/0;									// Arithmetic Exception
		ExpectedExceptionConcept obj = null;
		System.out.println(obj.name);					// Null pointer Exception
	}

}
