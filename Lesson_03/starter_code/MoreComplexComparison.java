/* Filename: MoreComplexConditionals.java 
* By: Jessica Thornhill-Skeete
* Email: jt2573@tc.columbia.edu 
* Date: September 23, 2013
* Comments: Demonstrating if else if
*/

public class MoreComplexComparison{
	public static void main(String[] agrs){
		int myAge = 17;

		if (myAge >=25) {
			System.out.println("I am old enough to rent a car");
		} else if (myAge >= 21) {
	    	System.out.println("You can't rent a car but you can drive your own car.");
		} else if (myAge >= 18) {
	    	System.out.println("You can't rent a car but you can vote.");
		} else if (myAge >= 16) {
	    	System.out.println("You can drive your parents' car.");
		} else if (myAge <= 10) {
	    	System.out.println("Ride your bicycle.");
		}
	}
}