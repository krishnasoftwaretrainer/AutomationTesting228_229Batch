package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Right_Click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Elements")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Buttons")).click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		
		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		//doubleClickBtn.click();
		act.doubleClick(doubleClickBtn).perform();
		Thread.sleep(1000);
		
		WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClickBtn).perform();
		//driver.close();
	}

}
