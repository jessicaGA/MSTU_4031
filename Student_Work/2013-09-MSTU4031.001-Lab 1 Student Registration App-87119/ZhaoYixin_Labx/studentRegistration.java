
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
Comments: Good Job! 
*/

/* File: StudetRegistration.java
* By: Yixin Zhao
* UNI: yz2558
* Email: yz2558@tc.columbia.edu
* Date: 09/20/2013 
* Comments: Student Registration App*/


import java.util.Scanner;

public class studentRegistration {

public static void main (String[] args){

//Declare variables

String lastName;
String firstName;
String program;
String degree;
double creditsFirst;
double creditsSecond;
double total;

//creat a new scanner
Scanner studentRegistration = new Scanner(System.in);

//Ask user Questions
System.out.println ("Welcome to the Student Registration App, please complete your information as below.");

System.out.println("\nWhat is your last name?");
lastName = studentRegistration.nextLine();

System.out.println ("What is your first name?");
firstName = studentRegistration.nextLine();

System.out.println ("What program are you in?");
program = studentRegistration.nextLine();

System.out.println ("What is your degree?");
degree = studentRegistration.nextLine();

System.out.println ("How many credits have you taken in your first semester?");
creditsFirst = studentRegistration.nextDouble();

System.out.println ("How many credits have you taken in your second semester? or will be taking?");
creditsSecond = studentRegistration.nextDouble();

 

//Summary the questions
System.out.println("\n*******************************");

System.out.println("Last Name:" + lastName + "    " + "First Name:" + firstName);

System.out.println("\nProgram:" + program + "     " + "Degree:" + degree);

System.out.println("\nCredits taken in your first sememster:" + creditsFirst);

System.out.println("\nCredits taken in your second semester:" + creditsSecond);


total = creditsFirst + creditsSecond;
System.out.println("\nYour total credits of two semesters is:" + total);

}


}







