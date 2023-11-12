package SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://orangehrm.com/");
		
		driver.findElement(By.xpath("//div[@class=\"social-link\"]//a//img[@alt=\"facebook logo\"]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		
		String parentWindow = it.next();
		System.out.println("Parent Window ID "+parentWindow);
		
		String childWindow = it.next();
		System.out.println("Child Window ID "+childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println("Child Window title is "+driver.getTitle());
		
		driver.close();
	
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window title is "+driver.getTitle());
	
		driver.quit();
		
		// 

	}

}
