import java.util.*;
import java.util.ArrayList;

public class vocabList{
	public static void main(String[] args){

		
		boolean done = true;
		String addvocab;
		Scanner myScanner = new Scanner(System.in);
        ArrayList<String> vocablist = new ArrayList<String>();

		do {

	    System.out.println("Please Add your vocabulary");
	    addvocab = myScanner.nextLine();

	    vocablist.add(addvocab);

        System.out.println("Would you like to add more vocabularies? Yes or No");
	        addvocab = myScanner.nextLine();
            

        if (addvocab.equalsIgnoreCase ("No")){
        	done = false;

        } else {addvocab.equalsIgnoreCase("Yes");
            done = true;}   

    }  while (done); 

    System.out.println(vocablist);
	
	}

}