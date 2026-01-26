package operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		
		/*
		int a=10,b=10,c=10,d=10,e=10;
		
		System.out.println(a+=5);//15  
		System.out.println(b-=5);//5
		System.out.println(c*=5);//50
		System.out.println(d/=5);//2
		System.out.println(e%=5);//0
		
		*/
		int x=10;  //Normal Variable
		System.out.println(x+=5); //15:x=10+5 x=15
		System.out.println(x-=5);	//5 x=15-5 x=10
		System.out.println(x*=5); //50 x=10*5 x=50
		System.out.println(x/=5); //2 x=50/5 x=10
		System.out.println(x%=5); //0 x=10%5 x=0
		
		
	}

}
