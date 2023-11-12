package SeleniumSession;

public class AmazonPageTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		
		br.launchBrowser("chrome");
		br.launchURL("https://www.amazon.in/");
		
		String title = br.getPageTitle();
		
		if(title.contains("Online"))
		{
			System.out.println("Correct title...");
		}
		else
		{
			System.out.println("Incorrect title....");
		}
		
		String baseURL = br.getPageUrl();
		if(baseURL.contains("amazon"))
		{
			System.out.println("Pointing to right url....");
		}
		
		br.closeBrowser();

	}

}
