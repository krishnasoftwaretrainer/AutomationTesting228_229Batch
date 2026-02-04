package methods;

public class WORWP {
	//Without Return type With Parameter
	
	public void Subtraction(int a,int b)
	{
		
		int c=a-b;
		System.out.println("Subtraction is: "+c);
	}
	
	public static void main(String[] args)
	{
		WORWP obj=new WORWP();
		obj.Subtraction(30, 10);
		obj.Subtraction(50, 20);
		obj.Subtraction(70, 30);
		
		
	}
}
