package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabsLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		// 1.Enter Valid Username
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		// 2.Enter InValid Password
		WebElement password = driver.findElement(By.id("password"));
		//password.sendKeys("secret_sauce");
		password.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		// 3.Click on Login Button
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		/*
		//WebElement ErrorMesg=driver.findElement(By.xpath("//h3[text()=\"Epic sadface: Username and password do not match any user in this service\"]"));
		//Absolute Xpath
		//WebElement ErrorMesg=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3"));
		//System.out.println("Error Message: "+ErrorMesg.getText());
		
		if (ErrorMesg.isDisplayed())
		{
			System.out.println("Login is Failed, Please Check the Username and Password");
			System.out.println("Entered UserName: "+username.getAttribute("value"));
			System.out.println("Entered Password: "+password.getAttribute("value"));
		}
		else
		{
			System.out.println("Login is Successful");
		} */
	}

}
