package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		WebElement dragMe = driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));
		Thread.sleep(1000);
		
		act.dragAndDrop(dragMe, dropHere).build().perform();
		//act.dragAndDropBy(dropHere, 0, 100).build().perform();
		
	}

}
