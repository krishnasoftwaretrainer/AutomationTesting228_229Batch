package conditional_Statements;

import java.util.Scanner;

public class BrowserSelection_Switch {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the browser name");
			String browser = scanner.next();
			
			switch (browser.toLowerCase()) 
			{
			case "chrome":
				System.out.println("You have selected Chrome browser");
				System.out.println("Your Script is executing in Chrome browser");
				break;
			
			case "firefox":
				System.out.println("You have selected Firefox browser");
				System.out.println("Your Script is executing in Firefox browser");
				break;
				
			case "edge":
				System.out.println("You have selected Edge browser");
				System.out.println("Your Script is executing in Edge browser");
				break;
			
				default:
					System.out.println("Invalid Browser Name");
					System.out.println("Please select a browser: Chrome, Firefox, Edge");
					break;
				
			
			}
			
			scanner.close();
			
			
	}

}
