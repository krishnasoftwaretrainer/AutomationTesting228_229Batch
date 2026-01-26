package operators;

public class Equals_DoubleEquals_EqualsTo_diff {

	public static void main(String[] args) {
		/*	
		int a = 10,b=20;
			a=b; //10=20
			int c=20;
			System.out.println(a);          // true
			*/
		/*
		int a = 10,b=10,c=20,d=30;
		System.out.println((a==b) && (c==d));   // false
		System.out.println((a==b) || (c==d));   // true
			*/
		String s1="hello";
		String s2="hello";
		
		
		System.out.println(s1==s2);          // true
		System.out.println(s1.equals(s2));   // true
		//System.out.println(s1.equalsIgnoreCase(s2));   // true	
			
		String s3=new String("hello1");  //123
		String s4=new String("hello");  //456
		
		System.out.println(s3==s3);          // false
		System.out.println(s3.equals(s4));   // true
		
			
			
	}

}
