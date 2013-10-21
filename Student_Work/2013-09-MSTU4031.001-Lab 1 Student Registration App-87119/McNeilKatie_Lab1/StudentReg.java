
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
Comments: Good Job! Try spacing your code so it is easier to read.
*/

/* File: StudentReg.java
Name: Katie McNeil
UNI: kjm2170
Email: kjm2170@tc.columbia.edu
Date: 9/17/13
Lab: 1
Comments: This is an program to gather registration information for students and determine if they are eligible for graduation. 
*/

import java.util.Scanner;


public class StudentReg {

	public static void main (String[] args){
		//Declare variables
		String lastName;
		String firstName;
		String programType;
		String degreeType;
		int creditsFirst;
		int creditsSecond;
		int totalCredits;

		//Creates a new scanner called myScanner.
		Scanner myScanner = new Scanner(System.in);

		//Welcomes user. Asks user for last name.
		System.out.println("Hey! Let's figure out if you are eligible for graduation at Teachers College. First, what is your last name?");
		lastName = myScanner.nextLine();
		//Asks user for first name
		System.out.println("Alright, great. What is your first name?");
		firstName = myScanner.nextLine();
		//Asks user for program type
		System.out.println("Fantastic. What program are you in?");
		programType = myScanner.nextLine();
		//Asks user for degree type.
		System.out.println("Awesome. And what degree?");
		degreeType = myScanner.nextLine();
		//Asks user for first semester credits.
		System.out.println("Almost done. How many credits did you take your first semester at TC?");
		creditsFirst = myScanner.nextInt();
		//Asks user for second semester credits. 
		System.out.println("And how many in your second semester?");
		creditsSecond = myScanner.nextInt();
		//Adding first and second semester credits
		totalCredits = (creditsFirst + creditsSecond);


	
		//Showing user summary of data. 
		System.out.println("Your Registration Summary");
		System.out.println("-----------------------------------");
		System.out.println("Name: " + lastName + ", " + firstName + "\t" + "Degree: " + degreeType + "\t" + "Program: " + programType); 
		System.out.println("First Semester Credits: " + creditsFirst + "\t" + "Second Semester Credits: " + creditsSecond);
		System.out.println("Total Credits: " + totalCredits);
		System.out.println("-----------------------------------");

		//This will tell the user if they are eligible for graduation (i.e., if they have more than 36 credits.)
		if (totalCredits >= 36) {
  		System.out.println("Congrats! You are eligible for graduation!");
		}
		else {
  		System.out.println("Bummer. You still need more credits to graduate.");
		}



	}
}



