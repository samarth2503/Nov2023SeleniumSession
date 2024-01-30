package SeleniumSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenURL {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		List<String> urlList = new ArrayList<String>();
		
		for(WebElement e : links)
		{
			String url = e.getAttribute("href");
			urlList.add(url);
			//brokenLink(url);
		}
		
		urlList.parallelStream().forEach(e -> brokenLink(e));

	}
	
	public static void brokenLink(String linkurl)
	{
		try {
			URL url = new URL(linkurl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.connect();
			
			if(conn.getResponseCode() >= 400)
			{
				System.out.println(linkurl + "--->" + conn.getResponseMessage() +" is a broken url....");
			}
			else {
				System.out.println(linkurl + "--->" + conn.getResponseMessage());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
