package TestNgExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo {
	
	@Test(dataProvider="dataSupplier")
	public void sampleTest(String a)
	{
		System.out.println(a);
	}
	
	@DataProvider(indices= {0,3})
	public Object[] dataSupplier()
	{
		Object[] data = {"Arun","Varun","Tharun","Kishore","Ravi","Gopal"};
		return data;
	}

}
