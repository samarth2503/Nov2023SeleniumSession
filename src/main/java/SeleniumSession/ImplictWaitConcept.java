package SeleniumSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplictWaitConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		// Implict Wait :- dynamci wait -- globally applied for all webelement
		// 1. global wait :- Applied on all webelement
		// Whenever you are creating the WE with Fe/FEs method -- imp wait is applied
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Naveen Automation");
		

	}

}
