package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_hSum5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int fact=1,i=1;
		if(num<=0) {
			System.out.println("Invalid input");
		}
		else {
			while(fact<num) {
				i++;
				fact=fact*i;
			}
			if(fact==num) {
				System.out.println(i);
			}
			else {
				System.out.println("Sorry. The given number is not a perfect factorial");
			}
		}
		input.close();
	}

}
