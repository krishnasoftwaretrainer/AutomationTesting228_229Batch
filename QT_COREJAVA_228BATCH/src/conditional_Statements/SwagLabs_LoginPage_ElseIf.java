package conditional_Statements;

import java.util.Scanner;

public class SwagLabs_LoginPage_ElseIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String username = "standard_user";
		//String password = "secret_sauce";
		
		System.out.println("Enter the Username");
		String username = scan.next();
		System.out.println("Enter the Password");
		String password = scan.next();
		
		if(username.equals("standard_user") && password.equals("secret_sauce"))
		{
			System.out.println("Login Successful - Navigating to Home Page");
		}
		else if(username.equals("locked_out_user") && password.equals("secret_sauce"))
		{
			System.out.println("Epic sadface: Sorry, this user has been locked out.");
		}
		else if(username.equals("problem_user") && password.equals("secret_sauce"))
		{
			System.out.println("Login Successful - Navigating to Home Page with some problems");
		}
		else if(username.equals("performance_glitch_user") && password.equals("secret_sauce"))
		{
			System.out.println("Login Successful - Navigating to Home Page with performance issues");
		}
		else if(username.equals("error_user") && password.equals("secret_sauce"))
		{
			System.out.println("Login Successful - Navigating to Home Page with error messages");
		}
		else if(username.equals("visual_user") && password.equals("secret_sauce"))
		{
			System.out.println("Login Successful - Navigating to Home Page with visual bugs");
		}
		else if(username.isEmpty() && password.isEmpty())
		{
			System.out.println("Epic sadface: Username is required");
		}
		else
		{
			System.out.println("Please check your username and password");
		}
	}
}


