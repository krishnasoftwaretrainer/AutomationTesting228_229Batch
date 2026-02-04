package arthameticPrograms;

import methods.*;

public class Calculator3  //Calling Class
{
	//+ - * / %
	//Different Package and Different Class
	
	public static void main(String[] args)
	{
		Calculator1 cal1=new Calculator1();
		cal1.Addition();          //Non-Static Method Call by Object
		Calculator1.Subtraction(); //Static Method Call by Class Name
		cal1.Multiplication();    //Non-Static Method Call by Object
		Calculator1.Division();    //Static Method Call by Class Name
		
		Calculator2 cal2=new Calculator2();
		cal2.ModulsDivision();    //Non-Static Method Call by Object
	}	
}
