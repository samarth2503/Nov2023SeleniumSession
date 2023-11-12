package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.findElement(By.name("proceed")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		

	}
	
	public static Alert waitForAlertPresent()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText()
	{
		return waitForAlertPresent().getText();
	}
	
	public static void dismissAlert()
	{
		waitForAlertPresent().dismiss();
	}
	
	public static void acceptAlert()
	{
		waitForAlertPresent().accept();
	}

}
