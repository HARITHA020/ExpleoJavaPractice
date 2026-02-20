package functionHandsOn;
import java.util.Scanner;
public class Hands_on_3_mSum3 {
	public static int calculateOverTime(int hours) {
		int overTimePay=0;
		
		if(hours>40) {
			overTimePay=(hours-40)*15;
		}
		else {
			overTimePay=0;
		}
		return overTimePay;
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=5;
		
		for(int i=1;i<=n;i++) {
			System.out.println("enter the employee "+i+" hour:");
			int hours=input.nextInt();
			int res=calculateOverTime(hours);
			System.out.println("over time pay for employee "+i+" is:"+res);
		}
		input.close();
	}
}
