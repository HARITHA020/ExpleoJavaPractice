package collectionJava;

import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("initial size of array list:"+arr.size());
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println("after insert  size of array list:"+arr.size());
		System.out.println("array elements are:"+arr);
		Integer ia[] =new Integer[arr.size()];
		ia=arr.toArray(ia);
		int sum=0;
		for(int i:ia) {
			sum+=i;
		}
		System.out.println("Sum value is:"+sum);
	}

}
