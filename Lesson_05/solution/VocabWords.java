/* Filename: WordScramble.java 
* By: Jessica Thornhill-Skeete
* Email: jt2573@tc.columbia.edu 
* Date: September 30, 2013
* Comments: 
*/

import java.util.*;

public class VocabWords{

	public static void main(String[] args){

		Scanner wordScanner = new Scanner(System.in);
		ArrayList<String> vocabList = new ArrayList<String>();
		
		String word;

		System.out.println("Hello Welcome to MSTU Vocab List Creator");
		System.out.println("Lets build your Vocab List.");
		message(); //Step2

		int response = wordScanner.nextInt();

		while(response == 1){
			
			wordScanner.nextLine();
			System.out.println("Enter Your Word");
			word = wordScanner.nextLine();


			if (vocabList.contains(word)){
				System.out.println("You already added that word.");
			}else{
				vocabList.add(word);
			}

			message(); //Step2
			response = wordScanner.nextInt();
		}

		if (!vocabList.isEmpty()){
			System.out.println(vocabList);
		}
		System.out.println("Thank you for using Vocabulary Builder");

	}

	public static void message(){ //Step1
		System.out.println("Enter (1) to add a word (0) to quit.");
	}
}


