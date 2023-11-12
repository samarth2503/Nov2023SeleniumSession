package SeleniumXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCss {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		// tag[attr = 'value']
		
		// id --> #{id}
		// class --> .class

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		// id --> #{id}
		By email = By.cssSelector("#username");
		
		// class -->.class
		By password = By.cssSelector(".form-control.private-form__control.login-password.m-bottom-3");
		
		// tag#id : input#username
		// tag.class : input.login-email
		// tag.class : input.c1.c2.c3    --> for multiple class
		// input.login-email#username
		// input#username.login-email
		// #username.login-email
		
		// tag[attr='value']
		driver.findElement(By.cssSelector("input[id='username']"));
		
		// tag[attr1='value'] [attr2='value']
		
		// input[id*='user']    --> equivalent to contains function
		// input[id='name'][type='email']   --> equivalent to and 
		// input[id^='name']				--> starts_with
		// input[id$='name']				--> endswith
		
		
		// parent to child
		//div[@class='private-form__input-wrapper']//input     ---> direct + indirect child element
		//div[@class='private-form__input-wrapper']/input		---> only direct child element 
		
		
		// parent to child in css
		
		// div.page div			(direct+ indirect)
		// div.page > div       (direct)
		
		By.cssSelector("input.form-control.private-form_control.login-email");
		

	}

}
