package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample 
{

	public static void main(String[] args) 
	{

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\11am Automation Testing\\chromedriver-win64\\chromedriver.exe");
		 driver= new ChromeDriver();
		 			
		driver.manage().window().maximize();
		
	driver.get("file:///C:/Automation%2012pm%20Class%20New/Frames/frames.html");
	
	//Frame-1
	driver.switchTo().frame(0);
	WebElement Frame1=driver.findElement(By.id("001"));
	
	Frame1.sendKeys("Krishna");
	
	//Frame-2
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
	WebElement Frame2=driver.findElement(By.id("002"));
	
	Frame2.sendKeys("Ramesh");
	
	//Frame-3
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
	WebElement Frame3=driver.findElement(By.id("003"));
	
	Frame3.sendKeys("Lakshmi");
	
	

	}

}
