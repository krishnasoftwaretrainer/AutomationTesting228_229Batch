package workingWithBrowsers;

import java.util.Scanner;

public class BrowserTest {
	static String BrowserName;
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Browser Name");
		 BrowserName=sc.next();
				 
		AllBrowsers_WithParametrs obj=new AllBrowsers_WithParametrs();
		obj.BrowserSelection(BrowserName);
	}

}
