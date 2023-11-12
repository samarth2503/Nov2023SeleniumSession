package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName)
	{
		System.out.println("BrowserName is "+browserName);
		
//		switch(browserName) {
//		
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//			
//		case "firefox":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//			
//		default:
//			System.err.println("Browser not found...."+browserName);
//			break;
//		}
//		
		return driver;
	}
	
	public void launchURL(String url)
	{
		if(url.isEmpty())
		{
			System.out.println("Url is Empty...");
			return;
		}
		driver.get(url);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
