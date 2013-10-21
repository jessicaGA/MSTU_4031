/* Lab4: Vocab
Group: Danfei, Yixin, Afnan
October 1, 2013 */ 


import java.util.*; // java package like scanner in the case where both scanner and arrays are used it is best to use java.util*;

public class vocab {

	public static void main (String[] args){

 		 String vocabulary; 
 		 String add;

 		 ArrayList<String> vocabs = new ArrayList<String>();

 		 Scanner myScanner = new Scanner(System.in);

 		 System.out.println("--------------------------Welcome to the Vocabulary Registeration Tool--------------------------");
 		 System.out.println("Please type in the vocabulary words. Make sure to enter add after each word to be entered." + 
 		 					"\n" + "Type in STOP when done adding"); 



			System.out.println("Type in the word add to begin ");								
			add = myScanner.nextLine();
 		 
 		 for (int i=0; i < vocabs.size(); i++){ 
 		 
			System.out.println("Type in the word");								
			vocabulary = myScanner.nextLine();

			vocabs.add (vocabulary); 

			if (!vocabs.contains(vocabulary)) 
				{
        
        		vocabs.add(vocabulary);

    			}

			
			if (vocabulary.equalsIgnoreCase("stop"))
				{
					System.out.println("Here is the list of vocabulary:");
					System.out.println(vocabs);
					System.out.println("Goodbye");
					
				}
				

		}
		
	}
}