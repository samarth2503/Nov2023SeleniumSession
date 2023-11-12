package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is "+pageTitle);
		
		if(pageTitle.equals("Google"))
		{
			System.out.println("Title is correct...");
		}
		else {
			System.out.println("Title is incorrect...");
		}
		
		System.out.println("Current Url is "+driver.getCurrentUrl());
		
		System.out.println("Page Source is "+driver.getPageSource());

	}

}
