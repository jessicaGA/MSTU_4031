public class Shoe
{
	Shoe(){}
		
	String	type;
	String	color;
	double	price;
	String	line;
	int quantity;
	
	
    //custom method
	public void shoeInfo()
	{
		System.out.println("This type of shoe is a " + type);
		System.out.println("It is a"  + color + " shoe");
		System.out.println("The shoe cost $ " + price);
		System.out.println("This shoe is for " + line);
		System.out.println("There are " + quantity + " in stock");
		
	}
	
}