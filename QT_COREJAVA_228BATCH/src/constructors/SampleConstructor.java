package constructors;

public class SampleConstructor
{

	public SampleConstructor()
	{
		System.out.println("This is a sample constructor");
	}
	public  void SampleConstructor1()
	{
		System.out.println("This is a sample Method");
	}
	
	public static void main(String[] args) 
	{
		//ClassName objectName = new ConstructorName();
		
	SampleConstructor sc = new SampleConstructor();
		sc.SampleConstructor1();
	
		Constructor_WithParameters cwp = new Constructor_WithParameters("Alice", 25,2.5);
		
	}
}
