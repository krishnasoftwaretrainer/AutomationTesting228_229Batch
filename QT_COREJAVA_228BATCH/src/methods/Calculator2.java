package methods;

public class Calculator2 //Calling Class
{
	//+ - * / %
	//Same Package and Different Class
	//Inside Package and Outside Class

	public void ModulsDivision()
	{
		int a = 20;
		int b = 3;
		int c = a % b;
		System.out.println("Modulus is: " + c);
	}
	public static void main(String[] args) 
	{
		Calculator1 cal1=new Calculator1();
		cal1.Addition(10,10);          //Non-Static Method Call by Object
		//Calculator1.Subtraction(); //Static Method Call by Class Name
		cal1.Multiplication();    //Non-Static Method Call by Object
		Calculator1.Division();    //Static Method Call by Class Name
		//Inside Package and Inside Class  
		Calculator2 cal2=new Calculator2();
		cal2.ModulsDivision();    //Non-Static Method Call by Object
	}
	

	
}
