package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.cssSelector("input#_R_64qjbjb9pb6amH1_")).sendKeys("admin");
		//1. CSS Selector with ID
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		//2. CSS Selector with Class
		//driver.findElement(By.cssSelector("input.input_error form_input")).sendKeys("standard_user");
		//3. CSS Selector with Attribute
		//driver.findElement(By.cssSelector("input[placeholder='Password'")).sendKeys("secret_sauce");
		
		//4. CSS Selector with Contains
		//driver.findElement(By.cssSelector("input[placeholder*='Pass'")).sendKeys("secret_sauce");
	
		//5. CSS Selector with Starts With
		driver.findElement(By.cssSelector("input[placeholder^='Pass'")).sendKeys("secret_sauce");
		//6. CSS Selector with Ends With
		//driver.findElement(By.cssSelector("input[placeholder$='word'")).send("secret_sauce");
	
		
	}

}
