/* Filename: Joanne100.java 
* By: Joanne Yoon-Hyoung Lee
* Email: yhl2109@tc.columbia.edu 
* Date: September 30, 2013
* Comments: from 1 to 100 
            multiples of three "Fizz"
            multiples of five "Buzz"
            multiples of fifteen "FizzBuzz"
*/


public class Joanne100
{
	public static void main(String[] args)

	{

		int i;

	//for loop statement
	for(i = 1; i <= 100; i++)
		
			if ((i % 3 == 0) && (i % 5 == 0))
			{
				System.out.println("FizzBuzz");
			}
		    else if (i % 3 == 0)
		    {
		    	System.out.println("Fizz");
		    }
		    else if (i % 5 == 0)
		    {
		    	System.out.println("Buzz");
		    }
		    else
		    {
		    	System.out.println(i);
		    }
		
		
	}
}