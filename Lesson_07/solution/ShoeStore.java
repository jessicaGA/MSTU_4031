public class ShoeStore
{
	public static void main(String[] args)
	{
	Shoe myHeels = new Shoe();
	Shoe myLoafers = new Shoe();
	
	
	//My heels information
	myHeels.type = "kitten heels";
	myHeels.color = "black";
	myHeels.price = 150.00;
	myHeels.line = "women's";
	myHeels.quantity = 5;
	
	//My loafers information
	myLoafers.type = "loafers";
	myLoafers.color = "tan";
	myLoafers.price = 350.00;
	myLoafers.line = "men's";
	myLoafers.quantity = 15;
	
	//Customer method call
	myHeels.shoeInfo();
	myLoafers.shoeInfo();
	}
}