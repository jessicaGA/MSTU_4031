/*
========================Grading================================
Use string concatenations in at least 2 of your output messages. (1 point)
Use arithmetic operators (1 point)
Have clear variable names and comments. (1 point)
Bonus:
Prompt the user for a Boolean variable. (1 points)
Use an escape character to format your output. (Requires that you google escape characters). (1 point.) 
-----------
Total: 5/3
=========================Comments====================================
Comments: Good Job! 
*/

/*File: StudentRegistrationApplication.java
By: Yang Jiang
Uni: yj2211
Email: yj2211@tc.columbia.edu
Date: 9/17/2013
Lab 1
Comments: This is the java application which will collect students' information and display the registration information on the console.
*/

import java.util.Scanner;

public class StudentRegistrationApplication {
	public static void main (String[] args){
		//Declare variables
		String lastName;
		String firstName;
		String program;
		String degree;
		int firstCredits;
		int secondCredits;
		int totalCredits;
		Boolean graduate;

		//Creates a new scanner called registrationApplication
		Scanner registrationApplication = new Scanner(System.in);

		//Ask question, and save the inputs as different variables;
		System.out.println ("Greetings, Student. What is your last name?");
		lastName = registrationApplication.nextLine();
		System.out.println ("");

		System.out.println ("What is your first name?");
		firstName = registrationApplication.nextLine();
		System.out.println ("");

		System.out.println ("What program are you in?");
		program = registrationApplication.nextLine();
		System.out.println ("");

		System.out.println ("What is your degree?");
		degree = registrationApplication.nextLine();
		System.out.println ("");

		System.out.println ("How many credits did you take for the first semester?");
		firstCredits = registrationApplication.nextInt();
		System.out.println ("");

		System.out.println ("How many credits did you take for the second semester?");
		secondCredits = registrationApplication.nextInt();
		System.out.println ("");

		System.out.println ("Have you taken 32 or more credits so far? Please enter \"true\" or \"false\".");
		graduate = registrationApplication.nextBoolean();
		System.out.println ("");

		//Calculate total credits
		totalCredits = firstCredits + secondCredits;

		//Output to user their registration information
		System.out.println (firstName + " " + lastName + ", below is the summary of your registration information.");
		System.out.println ("*************************************************************************");
		System.out.println ("Last Name: " + lastName + "\t" + "First Name: " + firstName);
		System.out.println ("Degree: " + degree);
		System.out.println ("Program: " + program);
		System.out.println ("Credits Taken First Semester: " + firstCredits);
		System.out.println ("Credits Taken Second Semester: " + secondCredits);
		System.out.println ("Total Credits You have Taken: " + totalCredits);

		//Judge and output student's graduation status.
		if ( graduate == true && totalCredits >= 32 ){
			System.out.println("Status: You are eligible to graduate.");
		}else{
			System.out.println("Status: You are not eligible to graduate.");
		}

		//Insert a blank line
		System.out.println ("");
}
}