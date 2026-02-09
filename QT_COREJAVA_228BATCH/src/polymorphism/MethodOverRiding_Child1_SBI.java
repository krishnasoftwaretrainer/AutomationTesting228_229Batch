package polymorphism;

public class MethodOverRiding_Child1_SBI extends MethodOverRiding_Parent_RBI
{

	public void RateOfIntrest()
	{
		System.out.println("SBI Rate of Intrest:6%");
	}
	
	public static void main(String[] args) {
		
		MethodOverRiding_Child1_SBI sbi=new MethodOverRiding_Child1_SBI();
		sbi.RateOfIntrest();
		
	}
}
