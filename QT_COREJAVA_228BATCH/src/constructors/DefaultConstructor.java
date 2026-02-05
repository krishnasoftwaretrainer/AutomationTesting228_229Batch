package constructors;

public class DefaultConstructor
{
	
	int id;
	String name;
	boolean status;
	double salary;
	
	public static void main(String[] args) 
	{
		DefaultConstructor obj = new DefaultConstructor();
		System.out.println("ID: "+obj.id);
		System.out.println("Name: "+obj.name);
	System.out.println("Status: "+obj.status);
		System.out.println("Salary: "+obj.salary);
	
	}
}
