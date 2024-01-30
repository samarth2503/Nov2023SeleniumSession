package SeleniumSession;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://orangehrm.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Accept Cookies']")).click();
		
		Thread.sleep(3000);
		By facebookLogo = By.xpath("//div[@class='social-link']//li//a[contains(@href,'facebook')]");
		By LinkedinLogo = By.xpath("//div[@class='social-link']//li//a[contains(@href,'linkedin')]");
		By YoutubeLogo = By.xpath("//div[@class='social-link']//li//a[contains(@href,'youtube')]");
		
		wait.until(ExpectedConditions.elementToBeClickable(facebookLogo));
		driver.findElement(facebookLogo).click();
		System.out.println(driver.getTitle());
		
		wait.until(ExpectedConditions.elementToBeClickable(LinkedinLogo));
		driver.findElement(LinkedinLogo).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(YoutubeLogo));
		driver.findElement(YoutubeLogo).click();
		
		
//		driver.findElement(By.xpath("//div[@class=\"social-link\"]//a//img[@alt=\"facebook logo\"]")).click();
//		
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		
//		Iterator<String> it = windowHandles.iterator();
//		
//		String parentWindow = it.next();
//		System.out.println("Parent Window ID "+parentWindow);
//		
//		String childWindow = it.next();
//		System.out.println("Child Window ID "+childWindow);
//		
//		driver.switchTo().window(childWindow);
//		System.out.println("Child Window title is "+driver.getTitle());
//		
//		driver.close();
//	
//		driver.switchTo().window(parentWindow);
//		System.out.println("Parent Window title is "+driver.getTitle());
//	
//		driver.quit();
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		
//		System.out.println("Title is "+driver.getTitle());
		
		

	}

}
