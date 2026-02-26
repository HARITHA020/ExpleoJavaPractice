package arrayhandsOn;
import java.util.Scanner;

public class Hands_on_2_eSum8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  
        int[] arr = new int[n];
        int sum = 0;
      
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        
        int totalSum = 100 * 101 / 2; 
        int missing = totalSum - sum;

        System.out.println("The missing number is: " + missing);
        input.close();
    }
}
