package SeleniumSession;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAccessRole {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		// admin, seller, supplier, distributor, vendors, customer
		// RBAC --> Role Based Access control  -- permission
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		doLogin("admin");

	}
	
	public static void doLogin(String role)
	{
		String[] cred = getCredentails(role).split(":");
		String un = cred[0];
		String pwd = cred[1];
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(un);
		
		driver.findElement(email).clear();
		driver.findElement(password).sendKeys(pwd);
	}
	
	public static String getCredentails(String role)
	{
		Map<String,String> credMap = new HashMap<String,String>();
		
		credMap.put("admin", "admin@gmail.com:admin@123");
		credMap.put("seller", "sellerg@gmail.com:seller@123");
		credMap.put("vendor", "vendor@gmail.com:admin@123");
		credMap.put("customer", "customer@gmail.com:seller@123");
		
		if(credMap.containsKey(role))
		{
			return credMap.get(role);
		}
		
		return null;
	}

}
