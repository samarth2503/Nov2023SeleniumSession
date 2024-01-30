package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPickUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.goibibo.com/");
//		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//span[text()='Departure']/parent::div[@class='sc-12foipm-16 wRKJm fswFld ']")).click();
		
		String cal = "March 2023";
		
		String month = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption' and @role='heading']/div)[1]")).getText();
		
		while(!month.equalsIgnoreCase(cal))
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		
		driver.findElement(By.xpath("(//div[@class='DayPicker-Body']//div//p[text()='21'])[1]")).click();
		
		

	}

}
