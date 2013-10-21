package lab3;
import java.util.Scanner;
import java.util.ArrayList;

public class lab3 {

	public static void main(String[] args) {		
		Scanner myScanner = new Scanner(System.in); // defining my scanner

		ArrayList<String> myList = new ArrayList<String> ();
		
		System.out.println ("Weclome to Vocabulary List Keeper");
		System.out.println ("Please type your vocabulary word. When your done please 'exit'");
		

		while (myScanner.hasNextLine()) {
			String words = myScanner.nextLine();
			myList.add(words);	
			
			
			if (words.equalsIgnoreCase("Exit")) {
				System.out.println(myList);
			}
		}
	}
}
	
