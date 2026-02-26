package Selenium_BasicScripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//Waits 
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen(); 
		Thread.sleep(2000);
		//driver.manage().window().setSize(new Dimension(-800, 00));
		
		//Set Position of the Window
		
		//driver.manage().window().setPosition(new Point(-500, 00));
		
		
		
	}

}
