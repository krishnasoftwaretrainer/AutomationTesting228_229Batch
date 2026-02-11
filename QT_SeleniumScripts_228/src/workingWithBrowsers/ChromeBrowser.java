package workingWithBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver(); //Opens the Chrome Browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();

		
		
		
		
		
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\QT\\QT_228\\chromedriver-win64\\chromedriver.exe");
		
		
		
		
	}

}
