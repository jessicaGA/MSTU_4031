/*
File: EnglishVocab.java
By: Ben Stern
Uni: bms2170
Date: 10/1/2013
Lab number: 3
Email: benjamin.m.stern@gmail.com

*/

import java.util.Scanner;
import java.util.ArrayList;


public class EnglishVocab {

	public static void main (String[] args){


		int totalWords = 0;

 		 ArrayList <String> words = new ArrayList <String> (); 
 		 String response;
 		 Scanner stringScanner = new Scanner(System.in);
 		  Scanner myScanner = new Scanner(System.in);
 		  boolean repeat = true;
 		
 		 String answer;
 		 int status;

 		

		do {

			 System.out.println("What would you like to do? \n 0: Add to list \n 1: See list \n 2: End program");
		status = myScanner.nextInt();

		//using switch b/c had trouble getting what is now case 0 to stop repeating. I think I found the solution but this felt pretty clean to me anyway.

 		 switch (status) {


 		 	case 0: 
 		 			System.out.println("What word would you like to add?");
					totalWords++;
					words.add(stringScanner.next());;
				break;
			case 1: System.out.println(words);
				break;
			case 2: System.out.println("application completed");
				repeat = false;
				break;
			default: System.out.println("Error");
				System.exit(0);

			}
			}

			while (repeat == true);
 		 }
 		 

 		 
 		
	}





