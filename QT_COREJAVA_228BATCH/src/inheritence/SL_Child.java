package inheritence;

public class SL_Child  extends SL_Parent
{

	public void Son()
	{
		System.out.println("I am Son / Daughter Class");
	}
	
	public static void main(String[] args) {
		
		SL_Child c1 = new SL_Child();
		c1.Father();
		c1.Son();
		
	}
}
