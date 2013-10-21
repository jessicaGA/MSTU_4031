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

/* File: LeeYoonhyoung.java
 * By: Yoon Hyoung Lee (Joanne)
 * UNI: yhl2109@tc.columbia.edu
 * Date: 9/17/2013
 * Comments: 1st Lap Assignment
*/

import java.util.Scanner;

public class LeeYoonhyoung{
	public static void main(String[] args){

        String lastname;
        String firstname;
        String program;
        String degree;
        int firstcredits;
        int secondcredits;
        int totalcredits;
        Boolean graduate;
        String confirmgra;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Hello, Welcome to Joanne's registration application!");

        System.out.println("Enter your last name.");
        lastname = myScanner.nextLine();

        System.out.println("Enter your first name.");
        firstname = myScanner.nextLine();

        System.out.println("What program are you in?");
        program = myScanner.nextLine();

        System.out.println("Are you in MA or EdD program?");
        degree = myScanner.nextLine();

        System.out.println("How many credits did you take for first semester?");
        firstcredits = myScanner.nextInt();

        System.out.println("How many credits do/did you take for second semester?");
        secondcredits = myScanner.nextInt();
        totalcredits = firstcredits + secondcredits;

        System.out.println("Do you think you can graduate with your total credits? true or false");
        graduate = myScanner.nextBoolean();
        System.out.println (" ");

        if (totalcredits >= 36) {
        	confirmgra = "You can graduate with your credits.";
                                
        } else {
           	confirmgra = "You have to take more for graduation.";
        }

        //belows are for the results on the screen.

        System.out.println("===============================================");
        System.out.println("** Thank you for providing your information! **");
        System.out.println(" "); 
        System.out.println(firstname + " " + lastname + "\t" + "in" + " " + program + " " + program);
        System.out.println(degree);
        System.out.println("Credits taken first semester is " + firstcredits);
        System.out.println("Credits taken second semester is " + secondcredits);
        System.out.println("Total credits taken is " + totalcredits);
        System.out.println(confirmgra);
        System.out.println("===============================================");
		
	}
}