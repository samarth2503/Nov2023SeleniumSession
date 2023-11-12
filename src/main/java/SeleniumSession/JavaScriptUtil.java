package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptUtil {
	
	public WebDriver driver;
	
	public JavaScriptUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getTitleByJs()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return docuement.title").toString();
	}
	
	public void refreshBrowserByJS()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}
	
	public void generateAlert(String message)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public String getInerPageText()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	public void clickElementByJS(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void sendKeysUsingWithId(String id, String value)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("docuement.getElementById('"+id+"').value='"+value+"'");
	}

}
