package methods;

public class WRWP {
	//With Return type With Parameter
	public int add(int a, int b) 
	{
		int c=a + b;  //10+20=30
		return c;
	}
	
	public static void main(String[] args) 
	{
		WRWP obj = new WRWP();
		int sum1 = obj.add(10, 20);
		System.out.println("Sum1 is: " + sum1);

		int sum2 = obj.add(30, 40);
		System.out.println("Sum2 is: " + sum2);

		int sum3 = obj.add(50, 60);
		System.out.println("Sum3 is: " + sum3);
	}
}
