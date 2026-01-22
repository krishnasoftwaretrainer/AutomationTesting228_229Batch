package operators;

public class Relational_Logical {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c=40;
		int d=50;
		
		System.out.println((a < b) && (c>d)); //false 
		System.out.println((a < b) || (c>d)); //true
		
		System.out.println((a <= b) && (c>d)); //false
		System.out.println((a < b) || (c>=d)); //true 
	
		System.out.println(!((a < b) && (c>=d))); //false
							//10<20 true &&	40>=50 false =false !false=true
		System.out.println(!(a < b) && (c>=d)); //false
		
		System.out.println((a < b) && !(c>=d)); //true
		
		
		
	
	}

}
