package arrayhandsOn;

import java.util.Random;

public class Hands_on_2_mSum2 {

	public static void main(String[] args) {
		 int[] frequency = new int[6]; 
	     Random random = new Random();
	     for (int i = 0; i < 100; i++) {
	          int roll = random.nextInt(6) + 1; // 1 to 6
	          frequency[roll - 1]++;
	        }
	     
	        System.out.println("Dice Roll Frequencies (100 rolls):");
	        for (int i = 0; i < frequency.length; i++) {
	            System.out.println("Number " + (i + 1) + " : " + frequency[i]);
	        }
	    }
}


