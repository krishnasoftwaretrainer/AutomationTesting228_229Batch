package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Swag_Parameters extends BaseClass
{
	SoftAssert softAssert = new SoftAssert();
	@Test(priority = 1)
	@Parameters({"vusername","vpassword"})
  public void ValidValidLogin(String vusername,String vpassword)
  {
	  WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(vusername);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(vpassword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		String expectedURL = "https://www.saucedemo.com/inventory.html";
		String actualURL = driver.getCurrentUrl();
		//SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualURL, expectedURL); //Pass Fail
		softAssert.assertAll(); //Report
  
  }
  @Test(priority = 2)
  @Parameters({"ivusername","ivpassword"})
  public void InvalidLogin(String ivusername,String ivpassword)
  {
	  WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(ivusername);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(ivpassword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		String actualErrorMessage = errorMessage.getText();
		
		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage); //Pass Fail
		softAssert.assertAll(); //Report
}

  //Valid Invalid Login
  @Test(priority = 3)
  @Parameters({"vusername","ivpassword"})
  public void ValidInvalidLogin(String vusername,String ivpassword)
  {
	  WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(vusername);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(ivpassword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		String actualErrorMessage = errorMessage.getText();
		
		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage); //Pass Fail
		softAssert.assertAll(); //Report
}

  //Invalid Valid Login
  //Valid Invalid Login
  @Test(priority = 4)
  @Parameters({"ivusername","vpassword"})
  public void InValidvalidLogin(String ivusername,String vpassword)
  {
	  WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(ivusername);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(vpassword);
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		String actualErrorMessage = errorMessage.getText();
		
		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage); //Pass Fail
		softAssert.assertAll(); //Report
}
}
