package Selenium_BasicScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariAutoITFileUpload {
	public static void main(String[] args) throws InterruptedException, IOException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Chandana");
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("vicky2123@gmail.com");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(2000);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Chandana");
		WebElement mobileNumber = driver.findElement(By.id("mobile"));
		mobileNumber.sendKeys("7981526404");
		Thread.sleep(2000);
		WebElement ClickButton = driver.findElement(By.xpath("//h2[@class=\"main-3\"]"));
		ClickButton.click();
		Thread.sleep(2000);
		WebElement UploadResume = driver.findElement(By.xpath("//button[text()=\"Upload Resume\"]"));
		UploadResume.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\QT\\QT_Selenium_228,229\\AutoIT\\NaukariResumeUpload.exe");
	}

}
