package polymorphism;

public class MethodOverLoading_DifferentDataTypes {

	public void Addition(int a,int b)  //empty 1 2 3 3 4 5 6 7
	{
		int sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public void Addition(double a,double b)  //empty 1 2 3 3 4 5 6 7
	{
		double sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public void Addition(float a,float b)  //empty 1 2 3 3 4 5 6 7
	{
		float sum=a+b;
		System.out.println("Sum:"+sum);
	}
}
