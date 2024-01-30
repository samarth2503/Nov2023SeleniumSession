package SeleniumSession;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesManagement {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com");
		
		// Add a New Cookies
		Cookie addCookie = new Cookie("myCookieName","myCookieValue");
		driver.manage().addCookie(addCookie);
		
		// Get all Cookies
		Set<Cookie> allCookies = driver.manage().getCookies();
		System.out.println("All Cookies : "+allCookies);
		System.out.println("Size is "+allCookies.size());
		
		// Get Cookies by specific name
		Cookie cook = driver.manage().getCookieNamed("myCookieName");
		System.out.println("Specific Cookies is : "+cook);
		
		// Delete a specific Cookie
		driver.manage().deleteCookie(cook);
		
		// Get all cookies after deleting specfic cookies
		allCookies = driver.manage().getCookies();
		System.out.println("All Cookies : "+allCookies);
		
		// Delete aLl cookies
		driver.manage().deleteAllCookies();
		
		// Get all cookies
		allCookies = driver.manage().getCookies();
		System.out.println("All Cookies : "+allCookies);
	}

}
