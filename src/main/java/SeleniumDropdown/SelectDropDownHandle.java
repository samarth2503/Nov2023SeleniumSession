package SeleniumDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement country = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']/p/select"));
		
		Select sel = new Select(country);
		
		sel.selectByIndex(2);

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSelectByvisisbleText(By locator, String visisbleText)
	{
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(visisbleText);
	}
	
	public static void doSelectByValue(By locator, String value)
	{
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}
	
	public static void doSelectByIndex(By locator, int index)
	{
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}

}
