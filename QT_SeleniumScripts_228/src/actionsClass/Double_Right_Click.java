package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		driver.close();
	}

}
