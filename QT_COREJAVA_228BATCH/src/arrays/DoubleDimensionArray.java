package arrays;

import java.util.Scanner;

public class DoubleDimensionArray {

	public static void main(String[] args) {

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
		int a[][] = new int[4][3];

		System.out.println("Enter Array Elements:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = scan.nextInt();
			}
			System.out.println();
		}

		System.out.println("Given Array:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
