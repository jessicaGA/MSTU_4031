/* File: QuickfireFizzBuzz.java
By: Yang Jiang
Email: yj2211@tc.columbia.edu
Date: September 30, 2013
*/


public class QuickFireFizzBuzz {

    public static void main (String[] args) {


    //for loop statement
    for (int x=1; x < 101; x++)
        {
            //print FizzBuzz for multiples of 15
            if(x % 15 == 0) {
            System.out.println("FizzBuzz");
            }

            //print Buzz for multiples of 5
            else if(x % 5 == 0) {
            System.out.println("Buzz");
            }

            //print Fizz for multiples of 3
            else if(x % 3 == 0) {
            System.out.println("Fizz");
            }

            //print the number for all other numbers
            else {
            System.out.println(x);
            }

        }
    }
}
