package operators;

public class ShiftOperators {

	public static void main(String[] args) {
		int a=5; //a<<4 
		//5 into Binary:0101
		//Lefet Shift:1's: 0101 0 
		//Lefet Shift:2's: 0101 00
		//Lefet Shift:3's: 0101 000
		//Lefet Shift:4's: 0101 0000
		System.out.println("a<<4: "+(a<<4)); //80
		int b=80;
		System.out.println("b>>4: "+(b>>4)); //5
		
		
		
		
	}

}
