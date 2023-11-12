package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {
	
	public static WebElement element;
	public static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		// Locators
		// 1. id
		driver.findElement(By.id("input-email")).sendKeys("samarthjain680@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Sam@123");
		
		WebElement element = driver.findElement(By.id("input-email"));
		
		//2. By
		
		By email = By.id("input-email");
		By password = By.id("input-passsord");
		
		WebElement emailid = driver.findElement(email);
		emailid.sendKeys("admin");
		WebElement pwd = driver.findElement(password);
		pwd.sendKeys("admin");
		
		
		//second: name
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		
		//thrid : classname (not reccomnded if class name is not unique)
		
		driver.findElement(By.className("abcs")).sendKeys("test@gmail.com");
		
		// fourth : xpath is a locator not an attribute
		
		//fifth: cssSelector : It is locator not an attribute
		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("admin");
		
		//sixth: linkText  htmltag = <a>
		driver.findElement(By.linkText("Login")).click();
		
		// seventh: partail link text htmltag = <a>
		driver.findElement(By.partialLinkText("Login")).click();
		
		//About us
		
		//eigth: tagName
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		By email1 = By.id("input-email");
		By password1 = By.id("input-password");
		
		doSendKeys(email1,"admin");
		doSendKeys(password1,"admin");
		
		

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String str)
	{
		getElement(locator).sendKeys(str);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}

}
