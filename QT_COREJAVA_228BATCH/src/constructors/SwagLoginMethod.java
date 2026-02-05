package constructors;

public class SwagLoginMethod 
{
	
	public void SwagValidLogin()
	{
		String username = "standard_user";
		String password = "secret_sauce";
		System.out.println("Login with username: " + username + " and password: " + password);
	}
	
	public void SwagLockedOutLogin()
	{
		String username = "locked_out_user";
		String password = "secret_sauce";
		System.out.println("Login with username: " + username + " and password: " + password);
		}
	
	public void SwagProblemLogin()
	{
		String username = "problem_user";
		String password = "secret_sauce";
		System.out.println("Login with username: " + username + " and password: " + password);
	}
	
	public static void main(String[] args) {
		SwagLoginMethod login = new SwagLoginMethod();
		login.SwagValidLogin();
		login.SwagLockedOutLogin();
		login.SwagProblemLogin();
	}
	
	
	
	/*
	public void Swaglogin(String username, String password)
	{
		System.out.println("Login with username: " + username + " and password: " + password);
	}
	
	public static void main(String[] args) {
		SwagLoginMethod login = new SwagLoginMethod();
		login.Swaglogin("standard_user", "secret_sauce");
		login.Swaglogin("locked_out_user", "secret_sauce");
		login.Swaglogin("problem_user", "secret_sauce");
	} */
	
}
