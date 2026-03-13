package generic;
class Demo<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class GenricClass {

	public static void main(String[] args) {
		Demo<Integer> iobj=new Demo<Integer>();
		iobj.setT(25);
		System.out.println(iobj.getT());
		
		Demo<String> sobj=new Demo<String>();
		sobj.setT("hello");
		System.out.println(sobj.getT());

	}

}
