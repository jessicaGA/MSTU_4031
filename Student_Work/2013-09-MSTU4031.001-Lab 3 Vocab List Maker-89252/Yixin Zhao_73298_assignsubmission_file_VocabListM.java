/* File Name: VocabListM.java
   By: Yixin Zhao
   UNI: yz2558
   Email: yz2558@tc.columbia.edu
   Date: 10/01/2013
*/

    import java.util.*;

    public class VocabListM {
	
    public static void main (String[] args){

    //Declare variable
    String answer;
    String stop;

    //Welcome the user
    System.out.println("******************Welcome to the Vocabulary List Maker App, you cuold creat a list of words for this week's vocabulary test.********************");
    System.out.println("\n" + "If you want to stop inputing words, please enter stop.");

    // Let the usert to put into word
    ArrayList<String> vocabListM = new ArrayList<String>();
    Scanner vocabListM  = new Scanner(System.in);
    
    for (int i = 1; i < vocabListM.length; i++) {
    

    String answer = vocabListM.nextline();
    System.out.println(array[i]);

    if (!vocabListM.contains(answer)){
    	vocabListM.add(answer);
    }         
   
    }  
    
    if (answer.equalsIgnoreCase("stop")){
    	break;
    }

    System.out.println("\n" + "Here is your full list as below:");
    System.out.println("\n" + vocabListM);

    }
}