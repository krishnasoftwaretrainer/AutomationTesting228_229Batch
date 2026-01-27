package conditional_Statements;

import java.util.Scanner;

public class EligibleToDonateBlood 
{
	public static void main(String[] args) 
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Age");
	int age = scan.nextInt();
	//System.out.println("Enter the Weight in Kgs");
	//int weight = scan.nextInt();
	
	if(age>=18)  //Outer T T F
	{
		System.out.println("Enter the Weight in Kgs");
		int weight = scan.nextInt();
		
		if(weight>=40) //Inner T F
		{
			System.out.println("Eligible to Donate Blood");  //TBS 
		}
		else //FBS of Inner
		{
			System.out.println("Not Eligible to Donate Blood due to Low Weight");
		}
	}
	else //FBS of Outer
	{
		System.out.println("Not Eligible to Donate Blood due to Low Age");
	}
	
	
	
	
	}

}
