// Wei Jiang,  Sep 30, quickfire

public class quickFire
{
	public static void main(String[] args)
	{
	
	for(int x = 1; x <= 100; x++)
		{
			
	        if (x % 3 == 0){
	        	System.out.println("Fizz");
	        }
	        	
	        if (x % 5 == 0){
	        	System.out.println("Buzz");
	        }
	        	
            if (x % 15 == 0){
            	System.out.println("FizzBuzz");
            }
            	
            else
            System.out.println(x);

		}
	}
}