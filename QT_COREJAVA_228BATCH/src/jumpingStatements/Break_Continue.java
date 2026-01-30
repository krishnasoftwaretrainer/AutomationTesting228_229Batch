package jumpingStatements;

public class Break_Continue {

	public static void main(String[] args) {


		for(int i=1;i<=10;i++) //1<=10 6<=10
		{
			//if(i==5) //1==5F 5==5 T 6==5 F
			//if(i>=5)  //1>=5F 
			//if(i<=5)
			
			//if(i==5 && i==7)
			if(i==5 || i==7)
			{
				//break; // terminates the loop permanently
				continue; // skips the current iteration only
			}
			
			System.out.println(i);//1  2  3 4 6 7 8 9 10
								// 1 2 3 4
								//
		}
		
		
		
		//break;
		//continue;
		
		//break cannot be used outside of a loop or a switch
		//continue cannot be used outside of a loop
	}

}
