public class ShoeAnswer
{
	ShoeAnswer(){}
		
	private String	type;
	private String	color;
	private double	price;
	private String	line;
	private int quantity;
	
	//Set methods
	public void setType(String n){
		type = n;
	}
	
	public void setQuantity(int a){
		quantity = a;
	}
	
	public void setPrice(double p){
		price = p;
	}
	
	public void setColor(String c){
		color = c;
	}
	
	//get methods
	public String getType(){
		return type;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getPrice(){
		return price;
	}
	
	public String getColor(){
		return color;
	}
	
    //custom method
	public void shoeInfo()
	{
		System.out.println("This type of shoe is a " + type);
		System.out.println("It is a"  + color + " shoe");
		System.out.println("The shoe cost $ " + price);
		System.out.println("There are " + quantity + " in stock");
		
	}
	
}

