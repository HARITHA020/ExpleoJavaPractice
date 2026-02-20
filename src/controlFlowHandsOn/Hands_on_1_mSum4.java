package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_mSum4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String time=input.nextLine();
		int bill=0;
		if(time.equals("1 min")) {
			bill=1;
			System.out.println("Bill is "+bill+"rs");
		}
		else if(time.equals("1 hr")) {
			bill=1+50;
			System.out.println("Bill is"+bill+"Rs");
		}
		else if(time.equals("5 hr")) {
			bill=1+50+200;
			System.out.println("Bill is"+bill+"rs");
		}
		else if(time.equals("7 hr")) {
			bill=1+50+200;
			System.out.println("Bill is"+bill+"rs");
		}
		else {
			System.out.println("The browser limit is exceeded.");
		}
		input.close();
	}

}
