/*
	Name: Jessica T-Skeete
	Date: September 22nd, 2013
	Comments: 9 Bottles of Beer Song in code
*/

public class BottlesOfBeer{
	public static void main (String args[]){

		for (int i = 99; i > 1; i--){

			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer, take one down pass it around." + (i - 1)  + "bottles of beer on the wall");
		}

		System.out.println("1 bottle beer on the wall. 1 bottle of beer, take one down pass it around. No bottles of beer on the wall");
	}
}



