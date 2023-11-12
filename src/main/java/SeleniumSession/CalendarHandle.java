package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandle {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("");
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//a[text()='15']")).click();
		
		By cal = By.cssSelector(".ui-datepicker-calendar tr td a");
		selectDate(cal,"23");
		
		List<WebElement> days = driver.findElements(By.xpath(".ui-datepicker-calendar tr td a"));

	}
	
	public static void selectDate(String day,String tagName)
	{
		driver.findElement(By.xpath("//"+tagName+"[text()='"+day+"']")).click();
	}
	
	public static void selectDate(By locator,String day)
	{
		int d1 = Integer.parseInt(day);

		List<WebElement> days = driver.findElements(locator);
		
		if(d1>30)
		{
			for(WebElement d : days)
			{
				if(d.getText().equals(day))
				{
					driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
				}
			}
		}
		else{
			System.out.println("Wrong date ..."+day);
		}
		
	}
	
	

}
