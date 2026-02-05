package swag_Inheritence;

public class Swag_Child2 extends Swag_Parent
{

	
	public void InvalidLogin()
	{
		System.out.println("Login Failed");
	}
	
	public static void main(String[] args) {
		
		Swag_Child2 c2 = new Swag_Child2();
		//c2.BrowserConfig();
		c2.InvalidLogin();
		//c2.BroswerClose();
		
		
	}
}
