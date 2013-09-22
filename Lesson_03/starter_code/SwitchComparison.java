import java.util.Scanner;

public class SwitchComparison{
	public static void main(String[] args) {
		
		//Declare Variables and instantiate the class.
		Scanner myScanner = new Scanner(System.in);
		int status;

		System.out.println("What is the status of your application? (enter 0, 1, 2, or 3)");
		status = myScanner.nextInt();

		switch (status) {
			case 0: System.out.println("Application opened");
				break;
			case 1: System.out.println("application started");
				break;
			case 2: System.out.println("application completed");
				break;
			case 3: System.out.println("application submitted");
				break;
			default: System.out.println("Error");
				System.exit(0);
		}
	}
}