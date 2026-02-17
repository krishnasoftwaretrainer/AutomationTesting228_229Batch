package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement skillsDropdown = driver.findElement(By.id("Skills"));
		skillsDropdown.click();
		
		Select select = new Select(skillsDropdown);
		//select.selectByIndex(3);
		//select.selectByValue("Client Server");
		select.selectByVisibleText("Installation");
		
	}

}
