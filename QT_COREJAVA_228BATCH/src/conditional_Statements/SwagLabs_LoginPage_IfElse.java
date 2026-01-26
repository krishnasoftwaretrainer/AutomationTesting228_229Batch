package conditional_Statements;

import java.util.Scanner;

public class SwagLabs_LoginPage_IfElse {

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
		else
		{
			System.out.println("Login Failed - Showing Error Message");
		}
	}

}
