package oopsPractice;
class Person{
	int age=21;
	static int weight=45;
	
	static class Gender{
		void nonStaticDisplay() {
			System.out.println("in non static display method.");
			System.out.println("weight value:"+weight);  // outer class static variable accessed in non static method
		}
		static void staticDisplay() {
			System.out.println("in static display method.");
			System.out.println("weight value: "+weight);  // outer class static variable accessed in static method.
		}
	}
	Gender gender=new Gender();         // this object is created for the nonStaticDisplay method() and it can through this object
}
public class StaticInnerClass {

	public static void main(String[] args) {
		Person person=new Person();
		person.gender.nonStaticDisplay();       //inner class nonStatic method
		Person.Gender.staticDisplay();          // inner class static method
	}


}
