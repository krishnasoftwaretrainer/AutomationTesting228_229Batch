package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsers 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver;
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(1000);
		driver.close();
		System.out.println("Chrome Browser is Closed");
		Thread.sleep(1000);
		driver=new EdgeDriver();
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.close();

		
		driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.close();
		
	}

}
