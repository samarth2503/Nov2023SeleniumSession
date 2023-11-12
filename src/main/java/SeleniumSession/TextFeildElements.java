package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFeildElements {
	
	public static WebDriver driver;

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		By textFeild = By.xpath("//input[@class=\"form-control\"]");
		
		ElementUtil el = new ElementUtil(driver);
		
		List<WebElement> formList = el.getElements(textFeild);
		
		if(formList.size() == 4)
		{
			System.out.println("All Elements are present.....");
		}
		
		
	}

}
