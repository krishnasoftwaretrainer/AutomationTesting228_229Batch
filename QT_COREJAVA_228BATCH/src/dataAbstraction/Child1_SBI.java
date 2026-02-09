package dataAbstraction;

public class Child1_SBI extends Parent_RBI
{

	public void RateOfIntrest()
	{
		System.out.println("SBI Intrest Rate:6%");
	}
	
	public void BankTimings()
	{
	System.out.println("Morning 9am to Evening 6pm");	
	}
	
	public static void main(String[] args) {
		Child1_SBI ch1=new Child1_SBI();
		ch1.RateOfIntrest();
		ch1.BankTimings();
		
	}
}
