package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		// //a[contains(text(),'Chitra')]/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		//  (//a[contains(text(),'Chitra')]/parent::td/following-sibling::td/span)[position()=1]
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("samarth_25");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Sam@123");
		
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Chitra')]/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		

	}
	
	public void selectContact(String name)
	{
		String path = "//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td/input[@type='checkbox']";
		driver.findElement(By.xpath(path)).click();
	}

}
