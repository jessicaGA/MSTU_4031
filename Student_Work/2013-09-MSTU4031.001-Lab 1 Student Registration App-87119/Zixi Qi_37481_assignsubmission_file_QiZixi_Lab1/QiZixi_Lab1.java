/*
========================Grading================================
Use string concatenations in at least 2 of your output messages. (1 point)
Use arithmetic operators (1 point)
Have clear variable names and comments. (1 point)
Bonus:
Prompt the user for a Boolean variable. (0 points)
Use an escape character to format your output. (Requires that you google escape characters). (1 point.) 
-----------
Total: 4/3
=========================Comments====================================
Comments: Good Job. You should include comments on all files you send me. i.e name, file name.
*/

import java.util.Scanner;

public class QiZixi_Lab1 {
	public static void main (String[] args){


		Scanner myScanner = new Scanner(System.in);
		String lastname;
		String firstname;
		String program;
		String degree;
		int credits1;
		int credits2;
		int credits;

	/* Get basic information from the user */
        	System.out.println("Last Name");
		lastname = myScanner.nextLine();
		System.out.println("");

                System.out.println("First Name");
                firstname = myScanner.nextLine();
                System.out.println("");

                System.out.println("What's your program at TC?");
                program = myScanner.nextLine();
                System.out.println("");

                System.out.println("Your degree?");
                degree = myScanner.nextLine();
                System.out.println("");
        
                System.out.println("Credits taken first semester?");
                credits1 = myScanner.nextInt();
                System.out.println("");

                System.out.println("Credits taken second semester?");
                credits2 = myScanner.nextInt();
                System.out.println("");

        credits = credits1 + credits2;
     /*This is feedback. \n is escape character for next line */
		System.out.println("***************************************"+"\n"+"Hello"+" "+firstname+" "+lastname);
		System.out.println("You are currently a "+degree+" student in "+program);
		System.out.println("You took "+credits1+" credits first semester and "+credits2+" credits second semester");
		System.out.println("You earned "+credits+" credits in total");

     /*This is a Boolean*/
        if (credits < 34) { 
        	System.out.println("Eligible for graduation: No");
        }
        else{
        	System.out.println("Eligible for graduation: Yes");
        }

	}
}