package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	
	public static WebDriver driver;

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		By loc = By.xpath("//div[@id=\\\"SIvCob\\\"]/a");
		
		doClickLink(loc,"मराठी");
		
	}
	
	public static List<WebElement> getElements(By loc)
	{
		return driver.findElements(loc);
	}
	
	public static void doClickLink(By locator, String value)
	{
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id=\"SIvCob\"]/a"));
		
		for(WebElement links : langLinks)
		{
			String text = links.getText();
			System.out.println("Link Text is "+text);
			
			if(text.equals(value))
			{
				links.click();
				break;
			}
		}
	}

}
