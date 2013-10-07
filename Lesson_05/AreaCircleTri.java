
public class AreaCircleTri {

	public static void main(String[] args) {
	double totalArea;

	System.out.println ("Triangle Area is " +TriArea(5,6));	
	System.out.println ("Circle Area is " +CircleArea(2));	
	System.out.println ("Total Area is " + TriArea(5,6) + CircleArea(2));	

	}
	
	public static double TriArea (double base, double height){
		
		double area;
		
		area = (base * height)/2;
		return area; // return will spit out the area
		// System.out.println(area) 
	}
	public static double CircleArea (double radius){
		
		double area;
		
		area = 3.14 * (radius * radius);
		return area; // return will spit out the area
		// System.out.println(area) 
	}
}
