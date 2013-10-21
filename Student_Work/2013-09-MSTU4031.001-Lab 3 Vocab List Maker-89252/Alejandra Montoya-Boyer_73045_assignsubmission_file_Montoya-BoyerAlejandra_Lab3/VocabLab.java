/* File name: VocabLab
By: Alejandra Montoya-Boyer
UNI: amm2403
Date: Sept. 30, 2013
Comments: in-class vocab lab

*/


import java.util.*;

public class VocabLab{

	public static void main (String[] args){

		System.out.println(" ");
		System.out.println("Hello Teacher, let's create a vocabulary list.");
		System.out.println("----------------------------------------------");
		System.out.println("Type each word and then press return. When you have typed in all the your words, please type done.");
		System.out.println(" ");
		
		//Declare variables
		String vocabWord;
		boolean done=true;
		ArrayList<String> vocabList = new ArrayList<String>();
		
		do{ 

		//Create a scanner and list.
		Scanner myScanner = new Scanner(System.in);
		vocabWord = myScanner.nextLine();
		if (vocabList.contains(vocabWord)){
		} else vocabList.add(vocabWord);
		
		
		if (vocabWord.equalsIgnoreCase("done")){
			done = false;
		}
		} while(done);

		vocabList.remove("done");
		
		System.out.println(vocabList);


	}
}
	
