/* Filename: SecretNumber.java 
* By: Jessica Thornhill-Skeete
* Email: jt2573@tc.columbia.edu 
* Date: September 23, 2013
* Comments: Creating a guessing game application.
*/

import java.util.Scanner;

	public class SecretNumber{
		public static void main (String args[]){
			Scanner myScanner = new Scanner(System.in);

			int answer;

			System.out.println("Guess a number between 1 and 10");
			answer = myScanner.nextInt();
			
			System.out.println(" "); // Empty String

			//Conditional
			if (answer == 4) {
				System.out.println("You guessed the right answer of " + answer);
			} else {
				System.out.println("Try again");
			}
		}
	}