package SeleniumXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathFunction {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");

	}
	
	public static void getLinkElement(String text)
	{
		String xpath = "//a[text()='"+text+"']";
		driver.findElement(By.xpath(xpath));
	}
	
	public static WebElement getLinkElement(String tag, String text)
	{
		return driver.findElement(By.xpath("//"+tag+"[text()='"+text+"']"));
	}

}
