package handsOn10;

import java.util.ArrayList;
import java.util.List;

public class Hands_on_10_sum1 {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("Anu");
		name.add("Pragathi");
		name.add("Charlie");
		name.add("Shiny");
		System.out.println("the name in the arraylist are:\n"+name);
		List<String> list=new ArrayList<String>();
		for(String n:name) {
			int name_length=n.length();
			if(name_length>5) {
				list.add(n);
			}
		}
		System.out.println("the name in the arraylist which has lenght greater than 5  are:\n"+list);
	}

}
