package arrays;

import java.util.Scanner;

public class MultiDimensionArrays
{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Array First Array Row Size:");
		int frows=scan.nextInt();
		System.out.println("Array First Array Column Size:");
		int fcols=scan.nextInt();
		
		System.out.println("Array Second Array Row Size:");
		int srows=scan.nextInt();
		System.out.println("Array Second Array Column Size:");
		int scols=scan.nextInt();
				
		//int a[][]=new int[2][3];
		//int b[][]=new int[2][3];
		
		if(frows==srows && fcols==scols)  //True
		{
			
		int a[][]=new int[frows][fcols];
		int b[][]=new int[srows][scols];
		int c[][]=new int[frows][fcols];
		
		System.out.println("Enter elements for first array:");
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		
		System.out.println("Enter elements for second array:");
		for(int i=0;i<b.length;i++) 
		{
			for(int j=0;j<b[0].length;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		
		
		System.out.println("Sum of two arrays:");
		
		for(int i=0;i<c.length;i++) 
		{
			for(int j=0;j<c[0].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		}
		else
		{
			System.out.println("Addition not possible, Rows and Columns must be same");
		}
		
		
		
		
	}

}
