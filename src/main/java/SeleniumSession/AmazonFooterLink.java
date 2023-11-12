package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooterLink {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=14579995609569434893&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062220&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		
		List<WebElement> footerList = driver.findElements(By.xpath("//div[@class=\"navFooterLinkCol navAccessibility\"]//a"));
		
		for(WebElement footer: footerList)
		{
			String text = footer.getText();
			String url = footer.getAttribute("href");
			
			System.out.println(text+"--->"+url);
		}
		
		

	}

}
