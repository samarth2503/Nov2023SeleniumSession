package SeleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopupHandle {
	
	// Java script Popup or Alert are not part of HTML DOM 
	// alert method in JS
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb%22");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert al = driver.switchTo().alert();
		
		String text = al.getText();
//		System.out.println("Text is : "+text);)
		

		al.accept();		// Click on OK/submit/Yes button
		
		al.dismiss();		// dismiss the alert
		
		driver.switchTo().defaultContent(); 		// Switch back to main window
		

	}

}
