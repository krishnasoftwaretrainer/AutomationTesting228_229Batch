package arrays;

import java.util.Scanner;

public class DoubleDimensionArray {
	
	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
				
		// String sname[]= {"","",""};
		// Static Array
		/*
		 * int a[][]= {{101,102,103},{104,105,106},{107,108,109}};
		 * 
		 * System.out.println("Given Array:");
		 * 
		 * for(int i=0;i<3;i++) { for(int j=0;j<3;j++) { System.out.print(a[i][j]+"  ");
		 * } System.out.println(); }
		 */
		// Dynamic Array
		// datatype arrayname[][]=new datatype[rsize][csize];
		
		System.out.println("Enter number of rows:");
		int rows = scan.nextInt();
		System.out.println("Enter number of columns:");
		int cols = scan.nextInt();
		
		int a[][] = new int[rows][cols];

		System.out.println("Enter Array Elements:");
		
		for (int i = 0; i <a.length; i++)
		//for (int i = 0; i < 4; i++) 
		{
			//for (int j = 0; j < 3; j++)
			for (int j = 0; j < a[0].length; j++)
			{
				
				a[i][j] = scan.nextInt();
			}
			System.out.println();
		}

		System.out.println("Given Array:");
		
		for (int i = 0; i < a.length; i++)
		{
		//for (int i = 0; i < 3; i++) {
			//for (int j = 0; j < 3; j++)
		for (int j = 0; j < a[0].length; j++)
		{
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
