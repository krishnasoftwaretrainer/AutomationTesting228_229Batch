import java.util.Scanner;
class Add2FloatDynamic
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.print("Enter First Value:");
float num1=scan.nextFloat();
System.out.print("Enter Second Value:");
float num2=scan.nextFloat();
float sum=num1+num2;
System.out.print("Addition of given Two float values:");
System.out.println(sum);
}
}