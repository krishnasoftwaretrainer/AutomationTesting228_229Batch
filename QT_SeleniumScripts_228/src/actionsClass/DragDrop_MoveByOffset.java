package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_MoveByOffset {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		WebElement drag = driver.findElement(By.id("dragBox"));
		Thread.sleep(1000);
		//act.dragAndDropBy(drag, 0, 50).build().perform();
		
		act.clickAndHold(drag).build().perform();
		Thread.sleep(1000);
		
		act.moveByOffset(00, 100).build().perform(); //Top to down
		Thread.sleep(1000);
		act.moveByOffset(0, -100).build().perform(); //Down to top
		Thread.sleep(1000);
		act.moveByOffset(100, 0).build().perform(); //Left to right
		Thread.sleep(1000);
		act.moveByOffset(-100, 0).build().perform(); //Right to left
	}

}
