/* 
Name: Vocabulary List
By: Zixi Qi
Date: 10/1/2013
Hint: Arraylist
Scanner
Loop - for - size ()
while - know when to stop */

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3 {
	public static void main(String[] args){
        String word;
		Scanner myScanner = new Scanner(System.in); 

		ArrayList<String> wordlist = new ArrayList<String>();

	
		System.out.println("Add word to your wordlist! Press 'E' if you finished adding the words");
        word = myScanner.nextLine();
		

        while (!word.equalsIgnoreCase("E")){ 
   		    wordlist.add(word);
   		    word = myScanner.nextLine();
   		    }

        if (word.equalsIgnoreCase("E")){
        	ArrayList <String> finalList = new ArrayList<String>();
        	for (String dupWord: wordlist){
        		if (!finalList.contains (dupWord)) {
        		finalList.add(dupWord);
        	   }
        	}
    	    System.out.println(finalList);}

	}
}