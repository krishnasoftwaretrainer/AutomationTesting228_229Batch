package sampleSeleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TittleVerification_TestNG {

	@Test
	public void verifyTittle()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google");
		driver.quit();
	}
}
