package handsOn7;

import java.util.Scanner;

public class Hands_on_7_sum2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int start = 0, end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        String trimmed = "";
        for (int i = start; i <= end; i++) {
            trimmed += str.charAt(i);
        }

        System.out.println(trimmed);
        input.close();
    }

	}


