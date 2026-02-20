package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_hSum3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the car no:");
		int val=input.nextInt();
		int sum=0;
		while(val>0) {
			int rem=val%10;
			sum=sum+rem;
			val=val/10;
		}
		if(sum%3==0 || sum%5==0|| sum%7==0) {
			System.out.println("Lucky Number");
		}
		else {
			System.out.println("Sorry it's not my lucky number");
		}
	}

}
