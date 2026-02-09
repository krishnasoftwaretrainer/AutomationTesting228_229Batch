package polymorphism;

public class MethodOverLoading_CompileTime 
{
	int sum;  //Global Variable
	//Number of Parameters 
	public void Addition(int a,int b)  //empty 1 2 3 3 4 5 6 7
	{
		sum=a+b;
		System.out.println("Sum:"+sum);
	}
	
	public void Addition(int a,int b,int c) //
	{
		sum=a+b+c;
		System.out.println("Sum:"+sum);

	}
	
	public void Addition(int a,int b,int c,int d) //
	{
		sum=a+b+c+d;
		System.out.println("Sum:"+sum);

	}
	
	public static void main(String[] args)
	{
	
		MethodOverLoading_CompileTime overload=new MethodOverLoading_CompileTime();
		overload.Addition(10, 20);
		//overload.Addition(100, 200);
		overload.Addition(10, 20, 30);
		overload.Addition(10, 20, 30, 40);
	}
	
	
	
	
	
}


