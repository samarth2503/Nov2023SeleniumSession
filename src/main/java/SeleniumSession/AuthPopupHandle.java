package SeleniumSession;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopupHandle {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		String username = "admin";
		String password = "admin";
		
		Set<Cookie> cook = driver.manage().getCookies();
		
		for(Cookie c : cook)
		{
			System.out.println(c.getName() + " " + c.getValue());
		}
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Alternate Way
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

	}

}
