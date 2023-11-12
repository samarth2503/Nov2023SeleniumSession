package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb%22");
		
		WebElement username = driver.findElement(By.id("input-email"));
		username.sendKeys("naveen");
		
		driver.navigate().refresh();
		
		//username = driver.findElement(By.id("input-email"));    // SeleniumSession.StaleElementRefException
		username.sendKeys("tom@gmail.com");

	}

}
