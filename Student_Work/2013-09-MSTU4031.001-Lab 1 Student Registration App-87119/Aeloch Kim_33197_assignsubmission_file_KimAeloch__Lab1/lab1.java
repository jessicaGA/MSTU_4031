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
Comments: Good Job. Nice work finding Next Boolean.
*/




/* Files:myScanner.java
By: Enok Kim
Email: ak3496@tc.columbia.edu
Date: 9/17/2013
Comments: Lab 1 - assignment 
*/

import java.util.Scanner;

public class lab1 {

//This is my print statements.
public static void main (String[] args){
	//declare variables
	String firstName, lastName, program, degree, yes, no;
	int firstSemester, secondSemester;
	int totalCredits;
	boolean tcExperience;

	//creates a new scanner called myScanner
	Scanner myScanner = new Scanner(System.in);

	//Ask a question then run the scanner 
	System.out.println ("What is last name?");
	firstName = myScanner.nextLine();

	System.out.println ("What is first name?");
	lastName = myScanner.nextLine();

	System.out.println ("What program are you in?");
	program = myScanner.nextLine();

	System.out.println ("What degree are you in?");
	degree = myScanner.nextLine();

	System.out.println ("How many credits did you take for first semester?");
	firstSemester = myScanner.nextInt();

	
	System.out.println ("How many credits did you take for second semester?");
	secondSemester = myScanner.nextInt();

	System.out.println ("Do you like TC so far? (true or false)");
	tcExperience = myScanner.nextBoolean();
	
	System.out.println ("_________________________ ");
	System.out.println("Your Name: "+ lastName+ "," + firstName); 
	System.out.println("Program:"+ program); 
	System.out.println("Degree:"+ degree); 
	System.out.println("Credits taken in first semester:"+ firstSemester+ "\t" 
		+"Credits taken in second semester:"+ secondSemester);

	totalCredits = firstSemester+secondSemester;
	System.out.println("Total Credits:"+ totalCredits); 

	if (tcExperience) {
		System.out.println("\t\t\t\t Go TC");
	} 
	else {
		System.out.println ("\t\t\t\t I am sorry");

	}



		}
}