public class ShoeStoreAnswer
{
	public static void main(String[] args)
	{
	ShoeAnswer myHeels = new ShoeAnswer();
	ShoeAnswer myLoafers = new ShoeAnswer();
	
	
	//My heels information
	myHeels.setType("kitten heels");
	myHeels.setColor ("black");
	myHeels.setPrice (150.00);
	myHeels.setQuantity(5);
	
	//My loafers information
	myLoafers.setType ("loafers");
	myLoafers.setColor ("tan");
	myLoafers.setPrice (350.00);
	myLoafers.setQuantity (15);
	
	//Customer method call
	myHeels.shoeInfo();
	myLoafers.shoeInfo();
	
	System.out.println("This is a " + myHeels.getType() + " shoe");
	}
}