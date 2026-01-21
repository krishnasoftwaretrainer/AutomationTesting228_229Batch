package variables_DatTypes;

import java.util.Scanner;

public class DataTypes_Memory {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//byte a=100; //1 byte memory
		//byte a=-129;
		//short a=100; //2 byte memory
		//short a=32768;
		//int a=32768;
		//int a=2147483647; //4 byte memory
		//int a=100; //4 byte memory
		//long a=100; //8 byte memory
		//long a=9223372036854775807L; //8 byte memory
		
		//float a=10.1234567890F; //4 byte memory
		//double a=10.1234567890123456789; //8 byte memory
		//double a=10.1234567890;
		//float a=10.1234567890f; //4 byte memory
		
		//char a='#'; //2 byte memory
		//boolean a=true; //1 byte memory
		//boolean b=false;
		
		String name="Core dfg WTR 434 $^%$^$% Java"; 
		System.out.println(name);
		//System.out.println("a:"+a);
		//System.out.println("b:"+b);
		
		byte a=sc.nextByte();
		short b=sc.nextShort();
		int c=sc.nextInt();
		long d=sc.nextLong();
		float e=sc.nextFloat();
		double f=sc.nextDouble();
		char g=sc.next().charAt(0);
		boolean h=sc.nextBoolean();
		String i=sc.next();	//Rama Rao He is a Boy 
		String j=sc.nextLine();//Rama Rao 
		
		
	}

}
