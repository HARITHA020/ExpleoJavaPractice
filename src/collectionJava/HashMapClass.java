package collectionJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<String,Double> tm=new HashMap<String,Double>();
		System.out.println("size of the hashmap is:"+tm.size());
		tm.put("anushiya",5553225.52);
		tm.put("john",100.7);
		tm.put("Jane", 1450.78);
		tm.put("haritha", 145.23);
		
		
		System.out.println("Elements in the hashmapset:"+tm);
		System.out.println("size of the hashmap is:"+tm.size());
		Set<Map.Entry<String,Double>>set=tm.entrySet();
		for(Map.Entry<String,Double>me:set) {
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
		

	}

}
