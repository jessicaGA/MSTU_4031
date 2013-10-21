import java.util.Scanner;
import java.io.*;

public class BirthYearWrite{
	
	public static void main(String[] args) throws IOException{
		

		int answer;
		int age; 

		Scanner myScanner = new Scanner(System.in);
		File info = new File ("BirthYearInfo.txt");
		PrintWriter output = new PrintWriter(info);

		System.out.println("What year were you born?");
		answer = myScanner.nextInt();
		System.out.println("");

		//Calculate Year of Birth
		age = (2013 - answer);

		System.out.println("You are " + age);
		output.println("Year of Birth: " + answer + "Age: " + age);

		output.close();
	

	}
}