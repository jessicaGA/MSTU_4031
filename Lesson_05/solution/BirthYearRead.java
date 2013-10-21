import java.util.Scanner;
import java.io.*;

public class BirthYearRead{
	
	public static void main(String[] args) throws IOException{
		

		int answer;
		int age; 
		
		File info = new File ("BirthYearInfo.txt");
		Scanner input = new Scanner(info);
		//PrintWriter output = new PrintWriter(info);

		answer = input.nextInt();
		System.out.println("You were born in:" + answer);

		answer = input.nextInt();
		System.out.println("He was born in:" + answer);

	}
}