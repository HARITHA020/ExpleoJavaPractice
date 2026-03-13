package generic;
class Test<T,U,R>{
	T obj1;
	U obj2;
	R obj3;
	public Test(T obj1, U obj2, R obj3) {
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	}	
}
public class MultiParameter {

	public static void main(String[] args) {
		Test<String, Integer, Float> obj=new Test<>("Test",15, 3.24f);
		obj.print();

	}

}
