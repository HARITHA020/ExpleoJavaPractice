package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_mSum6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int price=input.nextInt();
		int qty=input.nextInt();
		int totalcost=price*qty;
		int disc=0;
		if(totalcost>1000) {
			 disc=totalcost*10/100;
		}
		else {
			 disc=totalcost*5/100;
		}
		int pay=totalcost-disc;
		System.out.println("the total cost is"+totalcost);
		System.out.println("the discount is:"+disc);
		System.out.println("you need to pay:"+pay);
		input.close();
	}

}
