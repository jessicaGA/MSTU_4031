public class MyShapes{
	
	public static void main(String[] args){
	
		Shape mySquare = new Shape();
		Circle myCircle = new Circle(3.0);
	
	
	
	//My square
	mySquare.setDetails("square", "purple");
	mySquare.setSize(5.0, 5.0);
	

	//My circle
	myCircle.setDetails ("circle", "orange");
	
	

	
	//Shape method calls
	
	mySquare.shapeDetails();
	System.out.println("My area is " + mySquare.area());

	myCircle.shapeDetails();
	System.out.println("My area is " + myCircle.area());
	}
}