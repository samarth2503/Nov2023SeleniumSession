package SeleniumSession;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions ac = new Actions(driver);
		
//		ac.sendKeys(Keys.BACK_SPACE).perform();
//		Thread.sleep(3000);
		
		ac.keyDown(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		
//		ac.keyUp(Keys.ADD).perform();
//		Thread.sleep(3000);
//		
		

	}

}
