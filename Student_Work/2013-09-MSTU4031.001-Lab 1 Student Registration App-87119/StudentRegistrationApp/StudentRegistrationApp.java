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



/* Student Registration Application, Yichi Zhang, yz2542, yz2542@tc.columbia.edu, 09/23/2013, lab1*/

import java.util.Scanner;

public class StudentRegistrationApp {
    
	// this is my print statement
	
    public static void main (String[] args){
        
        // Declare variables.
        
        String Last_Name;
        String First_Name;
        String Program;
        String Degree;
        int Credits_taken_first_semester;
        int Credits_taken_second_semester;
        int Total_credit_this_year;
		int Total_credit;
        boolean Total_credit_question = false;
		
        // creates a new scanner called myScanner.
        
        Scanner myScanner = new Scanner (System.in);      
        
		System.out.println("Last Name: ");          // Ask question
        Last_Name = myScanner.nextLine ();
     
		System.out.println("First Name: ");          // Ask question
        First_Name = myScanner.nextLine ();
     
		System.out.println("Program: ");          // Ask question  
        Program = myScanner.nextLine ();
      
		System.out.println("Degree: ");          // Ask question 
        Degree = myScanner.nextLine ();
      
		System.out.println("Credit taken first semester: ");          // Ask question
        Credits_taken_first_semester = myScanner.nextInt ();
        
		System.out.println("Credit taken second semester: ");          // Ask question 
        Credits_taken_second_semester = myScanner.nextInt ();
	
	    System.out.println("Total credit you have at TC: ");          // Ask question 
        Total_credit = myScanner.nextInt ();
        
		// Calculate the total credits.
        Total_credit_this_year = (Credits_taken_first_semester + Credits_taken_second_semester) ;     
        
       // output all variables. Include the escape character.
        
        System.out.println ("**************************************************************");
        System.out.println ("Student Registration Application");
        System.out.println ("Last Name: " + Last_Name +  " \tFirst Name: " + First_Name ); // tab between two variables
        System.out.println ("Program: " + Program + "\nDegree: " + Degree);  //new lane after input Program variable
        System.out.println ("Credits taken first semester: " + Credits_taken_first_semester);
        System.out.println ("Credits taken second semester: " + Credits_taken_second_semester);
        System.out.println ("Your total credit: " + Total_credit);
        
		//boolean 
		if (Total_credit >= 32) 
		   { Total_credit_question = true;
		   System.out.println ("You may be able to graduate with a Master Degree -- " + Total_credit_question);}
		else 
			{System.out.println ("You may be able to graduate with a Master Degree -- " + Total_credit_question);}
			
		System.out.println ("**********************End*************************************");
        
	}
}
