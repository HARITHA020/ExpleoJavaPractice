package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_sum6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n,c=0;
		while(true) {
			n=input.nextInt();
			if(n<0) {
				break;
			}
			for(int i=0;i<n;i++) {
				System.out.println("Hello");
				c++;
			}
		}
		System.out.println("Total hello is:"+c);
		input.close();
	}

}
