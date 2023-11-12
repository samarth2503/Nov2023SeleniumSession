package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		
		driver.close();											// org.openqa.selenium.NoSuchSessionException: invalid session id  --->for driver.close();
																// NoSuchSessionException:- Session ID is null --> for driver.quit();
		
		System.out.println(driver.getTitle());					// Will get exception stating NoSuchSessionException:- Session ID is null. Using WebDriver after calling quit()
		
		System.out.println("Ending........");

	}

}
