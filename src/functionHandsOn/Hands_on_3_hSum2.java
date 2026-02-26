package functionHandsOn;

import java.util.Scanner;

public class Hands_on_3_hSum2 {
	public static void checkHighest(int CS, int EC, int ME) {
		if (CS < 0 || EC < 0 || ME < 0) {
			System.out.println("invalid input");
			return;
		}

		if (CS == EC && EC == ME) {
			System.out.println("None of the department has got the highest placement");
			return;
		}

		int max = Math.max(CS, Math.max(EC, ME));
		System.out.print("Highest placement ");
		if (CS == max) {
			System.out.print("CS ");
		}
		if (EC == max) {
			System.out.print("EC ");
		}
		if (ME == max) {
			System.out.print("ME ");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CS:");
		int CS = input.nextInt();

		System.out.println("Enter the no of students placed in EC:");
		int EC = input.nextInt();

		System.out.println("Enter the no of students placed in ME:");
		int ME = input.nextInt();

		checkHighest(CS, EC, ME);
	}

}
