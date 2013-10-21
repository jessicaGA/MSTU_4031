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


/*
File: SternBen_Lab1.java
By: Ben Stern
Uni: bms2170
Date: 9/16/2013
Lab number: 1
Email: benjamin.m.stern@gmail.com

*/

import java.util.Scanner;

public class SternBen_Lab1 {
	
	public static void main (String[] args){

		//declaring variables
		String lastName; 
		String firstName; 
		String program;
		String degree;
		int creditsFirst;
		int creditsSecond;
		int totalCredits;
		int answer;
		boolean expert = true;


		//creates a new scanner
		Scanner stringScanner = new Scanner(System.in);
		Scanner intScanner = new Scanner(System.in);

		//Ask a question
		System.out.println("What is your first name?");
		firstName = stringScanner.nextLine();
		System.out.println("What is your last name?");
		lastName = stringScanner.nextLine();
		System.out.println("What program are you in?");
		program = stringScanner.nextLine();
		System.out.println("What degree are you pursuing?");
		degree = stringScanner.nextLine();

		System.out.println("How many credits are you taking first semester?");
		creditsFirst = intScanner.nextInt();
		System.out.println("How many credits are you taking second semester?");
		creditsSecond = intScanner.nextInt();

		//adds credits
		totalCredits = creditsFirst + creditsSecond;

		//checking answer, intelligence

		System.out.println("How many credits do you think you're taking total? ");
		answer = intScanner.nextInt();

	

		//judgment day with escape characters and boolean logic. added the variable, though it doesn't actually do anything :) 
		if (expert == true && answer == totalCredits) {
    		System.out.println("Indeed you are!");
		} else if (answer != totalCredits) {
   			System.out.println("You should work on your math skills. Einstein said, \"Pure mathematics is, in its way, the poetry of logical ideas.\" He was right.");
			}


		//print
		System.out.println("Your name is " + firstName + " " + lastName);
		System.out.println("Your program and degree are " + program + " and " + degree);
		System.out.println("You are taking " + totalCredits + " this year!");
	
		



	
		
	}
}