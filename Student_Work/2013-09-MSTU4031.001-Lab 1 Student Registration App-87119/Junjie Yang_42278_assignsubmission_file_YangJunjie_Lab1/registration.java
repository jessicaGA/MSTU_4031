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
Comments: Good Job. Nice indentation.
*/


/* File Name: registration
 * My Name: Junjie Yang
 * UNI: jy2555
 * Email: jy2555@tc.columbia.edu
 * Date: 9/21/2013
 * Lab Number: 1
 * Comments: Students Registration Application
*/

import java.util.Scanner;

public class registration{
	public static void main(String[] args){

		String LastName, FirstName, Program, Degree;
		int CreditsFirstSemester, CreditsSecondSemester, CreditsTotal;
		
		Scanner myScanner = new Scanner(System.in);

	    System.out.println("Hello Students!\nWelcome To Teacher's College, Columbia University!"); 

	    System.out.println("Please enter your last name:");
	    LastName = myScanner.nextLine();

	    System.out.println("Please enter your first name:");
	    FirstName = myScanner.nextLine();
		
		System.out.println("Please enter your Program:");
	    Program = myScanner.nextLine();
		
		System.out.println("Please enter your Degree:");
	    Degree = myScanner.nextLine();
		
		System.out.println("Please enter your credits taken first semester:");
	    CreditsFirstSemester = myScanner.nextInt();
		
		System.out.println("Please enter your credits taken second semester:");
	    CreditsSecondSemester = myScanner.nextInt();
		
		CreditsTotal = CreditsFirstSemester + CreditsSecondSemester;
		
		System.out.println("Your last name: " + LastName);
		System.out.println("Your first name: " + FirstName);
		System.out.println("Your program: " + Program);
		System.out.println("Your degree: " + Degree);
		System.out.println("Your credits taken first semester: " + CreditsFirstSemester);
		System.out.println("Your credits taken second semester: " + CreditsSecondSemester);
		System.out.println("Your total credits taken: " + CreditsTotal);
	    
	}
}