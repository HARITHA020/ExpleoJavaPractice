package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_mSum9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int count_n=num;
		int c=0,arm=0;
		while(count_n>0) {
			c++;
			count_n/=10;
		}
		int n=num;
		while(n>0) {
			int rem=n%10;
			arm=arm+(int)Math.pow(rem, c);
			n=n/10;
		}
		if(num==arm) {
			System.out.println("it is armstrong number.");
		}
		else {
			System.out.println("it is not armstrong number.");
		}
	}

}
