package testNG;

import org.testng.annotations.Test;

public class SampaleTestNG
{
	@Test(priority = 0,enabled = true)
	public void India()
	{
		System.out.println("India is my Country");
	}
	@Test(priority = 1,enabled = false)
	public void Telangana()
	{
		System.out.println("Telangana is my State");
	}
	
	@Test(priority = 2,invocationCount = 1)
	public void Hyderabad()
	{
		System.out.println("Hyderabad is my City");
	}
	
	@Test(priority = 3,invocationCount = 9)
	public void Ameerpet()
	{
		System.out.println("Ameerpet is my Area");
	}
}
