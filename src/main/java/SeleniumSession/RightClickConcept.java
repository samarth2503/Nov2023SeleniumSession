package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickBtn = driver.findElement(By.className("context-menu-one"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightClickBtn).perform();
		
		List<WebElement> rightClickOpt = driver.findElements(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//li//span"));
		
		System.out.println("Total number of right optios : "+rightClickOpt.size());
		
		for(WebElement e : rightClickOpt)
		{
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}
	}

}
