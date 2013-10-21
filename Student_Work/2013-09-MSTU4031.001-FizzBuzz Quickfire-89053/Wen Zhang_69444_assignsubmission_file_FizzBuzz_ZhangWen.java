/*Name: Wen Zhang
Date: September 30th, 2013
UNI:wz2236
email:wz2236@tc.columbia.edu
Comment: QuickFire in-class assignment
 */
public class FizzBuzz_ZhangWen
{
	public static void main(String[] args)
	{


for(int x = 1; x < 101; x++){
	if (x%3 == 0 && x%5 ==0) {
		System.out.println("FizzBuzz");
	} else if (x%5 == 0) {
		System.out.println("Buzz");
	} else if (x%3 == 0 ) {
		System.out.println("Fizz");
	} else {
		System.out.println(x);
	}
}
}
}

