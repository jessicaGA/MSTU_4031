import java.util.Scanner;

public class StringComparison {
	public static void main (String arg[]){
		
		//Create a scanner.
		Scanner myScanner = new Scanner(System.in);

		String answer;
		System.out.println("What is your favorite color?");
		answer = myScanner.nextLine();
		System.out.println(" "); // Empty String

		//Conditional
		if (answer.equalsIgnoreCase("blue")) {
			System.out.println(answer + " is my favorite color.");
		} else if (answer.equalsIgnoreCase("green")) {
			System.out.println(answer + " is a good color, too!");
		} else {
			System.out.println(answer + " ? Really?  Well, I guess " + answer + " is good, too.");
		}
	}
}