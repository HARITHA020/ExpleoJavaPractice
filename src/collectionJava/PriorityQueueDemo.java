package collectionJava;
import java.util.*;
public class PriorityQueueDemo{

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("a");
		pq.add("b");
		pq.add("c");
		System.out.println("element un the priority:");
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
