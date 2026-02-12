package workingWithBrowsers;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsers_WithParametrs 
{
	
	WebDriver driver;
	String BrowserName;
	public void BrowserSelection(String BrowserName) throws InterruptedException
	{
		/*
		 
		 if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		
		}
		
		else if(BrowserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		else
		{
			System.out.println("Invalid Browser Name");
			
		}
		 */
		//Switch Case
		
		switch(BrowserName.toLowerCase())
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
			case "edge":
				driver=new EdgeDriver();
				break;
				case "firefox":
					driver=new FirefoxDriver();
					break;
					default:
						System.out.println("Invalid Browser Name");
						break;
		}
		
		
		
		 try
		 {
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
		 }
		 catch(NullPointerException e)
		 {
			 System.out.println(e.getMessage()+"Browser is not opened");
		 }
	}
}
