package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Capital_Select_Copy_Paste {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement textArea1 = driver.findElement(By.id("ta1"));
		WebElement textArea2 = driver.findElement(By.xpath("//div[@id=\"HTML11\"]//div//textarea"));
		//textArea1.sendKeys("hello world");
		//textArea1.sendKeys("HELLO WORLD");
		
		Actions act = new Actions(driver);
		act.keyDown(textArea1, Keys.SHIFT).sendKeys("hello world").keyUp(Keys.SHIFT).build().perform();
		//act.keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		act.sendKeys("abcdef").build().perform();
		Thread.sleep(1000);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.sendKeys("c").build().perform();
		//Thread.sleep(2000);
		//act.sendKeys(Keys.ARROW_DOWN).build().perform();
		//Thread.sleep(1000);
		//act.sendKeys(Keys.TAB).build().perform();
		//Thread.sleep(1000);
		//act.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(1000);
		//textArea2.clear();
		act.sendKeys(textArea2, "a").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(1000);
		act.sendKeys(textArea2, "v").keyUp(Keys.CONTROL).build().perform();
		//act.sendKeys(Keys.NUMPAD1).sendKeys(Keys.NUMPAD2).sendKeys(Keys.NUMPAD3).build().perform();
		//act.sendKeys("123").build().perform();
		Thread.sleep(2000);
		driver.close();
	}

}
