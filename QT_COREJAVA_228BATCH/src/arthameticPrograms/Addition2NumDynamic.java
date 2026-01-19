package arthameticPrograms;

import java.util.Scanner;

public class Addition2NumDynamic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=scan.nextInt();
		System.out.println("Enter second number: ");
		int b=scan.nextInt();
		int sum=a+b;
		System.out.println("The sum of two numbers is: "+sum);
		scan.close();
	}

}
