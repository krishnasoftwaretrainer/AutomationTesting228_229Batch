package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		// Radio Button Male Click
		WebElement radioMale = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		radioMale.click();
		Thread.sleep(2000);
		
		if(radioMale.isDisplayed() && radioMale.isEnabled() && !radioMale.isSelected()) 
		{			
			
		radioMale.click();
		Thread.sleep(2000);
		System.out.println("Male Radio Button is Clicked");
		}
		 	
		
		// Radio Button Click Female
		//WebElement radioFemale = driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		//radioFemale.click();
		
		
	}

}
