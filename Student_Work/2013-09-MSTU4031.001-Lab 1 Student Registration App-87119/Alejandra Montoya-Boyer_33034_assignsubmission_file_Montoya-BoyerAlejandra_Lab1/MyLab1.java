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
Comments: Good Job! Try spacing your code out a little more so it is readable.
*/

/* File: MyLab1.java
By: Alejandra Montoya-Boyer
Email: amm2403@tc.columbia.edu
Date: 9/17/13
Comments: This is my Lab 1 Assignment.
*/

import java.util.Scanner;


public class MyLab1 {

	//The is my lab.
	public static void main (String[] args){
  
		//Declare variables
		String lastName;
		String firstName;
		String program;
		String degree;
		boolean enrolled;
		String enrolledConfirm;
		int creditsFirstSemester;
		int creditsSecondSemester;
		int totalCredits;


		//Creates a new scanner called myScanner.
		Scanner myScanner = new Scanner(System.in);

		//Ask for all the users' info and wait for user answer
		System.out.println ("Hey TC Student! Please fill out your registratinon form.");
		System.out.println ("Last name:");
		lastName = myScanner.nextLine();
		System.out.println ("First name:");
		firstName = myScanner.nextLine();
		System.out.println ("Program:");
		program = myScanner.nextLine();
		System.out.println ("Degree:");
		degree = myScanner.nextLine();
		System.out.println ("Are you currently enrolled? true or false");
		enrolled = myScanner.nextBoolean();
		System.out.println ("How many credits did you take your first semester?");
		creditsFirstSemester = myScanner.nextInt();
		System.out.println ("How many credits did you take your second semester?");
		creditsSecondSemester = myScanner.nextInt();
	

		
		//boolean code
		if ((enrolled == true))	{
			enrolledConfirm = "Y";
		}	else {
			enrolledConfirm = "N";
		}

		//Calculate total credits
		totalCredits = creditsFirstSemester + creditsSecondSemester;

			System.out.println (" ");
			System.out.println (" ");


		//Output info to user
		System.out.println ("Student Registration Application");
		System.out.println ("---------------------------------");
		System.out.println ("Student Name: " + lastName + ",\t" + firstName);
		System.out.println ("Program: " + program);
		System.out.println ("Degree: " + degree);
		System.out.println ("Enrolled: " + enrolledConfirm);
		System.out.println ("First Semester Credits: " + creditsFirstSemester);
		System.out.println ("Second Semester Credits: " + creditsSecondSemester);
		System.out.println ("Total Credits: " + totalCredits);
		System.out.println (" ");
		System.out.println (" ");

	
	}
}