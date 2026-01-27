package conditional_Statements;

import java.util.Scanner;

public class StudentResult_Grades {

	public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter the Obtained Marks");
         byte obtainedMarks = scan.nextByte();
         
         if(obtainedMarks>=85 && obtainedMarks<=100   )//65>=85 false 120>=85 
         {			//85 to 100
        	 System.out.println("Student Grade is A");
		 }  //Exit the if block
         
		 else if(obtainedMarks>=70 && obtainedMarks<85) //120>=70 true
		 {					//70 to 84
			 System.out.println("Student Grade is B");
		 }
		 else if(obtainedMarks>=55 && obtainedMarks<70) //120>=55 true
		 {
			 System.out.println("Student Grade is C");
		 }
		 
		 else if(obtainedMarks>=35 && obtainedMarks<55) //120>=40 true
		 {
			 System.out.println("Student Grade is D");
		 }
                  		 else if(obtainedMarks>=0 && obtainedMarks<35) //120>=0 true
		 {
			 System.out.println("Student is Failed");
		 }
		 else
		 {
			 System.out.println("Invalid Marks");
         }
         
	}

}
