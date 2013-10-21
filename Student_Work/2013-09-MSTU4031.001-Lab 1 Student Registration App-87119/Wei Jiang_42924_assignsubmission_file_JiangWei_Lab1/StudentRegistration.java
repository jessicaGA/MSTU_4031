
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
Comments: Good Job! Next time space out your code more so it is easier to read. s
*/


/* WeiJiang_lab1.zip, Wei Jiang, wj2222, wj2222@tc.columbia.edu,
09/17/2013, lab1 */

import java.util.Scanner;

public class StudentRegistration{
	
public static void main(String[] args){
        //declare variables
		String lastName;
		String firstName;
		String program;
		String degree;
		int creditsTakenFirstSemester;
		int creditsTakenSecondSemester;
		int totalCredits;
		String gradconfirm;
		Boolean graduate;

        //create a new scanner called myScanner
		Scanner myScanner = new Scanner(System.in);
         
        //ask questions
	    System.out.println("Hello! Welcome To Teachers College!\nWhat is your last name?"); 
        
        //Output to user
	    lastName = myScanner.nextLine();
	    System.out.println("What is your first name?"); 
	    firstName = myScanner.nextLine();
	    System.out.println("What is your program?");  
	    program = myScanner.nextLine();
	    System.out.println("What is your degree?"); 
	    degree = myScanner.nextLine();
	    System.out.println("Please enter the credits you have taken first semester:");
	    creditsTakenFirstSemester = myScanner.nextInt();
	    System.out.println("Please enter the credits you have taken second semester:");
	    creditsTakenSecondSemester = myScanner.nextInt();

        //calculate the total credits
	    totalCredits = creditsTakenFirstSemester + creditsTakenSecondSemester;
	    System.out.println("Your total credits is: " + totalCredits);

        //give feedback about graduation qualification
	    System.out.println("Have you taken more than 32 credits? true or false.");
	    graduate = myScanner.nextBoolean();
	    System.out.println (" ");

        if ((graduate == true) && (totalCredits >= 32)) {
        	gradconfirm = "Yes";
        } else {
        	gradconfirm = "No";
        }
        
        //show summary of Student Registration
        System.out.println ("Student Registration Summary");
        System.out.println ("*********************************************");
        System.out.println ("Student Name: " + lastName + "," + firstName);
        System.out.println ("Program: " + program);
        System.out.println ("Degree: " + degree);
        System.out.println ("Semester one credits: " + creditsTakenFirstSemester);
        System.out.println ("Semester two credits: " + creditsTakenSecondSemester);
        System.out.println ("Total credits: " + totalCredits);
        System.out.println ("Can student graduate this semester? " + gradconfirm);
        System.out.println ("*********************************************");
        System.out.println ("Your registration has been successfully completed. Thank you so much!");
        
	}
}