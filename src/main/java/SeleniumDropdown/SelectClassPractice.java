package SeleniumDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id ='justAnInputBox']")).click();
		
		Thread.sleep(5000);
		List<WebElement> multipleOptions = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		for(WebElement e : multipleOptions)
		{
			System.out.println(e.getText());
			if(e.getText().equals("choice 2 2"))
			{
				e.click();
				break;
			}
		}
		
		//driver.quit();
		
		
	}

}
