package arrays;

import java.util.Scanner;

public class SingleDimensionArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int a=10; 
		/*
		int htno[]= {1001,1002,1003,1004,1005};
		
		for(int i=0;i<5;i++) //6
		{
			//System.out.println(htno[i]);
			System.out.print(htno[i]+" \t ");
		}  */
		
		//Memory Allocation
		//datatype arryname[]=new datatype[Size];
		int htno[]=new int[5];
		
		System.out.println("Enter Arrays Elements");
		
		for(int i=0;i<5;i++)
		{
			htno[i]=scan.nextInt();
			
		}
		
		System.out.println("Given Array:");
		for(int i=0;i<5;i++) //6
		{
			//System.out.println(htno[i]);
			System.out.print(htno[i]+" \t ");
		}
	}

}
