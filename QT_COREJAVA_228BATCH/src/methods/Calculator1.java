package methods;

public class Calculator1 
{
	//Metthod-1 Non-Static Method
	public void Addition()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Addition is: " + c);
	}
	
	//Method-2 Static Method
	 public static void Subtraction()
	 {
		 int a = 20;
		 int b = 10;
		 int c = a - b;
		 System.out.println("Subtraction is: " + c);
	 }
	 //Method-3 Non-Static Method
	 public void Multiplication()
	 {
		 int a = 10;
		 int b = 20;
		 int c = a * b;
		 System.out.println("Multiplication is: " + c);
	 }
	
	 //Method-4 Static Method
	 public static void Division()
	 {
		 int a = 20;
		 int b = 10;
		 int c = a / b;
		 System.out.println("Division is: " + c);
	 }
	 
	public static void main(String[] args) 
	{
		
		Calculator1 cal=new Calculator1();
		cal.Addition();
		//Calculator1.Addition();
		//Calculator1.Subtraction();
		cal.Subtraction();
		cal.Multiplication();
		Calculator1.Division();
		
		
	}
	
	
}
