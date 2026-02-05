package constructors;

public class Constructor_WithParameters 
{
     
	protected Constructor_WithParameters(String name, int age,double salary)
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	public static void main(String[] args) 
	{
	Constructor_WithParameters obj = new Constructor_WithParameters("John", 30,25.33);
	obj = new Constructor_WithParameters("Krishna", 20, 15.55);
	obj = new Constructor_WithParameters("Mohan", 40, 35.77);
	
	
	
	}
	
	
}
