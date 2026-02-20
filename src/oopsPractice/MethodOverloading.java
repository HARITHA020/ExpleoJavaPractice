package oopsPractice;

class Adder{
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static double add(double a, double b) {
		return a+b;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println("the values of add(int ,int):"+Adder.add(5,6));
		System.out.println("the values of add(double, double):"+Adder.add(5.00,6.00));

	}

}
