package controlFlowHandsOn;
import java.util.*;
public class Hands_on_1_sum7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		int weight=input.nextInt();
		if((age>18 && age<55)&& weight>45) {
			System.out.println("Blood donar is eligible.");
		}
		else {
			System.out.println("Blood donar is not eligible.");
		}
		input.close();
	}

}
