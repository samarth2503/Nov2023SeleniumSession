package SeleniumSession;

import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		By username = By.id("username");
		
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class);
		
		WebElement username_ele = w.until(ExpectedConditions.presenceOfElementLocated(username));
		
		username_ele.sendKeys("samarth_25");
		waitForElementWithFluentWait(username,10,2);
	}
	
	public static WebElement waitForElementWithFluentWait(By locator, int timeout, int pollingTime)
	{
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class)
				.ignoring(NoSuchAlgorithmException.class);
		
		return w.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

}
