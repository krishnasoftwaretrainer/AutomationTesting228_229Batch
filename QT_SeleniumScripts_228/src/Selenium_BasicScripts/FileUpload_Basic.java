package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Basic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);
		WebElement browse = driver.findElement(By.id("input-4"));
		//browse.click();
		browse.sendKeys("C:\\Users\\HP\\Downloads\\info (6).txt");
		Thread.sleep(1000);
		//browse.sendKeys("\"C:\\Users\\HP\\Downloads\\info (2).pdf\"");
		
		
	}

}
