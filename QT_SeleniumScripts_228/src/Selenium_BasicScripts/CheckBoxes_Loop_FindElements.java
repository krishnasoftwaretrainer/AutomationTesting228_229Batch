package Selenium_BasicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_Loop_FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		List<WebElement> CheckBox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		/*
		//for(int i=0; i<3; i++) //0<3, 1<3, 2<3, 3<3(false)
		for(int i=0; i<CheckBox.size(); i++) //0<3, 1<3, 2<3, 3<3(false)
		{
			CheckBox.get(i).click();
			Thread.sleep(2000);
			System.out.println("CheckBox is Clicked");
		}
		*/
		//For Each Loop
		
		if(!CheckBox.isEmpty()) 
		{
		for(WebElement CheckBox1:CheckBox) 
		{
			CheckBox1.click();
			Thread.sleep(2000);
			System.out.println("CheckBox is Clicked");
		}
		}
	}

}
