package Selenium_BasicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Screenshots {
	public static void main(String[] args) throws InterruptedException, IOException{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	// driver.get("https://www.google.com/");
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(2000);
	// Screen Shot-1
	File sc1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(sc1, new File("D:\\QT\\QT_228\\ScreenShots\\AfterAmazon.png"));
	Thread.sleep(2000);
	
	driver.navigate().back();
	Thread.sleep(2000);
	// Screen Shot-2
	File sc2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(sc2, new File("D:\\QT\\QT_228\\ScreenShots\\AfterBackWard1.jpg"));

	driver.navigate().back();
	Thread.sleep(2000);
	// Screen Shot-3
	File sc3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(sc3, new File("D:\\QT\\QT_228\\ScreenShots\\AfterBackWard2.jpeg"));

	driver.navigate().forward();
	Thread.sleep(2000);
	// Screen Shot-4
	File sc4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(sc4, new File("D:\\QT\\QT_228\\ScreenShots\\AfterForward1.bmp"));

	driver.navigate().forward();
	Thread.sleep(2000);
	// Screen Shot-5
	File sc5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(sc5, new File("D:\\QT\\QT_228\\ScreenShots\\AfterForward2.png"));

	driver.navigate().refresh();
	// Screen Shot-6
	File sc6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(sc6, new File("D:\\QT\\QT_228\\ScreenShots\\AfterRefresh.png"));

	System.out.println("Browser Navigations Completed");
	Thread.sleep(2000);
	driver.quit();
}
}
