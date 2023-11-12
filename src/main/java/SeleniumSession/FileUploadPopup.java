package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	
	public static WebDriver driver;

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		// To upload file type should be file
		WebElement choosefile = driver.findElement(By.name("upfile"));
		
		choosefile.sendKeys("C:\\Users\\samarjain\\Documents\\Devops.txt");

	}

}
