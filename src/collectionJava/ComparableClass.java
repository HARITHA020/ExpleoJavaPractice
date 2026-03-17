package collectionJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mobile implements Comparable<Mobile>{
	private String name;
	private int ram;
	private int price;
	Mobile(String name, int ram, int price){
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRam() {
		return ram;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int compareTo(Mobile o) {
		if(this.price>o.getPrice()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}


public class ComparableClass {

	public static void main(String[] args) {
		List<Mobile> mobileList=new ArrayList<>();
		mobileList.add(new Mobile("Redme",16,5000));
		mobileList.add(new Mobile("Apple",8,10000));
		mobileList.add(new Mobile("samsung",4,4000));
		
		Collections.sort(mobileList);
		System.out.println("Mobiles after sorting:");
		System.out.println("Name"+"\t"+"ram"+"\t"+"price");
		for(Mobile mb: mobileList) {
			System.out.println(mb.getName() + "\t"+ mb.getRam()+"\t"+mb.getPrice());
		}
	}

}
