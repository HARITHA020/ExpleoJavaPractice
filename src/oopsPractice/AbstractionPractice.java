package oopsPractice;
abstract class shape{
	void draw() {
		System.out.println("drawing");
	}
	
	abstract void area();
	abstract void perimeter();
}

class Rectangle extends shape{
	private int length, breath;
	Rectangle(int length, int breath){
		this.length=length;
		this.breath=breath;
	}
	@Override
	void area() {            // 
		System.out.println("the area of rectangle is :"+length*breath);
	}

	@Override
	void perimeter() {
		System.out.println("the perimeter of rectangle  is :"+(2*(length+breath)));
		
	}
}

class Square extends shape{
	private int side ;
	Square (int side){
		this.side=side;
	}
	@Override
	void area() {
		System.out.println("\nthe area of square is :"+side*side);
	}

	@Override
	void perimeter() {
		System.out.println("the perimeter of rectangle  is :"+(4*side));
		
	}
}

class circle extends shape{
	private double pi= 3.14;
	private int radius;
	
	circle(int radius){
		this.radius=radius;
	}
	
	@Override
	void area() {
		System.out.println("\nthe area of circle is :"+(pi*radius*radius));
		
	}

	@Override
	void perimeter() {
		System.out.println("the perimeter of circle is :"+(2*pi*radius));
		
	}
	
}
public class AbstractionPractice {

	public static void main(String[] args) {
		shape s;   //reference of  abstract class
		
		s=new Rectangle(5,7);
		s.area();
		s.perimeter();
		
		s=new Square(4);
		s.area();
		s.perimeter();
		
		s=new circle(4);
		s.area();
		s.perimeter();

	}

}
