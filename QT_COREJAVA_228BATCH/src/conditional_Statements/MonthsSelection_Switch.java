package conditional_Statements;

import java.util.Scanner;

public class MonthsSelection_Switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the month here");
		char month = scanner.next().toUpperCase().charAt(0);

		switch (month) {
		case 'J':
			System.out.println("January");
			break;
		case 'F':
			System.out.println("February");
			break;
		case 'M':
			System.out.println("March");
			break;
		case 'A':
			System.out.println("April");
			break;
		case 'L':
			System.out.println("May");
			break;
		case 'U':
			System.out.println("June");
			break;
		case 'Y':
			System.out.println("July");
			break;
		case 'G':
			System.out.println("August");
			break;
		case 'S':
			System.out.println("September");
			break;
		case 'O':
			System.out.println("October");
			break;
		case 'N':
			System.out.println("November");
			break;
		case 'D':
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid Month");
			break;
		}

	}

}
