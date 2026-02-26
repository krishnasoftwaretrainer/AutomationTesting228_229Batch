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

		        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		        // ✅ Switch to iframe using WebElement
		        WebElement frame = wait.until(
		                ExpectedConditions.presenceOfElementLocated(By.tagName("iframe"))
		        );
		        driver.switchTo().frame(frame);

		        // Click Add Textbox1
		        driver.findElement(By.id("btn1")).click();

		        // Wait and enter text
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textbox1")))
		            .sendKeys("Krishna");

		        // Click Add Textbox2
		        driver.findElement(By.id("btn2")).click();

		        // Wait and enter text
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textbox2")))
		            .sendKeys("Hyderabad");		
		
	}
}


