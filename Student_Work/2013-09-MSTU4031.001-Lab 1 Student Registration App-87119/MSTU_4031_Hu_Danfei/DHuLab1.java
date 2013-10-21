/*
========================Grading================================
Use string concatenations in at least 2 of your output messages. (1 point)
Use arithmetic operators (0 point)
Have clear variable names and comments. (1 point)
Bonus:
Prompt the user for a Boolean variable. (0 points)
Use an escape character to format your output. (Requires that you google escape characters). (0 point.) 
-----------
Total: 2/3
=========================Comments====================================
Comments: Remember to read all the requirements. You are missing the arithmetic operators.
*/



/* File: MyScanner.java
By: Danfei Hu
Email: dh2644@tc.columbia.edu
Date: 9/17/2013
Comments: This is the homework for Lab#1.
*/

import java.util.Scanner;


public class DHuLab1 {

	//This is my Java Program for lab#1.
	public static void main (String[] args){

		//Declares variables
		String lastName;
		String firstName;
		String progName;
		String degName;
		int grade = 0; 
		int firSemCre;     //number of credits earned in the first semester
		int secSemCre;     //number of credits earned in the second semester
		
		Scanner myScanner = new Scanner(System.in);

		//Allows a student to enter his/her information
		//Last Name
		System.out.println("Enter your last name");
		lastName = myScanner.nextLine();

		System.out.println("Last Name: " + lastName);

		//First Name
		System.out.println("Enter your first name");
		firstName = myScanner.nextLine();

		System.out.println("First Name: " + firstName);

		//Program
		System.out.println("Enter your program");
		progName = myScanner.nextLine();

		System.out.println("Program: " + progName);

		//Degree
		System.out.println("Enter your degree");
		degName = myScanner.nextLine();

		System.out.println("Degree: " + degName);

		//Ask if the student were a new student
		
		System.out.println("Please enter 1 if you are a new student, 0 if not");
		grade = myScanner.nextInt();

		if (grade == 1)     
		 {
		    System.out.println("Enter the number of credits you are taking.");
		    firSemCre = myScanner.nextInt();
		    System.out.println("Credits taken first semester: " + firSemCre);
		 } 
		 else
		 {
		 	System.out.println("Enter the number of credits you have earned in the first semester.");
		    firSemCre = myScanner.nextInt();
		    System.out.println("Credits taken first semester: " + firSemCre);

		    System.out.println("Enter the number of credits you are taking.");
		    secSemCre = myScanner.nextInt();
		    System.out.println("Credits taken second semester: " + secSemCre);
		 }        






	}
}