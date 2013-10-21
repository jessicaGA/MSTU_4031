import java.util.Scanner;


public class QuickFire {
	public static void main(String [] args) {


			int x = 1;

			do  {

			if (x%3 == 0 && x%5 == 0) {
					System.out.println("FizzBuzz"); x++;
				} else if (x%5 == 0) {
					System.out.println("Buzz"); x++;
				} else if (x%3 == 0) {
					System.out.println("Fizz"); x++;
				} else 
					System.out.println(x); x++;
				}
			

			while (x<101) ;
				}
			}