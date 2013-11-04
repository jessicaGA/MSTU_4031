public class MyShapes{
	
	public static void main(String[] args){
	
		Shape square = new Shape();
		Shape circle = new Shape();
	
	
	
	//My square
	square.type = "square";
	square.color = "purple";
	square.length = 5.0;
	square.height= 5.0;

	
	//My circle
	circle.type = "circle";
	circle.color = "orange";
	circle.radius = 4.0;

	
	//Shape method calls
	
	square.shapeDetails();
	System.out.println("My area is " + square.area());

	circle.shapeDetails();
	System.out.println("My area is " + circle.area());
	}
}