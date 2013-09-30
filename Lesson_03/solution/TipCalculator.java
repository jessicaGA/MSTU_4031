/* File: 
 * By: Jessica T-Skeete
 * Email: jessicat@tc.columbia.edu
 * Date: 9/17/2013
 * Comments: Tip Calculator
*/

import java.util.Scanner;

public class TipCalculator{
	public static void main(String[] args){

		double totalAmount; 
		double totalWTip;
		String restaurantName;
		Scanner myScanner = new Scanner(System.in);
		
	    System.out.println("Hello Welcome To Java Tip Calculator. What is the amount of your restaurant bill?"); 
	    
	    System.out.println("Enter the restaurant name");
	    restaurantName = myScanner.nextLine();

	    System.out.println("Please enter the total amount of your bill");
	    totalAmount = myScanner.nextInt();


	    totalWTip = totalAmount * 1.20;
	    System.out.println("Your total amount with tip is:" + totalWTip);
	}
}