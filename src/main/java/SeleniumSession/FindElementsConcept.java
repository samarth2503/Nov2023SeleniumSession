package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		// Link count - Total links on page
		// Ignore blank text
		
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb%22");
		
		List<WebElement> linksCount = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Links : "+linksCount.size());
		
		for(WebElement l : linksCount)
		{
			System.out.println("Link Text is "+l.getText());
		}
		
		for(int i=0;i<linksCount.size();i++)
		{
			String text = linksCount.get(i).getText();
			
			if(!text.isEmpty()) {
				System.out.println(i+"--->"+text);
			}
			
		}
				

	}

}
