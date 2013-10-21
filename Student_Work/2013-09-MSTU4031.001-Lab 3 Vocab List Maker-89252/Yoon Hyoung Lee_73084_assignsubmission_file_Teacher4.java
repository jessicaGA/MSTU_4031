import java.util.ArrayList;
import java.util.Scanner;

public class Teacher4 {
	
	public static void main(String[] args) {
		ArrayList <String> vocalist = new ArrayList <String>();
		Scanner myScanner = new Scanner (System.in);
		String word;
		boolean finish = true;

		do {
			System.out.println ("Please enter the new word. ");
			System.out.println ("If you enter 'X', this program ends. 'X' will not included in the word list.");
			word = myScanner.nextLine();
			if (vocalist.contains(word)) 
			{
				if (word.equalsIgnoreCase ("X"))
				{
					finish = false;
				}
				System.out.println ("It is already in the list.");
				System.out.println ("If you want to finish, just enter 'X' instead of word.");
				
			}

			else
			{
				if (word.equalsIgnoreCase ("X"))
				{
					finish = false;
				}
				else {
				vocalist.add (word);
				System.out.println ("If you want to finish, just enter 'X' instead of word.");
			}
			}
	} while (finish);

		System.out.println ("Please check your vocabulary list. ");
		System.out.println (vocalist);

	}
}