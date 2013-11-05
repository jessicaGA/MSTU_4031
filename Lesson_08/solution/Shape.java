public class Shape
{

	//Constructor
	Shape(){}
		
	private String	type;
	private String	color;
	private double	length;
	private double	height;
	
	
    //custom instance method
	public void setDetails (String shapeType, String shapeColor){
		type =  shapeType;
		color = shapeColor;
	}


	public void setSize (double shapeLength, double shapeHeight){
		length = shapeLength;
		height = shapeHeight;
	}


	public void shapeDetails(){
		System.out.println("I am a " + color + " " + type);
	}


	public double area(){
		double area;

			area = length * height;

		return area;
	}
	
	
}