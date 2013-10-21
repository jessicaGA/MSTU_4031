
public class number{
	public static void main(String[] args){

		int x = 1;
		do {
			if(x % 15 == 0){
			System.out.println("FizzBuzz");}
            else if(x % 5 == 0){
            System.out.println("Buzz");}
            else if(x % 3 == 0){
            System.out.println("Fizz");}
            else{ System.out.println(x);}
			x++; 
		} while (x<101);

	    }
}	    