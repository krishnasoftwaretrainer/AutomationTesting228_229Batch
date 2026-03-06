package testNG;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AllTestCases_Data_Provider_TestNG {
	
	@DataProvider(name="SwagLabs_All_TestCases")
	public Object[][] SwagTestData()
	
	{
		return new Object[][] 
				{
			{"standard_user","secret_sauce" }, 
			{"standard_user", "abcdefg"},
				{"adsnhjhj","secret_sauce"},
				{"dfghjk","asghjfgkhj"},
				{"standard_user",""},
				{"","secret_sauce"},
				{"",""},
			
			};
	}
	
	
@Test(dataProvider = "SwagLabs_All_TestCases")
public void SwagLabsLogin(String UserName, String Password) throws InterruptedException
 //Without ReturnType and With Parameters 
{
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	 
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("user-name")).sendKeys(UserName);
	Thread.sleep(2000);
	
	driver.findElement(By.id("password")).sendKeys(Password);
	Thread.sleep(2000);
	
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	
	driver.close();	
}

}
