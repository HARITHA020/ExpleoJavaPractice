/* inner class types: regular , static nested class, method local inner class , anonymous class
 * object creation outerclass.innerclass inner=outer.new innerclass()
 */
package oopsPractice;
class OuterClass{
	int age=19;
	void checkAge() {
		System.out.println("the checkage () methods called");
	}
	
	class innerClass{
		void show() {
			System.out.println("the show() method call of inner class");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		System.out.println("the age in outer loop is:"+outer.age);
		outer.checkAge();
		OuterClass.innerClass inner=outer.new innerClass();
		inner.show();

	}
}
