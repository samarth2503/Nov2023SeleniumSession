package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sikuliScript {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.xpath("file-upload")).click();
		
		Pattern pt = new Pattern("");
		
		
		
		

	}

}
