package polymorphism;

public class MOR_Test {

	public static void main(String[] args) {
		MethodOverRiding_Child1_SBI sbi=new MethodOverRiding_Child1_SBI();
		sbi.RateOfIntrest();
		
		MethodOverRiding_Child2_ICICI icici=new MethodOverRiding_Child2_ICICI();
		icici.RateOfIntrest();
		
		MethodOverRiding_Child3_HDFC hdfc=new MethodOverRiding_Child3_HDFC();
		hdfc.RateOfIntrest();
	}

}
