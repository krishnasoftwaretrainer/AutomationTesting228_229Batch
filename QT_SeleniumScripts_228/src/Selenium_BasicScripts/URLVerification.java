package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class URLVerification {

	public static void main(String[] args) throws InterruptedException {
		
		//EdgeOptions options = new EdgeOptions();
		//options.addArguments("--headless");
		//WebDriver driver = new EdgeDriver(options);
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		// 1.Enter Valid Username
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		// 2.Enter Valid Password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		//password.sendKeys("fhsdjskj");
		
		Thread.sleep(2000);
		// 3.Click on Login Button
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();

		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		
		System.out.println("Expected URL: " + expectedURL);
		System.out.println("Actual URL: " + actualURL);
		Thread.sleep(2000);
		
		if (expectedURL.equalsIgnoreCase(actualURL))
		{
			//Logout
		WebElement menu=driver.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		Thread.sleep(2000);
		WebElement logout=driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		Thread.sleep(2000);
		System.out.println("Login and Logout is Successful");
		
		} 
		else 
		{
			System.out.println("Login is Failed, Please Check the Username and Password");
			System.out.println("Entered UserName: "+username.getAttribute("value"));
			System.out.println("Entered Password: "+password.getAttribute("value"));
		}
		Thread.sleep(2000);		
		
		driver.close();
	}

}
