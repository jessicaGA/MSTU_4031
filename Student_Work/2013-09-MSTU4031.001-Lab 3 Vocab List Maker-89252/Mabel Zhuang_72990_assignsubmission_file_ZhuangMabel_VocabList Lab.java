//This application should allow teachers to create a list of words that will be used in this weeks vocabulary test.
//There is no fixed amount of words in any vocabulary list. Let the user add until they wish to stop.
//The application should handle word duplication in a list.
//When complete, let the instructor know what their vocab list looks like, print a list of the words to the terminal.

//Hint: use for loop and size(); use whlile loop to know when to stop

import java.util.*;

public class myArrayList{

	public static void main (String[] args){

 		ArrayList<String> vocabList = new ArrayList<String>(); //ArrayList<Data Type> array name = new ArrayList<Data Type>();
 		
 		//for reading inputs

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all the vocabulary words you would like to test. When you are done with your list, please type 'done'");	

		while (sc.hasNextLine())
		{
			String words = sc.nextLine();

			if (words.equalsIgnoreCase("done"))
			{

				for(int a=0;a<vocabList.size();a++){
			        for(int b=a+1;b<vocabList.size();b++){
			            if(vocabList.get(a).equalsIgnoreCase(vocabList.get(b))){
			                vocabList.remove(b); 
			                b--;
			            }
			        }
				}
				
			System.out.println(vocabList);

			}
			else
			{
				vocabList.add(words);
			}
		}
	}
}




