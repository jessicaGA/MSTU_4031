public class Circle extends Shape{

	//Constructor
	Circle(double circleRadius){
		radius = circleRadius;
	}

	private double radius;

	public double area(){
		double area;
		area = 3.14 * (Math.pow(radius,2));

		return area;
	}


}
