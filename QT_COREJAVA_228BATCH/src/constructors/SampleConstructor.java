package constructors;

public class SampleConstructor
{

	public  SampleConstructor()
	{
		String name1="Krishna";
		System.out.println("This is a sample constructor");
	}
	
	public  void SampleConstructor1()
	{
		System.out.println("This is a sample Method");
	}
	
	public static void main(String[] args) 
	{
		//ClassName objectName = new ClassName();
		SampleConstructor con=new SampleConstructor();
		con.SampleConstructor1();
		
	}
}
