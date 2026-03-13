package Selenium_BasicScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(800, 600));
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		 username.sendKeys("standard_user");
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		 password.sendKeys("secret_sauce");
		 WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
		 loginButton.click();
		 //driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		

	}
}
