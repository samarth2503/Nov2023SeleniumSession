package SeleniumSession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		// Explict wait: dynamic wait
		// WebdriverWait extends FluentWait
		// FluentWait
		
		// can be applied for any WebElement whenever its needed.
		// can be applied for non WebElement also:alert, title of page, url of page
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		By email = By.id("input-email");
		
		// Does not necessarily means that element is visible. 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.numberOfElementsToBe(email, 1));
		wait.until(ExpectedConditions.numberOfElementsToBeLessThan(email, 2));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(email, 1));
		wait.until(ExpectedConditions.numberOfWindowsToBe(4));
		
		
		// TimeOut exception: Expected condition failed
		// Waiting for presence od element located by: By.id: input-email11
		// (tried for 10 seconds with 500 milliseconds interval)
		

	}
	
	// Check only the presence of element in DOM doesn't neccesarly mean element is visible
	public static WebElement waitForPresenceELement(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static Alert waitForAlertIsPresent(By locator,int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String waitForTitleContains(String title,int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(timeOut));
		wait.until(ExpectedConditions.titleIs(title));	
		return driver.getTitle();
		
	}
	
	public static boolean waitFortitleContains(int timeOut,String title)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(timeOut));
		return wait.until(ExpectedConditions.titleContains(title));
	}
	
	// Not only visible but element having height and width greater than 0
	public static List<WebElement> waitForVisibleOfElement(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static List<WebElement> waitForVisibleElement(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static void waitForElementToClick(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(timeOut));
		WebElement ele = driver.findElement(locator);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static void waitForSelectionState(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(timeOut));
		wait.until(ExpectedConditions.elementSelectionStateToBe(locator, true));
		
	}
	
	// Wait for checking whether the given frame is available to switch to. If the frame is available it switches the given driver to the specified frame.
	public static WebDriver waitForFrameToBeAvailable(int timeOut,By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(timeOut));
		return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}
	
	// Checking if the given text is present in the specified element.
	public static void waitForTextTobe(int timeOut, By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(timeOut));
		WebElement ele = driver.findElement(locator);
		wait.until(ExpectedConditions.textToBePresentInElement(ele, "Text"));
	}
	
	
	
	

}
