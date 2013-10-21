/* Filename: DHuWordList.java 
* By: Danfei Hu
* Email: dh2644@tc.columbia.edu 
* Date: September 30, 2013
* Comments: This is the app for the English Teachers.
——————————————————————————————————————————————————————————————————————————————————
Requirements:
1.Allow teachers to create a list of words that will be used in this weeks vocabulary test.
2.Let the user add until they wish to stop.
3.The app should handle word duplication in a list.
4.When complete, let the instructor know what their vocab list looks like, print a list of the words to the terminal.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class DHuWordList
{
	public static void main(String[] args)
	{
		//Declares variables       
		String add;
		String newWord; 
		ArrayList<String> words = new ArrayList<String>();

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Welcome to create your Vocabulary List!\n"
							+ "Do you want to enter a word?");
		add = myScanner.nextLine();

		
		
		int i = 0;

		do
		{
			
			if (add.equals("ADD")){

				System.out.println("Type the new word.");
				newWord = myScanner.nextLine();
				words.add(newWord);              //add a naw word
				i++;

			  if(!words.contains(add))
			  {
			   	words.add(newWord);
			   }
			    
				System.out.println("Enter ADD to add.");
				add = myScanner.nextLine(); 
			}
		}

		while (i < words.size()); 
			
	}
}
