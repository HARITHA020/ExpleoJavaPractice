package generic;
// this example demosstrate upper bounded wildcard
import java.util.ArrayList;
import java.util.List;

public class UpperBounded {
	
	public static void main(String[] args) {
		List<Integer> ints=new ArrayList<>();
		ints.add(3);
		ints.add(10);
		ints.add(20);
		
		double sum=sum(ints);
		System.out.println("sum of ints:"+sum);
	}
	
	public static double sum(List<? extends Number>list) {
		double sum=0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return sum;
	}

}
