package SeleniumSession;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWithStreams {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		// amazon --> fetch all links --> List<WebElement>
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		
		System.out.println(ele.size());
		
		// sequence stream
		ele.stream().forEach(e -> System.out.println(e.getText()));
		
		// Parallel stream
		ele.parallelStream().forEach(e -> System.out.println(e.getText()));
		
		List<String> l1 =ele.stream()
		.filter(e ->!e.getText().isEmpty())
		.map(e -> e.getText())
		.collect(Collectors.toList());
		

	}

}
