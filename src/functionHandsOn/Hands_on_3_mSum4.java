package functionHandsOn;

import java.util.Scanner;

public class Hands_on_3_mSum4 {
	public static boolean isEligible(int age, int weight) {
		if((age>18 && age<55)&& weight>45) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		int weight=input.nextInt();
		if(isEligible(age,weight)) {
			System.out.println("Blood donar is eligible to blood donating");
		}
		else {
			System.out.println("Blood donar is not eligible to blood donating");
		}
		
		input.close();

	}

	

}
