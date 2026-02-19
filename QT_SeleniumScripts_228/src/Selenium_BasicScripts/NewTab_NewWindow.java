package Selenium_BasicScripts;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class NewTab_NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.google.com/");
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		//String WindowTab1=driver.getWindowHandle();
		//System.out.println("Window Tab 1 ID: "+WindowTab1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//String WindowTab2=driver.getWindowHandles();
		//System.out.println("Window Tab 2 ID: "+WindowTab1);
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		//driver.close();
		//driver.quit();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.flipkart.com/");
		
		//Get All Window IDs
		Set<String> WindowTab3=driver.getWindowHandles();
		System.out.println("All Window Tab IDs: "+WindowTab3);
		
		//driver.close();
		driver.quit();
		
	}

}
