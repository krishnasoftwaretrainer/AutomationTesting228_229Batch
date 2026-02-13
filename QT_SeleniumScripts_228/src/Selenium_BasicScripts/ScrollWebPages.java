package Selenium_BasicScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebPages 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//int a=(int)(20.5);
		
		//Scroll Down the Web Page:Top to Bottom
		js.executeScript("window.scrollBy(0,500)"); //(x,y)
		Thread.sleep(2000);
		//Scroll Up the Web Page:Bottom to Top
		js.executeScript("window.scrollBy(0,-500)"); //(x,y)
		Thread.sleep(2000);
		//Scroll Up the Web Page:Left to Right
		js.executeScript("window.scrollBy(200,0)"); //(x,y)
		Thread.sleep(2000);
		//Scroll Up the Web Page:Right to Left
		js.executeScript("window.scrollBy(-200,0)"); //(x,y)
	}

}
