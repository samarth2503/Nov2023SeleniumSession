package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaleElementWithList {
	
	public static WebDriver driver;

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--headless");
		op.addArguments("--incognito");
		
		driver = new ChromeDriver(op);
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb%22");
		
		
	}

}
