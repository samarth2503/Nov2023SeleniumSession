package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samarjain\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement sourcele = driver.findElement(By.id("draggable"));
		WebElement targetele = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(sourcele).moveToElement(targetele).release().build().perform();
		
		// Alternate Way
		
		act.dragAndDrop(sourcele, targetele).perform();

	}

}
