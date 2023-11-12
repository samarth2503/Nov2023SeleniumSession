package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinkWithXpath {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/?tactic_id=3419410&utm_source=google-adwords&utm_medium=FWorks-Search-India&utm_campaign=FWorks-Search-India&utm_term=freshworks&device=c&matchtype=e&network=g&gclid=Cj0KCQjwy4KqBhD0ARIsAEbCt6j48J2ZbRFHIhEHniX-nQ3N0RtbcrPUSAh-8ebKZiz3skBvgw82xwkaAk18EALw_wcB&gad_source=1");

		
		List<WebElement> footerLink = driver.findElements(By.xpath("//nav[@class='sc-662dedcb-0 fMAcTI']/div[@class='sc-6293d692-0 eNMhGa']//ul"));
				
		for(int i=0;i<footerLink.size();i++)
		{
			List<WebElement> footerLinkSub = driver.findElements(By.xpath("(//nav[@class='sc-662dedcb-0 fMAcTI']/div[@class='sc-6293d692-0 eNMhGa'])//["+i+"]/ul"));
			
			for(WebElement ele : footerLinkSub)
			{
				System.out.println(ele.getText());
			}
		}

	}

}
