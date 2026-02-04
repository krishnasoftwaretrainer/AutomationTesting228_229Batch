package methods;

public class WRWOP {
	//With Return type Without Parameter
	
	public int Multiplication()
	{
		int a=10; //Variables
		int b=20;
		int c=a*b;
		return c;
	}
	
	
	public static void main(String[] args)
	{
		WRWOP obj=new WRWOP();
		//int mul=obj.Multiplication(); //Method Call
	//System.out.println("Multiplication is: "+mul);
	System.out.println("Multiplication is: "+obj.Multiplication());
	
	}
}
