package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithList {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		
		
//		ChromeOptions op = new ChromeOptions();
//		
//		op.addArguments("--headless");
//		op.addArguments("--incognito");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb%22");
		
		driver.findElement(By.cssSelector("#input-email")).sendKeys("smarjain@deloitte.com");
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.cssSelector("#input-email")).clear();
//		
//		try {
//			
//			
//		}
//		catch(StaleElementReferenceException e)
//		{
//			e.printStackTrace();
//			driver = new ChromeDriver();
//		}
		
		driver.findElement(By.cssSelector("#input-email")).sendKeys("smarjain@deloitte.com");
		
		
		
		
	}

}
