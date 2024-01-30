package SeleniumDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownOptionvalueWithText {
	
	
	// Without using selectByVisisbleText, selectByValue, selectByIndex	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement country = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']/p/select/option"));
		Dimension d = country.getSize();
		System.out.println(d.getHeight() + "  "+ d.getWidth());
		
		
		Select sel = new Select(country);
		
		List<WebElement> indusOption = sel.getOptions();
		
		System.out.println(indusOption.size());
		
		for(WebElement e : indusOption)
		{
			if(e.getText().equals("India"))
			{
				e.click();
				break;
			}
		}

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSelectOptionByText(By locator)
	{
		Select sel = new Select(getElement(locator));
		
		List<WebElement> indusOption = sel.getOptions();
		
		System.out.println(indusOption.size());
		
		for(WebElement e : indusOption)
		{
			if(e.getText().equals("India"))
			{
				e.click();
				break;
			}
		}
	}

}
