package swag_Inheritence;

public class Swag_Child1 extends Swag_Parent
{

	
	public void ValidLogin()
	{
		System.out.println("Login Successfull");
	}
	
	public static void main(String[] args) {
		
		Swag_Child1 c1 = new Swag_Child1();
		//c1.BrowserConfig();
		c1.ValidLogin();
		//c1.BroswerClose();
		
		
	}
}
