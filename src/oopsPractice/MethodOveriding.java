package oopsPractice;

class Vehicle{
	void run() {
		System.out.println("it is running");
	}
}

class Truck extends Vehicle{
	void run() {
		System.out.println("truck is running");
	}
}
public class MethodOveriding {

	public static void main(String[] args) {
		//Vehicle v=new Vehicle();
		//v.run();
		
		Vehicle v1= new Truck();
		v1.run();
		
		Truck t= (Truck) v1;
		t.run();

	}

}
