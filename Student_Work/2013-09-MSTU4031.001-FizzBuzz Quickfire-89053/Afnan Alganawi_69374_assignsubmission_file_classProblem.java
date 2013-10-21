/* Afnan Alganawi 
aa3321@tc.columbia.edu 
09/30/2013 */

public class classProblem {
	public static void main(String[] args){
	

        for (int i = 0; i <= 100; i++)
        {  
    
            System.out.print(i);  

            if (i % 3 == 0 )

            {

                 System.out.print("Frizz");  

            
            } else if(i % 5 == 0)
            {

                System.out.println("Buzz");  

            }else if (i% 15 == 0)
            {
                System.out.println("FrizzBuzz");  

            }

            

        }

    }
}
