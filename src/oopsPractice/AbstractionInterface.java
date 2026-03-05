package oopsPractice;
interface shapes{
	double DEFAULT_VALUE=1.0 ; // public static final constant
	double calculateArea();
	double calculatePerimeter();
	
	default String getDescription() {            // default method
		return "a shape with the unspecified dimension";
	}
}

abstract class circles implements shapes{  // IMPLEMENTS THE SHAPE INTERFACE IN THE CIRCLE CLASS
	private double radius;
	public circles(double radius) {
		this.radius=radius;
	}
	
	public circles() {                   // constructor that uses the default_value
		this.radius=DEFAULT_VALUE;
	}

	// calculateArea method is implemented
	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
	}
	
	// calculatePerimeter method is implemented
	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	
	// getDescription is implemented
	@Override
	public String getDescription() {
		return "A circle with radius: "+radius;
	}
}

class subCircle extends circles{
	subCircle(int radius){
		super(radius);
	}
	
	subCircle(){
		super();
	}
}

class Rectangle1 implements shapes{
	private int length,breath;
	
	Rectangle1(int length, int breath){
		this.length=length;
		this.breath=breath;
	}
	
	Rectangle1(){
		this.length=(int) DEFAULT_VALUE;
		this.breath=(int)DEFAULT_VALUE;
	}
	@Override
	public double calculateArea() {
		return length*breath;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(length+breath);
	}

	@Override
	public String getDescription() {
		return "A rectangle with length "+length+" and breath:"+breath;
	}
	
	
	
}
public class AbstractionInterface {

	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1(2,2);
		System.out.println(r.calculateArea());
		System.out.println(r.calculatePerimeter());
		System.out.println(r.getDescription());
		
		circles c=new subCircle(4);
		System.out.println(c.calculateArea());
		System.out.println(c.calculatePerimeter());
		System.out.println(c.getDescription());
		
			
		
		
	}

}
