package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Basic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frame_a.html");
		driver.navigate().to("file:///D:/SELENIUM/Selenium%20Scripts/Frames/frames.html");
		
		//Frame-1 Blue
		//Switching to frame using WebElement
		//WebElement Frame1=driver.findElement(By.xpath("//frame[@src=\"D:\\SELENIUM\\Selenium Scripts\\Frames\\frame_a.html\"]"));
		//driver.switchTo().frame(Frame1);
		
		//Switching to frame using index
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		WebElement TextBox1=driver.findElement(By.id("001"));
		TextBox1.sendKeys("Welcome to Selenium");
		Thread.sleep(1000);
		//Switching back to main page Default Place
		driver.switchTo().defaultContent();
		
		//Frame-2 Green
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		
		WebElement TextBox2=driver.findElement(By.id("002"));
		TextBox2.sendKeys("Welcome to Frames");
		Thread.sleep(1000);
		
		//Switching back to main page Default Place
		driver.switchTo().defaultContent();
		//Frame-3 Yellow
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		WebElement TextBox3=driver.findElement(By.id("003"));
		TextBox3.sendKeys("Welcome to Selenium Frames");
		Thread.sleep(1000);
		
		//Switching back to main page Default Place
		driver.switchTo().defaultContent();
		
		//Frame-4 Orange
		driver.switchTo().frame(3);
		Thread.sleep(1000);
		WebElement TextBox4=driver.findElement(By.id("004"));
		TextBox4.sendKeys("Welcome to Selenium Frames Orange");
		Thread.sleep(1000);
		
		//Switching back to main page Default Place
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.quit();
	}

}
