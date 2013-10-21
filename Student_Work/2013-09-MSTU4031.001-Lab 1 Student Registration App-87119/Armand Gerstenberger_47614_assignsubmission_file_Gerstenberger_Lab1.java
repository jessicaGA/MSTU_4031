/*
========================Grading================================
Use string concatenations in at least 2 of your output messages. (1 point)
Use arithmetic operators (1 point)
Have clear variable names and comments. (1 point)
Bonus:
Prompt the user for a Boolean variable. (0 points)
Use an escape character to format your output. (Requires that you google escape characters). (1 point.) 
-----------
Total: 5/3
=========================Comments====================================
Comments: Good Job! 
*/


//* File: Gerstenberger_Lab1    
//* By: Armand Gerstenberger
//* Email: Armandjg@gmail.com
//* Date: 9/17/2013

import java.util.Scanner;

public class Gerstenberger_Lab1 {
public static void main(String[] args){
   
    //Declare variables
    String firstname;
    String lastname; 
    String fullname;
    String program;
    String degree;
    String prode;
    int credit;
    int credit2;
    int totalc;
    String C = "Credits";
    String d = "dollars";
    String space = " ";
        String ans;
            
    //Create a Scanner
    Scanner myScanner = new Scanner(System.in);
    
    //Asks the questions
    System.out.println("What’s your first name?");
    firstname = myScanner.nextLine();
    
    System.out.println("What’s your last name?");
    lastname = myScanner.nextLine();
    
    System.out.println("What program are you in?");
    program = myScanner.nextLine();
    
    System.out.println("What degree are you completing? (MA, PhD, EdD..)");
    degree = myScanner.nextLine();
    
    System.out.println("How many credits have you completed for the first semester?");
    credit = myScanner.nextInt();
       
    System.out.println("How many credits have you completed for the second semester?");
    credit2 = myScanner.nextInt();
   
    System.out.println("Can you afford this? \\t (Yes or No)");
    myScanner.nextLine();
    boolean yes = true; 

    if (yes == true){
    System.out.println("Lucky. How did you afford that?");
    }
    else {
    System.out.println("You are in a. \\t lot. \\t of. \\t debt :( :( :( ");
    }
     
    //New variable
    fullname = firstname + " " + lastname;
    prode = program + " " + degree;
    totalc = credit + credit2;
    
   //Summary of User input 
    System.out.println("_____________________________");
    System.out.println("Name: " + fullname); 
    System.out.println("Program: " + prode);
    System.out.println("_____________________________");
    System.out.println("You have taken: " + totalc + space + C);
    System.out.println("You have spent at least: " +totalc*1411+ space + d); 
    System.out.println("You are in a. \t lot. \t of. \t debt :( :( :( ");
    System.out.println("_____________________________");
}
    
        }
