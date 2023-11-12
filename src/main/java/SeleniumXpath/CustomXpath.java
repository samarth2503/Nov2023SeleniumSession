package SeleniumXpath;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {
		
		// xpath --> it is not attribute
		// address of element inside the html dom.
		
		//2 types of xpath:
		//a. Absolute address - Absolute address of element
		
		//html/body/div[2]/div[1]/div[3]/ul[1]
		
		//b. Relative/ custom xpath:
		
		//htmltag[@attribute="value"]
		
		//input[@name="username"]
		//input[@class='form-control']
		
		
		// By using 2 attribute
		
		//input[@attr1='value' and @attr2='value']
		
		//input[@name="username" and  @type="text"]
		//button[@data-test-id = 'password-login-button']
		
		// Dynamic id
		// contains() in xpath --> it is only for dynamic id and value attribute
		
		//htmltag[contains(@id,'test_')]				// For htmltag whose id is dynamic eg - test_123, test_456,test_789
		//htmltag[contains(@id,'email') and @name='value']
		
		// Using * operator
		
		//input[@id='input-email']						// Efficient xpath
		// *[@id='input-email']
		
		// USing unqiue classname
		
		// form-control, priate-form__control login-email are 3 diff class and should not be used togther when we use classname
		By.className("form-control private-form__control login-email");			//--> incorrect
		
		// Valid locator we can use 3 diff class togther in xpath  
		By.xpath("//input[@classname='form-control private-form__control login-email']");
		
		By.className("login-email");								// correct
		
		// USing text()
		
		//htmltag[text()='some text']								// Equivalent to linktext and partial linktext
		
		By.xpath("//h2[text()='Some refreshing content']");
		By.xpath("//a[text()='Customers' and @href='/customers/']");
		
		By.xpath("//a[conatins(text(),'Refreshing')]");
		
		// Using index  --> Should be used for similar element 
		
		By.xpath("(//h2[text()='Register'])[2]");				// we have 2 webelement with register text 
		By.xpath("(//h2[text()='Register'])[position()=1]");		// we are using position method it is equivalent to index
		
		By.xpath("(//h2[text()='Register'])[last()]");				// Last element in Webelement
		
		//starts-with() function
		
		//input[starts-with(@id,'user')]
		//input[starts-with(text(),'Contact')]
		
		

	}

}
