/* File: 
 * By: Jessica T-Skeete
 * Email: jessicat@tc.columbia.edu
 * Date: 9/17/2013
 * Comments: HelloScanner example that demonstrates how to take user input using the Scanner class.
*/

import java.util.Scanner;

public class HelloScanner{
	public static void main(String[] args){
   		
   		//Declare variables 
   		String answer;

   		//Create a Scanner
   		Scanner myScanner = new Scanner(System.in);


		//Ask the question
		System.out.println("What’s your favorite food?");
		answer = myScanner.nextLine();

		//Response
		System.out.println("Your favorite food is " + answer);
	}
}
