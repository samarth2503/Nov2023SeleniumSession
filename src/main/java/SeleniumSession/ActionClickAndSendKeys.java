package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickAndSendKeys {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		//System.out.println(System.getProperty("user.dir"));

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb%22");
		
		By email = By.id("input-email");
		By loginLink = By.partialLinkText("Register");
		
		Actions ac = new Actions(driver);
		
		ac.sendKeys(driver.findElement(email), "naveen@gmail.com").perform();				// If we don't use perform then action won't be performed
		
		ac.click(driver.findElement(loginLink)).perform();
		
	}

}
