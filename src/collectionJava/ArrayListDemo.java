package collectionJava;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		System.out.println("initial size of array list:"+arr.size());
		arr.add("c");
		arr.add("A");
		arr.add("E");
		arr.add("b");
		arr.add("d");
		arr.add("f");
		arr.add(1,"G");
		System.out.println("after insert  size of array list:"+arr.size());
		System.out.println("array elements are:"+arr);
		arr.remove(2);
		arr.remove("d");
		System.out.println("after remove size of array list:"+arr.size());
		System.out.println("array elements are:"+arr);
	}

}
