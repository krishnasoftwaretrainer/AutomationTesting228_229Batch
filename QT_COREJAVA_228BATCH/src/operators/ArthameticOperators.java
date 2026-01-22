package operators;

import java.util.Scanner;

public class ArthameticOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Enter first number: ");
		//int a = scan.nextInt();
		//System.out.println("Enter second number: ");
		//int b = scan.nextInt();
		
		//int a=5,b=5;
		float a=5.5f,b=2.3f;
		
		//float addition = a + b;
		float subtraction = a - b;
		float multiplication = a * b;
		float division = a / b;
		float modulus = a % b;
		
		int addition = (int)(a + b);
		//int subtraction = a - b;
		//int multiplication = a * b;
		//int division = a / b;
		//int modulus = a % b;
		System.out.println("Addition: " + addition);
		System.out.println("Subtraction: " + subtraction);
		System.out.println("Multiplication: " + multiplication);
		System.out.println("Division: " + division);
		System.out.println("Modulus: " + modulus);
		
		System.out.println(25+25);
		System.out.println(25-25);
		System.out.println(25*25);
		System.out.println(25/25);
		System.out.println(25%25);
		
		
		//int a = 10;
		//int b = 3;
		/*
		System.out.println("Addition: " + (a + b)); //13
		System.out.println("Subtraction: " + (a - b)); //7
		System.out.println("Multiplication: " + (a * b));//30
		System.out.println("Division: " + (a / b)); //3
		System.out.println("Modulus: " + (a % b)); //1
		
		*/
			
		/*System.out.println(10/3);
			System.out.println(10%3);
			System.out.println(3/10);
			System.out.println(3%10);*/
	}

}
