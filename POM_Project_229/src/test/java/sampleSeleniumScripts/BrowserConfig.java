package sampleSeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig 
{

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	String title=driver.getTitle();
	System.out.println(title);
	
	if(title.equals("Google"))
	{
		System.out.println("Title is correct");
	}
	else
	{
		System.out.println("Title is incorrect");
	
	
	}
	}
}
