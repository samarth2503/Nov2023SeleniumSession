package SeleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRectMethods {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://app.hubspot.com/login");
		
		WebElement email = driver.findElement(By.id("username"));
		
		Rectangle dim = email.getRect();
		
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		System.out.println(dim.getX());
		System.out.println(dim.getY());
		System.out.println(dim.getPoint());
		
		Point p = email.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		Dimension d = email.getSize();
		
		

	}

}
