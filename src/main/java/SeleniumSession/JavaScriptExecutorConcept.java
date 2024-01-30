package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		JavaScriptUtil js = new JavaScriptUtil(driver);
		

	}
	
	public static void flash(WebElement ele)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		
	}
	
	public static void changecoloe(String color, WebElement ele)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("argument[0].style.backgroundColor = '"+color+"'", ele);
	}
	
	public static void scrollIntoView(WebElement ele)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("argument.scrollIntoView(true)", ele); 
	}
	
	public static void scrollPageUp()
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)"); 
	}
	
	public static void getTitleByJs()
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("return document.title").toString(); 
	}
	
	public static void refreshBrowser()
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("history.go(0)"); 
	}
	
	public static void generateAlert(String message)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("alert('"+message+"')"); 
	}
	
	public static void getPageInnerText()
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("return document.docuemntElement.innerText;").toString(); 
	}
	
	public static void scrollPageDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight;)");)
	}
	
	public static void scrollPageDown(String height)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,'"+height+"')");
	}

}
