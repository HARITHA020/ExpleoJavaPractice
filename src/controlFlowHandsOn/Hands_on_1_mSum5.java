package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_mSum5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int month=input.nextInt();
		if(month <1 && month>12) {
			System.out.println("invalid month");
		}
		if(month==4|| month==6||month==9||month==11) {
			int total_days=30;
			days(total_days);
		}
		else if(month==2) {
			System.out.println("enter the days 28 or 29:");
			int val=input.nextInt();
			if(val==28) {
				days(28);
			}
			else {
				days(29);
			}
		}
		else {
			days(31);
		}
	}

    public static void days(int total_days){
    	String[] enume= {"mon","Tue","Wed","Thur","Fri","Sat","Sun"};
    	for(String days:enume) {
    		System.out.printf("%4s",days);
    		
    	}
    	System.out.println();
    	int c = 1;
        for (int i = 1; i <= total_days; i++) {
            System.out.printf("%4d", c);
            if ((i) % 7 == 0) { 
                System.out.println();
            }
            c++;
        }
        System.out.println();
    	}
		
	}
	


