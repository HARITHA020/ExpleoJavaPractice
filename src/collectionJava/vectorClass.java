package collectionJava;

import java.util.Vector;

public class vectorClass {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		System.out.println("initial size of array list:"+v.size());
		System.out.println("initial capacity size of array list:"+v.capacity());
		v.add("c");
		v.add("A");
		v.add("E");
		v.add("b");
		v.add("d");
		System.out.println("after insert  size of array list:"+v.size());
		System.out.println("array elements are:"+v);
		v.remove(2);
		v.remove("d");
		System.out.println("after remove size of array list:"+v.size());
		System.out.println("array elements are:"+v);
		System.out.println("capacity at end:"+v.capacity());
	}

}
