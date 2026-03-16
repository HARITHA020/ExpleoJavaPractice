package collectionJava;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		System.out.println("Size at begin:"+list.size());
		list.add("Java");
		list.add("c++");
		list.add("Javascript");
		list.add("Python");
		System.out.println("Size after insert:"+list.size());
		System.out.println("elements in list:"+list);
		list.addFirst("programming list ->");
		list.addLast("C#");
		System.out.println("elements in list after adding at first and last:"+list);
		list.remove(3);
		System.out.println("the new list is:"+list);
		
	}

}
