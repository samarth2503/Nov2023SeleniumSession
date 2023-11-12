package SeleniumSession;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(driver.findElement(By.className("menulink"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	// 1 time clicking
	public static void doMoveToElement(By locator)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}
	
	// 2 times clicking
	public static void doMoveToElement(By locator1,By locator2)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator1)).perform();
		act.moveToElement(getElement(locator2)).click();
	}
	
	// 3times clicking
	public static void doMoveToElement(By locator1,By locator2,By locator3)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator1)).perform();
		act.moveToElement(getElement(locator2)).perform();
		act.moveToElement(getElement(locator3)).click();
	}
	
	public static void doActionClick(By locator)
	{
		Actions ac = new Actions(driver);
		ac.click(driver.findElement(locator)).perform();
	}
	
	public static void doActionsendKeys(By locator,String value)
	{
		Actions ac = new Actions(driver);
		ac.sendKeys(driver.findElement(locator), value);
	}


}
