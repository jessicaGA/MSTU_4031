import java.util.Scanner;

public class BirthYear{
	
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int answer;
		int age; 
		try{
			System.out.println("What year were you born?");
			answer = myScanner.nextInt();
			System.out.println(""); // Empty String
			
			//Calculate Year of Birth
			age = (2012 - answer);
			System.out.println("You are" + age + " years old");
		}
		catch (java.util.InputMismatchException error){
			System.out.println("Please input a numeral. Goodbye");
		}
	

	}
}