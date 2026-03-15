package handsOn7;

import java.util.Scanner;

public class Hands_on_7_sum1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase(); 
        boolean[] seen = new boolean[26]; 
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!seen[index]) {
                    seen[index] = true;     
                    result.append(ch);      
                }
            } else {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
        sc.close();
    }

}
