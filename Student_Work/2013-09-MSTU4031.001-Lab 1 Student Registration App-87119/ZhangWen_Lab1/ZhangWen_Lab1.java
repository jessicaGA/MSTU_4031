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


/* File: ZhangWen_Lab1.java
* By: Wen Zhang
* Email: wz2236@tc.columbia.edu
* Date: 9/17/2013
* Comments: MSTU 4031 in class lab1
*/

import java.util.Scanner;

public class ZhangWen_Lab1// Class declaration
{
public static void main(String[] args){ //Main method  

	//declare variables
	String lastName;
	String firstName;
	String program;
	String degree;
	int creditFirstSemester;
	int creditSecondSemester;
	int creditTotal;
	boolean studentStatus;
	String fullOrPartConfirm;

	//create myScanner
	Scanner myScanner = new Scanner(System.in);

//ask the user to answer the questions line by line
System.out.println("Last Name:");
lastName = myScanner.nextLine();
System.out.println(" ");

System.out.println("First Name:");
firstName = myScanner.nextLine();
System.out.println(" ");

System.out.println("Program at TC:");
program = myScanner.nextLine();
System.out.println(" ");

System.out.println("Degree:");
degree = myScanner.nextLine();
System.out.println(" ");

System.out.println("Number of credits for 1st semester:");
creditFirstSemester = myScanner.nextInt();
System.out.println(" ");

System.out.println("Number of credits for 2nd semester:");
creditSecondSemester = myScanner.nextInt();
System.out.println(" ");

	creditTotal = creditFirstSemester + creditSecondSemester;//calculate the credits in total for two semesters

System.out.println("Are you taking 12 or more credits for current semester? true or false");
studentStatus = myScanner.nextBoolean();
System.out.println(" ");

	//use boolean to check student status (full-time vs part-time)
	if (studentStatus == true) {
		fullOrPartConfirm = "Full-time";
	} else {
		fullOrPartConfirm ="Part-time";
	}

//print student registration summary
System.out.println("Student Registration Summary");
System.out.println("******************************");
System.out.println("Student Name: " + firstName + lastName + "\t" + "\t" + "Program: " + program);
System.out.println("Degree: " + degree);
System.out.println("1st Semester Credits: " + creditFirstSemester + "\t" + "\t" + "2nd Semester Credits: " + creditSecondSemester);
System.out.println("Total Credits: " + creditTotal);
System.out.println("Current Student Status: " + fullOrPartConfirm);
System.out.println(" ");
}
}