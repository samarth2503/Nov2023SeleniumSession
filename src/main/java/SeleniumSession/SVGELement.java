package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGELement {

	public static void main(String[] args) throws InterruptedException {
		
		//*[name()='svg']//*[local-name='circle']
		//*[name()='svg']//*[local-name()='text' and @id='pointline'] 
		//*[name()='svg']//*[local-name()='text' and @id='g2']//*[local-name()='path' and contains(@id,'face')]
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/alerts-map/#/");
		
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		List<WebElement> country = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']//*[name()='g']//*[name()='path']"));
		
		for(WebElement e : country)
		{
			Actions ac = new Actions(driver);
			
			ac.moveToElement(e).perform();
			String count = e.getAttribute("name");
			
			System.out.println(count);
			
			if(count.equals("TEXAS"))
			{
				ac.click(e).perform();
				break;
			}
			
			
		}

	}

}
