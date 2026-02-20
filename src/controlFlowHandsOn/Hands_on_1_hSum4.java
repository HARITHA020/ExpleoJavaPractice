package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_hSum4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int totalcost=input.nextInt();
		float disc=0;
		if(totalcost<2000) {
			disc=totalcost*5/100;
		}
		else if(totalcost>=2000 && totalcost<5000) {
			disc=totalcost*25/100;
		}
		else if(totalcost>=5000 && totalcost<10000) {
			disc=totalcost*35/100;
		}
		else {
			disc=totalcost*50/100;
		}
		float pay=totalcost-disc;
		System.out.println("the amount to pay is:"+pay);

	}

}
