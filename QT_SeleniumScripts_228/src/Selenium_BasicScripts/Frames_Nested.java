package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames_Nested {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		
		//Frame-1 Outer Frame
		driver.switchTo().frame("singleframe");
		Thread.sleep(1000);
		WebElement TextBox1=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		TextBox1.sendKeys("Welcome to Selenium");
		Thread.sleep(1000);
		
		//Switching back to main page Default Place
		driver.switchTo().defaultContent();
		
		//Frame-2 Outer Frame
		WebElement IFrameWithinFrameButton=driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
		IFrameWithinFrameButton.click();
		Thread.sleep(1000);
		
		//Switching to Outer Frame
		WebElement OuterFrame=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(OuterFrame);
		Thread.sleep(1000);
		//Switch to Inner Frame
		WebElement InnerFrame=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(InnerFrame);
		
		//Enter Text in Inner Frame TextBox
		WebElement TextBox2=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		TextBox2.sendKeys("Welcome to Selenium Frames");
		
		Thread.sleep(1000);
		//Switching back to main page Default Place
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
