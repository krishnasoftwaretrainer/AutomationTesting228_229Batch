package operators;

public class RelationalOperators {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		boolean alessThanb = a < b; // false
		System.out.println("a < b: " + alessThanb);
		
		//System.out.println("a < b: " + (a < b)); //false
		System.out.println("a > b: " + (a > b)); //true
		System.out.println("a <= b: " + (a <= b)); // false
		System.out.println("a >= b: " + (a >= b)); // true
		System.out.println("a == b: " + (a == b)); // false
		System.out.println("a != b: " + (a != b)); // true
	
	
	}

}
