package swag_Inheritence;

public class Swag_Child3  extends Swag_Parent
{

	
	public void BlankLogin()
	{
		System.out.println("Blank Login");
	}
	
	public static void main(String[] args) {
		
		Swag_Child3 c3 = new Swag_Child3();
		//c3.BrowserConfig();
		c3.BlankLogin();
		//c3.BroswerClose();
		
		
	}
}
