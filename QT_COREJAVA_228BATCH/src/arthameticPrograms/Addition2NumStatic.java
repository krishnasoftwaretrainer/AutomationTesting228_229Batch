package arthameticPrograms;

import java.util.Scanner;

public class Addition2NumStatic 
{

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		//int a=30; //a variable is declared and initialized
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		
		short b=200; //b variable is declared and initialized
		//int b=200; //Normal Variable Initialization 
		System.out.println("b:"+b);
			b=500; //Variable Re-Initialization
			System.out.println("b after re-initialization:"+b);
		int c=300;
		
		int sum; //sum variable is declared
		sum=a+b+c;
		int sub=a-b;
		int mul=a*b;
		System.out.println(sum);
		//System.out.println("The sum of two numbers is: "+sum);
		System.out.println("The sub of two numbers is: "+sub);
		System.out.println("The mul of two numbers is: "+mul);
	}
}
