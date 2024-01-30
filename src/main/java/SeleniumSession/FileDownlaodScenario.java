package SeleniumSession;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownlaodScenario {
	
	public static void man(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		String downlaodedPath = "";
		String fileName = "";
		
		File file = new File(downlaodedPath,fileName);
		
		
		FluentWait<File> wait = new FluentWait<File>(file)
				.withTimeout(Duration.ofMinutes(5))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class)
				.withMessage("File not downlaoded");
		
		boolean isDowlaoded = wait.until(f -> ((Object) f).isExist() && f.canRead());
		
		if(isDownlaoded)
		{
			System.out.println("File is downlaoded");
		}
		else {
			System.out.println("file is not downlaoded....");
		}
			
		
		
	}

}
