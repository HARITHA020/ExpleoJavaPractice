package handsOn7;

import java.util.*;
import java.util.regex.Pattern;

public class Hands_on_7_sum3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter corporate email: ");
        String email = input.nextLine();
        String regex = "^[A-Za-z][A-Za-z0-9._-]*[A-Za-z0-9]?@([A-Za-z0-9]+(-[A-Za-z0-9]+)*\\.)+[A-Za-z]{2,}$";

        if (Pattern.matches(regex, email)) {
            String localPart = email.substring(0, email.indexOf('@'));
            if (localPart.contains("..")) {
                System.out.println("Invalid email format: consecutive dots not allowed");
            } else {
                System.out.println("Valid corporate email.");
            }
        } else {
            System.out.println("Invalid email format.");
        }

        input.close();
    }

	}


