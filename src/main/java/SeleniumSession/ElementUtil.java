package SeleniumSession;

import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriver driver;
	private Actions ac;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
		ac = new Actions(this.driver);
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String str)
	{
		getElement(locator).sendKeys(str);
	}
	
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public String getText(By locator)
	{
		return getElement(locator).getText();
	}
	
	public boolean doIsDisplyed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public List<WebElement> getElements(By textFeild)
	{
		return driver.findElements(textFeild);
	}
	
	public void doClickLink(By locator, String value)
	{
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id=\"SIvCob\"]/a"));
		
		for(WebElement links : langLinks)
		{
			String text = links.getText();
			System.out.println("Link Text is "+text);
			
			if(text.equals(value))
			{
				links.click();
				break;
			}
		}
	}
	
	public void doSelectDropdownWithoutSelectClass(By locator, String value)
	{
		List<WebElement> options = driver.findElements(locator);
		
		for(WebElement e : options)
		{
			if(e.getText().equals(value))
			{
				e.click();
				break;
			}
		}
	}
	
	public void doSelectOptionByText(By locator,String value)
	{
		Select sel = new Select(getElement(locator));
		
		List<WebElement> indusOption = sel.getOptions();
		
		System.out.println(indusOption.size());
		
		for(WebElement e : indusOption)
		{
			if(e.getText().equals(value))
			{
				e.click();
				break;
			}
		}
	}
	
	public void doSelectByvisisbleText(By locator, String visisbleText)
	{
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(visisbleText);
	}
	
	public void doSelectByValue(By locator, String value)
	{
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}
	
	public void doSelectByIndex(By locator, int index)
	{
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}
	
	public List<String> getDropdownOptionList(By locator)
	{
		Select sel = new Select(getElement(locator));
		List<String> optionTextList = new ArrayList<String>();
		
		List<WebElement> optionList = sel.getOptions();
		
		System.out.println(optionList.size());
		
		for(WebElement e : optionList)
		{
			optionTextList.add(e.getText());
		}
		
		return optionTextList;
	}
	
	public void doActionClick(By locator)
	{
		Actions ac = new Actions(driver);
		ac.click(driver.findElement(locator)).perform();
	}
	
	public void doActionSendKeys(By locator,String value)
	{
		Actions ac = new Actions(driver);
		ac.sendKeys(driver.findElement(locator), value);
	}
	
	// ******************** Calendar Util ********************************//
	
	
	public void selectDate(String day,String tagName)
	{
		driver.findElement(By.xpath("//"+tagName+"[text()='"+day+"']")).click();
	}
	
	public void selectDate(By locator,String day)
	{
		int d1 = Integer.parseInt(day);

		List<WebElement> days = driver.findElements(locator);
		
		if(d1>30)
		{
			for(WebElement d : days)
			{
				if(d.getText().equals(day))
				{
					driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
				}
			}
		}
		else{
			System.out.println("Wrong date ..."+day);
		}
		
	}
	
	//**************************Wait Util ***********************************/
	
	public WebElement waitForPresenceELement(By locator, int timeOut)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		return (WebElement) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	public WebElement waitForElementWithFluentWait(By locator, int timeout, int pollingTime)
	{
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingTime)).ignoring(NoSuchElementException.class)
				.ignoring(NoSuchAlgorithmException.class);
		
		return w.until(ExpectedConditions.presenceOfElementLocated(locator));
	}



}
