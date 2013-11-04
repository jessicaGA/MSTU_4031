public class Shape
{

	//Constructor
	Shape(){}
		
	String	type;
	String	color;
	double	length;
	double	height;
	double 	radius;
	
	
    //custom instance method
	public void shapeDetails(){
		System.out.println("I am a " + color + " " + type);
	}


	public double area(){
		
		double area;

		if (type.equalsIgnoreCase("circle"))
			area = 3.14 * (Math.pow(radius, 2));
		else 
			area = length * height;

		return area;
		
	}
	
	
}