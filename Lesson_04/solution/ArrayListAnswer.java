import java.util.*;

public class ArrayListExample
{
	public static void main(String[] args)
	{
		Scanner myScanner = new Scanner(System.in);
	
		ArrayList<String> petNames = new ArrayList<String>();
	
		petNames.add("Woofie");
		petNames.add("Fido");
		petNames.add("Cuddles");
	
		//Ask the user for their pet name and add it to the array list.
		//Remove .remove an element from the array.
		//Add a for loop print all the names in the array. Hint: .size()
		//You CANNOT use petNames[i]. 

		System.out.println("What is the name of your animal?");
		String answer = myScanner.nextLine();
		petNames.add(answer);
		petNames.remove(0);
		petNames.remove("Fido");
	
	
		System.out.println(petNames);
		System.out.println(petNames.get(0));
	
		for(int i=0; i<petNames.size(); i++){
			System.out.println(petNames.get(i));
		}
	}
}