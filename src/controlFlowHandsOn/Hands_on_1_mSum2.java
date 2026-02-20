package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_mSum2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int qty=input.nextInt();
		int price=input.nextInt();
		int totalprice=qty*price;
		int total=0;
		if(qty>500) {
			int dis=totalprice-15/100;
			total=totalprice-dis;
		}
		else {
			total=totalprice;
		}
		System.out.println("total Expense:"+total);
		
		input.close();
	}
}
