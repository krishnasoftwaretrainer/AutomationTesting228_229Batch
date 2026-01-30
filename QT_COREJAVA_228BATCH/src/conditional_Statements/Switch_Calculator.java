package conditional_Statements;

import java.util.Scanner;

public class Switch_Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();

		System.out.println("CALCULATOR");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modules Division");

		System.out.println("Choose your Option");
		byte option = scanner.nextByte();

		switch (option) {
		case 1: {
			int sum = num1 + num2;
			System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
			break;
					}
		case 2: {
			int difference = num1 - num2;
			System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
			break;	
		}

		case 3: {
			int product = num1 * num2;
			System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
			break;
		}
		case 4: {
			int div = num1 / num2;
			System.out.println("The division of " + num1 + " by " + num2 + " is: " + div);
			break;
		}
		case 5: {
			int mod = num1 % num2;
			System.out.println("The modulus of " + num1 + " and " + num2 + " is: " + mod);
				break;
		}
		default:
			System.out.println("Invalid Option");
			break;
		}
	}

}
