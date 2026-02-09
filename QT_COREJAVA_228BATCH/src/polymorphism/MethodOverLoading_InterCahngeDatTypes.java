package polymorphism;

public class MethodOverLoading_InterCahngeDatTypes
{

	public void Addition(int a,double b)  //empty 1 2 3 3 4 5 6 7
	{
		double sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public void Addition(double a,int b)  //empty 1 2 3 3 4 5 6 7
	{
		double sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public void Addition(int a,float b)  //empty 1 2 3 3 4 5 6 7
	{
		float sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public static void main(String[] args)
	{
	
		MethodOverLoading_InterCahngeDatTypes overload=new MethodOverLoading_InterCahngeDatTypes();
		overload.Addition(10,20.5);
		overload.Addition(10.5,20);
		overload.Addition(10,20.5f);
		
	}
}
