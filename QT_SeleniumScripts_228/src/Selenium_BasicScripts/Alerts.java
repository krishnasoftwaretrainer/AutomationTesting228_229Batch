package Selenium_BasicScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		// Alert-1 Accept Alert
		WebElement ClickButtonToDisplayAlert = driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]"));
		ClickButtonToDisplayAlert.click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Alert-1 Text: " + alert1.getText());
		alert1.accept();
		System.out.println("Alert-1 Accepted");
		Thread.sleep(2000);
		
		// Alert-2 Confirm Alert
		WebElement AlertWithOKCancel = driver.findElement(By.partialLinkText("Alert with OK & Ca"));
		AlertWithOKCancel.click();
		Thread.sleep(2000);
		WebElement ClickTheButtonToDisplayConfirmBox = driver.findElement(By.xpath("//button[@onclick=\"confirmbox()\"]"));
		ClickTheButtonToDisplayConfirmBox.click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println("Alert-2 Text: " + alert2.getText());
		alert2.dismiss();
		Thread.sleep(2000);
		WebElement AfterClickOnCancel_OK = driver.findElement(By.id("demo"));
		System.out.println("After Click on Cancel/OK: " + AfterClickOnCancel_OK.getText());
		Thread.sleep(2000);
		System.out.println("Alert-2 "+AfterClickOnCancel_OK.getText());
		
		// Alert-3 Prompt Alert
		WebElement AlertWithTextBox = driver.findElement(By.partialLinkText("Alert with Textbox"));
		AlertWithTextBox.click();
		Thread.sleep(2000);
		WebElement ClickTheButtonToDemonstrateThePromptBox = driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]"));
		ClickTheButtonToDemonstrateThePromptBox.click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		System.out.println("Alert-3 Text: " + alert3.getText());
		alert3.sendKeys("Selenium Alert");
		Thread.sleep(2000);
		alert3.accept();
		Thread.sleep(2000);
		WebElement AfterSendTextAndClickOnOK = driver.findElement(By.id("demo1"));
		System.out.println("After Send Text and Click on OK: " + AfterSendTextAndClickOnOK.getText());
		System.out.println("Alert-3 "+AfterSendTextAndClickOnOK.getText());
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}

}
