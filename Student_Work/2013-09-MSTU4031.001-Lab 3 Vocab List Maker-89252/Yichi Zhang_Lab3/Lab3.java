/*
 Arraylist
 Scanner
 Loop > For > size()
 While > know when to stop
 */

import java.util.*;


public class Lab3{

    public static void main (String arg[]){
    
        String vocab;
        String enter;
        String vocab1;
        boolean finish = true;
        
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> VocabList = new ArrayList<String>();
        
        
        do {
            System.out.println ("Enter the vocabulary: ");
            vocab = myScanner.nextLine();
            if (VocabList.contains (vocab)) {
                System.out.println ("You already entered that word. Are you finished? YES or NO");
                enter = myScanner.nextLine();
                if (enter.equalsIgnoreCase ("Yes")) {
                    finish = false;
                }
            } else {
                VocabList.add (vocab);
                System.out.println ("Are you finished? YES or NO");
                vocab1 = myScanner.nextLine();
                if (vocab1.equalsIgnoreCase ("Yes")) {
                    finish = false;
                }
            }
        } while (finish);
        
        System.out.println ("Your vocabulary list is: " + VocabList);
        
    }
}
