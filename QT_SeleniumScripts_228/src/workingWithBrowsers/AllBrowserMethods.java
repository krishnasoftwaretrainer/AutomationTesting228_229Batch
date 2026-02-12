package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllBrowserMethods 
{
	WebDriver driver;
	public void OpenChromeBrowser()
	{
		driver=new ChromeDriver(); //Opens the Chrome Browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
		System.out.println("Chrome Browser is Closed");
		
	}
	
	public void OpenEdgeBrowser()
	{
		driver=new ChromeDriver(); //Opens the Chrome Browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
		System.out.println("Edge Browser is Closed");
		
	}
	
	public void OpenFirefoxBrowser()
	{
		driver=new ChromeDriver(); //Opens the Chrome Browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
		System.out.println("Firefox Browser is Closed");
		
	}
}
