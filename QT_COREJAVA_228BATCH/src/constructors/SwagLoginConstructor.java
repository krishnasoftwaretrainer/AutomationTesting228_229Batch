package constructors;

public class SwagLoginConstructor 
{

	public SwagLoginConstructor(String username, String password)
	{
		System.out.println("Login with username: " + username + " and password: " + password);
	}
	
	public static void main(String[] args) {
		SwagLoginConstructor login1 = new SwagLoginConstructor("standard", "secret_sauce");
		 login1 = new SwagLoginConstructor("locked_out_user", "secret_sauce");
		login1 = new SwagLoginConstructor("problem_user", "secret");
}
}
