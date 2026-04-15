package handsOn10;

import java.util.HashSet;
import java.util.Set;

public class Hands_on_10_sum2 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("Java");
		s.add("Hello");
		s.add("Programming");
		s.add("World");
		
		System.out.println("the element in the set:"+s);
		for(String str:s) {
			System.out.print(str+" ");
		}
	}
}
