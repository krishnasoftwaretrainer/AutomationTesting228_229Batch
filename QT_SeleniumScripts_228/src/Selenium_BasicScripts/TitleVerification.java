package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Smoke Testing
		//WebElement ForgottenPasswordLink = driver.findElement(By.linkText("Forgotten password?"));
		WebElement ForgottenPasswordLink = driver.findElement(By.partialLinkText("Forgotten"));
		
		ForgottenPasswordLink.click();
		
		String ExpectedTitle = "Forgotten Password | Can't Log In | Facebook";
		String ActualTitle = driver.getTitle();
		//System.out.println("Actual Title is : " + ActualTitle);
		
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle)) {
		//if(ActualTitle.contains("Forgotten Password"))
		
			WebElement EmailOrPhoneNumberTextBox = driver.findElement(By.name("email"));
			EmailOrPhoneNumberTextBox.sendKeys("Krishna@gmail.com");
			Thread.sleep(2000);
			WebElement SearchButton = driver.findElement(By.id("did_submit"));
			SearchButton.click();
			System.out.println("Title is Matching, Test Case is Passed");
		}
		
		else 
		{
			System.out.println("Title is Not Matching, Test Case is Failed");
		}
		
		
		driver.quit();
		
		
		
	}

}
