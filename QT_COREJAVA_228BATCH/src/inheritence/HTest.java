package inheritence;

public class HTest {

	public static void main(String[] args) {
		
		HChild1 c1 = new HChild1();
		c1.Father();
		c1.Son();
		System.out.println("********************");
		HChild2 c2 = new HChild2();
		c2.Father();
		c2.Daughter1();
		System.out.println("********************");
		HChild3 c3 = new HChild3();
		c3.Father();
		c3.Daughter2();
	}

}
