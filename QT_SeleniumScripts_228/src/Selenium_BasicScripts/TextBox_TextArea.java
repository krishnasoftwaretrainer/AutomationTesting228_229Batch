package Selenium_BasicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_TextArea {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		//Scroll Web Page:Top to Bottom
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)"); //(x,y)
		Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.id("userName"));
	
		firstname.sendKeys("Krishna \n Suresh");
		Thread.sleep(2000);
		
		//firstname.clear();
		//Thread.sleep(2000);
		//firstname.sendKeys("Suresh");
	
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("Krishna@gmail.com");
		Thread.sleep(2000);
		
		WebElement currentaddress=driver.findElement(By.id("currentAddress"));
		currentaddress.sendKeys("Ameerpet \n Hyderabad \n Telangana");
		Thread.sleep(2000);
		
		WebElement permanentaddress=driver.findElement(By.id("permanentAddress"));
		permanentaddress.sendKeys("Ameerpet \n Hyderabad \n Telangana");
		
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		
		//Print the Text of after submit the form
		WebElement Output=driver.findElement(By.id("output"));
		System.out.println("The Output of the Form is: "+Output.getText());
		Thread.sleep(2000);
		driver.close();
				
			/*	
		//Enter Text in Full Name Text Box
		driver.findElement(By.id("userName")).sendKeys("Krishna");
		Thread.sleep(2000);
		//Clear the Text in Full Name Text Box
		driver.findElement(By.id("userName")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("Suresh");
		*/
		/*
		int a=10,b=20;
		System.out.println("The Sum of a and b is: "+(a+b));
		System.out.println("The Sum of a and b is: "+(a-b));
		System.out.println("The Sum of a and b is: "+(a*b));
		
		System.out.println(20+30);
		System.out.println(20-30);
		System.out.println(20*30);
		*/
	}

}
