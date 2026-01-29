package looping_Statements;

public class PatternPrograms {

	public static void main(String[] args) {
		/*
		1	2	3	4	5 
		1	2	3	4	5
		1	2	3	4	5
		1	2	3	4	5
		1	2	3	4	5  */ //5 5 
		/*
		 * 1	1	1	1	1
		 * 2	2	2	2	2
		 * 3	3	3	3	3
		 * 4	4	4	4	4
		 * 5	5	5	5	5
		 */
		/*	* *	*	*	*	 
		 	* *	*	*	*	
		 	* *	*	*	*	
		 	* *	*	*	*	
		 	* *	*	*	*	  */
		/*
		for(int i=1;i<=5;i++) //rows 1 2 3 4 5 6
		{
			for(int j=1;j<=5;j++)
			{
				//System.out.print(j+"  ");
				//System.out.print(i+"  ");
				//System.out.print("* ");
				System.out.print(" KRISHNA ");
				
			}  //Exit of Inner Loop
			System.out.println();
		} */
		//Exit of Outer Loop
	/* Outer Loop:
	 * i=1;i<=5;1<=5 true
	 * 
	 * Inner Loop:
	 * j=1;j<=5;1<=5 true j++ //1 1 1 1 1
	 * j=2;j<=5;2<=5 true j++ //2 2 2 2 2
	 * j=3;j<=5;3<=5 true j++
	 * j=4;j<=5;4<=5 true j++
	 * j=5;j<=5;5<=5 true j++
	 * j=6;j<=5;6<=5 false Inner 
	 * 
	 * i++ i=2 2<=5 true Outer 
	 * 
	 * j=1;j<=5;1<=5 true j++
	 * Outer Loop 
	 * i=6;i<=5;6<=5 false
	 * 
	 * 	1    2   3   4   5
	 *  1	2   3   4   5
	 */
		/*
		1 
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5  */
		/*
		for(int i=1;i<=5;i++) //rows
		{
			for(int j=1;j<=i;j++) //columns
			{
				System.out.print(j+" ");
			}
			System.out.println();
		} */
		
		/*
		for(int i=1;i<=15;i++) //rows
		{
			for(int j=15;j>=i;j--) //columns
			{
				System.out.print(j+" ");
			}
			System.out.println();
		} */
		
		//Print 1 to 10 Tables
		for(int i=1;i<=100;i++) //Tables
		{
			for(int j=1;j<=10;j++) //Multiple
			{
				System.out.println(i +" * "+ j+" ="+(i*j));
			}
			System.out.println();
		}
		
	}

}
