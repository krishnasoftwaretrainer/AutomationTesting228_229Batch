package conditional_Statements;

import java.util.Scanner;

public class BiggestNumber_givenThree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any Three Numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if(num1 >= num2 && num1 >= num3)  //num1 is Biggest
		{
			System.out.println(num1 + " is the Biggest Number");
		} //Exit 
	
		else if(num2>num3)
			{
				System.out.println(num2 + " is the Biggest Number");
			}
			else
			{
				System.out.println(num3 + " is the Biggest Number");
			}
}
}
