import java.util.*;

public class VocabularyProgram{

	public static void main (String[] args){

		ArrayList<String> vocabArray = new ArrayList<String>();
		String vocabWord;
		boolean done = true;

		System.out.println("Welcome to your Vocab List Compiler. Type in your words and press enter. When finished, type done.");
		System.out.println("**************************************************************** "); // Empty String

	do{

		Scanner myScanner = new Scanner(System.in);
		vocabWord = myScanner.nextLine();

		if (vocabArray.contains(vocabWord)) {
		} else vocabArray.add(vocabWord); 

		if (vocabWord.equalsIgnoreCase("done")) {
			done = false;
		}

		} while (done);

		vocabArray.remove("done");
		System.out.println(vocabArray);


	}


}

