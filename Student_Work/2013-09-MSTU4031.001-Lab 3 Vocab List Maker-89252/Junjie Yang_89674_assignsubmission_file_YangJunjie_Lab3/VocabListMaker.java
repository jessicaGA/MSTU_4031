/* File Name: VocabListMaker
 * My Name: Junjie Yang
 * UNI: jy2555
 * Email: jy2555@tc.columbia.edu
 * Date: 10/07/2013
 * Lab Number: 3
 * Comments: making a word list
*/

import java.util.ArrayList;
import java.util.Scanner;

public class VocabListMaker {

    public static void main(String[] args) {
		
		Scanner myScanner = new Scanner (System.in);
        ArrayList <String> vocablist = new ArrayList <String>();
		
		String word, answer;
		boolean finish = true;
		
		System.out.println(" ");
		System.out.println("Welcome to use the VocabListMaker project!");
		System.out.println(" ");
		
        do{
			System.out.println("Please enter the word:");
		    word = myScanner.nextLine ();
			if(!vocablist.contains(word)){
				vocablist.add(word);
			}
		    System.out.println("Would you like to add another word?");
			answer = myScanner.nextLine();
			if(answer.equalsIgnoreCase("no")){
				System.out.println("The final word list is: " + vocablist);
				finish = false;
			}
		} while(finish);	
        
    }
}
