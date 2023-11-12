package SeleniumDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownHandleWithoutSelectClass {
	
	// Without using select class
	
	public static WebDriver driver;
	
	public static void main(String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']/p/select/option"));
		
		for(WebElement e : options)
		{
			if(e.getText().equals("Aruba"))
			{
				e.click();
				break;
			}
		}
		
		
	}
	
	public void doSelectDropdownWithoutSelectClass(By locator, String value)
	{
		List<WebElement> options = driver.findElements(locator);
		
		for(WebElement e : options)
		{
			if(e.getText().equals(value))
			{
				e.click();
				break;
			}
		}
	}

}
