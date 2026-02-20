package functionHandsOn;

import java.util.Scanner;

public class Hands_on_3_mSum2 {
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the x value:");
		int x=input.nextInt();
		
		System.out.println("enter the y value:");
		int y=input.nextInt();
		
		System.out.println("the prime numbers between the [x,y]:");
		for(int i=x;i<y;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
		input.close();
	}
}
