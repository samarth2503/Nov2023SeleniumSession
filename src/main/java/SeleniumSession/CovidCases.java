package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CovidCases {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.worldometers.info/coronavirus/country/india");
		
		List<WebElement> ele = driver.findElements(By.xpath("(//*[local-name()='svg' and @class='highcharts-root'])[2]"));
		
		
		Actions ac = new Actions(driver);
		
		for(WebElement e : ele)
		{
			int Topleft = ((e.getSize().getHeight())/2);
			ac.moveToElement(e).perform();
			String text = e.getText();
			System.out.println(text);
		}
		
		
		// 

	}

}
