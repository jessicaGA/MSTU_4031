import java.util.Scanner;
import java.util.*;

public class WordList{
	public static void main(String[] args){

		ArrayList<String> wordList = new ArrayList<String>();
		Scanner myScanner = new Scanner(System.in);

        String answer;

		System.out.println("Please type in the vocabulary list. Press 'E' to stop adding words.");
        answer = myScanner.nextLine();

        while (!answer.equalsIgnoreCase("E"))
        {wordList.add(answer);
	    answer = myScanner.nextLine();
	    }

        if (answer.equalsIgnoreCase("E")) { 
        ArrayList <String> finalList = new ArrayList <String> ();
		for (String dupVocab : wordList) {
	     	if (!finalList.contains (dupVocab)) {
		    finalList.add(dupVocab);
						}
					}
	    System.out.println(finalList);
	    }




    }
}      