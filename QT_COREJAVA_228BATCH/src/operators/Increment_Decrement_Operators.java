package operators;

public class Increment_Decrement_Operators {

	public static void main(String[] args) {
			/*
           int a=10,b=10,c=10,d=10;
           System.out.println("++a: "+(++a)); //10  a=11:updated:11
           System.out.println("After Update: "+a); //11  a=10:updated:10
           System.out.println("b++: "+b++); //10  b=9 updated:11
           System.out.println("After Update: "+b); //11  b=10:updated:10
           System.out.println("--c: "+--c); //9   c=9 :updated:9
           System.out.println("After Update: "+c); //9   c=10 :updated:10
           System.out.println("d--: "+d--); //10  d=9 updated:9
           System.out.println("After Update: "+d); //9   d=10 updated:10
           */
           //a=10; a++; a+10=21 | b=10; ++b; b+10=21
	
		int x=10;
		System.out.println("Initial Value: "+x);//10
		
		System.out.println("x++: "+x++); //10
		System.out.println("After Update: "+x); //11
		
		System.out.println("++x: "+(++x)); //12
		System.out.println("After Update: "+x); //12
		
		System.out.println("x--: "+x--); //12
		System.out.println("After Update: "+x); //11
		
		System.out.println("--x: "+(--x)); //10
		System.out.println("After Update: "+x); //10
		
		System.out.println("Final Value: "+x); //10
	
	
	}

}
