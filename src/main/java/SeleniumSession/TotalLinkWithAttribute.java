package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinkWithAttribute {

	public static void main(String[] args) {
		
		// get total link
		// print href values of each link(having no blank text)

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		List<WebElement>link = driver.findElements(By.tagName("a"));
		
		int totalLink = link.size();
		System.out.println("Total Number of link is "+totalLink);
		
		for(int i=0;i<totalLink;i++)
		{
			String text = link.get(i).getText();
			
			if(!text.isEmpty())
			{
				String href = link.get(i).getAttribute("href");
				if(href != null || ! href.isEmpty())
				{
					System.out.println("Href is "+i+"-->"+href);
				}
				
			}
		}

	}

}
