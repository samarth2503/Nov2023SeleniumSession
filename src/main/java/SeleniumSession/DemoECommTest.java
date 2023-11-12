package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoECommTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.launchBrowser("chrome");
		br.launchURL("https://demo.opencart.com/index.php?route=account/login&language=en-gb%22");
		
		ElementUtil el = new ElementUtil(driver);
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		el.doSendKeys(email, "admin");
		el.doSendKeys(password, "admin");

	}

}
