package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {
	
	// driver.get() --> Internally call driver.navigate().to() method.
	// There is no difference between driver.get() and driver.navigate().to() method

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://google.co.in/");
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.navigate().to("https://www.amazon.in/");
		
		System.out.println("Title is "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Title is "+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Title is "+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Title is "+driver.getTitle());
		
		driver.navigate().refresh();

	}

}
