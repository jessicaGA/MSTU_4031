/*
========================Grading================================
Use string concatenations in at least 2 of your output messages. (1 point)
Use arithmetic operators (1 point)
Have clear variable names and comments. (1 point)
Bonus:
Prompt the user for a Boolean variable. (0 points)
Use an escape character to format your output. (Requires that you google escape characters). (0 point.) 
-----------
Total: 3/3
=========================Comments====================================
Comments: Good Job! Code is easy to read.
*/


/* Xin Cheng,XC2252
XC2252@tc.columbia.edu
Sep.22,2013
Lab 1, Student Registration Form. */


import java.util.Scanner;
public class StudentRegistration2{

	//This are my print statements.
	public static void main(String[] args) {
          //Creates a new scanner called myScanner
          Scanner myScanner = new Scanner(System.in);

          //Declare variables
          String answer1, answer2, answer3, answer4;
          
          //Ask Question
          System.out.println("What is your last name?");
          answer1=myScanner.nextLine();
          
          //Ask Question
          System.out.println("What is your first name?");
          answer2=myScanner.nextLine();

          //Ask Question
          System.out.println("What is your program?");
          answer3=myScanner.nextLine();

          //Ask Question
          System.out.println("What is your degree?");
          answer4=myScanner.nextLine();

          //Declare variables
          int num1, num2, num3;
          //Ask Question
          System.out.println("Credits taken for the first semester?");
          num1=myScanner.nextInt();

          //Ask Question
          System.out.println("Credits taken for the second semester?");
          num2=myScanner.nextInt();

          //add the credits together
          num3= num2 + num1;



          //Output to user what is his last name
          System.out.println("LastName:" + answer1);
          System.out.println("FirstName:" + answer2);
          System.out.println("Program:" + answer3);
          System.out.println("Degree:" + answer4);
          System.out.println("Total credits taken:" + num3);
        
	}
}