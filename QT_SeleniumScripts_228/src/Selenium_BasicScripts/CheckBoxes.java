package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//CheckBox-1: Cricket
		WebElement Cricket=driver.findElement(By.id("checkbox1"));
		
		if(Cricket.isDisplayed() && Cricket.isEnabled() && !Cricket.isSelected()) 
		{
			Cricket.click();
			Thread.sleep(2000);
			System.out.println("Cricket CheckBox is Clicked");
		}
		
		//CheckBox-2: Movies
		WebElement Movies=driver.findElement(By.id("checkbox2"));
		if(Movies.isDisplayed() && Movies.isEnabled() && !Movies.isSelected()) 
		{
			Movies.click();
			Thread.sleep(2000);
			System.out.println("Movies CheckBox is Clicked");
		}
		
		//CheckBox-3: Hockey
		WebElement Hockey=driver.findElement(By.id("checkbox3"));
		if(Hockey.isDisplayed() && Hockey.isEnabled() && !Hockey.isSelected()) 
		{
			Hockey.click();
			Thread.sleep(2000);
			System.out.println("Hockey CheckBox is Clicked");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
