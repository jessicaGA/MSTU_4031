public class Circle extends Shape
{

	//Variables
	private double 	radius;


	//Constructor
	Circle(double circleRadius){
		radius = circleRadius;
	}
		
    

    //Instance method
	public double area(){
		double area;
		area = 3.14 * (Math.pow(radius, 2));
		
		return area;
	}
}
	
	