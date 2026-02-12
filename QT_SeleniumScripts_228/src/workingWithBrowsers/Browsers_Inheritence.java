package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers_Inheritence 
{

	static WebDriver driver;
	
	public void OpenChromeBrowser(String AppURL,WebDriver driver) throws InterruptedException
	{
		driver=new ChromeDriver(); //Opens the Chrome Browser
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//driver.get("http://www.amazon.com");
		driver.get(AppURL);
		Thread.sleep(2000);
		driver.close();
		//System.out.println("Chrome Browser is Closed");
		
	}
	
	public void OpenEdgeBrowser(String AppURL,WebDriver driver) throws InterruptedException
	{
		driver=new EdgeDriver(); //Opens the Chrome Browser
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get(AppURL);
		Thread.sleep(2000);
		
		//driver.close();
		//System.out.println("Edge Browser is Closed");
		
	}
	
	public void OpenFirefoxBrowser(String AppURL) throws InterruptedException
	{
		driver=new FirefoxDriver(); //Opens the Chrome Browser
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get(AppURL);
		Thread.sleep(2000);
		
		//driver.close();
		//System.out.println("Firefox Browser is Closed");
		
	}

}
