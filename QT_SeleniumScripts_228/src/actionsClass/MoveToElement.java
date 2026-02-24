package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		Actions act = new Actions(driver);
		//WebElement Products = driver.findElement(By.xpath("//span[text()='Products']"));
	WebElement Products =driver.findElement(By.id("products-dd-toggle"));
	act.moveToElement(Products).build().perform();
	//Products.click();
	Thread.sleep(1000);
	WebElement WebTesting = driver.findElement(By.id("products-dd-tab-2"));
	act.moveToElement(WebTesting).click().build().perform();
	Thread.sleep(2000);
	WebElement Automate = driver.findElement(By.partialLinkText("Automate"));
	Automate.click();

	}

}
