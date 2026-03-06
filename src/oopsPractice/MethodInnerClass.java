package oopsPractice;
class Outer{
	int value=56;
	public void OuterClassMethod() {
		System.out.println("inside the method of outer class:");
		class Inner{
			public void innerClassMethod() {
				System.out.println("inside the method of inner class");
				System.out.println("value: "+value);
			}
		}
		Inner inner=new Inner();
		inner.innerClassMethod();
	}
}
public class MethodInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
