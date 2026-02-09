package inheritence;

public class ML_Test {

	public static void main(String[] args) {
		MLChild1 c1 = new MLChild1();
		c1.m1();
		c1.m2();
		System.out.println("********************");
		MLGrandChild gc = new MLGrandChild();
		gc.m1();
		gc.m2();
		gc.m3();
		
	}

}
