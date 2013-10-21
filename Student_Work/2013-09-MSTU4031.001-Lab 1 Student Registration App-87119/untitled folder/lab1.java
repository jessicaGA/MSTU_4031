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
Comments: Good Job! Very good boolean variable names.
*/


/* File: lab1.java
By: Afnan Alganawi
uni: aa3321
email: aa3321@tc.columbia.edu
Date 9/16/13
Lab #1
*/

import java.util.Scanner;

public class lab1 {

	public static void main (String[] args){
		//Declare variables
	    String lastName;
	    String firstName;
	    String program;
	    String degree;
	    int firstSemCredits;
	    int secondSemCredits;
	    int totalCredits;
	    Boolean willGraduate;


		//creates a new scanner called myScanner. 
		Scanner myScanner = new Scanner(System.in);

		//Ask users for their last name, first name, program they are in, degree, credits taken during first and second semester.
		System.out.println("Type in the following:"); 

		System.out.println("Last name:");
        lastName = myScanner.nextLine(); //tells the computer to wait until the user enters the next line.

		System.out.println("First name:");
        firstName = myScanner.nextLine(); 

        System.out.println("The program you are currently enrolled in:");
        program = myScanner.nextLine(); 

        System.out.println("Degree:");
        degree = myScanner.nextLine(); 

        System.out.println("Type in the number of credits you have taken in your first semester (use numbers only)");
        firstSemCredits = myScanner.nextInt();// tells the computer to wait until the user enters the next line with an integer

        System.out.println("Type in the number of credits you have taken in your second semester (use numbers only)");
        secondSemCredits = myScanner.nextInt(); 


        totalCredits= firstSemCredits + secondSemCredits;// calculates the total credits taken in the two semesters. 


        System.out.println("Have you completed 32 credits or more in your program? please use true or false to answer this question.)");
        willGraduate = myScanner.nextBoolean(); // student will use "true" or "false" to answer this prompt.


        //output variables to student 
        System.out.println("**********************************************************");
        System.out.println("Student's name:" + firstName + " " + lastName );
        System.out.println("Program and degree student is enrolled in:" + "\n" + program + "\n"  + degree); // "\n" is an escape which inserts a new line at the certain point in the text
        System.out.println("Credits taken first semster:" + firstSemCredits);
        System.out.println("Credits taken second semester:" + secondSemCredits);
        System.out.println("Total credits taken:" + totalCredits);
        System.out.println("Eligibility for graduation:");



        // An if/else statement for the boolean variable that tests if the user answered true for completeing 32 credits or more and the total credits calculated here were greater than or equal to 32 
             if ((willGraduate == true) && (totalCredits >= 32)) {
        System.out.println("Congrats! you are able to apply for graduation.");
     }
     else {
       System.out.println("You are not ready to apply for graduation yet.");
     }



	}
}
  