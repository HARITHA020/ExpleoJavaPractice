package oopsPractice;

class Base{
	public final void display(String s) {    //final method
		System.out.println(s);
	}
}

class Sample extends Base{
	public void display(String s) {                   // cannot overide the final method from the base class
		System.out.println(s);
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.display("lets try to change final");

	}

}
