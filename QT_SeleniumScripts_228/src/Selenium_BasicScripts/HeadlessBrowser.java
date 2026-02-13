package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {

		// Headless Browser: It is a browser that runs without a graphical user
		// interface (GUI).
		// It allows you to automate web interactions and perform tasks without the need
		// for a visible browser window.
		// Headless browsers are commonly used for web scraping, testing, and automation
		// purposes

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//WebDriver driver = new ChromeDriver(options);

		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless");
		WebDriver driver = new EdgeDriver(options);
		System.out.println("Execution Started");
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		// Scroll Web Page:Top to Bottom

		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("window.scrollBy(0,250)"); //(x,y)
		Thread.sleep(2000);

		WebElement firstname = driver.findElement(By.id("userName"));

		firstname.sendKeys("Krishna");
		Thread.sleep(2000);

		// firstname.clear();
		// Thread.sleep(2000);
		// firstname.sendKeys("Suresh");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("Krishna@gmail.com");
		Thread.sleep(2000);

		WebElement currentaddress = driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("Ameerpet \n Hyderabad \n Telangana");
		Thread.sleep(2000);

		WebElement permanentaddress = driver.findElement(By.id("permanentAddress"));
		permanentaddress.sendKeys("Ameerpet \n Hyderabad \n Telangana");

		Thread.sleep(2000);

		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(2000);
		// Print the Text of after submit the form
		WebElement Output = driver.findElement(By.id("output"));
		System.out.println("The Output of the Form is: " + Output.getText());
		Thread.sleep(2000);
		driver.close();

	}

}
